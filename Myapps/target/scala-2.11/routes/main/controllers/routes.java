
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kakhila/PlaySampleApp/Myapps/conf/routes
// @DATE:Thu Feb 23 16:24:08 IST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRestaurantController RestaurantController = new controllers.ReverseRestaurantController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdminController AdminController = new controllers.ReverseAdminController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCountController CountController = new controllers.ReverseCountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHelloWorldController HelloWorldController = new controllers.ReverseHelloWorldController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
    public static controllers.ImageController ImageController;

    public static class javascript {
    
    public static final controllers.javascript.ReverseRestaurantController RestaurantController = new controllers.javascript.ReverseRestaurantController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdminController AdminController = new controllers.javascript.ReverseAdminController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCountController CountController = new controllers.javascript.ReverseCountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHelloWorldController HelloWorldController = new controllers.javascript.ReverseHelloWorldController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  }

}
