
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kakhila/PlaySampleApp/Myapps/conf/routes
// @DATE:Wed Mar 22 16:27:35 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:43
  class ReverseRestaurantController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def getRecent(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/recent")
    }
  
    // @LINE:53
    def getRestaurantById(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbyid/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:47
    def getByPopularStreetName(stname:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbypstname/" + implicitly[PathBindable[String]].unbind("stname", dynamicString(stname)))
    }
  
    // @LINE:59
    def getRestaurantByModeratePrice(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbymoderate")
    }
  
    // @LINE:63
    def getRestaurantNearBy(lat:String, lon:String, dist:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/nearby/" + implicitly[PathBindable[String]].unbind("lat", dynamicString(lat)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("lon", lon)), Some(implicitly[QueryStringBindable[Integer]].unbind("dist", dist)))))
    }
  
    // @LINE:55
    def getRestaurantByTime(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbyTime")
    }
  
    // @LINE:57
    def getRestaurantByLowPrice(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbylow")
    }
  
    // @LINE:65
    def getByPopularNearBy(lat:String, lon:String, dist:Integer): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/pnearby/" + implicitly[PathBindable[String]].unbind("lat", dynamicString(lat)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("lon", lon)), Some(implicitly[QueryStringBindable[Integer]].unbind("dist", dist)))))
    }
  
    // @LINE:51
    def getByCuisines(cuisine:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbycuisine/" + implicitly[PathBindable[String]].unbind("cuisine", dynamicString(cuisine)))
    }
  
    // @LINE:49
    def getRestaurantByName(name:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbyname/" + implicitly[PathBindable[String]].unbind("name", dynamicString(name)))
    }
  
    // @LINE:73
    def createRestaurant(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "restsadd")
    }
  
    // @LINE:43
    def getAllRestaurants(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests")
    }
  
    // @LINE:69
    def getByPopular(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/popular")
    }
  
    // @LINE:45
    def getByStreetName(stname:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbystname/" + implicitly[PathBindable[String]].unbind("stname", dynamicString(stname)))
    }
  
    // @LINE:79
    def updateRestaurant(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "rests/update/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:61
    def getRestaurantByHighPrice(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "rests/getbyhigh")
    }
  
    // @LINE:77
    def deleteRestaurantById(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "rests/delid/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:97
  class ReverseSuggestionBox(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:99
    def createSuggestion(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "suggest")
    }
  
    // @LINE:101
    def deleteSuggestionById(id:Integer): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "suggestdel/" + implicitly[PathBindable[Integer]].unbind("id", id))
    }
  
    // @LINE:97
    def getAllSuggestions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "suggest")
    }
  
  }

  // @LINE:21
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def validateAdmin(email:String, pwd:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admins/validate/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("pwd", pwd)))))
    }
  
    // @LINE:33
    def createAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admins")
    }
  
    // @LINE:21
    def getAllAdmins(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admins")
    }
  
    // @LINE:35
    def deleteAdminById(email:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "admins/del/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
    }
  
    // @LINE:29
    def getAdminById(email:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admins/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:88
  class ReverseImageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def downloadImage(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:92
    def deleteImage(id:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "images/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:88
    def uploadImage(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "images")
    }
  
  }

  // @LINE:15
  class ReverseHelloWorldController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def hello(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "hello")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }


}
