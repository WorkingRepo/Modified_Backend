
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kakhila/PlaySampleApp/Myapps/conf/routes
// @DATE:Wed Mar 22 16:27:35 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:8
  CountController_2: controllers.CountController,
  // @LINE:10
  AsyncController_4: controllers.AsyncController,
  // @LINE:13
  Assets_8: controllers.Assets,
  // @LINE:15
  HelloWorldController_7: controllers.HelloWorldController,
  // @LINE:21
  AdminController_0: controllers.AdminController,
  // @LINE:43
  RestaurantController_6: controllers.RestaurantController,
  // @LINE:88
  ImageController_5: controllers.ImageController,
  // @LINE:97
  SuggestionBox_1: controllers.SuggestionBox,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:8
    CountController_2: controllers.CountController,
    // @LINE:10
    AsyncController_4: controllers.AsyncController,
    // @LINE:13
    Assets_8: controllers.Assets,
    // @LINE:15
    HelloWorldController_7: controllers.HelloWorldController,
    // @LINE:21
    AdminController_0: controllers.AdminController,
    // @LINE:43
    RestaurantController_6: controllers.RestaurantController,
    // @LINE:88
    ImageController_5: controllers.ImageController,
    // @LINE:97
    SuggestionBox_1: controllers.SuggestionBox
  ) = this(errorHandler, HomeController_3, CountController_2, AsyncController_4, Assets_8, HelloWorldController_7, AdminController_0, RestaurantController_6, ImageController_5, SuggestionBox_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, CountController_2, AsyncController_4, Assets_8, HelloWorldController_7, AdminController_0, RestaurantController_6, ImageController_5, SuggestionBox_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello""", """controllers.HelloWorldController.hello()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins""", """controllers.AdminController.getAllAdmins()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins/""" + "$" + """email<[^/]+>""", """controllers.AdminController.getAdminById(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins/validate/""" + "$" + """email<[^/]+>""", """controllers.AdminController.validateAdmin(email:String, pwd:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins""", """controllers.AdminController.createAdmin()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins/del/""" + "$" + """email<[^/]+>""", """controllers.AdminController.deleteAdminById(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests""", """controllers.RestaurantController.getAllRestaurants()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbystname/""" + "$" + """stname<[^/]+>""", """controllers.RestaurantController.getByStreetName(stname:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbypstname/""" + "$" + """stname<[^/]+>""", """controllers.RestaurantController.getByPopularStreetName(stname:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbyname/""" + "$" + """name<[^/]+>""", """controllers.RestaurantController.getRestaurantByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbycuisine/""" + "$" + """cuisine<[^/]+>""", """controllers.RestaurantController.getByCuisines(cuisine:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbyid/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.getRestaurantById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbyTime""", """controllers.RestaurantController.getRestaurantByTime()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbylow""", """controllers.RestaurantController.getRestaurantByLowPrice()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbymoderate""", """controllers.RestaurantController.getRestaurantByModeratePrice()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbyhigh""", """controllers.RestaurantController.getRestaurantByHighPrice()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/nearby/""" + "$" + """lat<[^/]+>""", """controllers.RestaurantController.getRestaurantNearBy(lat:String, lon:String, dist:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/pnearby/""" + "$" + """lat<[^/]+>""", """controllers.RestaurantController.getByPopularNearBy(lat:String, lon:String, dist:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/popular""", """controllers.RestaurantController.getByPopular()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/recent""", """controllers.RestaurantController.getRecent()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restsadd""", """controllers.RestaurantController.createRestaurant()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/delid/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.deleteRestaurantById(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/update/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.updateRestaurant(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images""", """controllers.ImageController.uploadImage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImageController.downloadImage(id:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """images/""" + "$" + """id<[^/]+>""", """controllers.ImageController.deleteImage(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggest""", """controllers.SuggestionBox.getAllSuggestions()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggest""", """controllers.SuggestionBox.createSuggestion()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """suggestdel/""" + "$" + """id<[^/]+>""", """controllers.SuggestionBox.deleteSuggestionById(id:Integer)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_2.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_4.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_8.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources0. from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HelloWorldController_hello4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello")))
  )
  private[this] lazy val controllers_HelloWorldController_hello4_invoker = createInvoker(
    HelloWorldController_7.hello(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "hello",
      Nil,
      "GET",
      """""",
      this.prefix + """hello"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_AdminController_getAllAdmins5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins")))
  )
  private[this] lazy val controllers_AdminController_getAllAdmins5_invoker = createInvoker(
    AdminController_0.getAllAdmins(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getAllAdmins",
      Nil,
      "GET",
      """""",
      this.prefix + """admins"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_AdminController_getAdminById6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_getAdminById6_invoker = createInvoker(
    AdminController_0.getAdminById(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getAdminById",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admins/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_AdminController_validateAdmin7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins/validate/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_validateAdmin7_invoker = createInvoker(
    AdminController_0.validateAdmin(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "validateAdmin",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """admins/validate/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_AdminController_createAdmin8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins")))
  )
  private[this] lazy val controllers_AdminController_createAdmin8_invoker = createInvoker(
    AdminController_0.createAdmin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "createAdmin",
      Nil,
      "POST",
      """""",
      this.prefix + """admins"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_AdminController_deleteAdminById9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins/del/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteAdminById9_invoker = createInvoker(
    AdminController_0.deleteAdminById(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteAdminById",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """admins/del/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_RestaurantController_getAllRestaurants10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests")))
  )
  private[this] lazy val controllers_RestaurantController_getAllRestaurants10_invoker = createInvoker(
    RestaurantController_6.getAllRestaurants(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getAllRestaurants",
      Nil,
      "GET",
      """""",
      this.prefix + """rests"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_RestaurantController_getByStreetName11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbystname/"), DynamicPart("stname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getByStreetName11_invoker = createInvoker(
    RestaurantController_6.getByStreetName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getByStreetName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """rests/getbystname/""" + "$" + """stname<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_RestaurantController_getByPopularStreetName12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbypstname/"), DynamicPart("stname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getByPopularStreetName12_invoker = createInvoker(
    RestaurantController_6.getByPopularStreetName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getByPopularStreetName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """rests/getbypstname/""" + "$" + """stname<[^/]+>"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_RestaurantController_getRestaurantByName13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbyname/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantByName13_invoker = createInvoker(
    RestaurantController_6.getRestaurantByName(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantByName",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """rests/getbyname/""" + "$" + """name<[^/]+>"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_RestaurantController_getByCuisines14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbycuisine/"), DynamicPart("cuisine", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getByCuisines14_invoker = createInvoker(
    RestaurantController_6.getByCuisines(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getByCuisines",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """rests/getbycuisine/""" + "$" + """cuisine<[^/]+>"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_RestaurantController_getRestaurantById15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbyid/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantById15_invoker = createInvoker(
    RestaurantController_6.getRestaurantById(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantById",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """rests/getbyid/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_RestaurantController_getRestaurantByTime16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbyTime")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantByTime16_invoker = createInvoker(
    RestaurantController_6.getRestaurantByTime(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantByTime",
      Nil,
      "GET",
      """""",
      this.prefix + """rests/getbyTime"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_RestaurantController_getRestaurantByLowPrice17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbylow")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantByLowPrice17_invoker = createInvoker(
    RestaurantController_6.getRestaurantByLowPrice(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantByLowPrice",
      Nil,
      "GET",
      """""",
      this.prefix + """rests/getbylow"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_RestaurantController_getRestaurantByModeratePrice18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbymoderate")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantByModeratePrice18_invoker = createInvoker(
    RestaurantController_6.getRestaurantByModeratePrice(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantByModeratePrice",
      Nil,
      "GET",
      """""",
      this.prefix + """rests/getbymoderate"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_RestaurantController_getRestaurantByHighPrice19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbyhigh")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantByHighPrice19_invoker = createInvoker(
    RestaurantController_6.getRestaurantByHighPrice(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantByHighPrice",
      Nil,
      "GET",
      """""",
      this.prefix + """rests/getbyhigh"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_RestaurantController_getRestaurantNearBy20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/nearby/"), DynamicPart("lat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantNearBy20_invoker = createInvoker(
    RestaurantController_6.getRestaurantNearBy(fakeValue[String], fakeValue[String], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantNearBy",
      Seq(classOf[String], classOf[String], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """rests/nearby/""" + "$" + """lat<[^/]+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_RestaurantController_getByPopularNearBy21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/pnearby/"), DynamicPart("lat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getByPopularNearBy21_invoker = createInvoker(
    RestaurantController_6.getByPopularNearBy(fakeValue[String], fakeValue[String], fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getByPopularNearBy",
      Seq(classOf[String], classOf[String], classOf[Integer]),
      "GET",
      """""",
      this.prefix + """rests/pnearby/""" + "$" + """lat<[^/]+>"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_RestaurantController_getByPopular22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/popular")))
  )
  private[this] lazy val controllers_RestaurantController_getByPopular22_invoker = createInvoker(
    RestaurantController_6.getByPopular(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getByPopular",
      Nil,
      "GET",
      """""",
      this.prefix + """rests/popular"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_RestaurantController_getRecent23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/recent")))
  )
  private[this] lazy val controllers_RestaurantController_getRecent23_invoker = createInvoker(
    RestaurantController_6.getRecent(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRecent",
      Nil,
      "GET",
      """""",
      this.prefix + """rests/recent"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_RestaurantController_createRestaurant24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restsadd")))
  )
  private[this] lazy val controllers_RestaurantController_createRestaurant24_invoker = createInvoker(
    RestaurantController_6.createRestaurant(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "createRestaurant",
      Nil,
      "POST",
      """""",
      this.prefix + """restsadd"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_RestaurantController_deleteRestaurantById25_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/delid/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_deleteRestaurantById25_invoker = createInvoker(
    RestaurantController_6.deleteRestaurantById(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "deleteRestaurantById",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """rests/delid/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_RestaurantController_updateRestaurant26_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_updateRestaurant26_invoker = createInvoker(
    RestaurantController_6.updateRestaurant(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "updateRestaurant",
      Seq(classOf[Integer]),
      "PUT",
      """""",
      this.prefix + """rests/update/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_ImageController_uploadImage27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images")))
  )
  private[this] lazy val controllers_ImageController_uploadImage27_invoker = createInvoker(
    ImageController_5.uploadImage(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImageController",
      "uploadImage",
      Nil,
      "POST",
      """""",
      this.prefix + """images"""
    )
  )

  // @LINE:90
  private[this] lazy val controllers_ImageController_downloadImage28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImageController_downloadImage28_invoker = createInvoker(
    ImageController_5.downloadImage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImageController",
      "downloadImage",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """images/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:92
  private[this] lazy val controllers_ImageController_deleteImage29_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("images/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ImageController_deleteImage29_invoker = createInvoker(
    ImageController_5.deleteImage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ImageController",
      "deleteImage",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """images/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_SuggestionBox_getAllSuggestions30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggest")))
  )
  private[this] lazy val controllers_SuggestionBox_getAllSuggestions30_invoker = createInvoker(
    SuggestionBox_1.getAllSuggestions(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionBox",
      "getAllSuggestions",
      Nil,
      "GET",
      """""",
      this.prefix + """suggest"""
    )
  )

  // @LINE:99
  private[this] lazy val controllers_SuggestionBox_createSuggestion31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggest")))
  )
  private[this] lazy val controllers_SuggestionBox_createSuggestion31_invoker = createInvoker(
    SuggestionBox_1.createSuggestion(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionBox",
      "createSuggestion",
      Nil,
      "POST",
      """""",
      this.prefix + """suggest"""
    )
  )

  // @LINE:101
  private[this] lazy val controllers_SuggestionBox_deleteSuggestionById32_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("suggestdel/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuggestionBox_deleteSuggestionById32_invoker = createInvoker(
    SuggestionBox_1.deleteSuggestionById(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuggestionBox",
      "deleteSuggestionById",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """suggestdel/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_2.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_8.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_HelloWorldController_hello4_route(params) =>
      call { 
        controllers_HelloWorldController_hello4_invoker.call(HelloWorldController_7.hello())
      }
  
    // @LINE:21
    case controllers_AdminController_getAllAdmins5_route(params) =>
      call { 
        controllers_AdminController_getAllAdmins5_invoker.call(AdminController_0.getAllAdmins())
      }
  
    // @LINE:29
    case controllers_AdminController_getAdminById6_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_getAdminById6_invoker.call(AdminController_0.getAdminById(email))
      }
  
    // @LINE:31
    case controllers_AdminController_validateAdmin7_route(params) =>
      call(params.fromPath[String]("email", None), params.fromQuery[String]("pwd", None)) { (email, pwd) =>
        controllers_AdminController_validateAdmin7_invoker.call(AdminController_0.validateAdmin(email, pwd))
      }
  
    // @LINE:33
    case controllers_AdminController_createAdmin8_route(params) =>
      call { 
        controllers_AdminController_createAdmin8_invoker.call(AdminController_0.createAdmin())
      }
  
    // @LINE:35
    case controllers_AdminController_deleteAdminById9_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_deleteAdminById9_invoker.call(AdminController_0.deleteAdminById(email))
      }
  
    // @LINE:43
    case controllers_RestaurantController_getAllRestaurants10_route(params) =>
      call { 
        controllers_RestaurantController_getAllRestaurants10_invoker.call(RestaurantController_6.getAllRestaurants())
      }
  
    // @LINE:45
    case controllers_RestaurantController_getByStreetName11_route(params) =>
      call(params.fromPath[String]("stname", None)) { (stname) =>
        controllers_RestaurantController_getByStreetName11_invoker.call(RestaurantController_6.getByStreetName(stname))
      }
  
    // @LINE:47
    case controllers_RestaurantController_getByPopularStreetName12_route(params) =>
      call(params.fromPath[String]("stname", None)) { (stname) =>
        controllers_RestaurantController_getByPopularStreetName12_invoker.call(RestaurantController_6.getByPopularStreetName(stname))
      }
  
    // @LINE:49
    case controllers_RestaurantController_getRestaurantByName13_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RestaurantController_getRestaurantByName13_invoker.call(RestaurantController_6.getRestaurantByName(name))
      }
  
    // @LINE:51
    case controllers_RestaurantController_getByCuisines14_route(params) =>
      call(params.fromPath[String]("cuisine", None)) { (cuisine) =>
        controllers_RestaurantController_getByCuisines14_invoker.call(RestaurantController_6.getByCuisines(cuisine))
      }
  
    // @LINE:53
    case controllers_RestaurantController_getRestaurantById15_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_getRestaurantById15_invoker.call(RestaurantController_6.getRestaurantById(id))
      }
  
    // @LINE:55
    case controllers_RestaurantController_getRestaurantByTime16_route(params) =>
      call { 
        controllers_RestaurantController_getRestaurantByTime16_invoker.call(RestaurantController_6.getRestaurantByTime())
      }
  
    // @LINE:57
    case controllers_RestaurantController_getRestaurantByLowPrice17_route(params) =>
      call { 
        controllers_RestaurantController_getRestaurantByLowPrice17_invoker.call(RestaurantController_6.getRestaurantByLowPrice())
      }
  
    // @LINE:59
    case controllers_RestaurantController_getRestaurantByModeratePrice18_route(params) =>
      call { 
        controllers_RestaurantController_getRestaurantByModeratePrice18_invoker.call(RestaurantController_6.getRestaurantByModeratePrice())
      }
  
    // @LINE:61
    case controllers_RestaurantController_getRestaurantByHighPrice19_route(params) =>
      call { 
        controllers_RestaurantController_getRestaurantByHighPrice19_invoker.call(RestaurantController_6.getRestaurantByHighPrice())
      }
  
    // @LINE:63
    case controllers_RestaurantController_getRestaurantNearBy20_route(params) =>
      call(params.fromPath[String]("lat", None), params.fromQuery[String]("lon", None), params.fromQuery[Integer]("dist", None)) { (lat, lon, dist) =>
        controllers_RestaurantController_getRestaurantNearBy20_invoker.call(RestaurantController_6.getRestaurantNearBy(lat, lon, dist))
      }
  
    // @LINE:65
    case controllers_RestaurantController_getByPopularNearBy21_route(params) =>
      call(params.fromPath[String]("lat", None), params.fromQuery[String]("lon", None), params.fromQuery[Integer]("dist", None)) { (lat, lon, dist) =>
        controllers_RestaurantController_getByPopularNearBy21_invoker.call(RestaurantController_6.getByPopularNearBy(lat, lon, dist))
      }
  
    // @LINE:69
    case controllers_RestaurantController_getByPopular22_route(params) =>
      call { 
        controllers_RestaurantController_getByPopular22_invoker.call(RestaurantController_6.getByPopular())
      }
  
    // @LINE:71
    case controllers_RestaurantController_getRecent23_route(params) =>
      call { 
        controllers_RestaurantController_getRecent23_invoker.call(RestaurantController_6.getRecent())
      }
  
    // @LINE:73
    case controllers_RestaurantController_createRestaurant24_route(params) =>
      call { 
        controllers_RestaurantController_createRestaurant24_invoker.call(RestaurantController_6.createRestaurant())
      }
  
    // @LINE:77
    case controllers_RestaurantController_deleteRestaurantById25_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_deleteRestaurantById25_invoker.call(RestaurantController_6.deleteRestaurantById(id))
      }
  
    // @LINE:79
    case controllers_RestaurantController_updateRestaurant26_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_updateRestaurant26_invoker.call(RestaurantController_6.updateRestaurant(id))
      }
  
    // @LINE:88
    case controllers_ImageController_uploadImage27_route(params) =>
      call { 
        controllers_ImageController_uploadImage27_invoker.call(ImageController_5.uploadImage())
      }
  
    // @LINE:90
    case controllers_ImageController_downloadImage28_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImageController_downloadImage28_invoker.call(ImageController_5.downloadImage(id))
      }
  
    // @LINE:92
    case controllers_ImageController_deleteImage29_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_ImageController_deleteImage29_invoker.call(ImageController_5.deleteImage(id))
      }
  
    // @LINE:97
    case controllers_SuggestionBox_getAllSuggestions30_route(params) =>
      call { 
        controllers_SuggestionBox_getAllSuggestions30_invoker.call(SuggestionBox_1.getAllSuggestions())
      }
  
    // @LINE:99
    case controllers_SuggestionBox_createSuggestion31_route(params) =>
      call { 
        controllers_SuggestionBox_createSuggestion31_invoker.call(SuggestionBox_1.createSuggestion())
      }
  
    // @LINE:101
    case controllers_SuggestionBox_deleteSuggestionById32_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_SuggestionBox_deleteSuggestionById32_invoker.call(SuggestionBox_1.deleteSuggestionById(id))
      }
  }
}
