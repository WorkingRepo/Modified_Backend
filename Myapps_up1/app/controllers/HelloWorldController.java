package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class HelloWorldController extends Controller{

    public Result hello(){
        return ok("hello !!");
    }

}
