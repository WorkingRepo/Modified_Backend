package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import models.Admins;
import models.Restaurants;
import play.Logger;

import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Collections;
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
            getOpen();
            Collections.sort(rests);
            JsonNode json = Json.toJson(rests);
            return ok(json);
    }

    @Transactional
    public Result getByStreetName(String stname) {

            String q = "select r from Restaurants r  where StreetName LIKE :stname";
            TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class).setParameter("stname", '%' + stname + '%');
            rests = query.getResultList();
            getOpen();
            Collections.sort(rests);
            final JsonNode json = Json.toJson(rests);
            return ok(json);

    }

    @Transactional
    public Result getRestaurantByTime() {

            TypedQuery<Restaurants> query = jpaApi.em().createQuery("SELECT r FROM Restaurants r where CURTIME()>otime and CURTIME()<ctime", Restaurants.class);
            List<Restaurants> restaurants = query.getResultList();
            getOpen();
            Collections.sort(restaurants);
            JsonNode json = Json.toJson(restaurants);
            return ok(json);

    }

    @Transactional
    public Result getByCuisines(String cuisine) {

        String q = "select r from Restaurants r  where Cuisines LIKE :cuisine";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class).setParameter("cuisine", '%' + cuisine + '%');
        rests = query.getResultList();
        getOpen();
        Collections.sort(rests);
        JsonNode json = Json.toJson(rests);
        return ok(json);
    }


    @Transactional
    public void getOpen() {

        TypedQuery<Restaurants> query = jpaApi.em().createQuery("SELECT r FROM Restaurants r where CURTIME()>otime and CURTIME()<ctime", Restaurants.class);
        List<Restaurants> restaurants = query.getResultList();

        for(Restaurants rest:restaurants){
           final Restaurants rest2 = jpaApi.em().find(Restaurants.class,rest.getId() );
            rest2.setOpen("Open Now");
            //Logger.debug(String.valueOf(rest2));
            jpaApi.em().merge(rest2);
        }
        TypedQuery<Restaurants> query1 = jpaApi.em().createQuery("SELECT r FROM Restaurants r where CURTIME()<=otime and CURTIME()>=ctime", Restaurants.class);
        List<Restaurants> restaurants1 = query1.getResultList();
        for(Restaurants rest:restaurants1){
            final Restaurants rest2 = jpaApi.em().find(Restaurants.class,rest.getId() );
            rest2.setOpen("Closed");
            //Logger.debug(String.valueOf(rest2));
            jpaApi.em().merge(rest2);
        }

    }



    @Transactional
    public Result getRecent() {

        String q = "select r from Restaurants r ORDER BY r.id DESC";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class);
        rests = query.setMaxResults(10).getResultList();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }

    // ORDER BY r.id DESC LIMIT 6
    @Transactional
    public Result getByPopular() {

        String q = "select r from Restaurants r  where Popular = true ORDER BY r.id DESC";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class);
        rests = query.setMaxResults(6).getResultList();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }

    @Transactional
    public Result getByPopularStreetName(String stname) {

        String q = "select r from Restaurants r  where Popular = true and StreetName LIKE :stname ORDER BY r.id DESC";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class).setParameter("stname", stname + '%');
        rests = query.setMaxResults(6).getResultList();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }

    @Transactional
    public Result getByPopularNearBy(String lat, String lon ,Integer dist) {
        Integer i;
        Restaurants rest = null;
        String q= "SELECT id,longitude, latitude, RestName, StreetName, Address, Phone, Email, HomePage, FaceBook, otime, ctime, image, Popular, Description, Highlights, Cuisines, open, \n" +
                "      111.045* DEGREES(ACOS(COS(RADIANS(latpoint))\n" +
                "                 * COS(RADIANS(latitude))\n" +
                "                 * COS(RADIANS(longpoint) - RADIANS(longitude))\n" +
                "                 + SIN(RADIANS(latpoint))\n" +
                "                 * SIN(RADIANS(latitude)))) AS distance_in_km\n" +
                " FROM Restaurants \n" +
                " JOIN (\n" +
                "     SELECT " + lat + " AS latpoint, " + lon + " AS longpoint\n" +
                "   ) AS p ON 1=1\n" +
                "HAVING distance_in_km <= " + dist + " and Popular=true ORDER BY distance_in_km\n" ;

        Query query=jpaApi.em().createNativeQuery(q);
        List<Object[]> restaurants =query.setMaxResults(6).getResultList();
        JsonNode json = Json.toJson(restaurants);
        return ok(json);


    }

    @Transactional
    public Result createRestaurant() {
        String token = request().getHeader("Authentication");
        String email = request().getHeader("id");
        Result auth = auth(token, email);
        Logger.debug(token);
        Logger.debug(email);
        Logger.debug(auth.toString());
        if(200 == auth.status()) {
            final JsonNode json = request().body().asJson();
            final Restaurants rests = Json.fromJson(json, Restaurants.class);
            rests.setOpen("Closed");

            jpaApi.em().persist(rests);
            return created();
        }
        return unauthorized("unauthorized user");
    }

    @Transactional
    public Result deleteRestaurant(String resname, String stname) {
        String token = request().getHeader("Authentication");
        String email = request().getHeader("id");
        Result auth = auth(token, email);
        if(200 == auth.status()) {
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
        return unauthorized("unauthorized user");
    }



    @Transactional
    public Result getRestaurantById(Integer id) {
            final Restaurants rest = jpaApi.em().find(Restaurants.class, id);
            getOpen();
            JsonNode json = Json.toJson(rest);
            return ok(json);
    }


    @Transactional
    public Result deleteRestaurantById(Integer id) {
        String token = request().getHeader("Authentication");
        String email = request().getHeader("id");
        Result auth = auth(token, email);
        if(200 == auth.status()) {
            final Restaurants rest = jpaApi.em().find(Restaurants.class, id);
            if (null == rest) {
                return notFound("restaurant not found");
            }
            jpaApi.em().remove(rest);
            TypedQuery<Restaurants> query = jpaApi.em().createQuery("select r from Restaurants r", Restaurants.class);
            rests = query.getResultList();
            Collections.sort(rests);
            JsonNode json = Json.toJson(rests);
            return ok(json);
        }
        return unauthorized("unauthorized user");
    }


    @Transactional
    public Result getRestaurantByName(String name) {
        String q = "select r from Restaurants r  where RestName LIKE :name ";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class).setParameter("name", '%' + name + '%');
        rests = query.getResultList();
        getOpen();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }


    @Transactional
    public Result getRestaurantByLowPrice() {
        String q = "select r from Restaurants r  where cost < 500 order by cost";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class);
        rests = query.getResultList();
        getOpen();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }

    @Transactional
    public Result getRestaurantByModeratePrice() {
        String q = "select r from Restaurants r  where cost >= 500 and cost <= 1000 order by cost";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class);
        rests = query.getResultList();
        getOpen();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }

    @Transactional
    public Result getRestaurantByHighPrice() {
        String q = "select r from Restaurants r  where cost >= 1000 order by cost";
        TypedQuery<Restaurants> query = jpaApi.em().createQuery(q, Restaurants.class);
        rests = query.getResultList();
        getOpen();
        final JsonNode json = Json.toJson(rests);
        return ok(json);
    }

    @Transactional
    public Result updateRestaurant(Integer id) {
        String token = request().getHeader("Authentication");
        String email = request().getHeader("id");
        Result auth = auth(token, email);
        if(200 == auth.status()) {
            final JsonNode json = request().body().asJson();
            final Restaurants rests = Json.fromJson(json, Restaurants.class);
            Result del = deleteRestaurantById(id);
            if (OK == del.status()) {
                jpaApi.em().persist(rests);
                return ok("updated");
            }
            return badRequest("can't update");
        }
        return unauthorized("unauthorized user");

    }

    @Transactional
    public Result getRestaurantNearBy(String lat, String lon ,Integer dist){

        Integer i;
        Restaurants rest = null;
        String q= "SELECT id,longitude, latitude, RestName, StreetName, Address, Phone, Email, HomePage, FaceBook, otime, ctime, image, Popular, Description, Highlights, Cuisines, open, Cost, \n" +
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
        JsonNode json = Json.toJson(restaurants);
        return ok(json);
    }

/*

    @Transactional
    public Result getRestaurantNearByRests(){

        String q= " SELECT RestName, abs((3959 * acos(cos(radians(17.3677990)) * cos(radians(latitude)) * cos(radians(longitude) - radians(78.5401180)) + sin(radians(17.3677990)) * sin(radians(latitude ))))) AS distance FROM Restaurants HAVING distance < 2 ORDER BY distance";

        Query query=jpaApi.em().createNativeQuery(q);
        List<Object[]> restaurants =query.getResultList();

        JsonNode json = Json.toJson(restaurants);
        return ok(json);

    }
    */

    public Result auth(String token, String id) {
        final Admins admins = jpaApi.em().find(Admins.class, id);
        if(null != admins) {
            JsonNode json = Json.toJson(admins);
            if (token.equals(json.path("token").asText())) {
                return ok();
            }
        }
        return badRequest();

    }


    public Result imageUpload(String url){

        return ok();
    }
}