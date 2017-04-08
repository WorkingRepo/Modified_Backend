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
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;


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
        if(null != json) {
            return ok(json);
        }
        return notFound();
    }

    @Transactional
    public  Result createAdmin() throws NoSuchAlgorithmException {

        final JsonNode json=request().body().asJson();
        String c = json.path("password").asText();
        String email = json.path("email").asText();
        String salt = salt();
        String pwd = sha256(c, salt);
        final Admins admins=Json.fromJson(json,Admins.class);
        jpaApi.em().persist(admins);
        updateAdminById(email,pwd,salt);
        return created();
    }

    @Transactional
    public Result validateAdmin(String email, String pwd) throws NoSuchAlgorithmException {

        String token;
        String q = "select r from Admins r where Email LIKE :email";
        TypedQuery<Admins> query = jpaApi.em().createQuery(q, Admins.class).setParameter("email",email);
        List<Admins> admins = query.getResultList();
        final Admins existingAdmin=jpaApi.em().find(Admins.class,email);
        JsonNode json = Json.toJson(admins);
        if(0 != json.size() ) {

            String existingPwd = json.findValue("password").asText().substring(11);
            String salt = json.findValue("password").asText().substring(0,11);
            String newPwd = sha256(pwd,salt);
            if(newPwd.equals(existingPwd)){
                token=authToken();
                existingAdmin.setToken(token);
                jpaApi.em().merge(existingAdmin);
                query = jpaApi.em().createQuery(q, Admins.class).setParameter("email",email);
                admins = query.getResultList();
                json = Json.toJson(admins);
                return ok(json);
            }
            else{
                return notFound("invalid details");
            }
        }
        return notFound("not registered");
    }

   /* @Transactional
    public Result getToken(String email,String pwd)
    {
        String q = "select r from Admins r where Email LIKE :email";
        TypedQuery<Admins> query = jpaApi.em().createQuery(q, Admins.class).setParameter("email",email);
        List<Admins> admins = query.getResultList();
        final JsonNode json= Json.toJson(admins);
        if(null != json) {
            String c = json.path("token").asText();
            return ok(json);
        }
        return notFound();
    }*/

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
    public Result updateAdminById(String email,String pwd, String salt) {
      //  final JsonNode json=request().body().asJson();
        //final Admins admins=Json.fromJson(json,Admins.class);
        final Admins existingAdmin=jpaApi.em().find(Admins.class,email);
        //existingAdmin.setEmail(admins.getEmail());
        existingAdmin.setPassword(salt + pwd);
        jpaApi.em().merge(existingAdmin);
        return ok("updated");
    }


    @Transactional
    public String md5(String pwd)
    {
        String passwordToHash = pwd;
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(passwordToHash.getBytes());
            //Get the hash's bytes
            byte[] bytes = md.digest();
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return generatedPassword;
    }

    @Transactional
    public String sha256(String pwd, String salt) throws NoSuchAlgorithmException {

        String password = salt + pwd;
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }


        //convert the byte to hex format method 2
        StringBuffer hexString = new StringBuffer();
        for (int i=0;i<byteData.length;i++) {
            String hex=Integer.toHexString(0xff & byteData[i]);
            if(hex.length()==1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
    public String salt() throws NoSuchAlgorithmException {
        Random ranGen = new SecureRandom();
        byte[] aesKey = new byte[16];
        ranGen.nextBytes(aesKey);
       return aesKey.toString() ;

    }

    public String authToken() throws NoSuchAlgorithmException {

        Random ranGen = new SecureRandom();
        byte[] msg = new byte[40];
        ranGen.nextBytes(msg);
        MessageDigest sha = MessageDigest.getInstance("SHA-256");
        sha.reset();
        byte[] digest = sha.digest(msg);
        return (String.format("%0" + (digest.length<<1) + "x" , new BigInteger(1,digest)).substring(0,64));
    }
}