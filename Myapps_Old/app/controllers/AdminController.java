package controllers;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import models.Admins;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import javax.persistence.TypedQuery;
import java.util.List;




public class AdminController extends Controller {
    private JPAApi jpaApi;







    @Inject
    public AdminController(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }
    @Transactional
    public Result getAllAdmins(){
        TypedQuery<Admins> query=jpaApi.em().createQuery("select a from Admins a", Admins.class);
        List<Admins> admins= query.getResultList();
        final JsonNode json= Json.toJson(admins);
        return  ok(json);
    }

    @Transactional
    public  Result createAdmin(){

        final JsonNode json=request().body().asJson();
        final Admins admins=Json.fromJson(json,Admins.class);
        jpaApi.em().persist(admins);
        return created();
    }
    @Transactional
    public Result deleteAdminById(String email) {
        final Admins admins=jpaApi.em().find(Admins.class,email);
        jpaApi.em().remove(admins);
        return ok();
    }

    @Transactional
    public Result getAdminById(String email){
        final Admins admins=jpaApi.em().find(Admins.class,email);
        final JsonNode json=Json.toJson(admins);
        return  ok(json);
    }
    @Transactional
    public Result updateAdminById(String email) {
        final JsonNode json=request().body().asJson();
        final Admins admins=Json.fromJson(json,Admins.class);
        final Admins existingAdmin=jpaApi.em().find(Admins.class,email);
        existingAdmin.setEmail(admins.getEmail());
        jpaApi.em().merge(existingAdmin);
        return ok("updated");
    }
}
