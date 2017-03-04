package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import models.Restaurants;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class RestaurantController extends Controller {
    private JPAApi jpaApi;

    private List<Restaurants> rests;


    @Inject
    public RestaurantController(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }


    @Transactional
    public Result getAllRestaurants() {
        TypedQuery<Restaurants> query = jpaApi.em().createQuery("select r from Restaurants r", Restaurants.class);
        rests = query.getResultList();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }

    @Transactional
    public Result getByStreetName(String stname) {
        String q = "select r from Restaurants r  where StreetName LIKE :stname ";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class).setParameter("stname",  stname + '%');
        rests = query.getResultList();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }

    @Transactional
    public Result getRestaurantByTime() {
        TypedQuery<Restaurants> query = jpaApi.em().createQuery("SELECT r FROM Restaurants r where CURTIME()>otime and CURTIME()<ctime", Restaurants.class);
        List<Restaurants> restaurants = query.getResultList();
        JsonNode json = Json.toJson(restaurants);
        return ok(json);
    }

    @Transactional
    public Result createRestaurant() {

        final JsonNode json = request().body().asJson();
        final Restaurants rests = Json.fromJson(json, Restaurants.class);
        jpaApi.em().persist(rests);
        return created();
    }

    @Transactional
    public Result deleteRestaurant(String resname, String stname) {
        TypedQuery<Restaurants> query = jpaApi.em().createQuery("select r from Restaurants r", Restaurants.class);
        rests = query.getResultList();
        for (int i = 0; i < rests.size(); i++) {

            Restaurants r = rests.get(i);

            if (resname.equals(r.getRestName()) && stname.equals(r.getStreetName())) {
                {
                    //rests.remove(r);
                    jpaApi.em().remove(r);
                    return ok("deleted");

                }
            }
        }
        return notFound("restaurant not found");
    }



    @Transactional
    public Result getRestaurantById(Integer id) {
        final Restaurants rest = jpaApi.em().find(Restaurants.class, id);
        JsonNode json = Json.toJson(rest);
        return ok(json);
    }


    @Transactional
    public Result deleteRestaurantById(Integer id) {
        final Restaurants rest = jpaApi.em().find(Restaurants.class, id);
        if (null == rest) {
            return notFound("restaurant not found");
        }
        jpaApi.em().remove(rest);
        return ok("deleted");
    }


    @Transactional
    public Result getRestaurantByName(String name) {
        String q = "select r from Restaurants r  where RestName LIKE :name ";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class).setParameter("name", '%' + name + '%');
        rests = query.getResultList();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }


    @Transactional
    public Result updateRestaurant(Integer id) {
        final JsonNode json = request().body().asJson();
        final Restaurants rests = Json.fromJson(json, Restaurants.class);
        Result del = deleteRestaurantById(id);
        if( OK == del.status()) {
            jpaApi.em().persist(rests);
            return ok("updated");
        }
        return badRequest("can't update");

    }

    @Transactional
    public Result getRestaurantNearBy(String lat, String lon ,Integer dist){

        Integer i;
        Restaurants rest = null;
        String q= "SELECT id,longitude, latitude, RestName, StreetName, Address, Phone, Email, HomePage, FaceBook, otime, ctime,\n" +
                "      111.045* DEGREES(ACOS(COS(RADIANS(latpoint))\n" +
                "                 * COS(RADIANS(latitude))\n" +
                "                 * COS(RADIANS(longpoint) - RADIANS(longitude))\n" +
                "                 + SIN(RADIANS(latpoint))\n" +
                "                 * SIN(RADIANS(latitude)))) AS distance_in_km\n" +
                " FROM Restaurants \n" +
                " JOIN (\n" +
                "     SELECT " + lat + " AS latpoint, " + lon + " AS longpoint\n" +
                "   ) AS p ON 1=1\n" +
                "HAVING distance_in_km <= " + dist + " ORDER BY distance_in_km\n" ;

        Query query=jpaApi.em().createNativeQuery(q);
        List<Object[]> restaurants =query.getResultList();
        
       /* for(i = 0;i<restaurants.size();i++){
            Integer id = (Integer) restaurants.get(i)[0];
            rest = jpaApi.em().find(Restaurants.class, id);
           
        }
        */
        JsonNode json = Json.toJson(restaurants);
        return ok(json);
    }



    @Transactional
    public Result getRestaurantNearByRests(){

        String q= " SELECT RestName, abs((3959 * acos(cos(radians(17.3677990)) * cos(radians(latitude)) * cos(radians(longitude) - radians(78.5401180)) + sin(radians(17.3677990)) * sin(radians(latitude ))))) AS distance FROM Restaurants HAVING distance < 2 ORDER BY distance";

        Query query=jpaApi.em().createNativeQuery(q);
        List<Object[]> restaurants =query.getResultList();

        JsonNode json = Json.toJson(restaurants);
        return ok(json);

    }

}
/*

SELECT zip, primary_city, latitude, longitude,
      111.045* DEGREES(ACOS(COS(RADIANS(latpoint))
                 * COS(RADIANS(latitude))
                 * COS(RADIANS(longpoint) - RADIANS(longitude))
                 + SIN(RADIANS(latpoint))
                 * SIN(RADIANS(latitude)))) AS distance_in_km
 FROM zip
 JOIN (
     SELECT  42.81  AS latpoint,  -70.81 AS longpoint
   ) AS p ON 1=1
 ORDER BY distance_in_km
 LIMIT 15


 @Transactional
    public Result getRestaurantNearBy(String lat, String lon ){

        Integer i;
        Restaurants rest = null;
        String q= "SELECT id,longitude, latitude, RestName, StreetName, Address, Phone, Email, HomePage, FaceBook, otime, ctime,\n" +
                "      111.045* DEGREES(ACOS(COS(RADIANS(latpoint))\n" +
                "                 * COS(RADIANS(latitude))\n" +
                "                 * COS(RADIANS(longpoint) - RADIANS(longitude))\n" +
                "                 + SIN(RADIANS(latpoint))\n" +
                "                 * SIN(RADIANS(latitude)))) AS distance_in_km\n" +
                " FROM Restaurants \n" +
                " JOIN (\n" +
                "     SELECT " + lat + " AS latpoint, " + lon + " AS longpoint\n" +
                "   ) AS p ON 1=1\n" +
                "HAVING distance_in_km <= 10  ORDER BY distance_in_km\n" ;

        Query query=jpaApi.em().createNativeQuery(q);
        List<Object[]> restaurants =query.getResultList();

       /* for(i = 0;i<restaurants.size();i++){
            Integer id = (Integer) restaurants.get(i)[0];
            rest = jpaApi.em().find(Restaurants.class, id);

        }

JsonNode json = Json.toJson(restaurants);
        return ok(json);
                }

 */
