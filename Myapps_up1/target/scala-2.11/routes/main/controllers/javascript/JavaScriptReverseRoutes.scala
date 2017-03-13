
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kakhila/PlaySampleApp/Myapps/conf/routes
// @DATE:Mon Mar 13 15:19:13 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:44
  class ReverseRestaurantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def getRestaurantById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbyid/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:54
    def getRestaurantNearBy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantNearBy",
      """
        function(lat0,lon1,dist2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/nearby/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lat", encodeURIComponent(lat0)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lon", lon1), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("dist", dist2)])})
        }
      """
    )
  
    // @LINE:52
    def getRestaurantByTime: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByTime",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbyTime"})
        }
      """
    )
  
    // @LINE:48
    def getRestaurantByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbyname/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:62
    def createRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.createRestaurant",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restsadd"})
        }
      """
    )
  
    // @LINE:44
    def getAllRestaurants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getAllRestaurants",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests"})
        }
      """
    )
  
    // @LINE:60
    def getByPopular: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getByPopular",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/popular"})
        }
      """
    )
  
    // @LINE:46
    def getByStreetName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getByStreetName",
      """
        function(stname0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbystname/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("stname", encodeURIComponent(stname0))})
        }
      """
    )
  
    // @LINE:68
    def updateRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.updateRestaurant",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/update/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:66
    def deleteRestaurantById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.deleteRestaurantById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/delid/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def validateAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.validateAdmin",
      """
        function(email0,pwd1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admins/validate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pwd", pwd1)])})
        }
      """
    )
  
    // @LINE:33
    def createAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.createAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admins"})
        }
      """
    )
  
    // @LINE:21
    def getAllAdmins: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getAllAdmins",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admins"})
        }
      """
    )
  
    // @LINE:35
    def deleteAdminById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteAdminById",
      """
        function(email0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "admins/del/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0))})
        }
      """
    )
  
    // @LINE:29
    def getAdminById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.getAdminById",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admins/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0))})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:75
  class ReverseImageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def downloadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.downloadImage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:79
    def deleteImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.deleteImage",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:75
    def uploadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.uploadImage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "images"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseHelloWorldController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def hello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.hello",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }


}
