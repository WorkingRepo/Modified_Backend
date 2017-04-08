package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import models.Suggestions;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by kakhila on 3/21/17.
 */
public class SuggestionBox extends Controller {

    private JPAApi jpaApi;

    private List<Suggestions> sug;


    @Inject
    public SuggestionBox(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }


    @Transactional
    public Result getAllSuggestions(){
        TypedQuery<Suggestions> query=jpaApi.em().createQuery("select a from Suggestions a", Suggestions.class);
        sug= query.getResultList();
        final JsonNode json= Json.toJson(sug);
        if(null != json) {
            return ok(json);
        }
        return notFound();
    }

    @Transactional
    public  Result createSuggestion() {

        final JsonNode json=request().body().asJson();
        final Suggestions suggest=Json.fromJson(json,Suggestions.class);
        jpaApi.em().persist(suggest);
        return created();
    }


    @Transactional
    public Result deleteSuggestionById(Integer id) {
        final Suggestions suggest=jpaApi.em().find(Suggestions.class,id);
        jpaApi.em().remove(suggest);
        TypedQuery<Suggestions> query = jpaApi.em().createQuery("select r from Suggestions r", Suggestions.class);
        sug = query.getResultList();
        JsonNode json = Json.toJson(sug);
        return ok(json);

    }

}
