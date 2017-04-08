
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kakhila/PlaySampleApp/Myapps/conf/routes
// @DATE:Wed Mar 22 16:27:35 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:43
  class ReverseRestaurantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def getRecent: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRecent",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/recent"})
        }
      """
    )
  
    // @LINE:53
    def getRestaurantById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbyid/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:47
    def getByPopularStreetName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getByPopularStreetName",
      """
        function(stname0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbypstname/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("stname", encodeURIComponent(stname0))})
        }
      """
    )
  
    // @LINE:59
    def getRestaurantByModeratePrice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByModeratePrice",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbymoderate"})
        }
      """
    )
  
    // @LINE:63
    def getRestaurantNearBy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantNearBy",
      """
        function(lat0,lon1,dist2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/nearby/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lat", encodeURIComponent(lat0)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lon", lon1), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("dist", dist2)])})
        }
      """
    )
  
    // @LINE:55
    def getRestaurantByTime: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByTime",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbyTime"})
        }
      """
    )
  
    // @LINE:57
    def getRestaurantByLowPrice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByLowPrice",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbylow"})
        }
      """
    )
  
    // @LINE:65
    def getByPopularNearBy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getByPopularNearBy",
      """
        function(lat0,lon1,dist2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/pnearby/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lat", encodeURIComponent(lat0)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("lon", lon1), (""" + implicitly[QueryStringBindable[Integer]].javascriptUnbind + """)("dist", dist2)])})
        }
      """
    )
  
    // @LINE:51
    def getByCuisines: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getByCuisines",
      """
        function(cuisine0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbycuisine/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cuisine", encodeURIComponent(cuisine0))})
        }
      """
    )
  
    // @LINE:49
    def getRestaurantByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbyname/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("name", encodeURIComponent(name0))})
        }
      """
    )
  
    // @LINE:73
    def createRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.createRestaurant",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restsadd"})
        }
      """
    )
  
    // @LINE:43
    def getAllRestaurants: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getAllRestaurants",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests"})
        }
      """
    )
  
    // @LINE:69
    def getByPopular: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getByPopular",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/popular"})
        }
      """
    )
  
    // @LINE:45
    def getByStreetName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getByStreetName",
      """
        function(stname0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbystname/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("stname", encodeURIComponent(stname0))})
        }
      """
    )
  
    // @LINE:79
    def updateRestaurant: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.updateRestaurant",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/update/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:61
    def getRestaurantByHighPrice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.getRestaurantByHighPrice",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rests/getbyhigh"})
        }
      """
    )
  
    // @LINE:77
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

  // @LINE:97
  class ReverseSuggestionBox(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:99
    def createSuggestion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionBox.createSuggestion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suggest"})
        }
      """
    )
  
    // @LINE:101
    def deleteSuggestionById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionBox.deleteSuggestionById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "suggestdel/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:97
    def getAllSuggestions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuggestionBox.getAllSuggestions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suggest"})
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

  // @LINE:88
  class ReverseImageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def downloadImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.downloadImage",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:92
    def deleteImage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ImageController.deleteImage",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "images/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:88
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
