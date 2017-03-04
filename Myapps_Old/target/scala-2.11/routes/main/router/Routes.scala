
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kakhila/PlaySampleApp/Myapps/conf/routes
// @DATE:Thu Feb 23 16:24:08 IST 2017

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
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_6: controllers.Assets,
  // @LINE:15
  HelloWorldController_5: controllers.HelloWorldController,
  // @LINE:21
  AdminController_0: controllers.AdminController,
  // @LINE:36
  RestaurantController_4: controllers.RestaurantController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_6: controllers.Assets,
    // @LINE:15
    HelloWorldController_5: controllers.HelloWorldController,
    // @LINE:21
    AdminController_0: controllers.AdminController,
    // @LINE:36
    RestaurantController_4: controllers.RestaurantController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_6, HelloWorldController_5, AdminController_0, RestaurantController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_6, HelloWorldController_5, AdminController_0, RestaurantController_4, prefix)
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins""", """controllers.AdminController.createAdmin()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins/del/""" + "$" + """email<[^/]+>""", """controllers.AdminController.deleteAdminById(email:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins/""" + "$" + """email<[^/]+>""", """controllers.AdminController.updateAdminById(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests""", """controllers.RestaurantController.getAllRestaurants()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbystname/""" + "$" + """stname<[^/]+>""", """controllers.RestaurantController.getByStreetName(stname:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbyname/""" + "$" + """name<[^/]+>""", """controllers.RestaurantController.getRestaurantByName(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbyid/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.getRestaurantById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/getbyTime""", """controllers.RestaurantController.getRestaurantByTime()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/nearby/""" + "$" + """lat<[^/]+>""", """controllers.RestaurantController.getRestaurantNearBy(lat:String, lon:String, dist:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/nearbyrests""", """controllers.RestaurantController.getRestaurantNearByRests()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restsadd""", """controllers.RestaurantController.createRestaurant()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/delid/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.deleteRestaurantById(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """rests/update/""" + "$" + """id<[^/]+>""", """controllers.RestaurantController.updateRestaurant(id:Integer)"""),
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
    HomeController_2.index,
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
    CountController_1.count,
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
    AsyncController_3.message,
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
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
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
    HelloWorldController_5.hello(),
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

  // @LINE:23
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

  // @LINE:25
  private[this] lazy val controllers_AdminController_createAdmin7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins")))
  )
  private[this] lazy val controllers_AdminController_createAdmin7_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_AdminController_deleteAdminById8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins/del/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteAdminById8_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_AdminController_updateAdminById9_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateAdminById9_invoker = createInvoker(
    AdminController_0.updateAdminById(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateAdminById",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """admins/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_RestaurantController_getAllRestaurants10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests")))
  )
  private[this] lazy val controllers_RestaurantController_getAllRestaurants10_invoker = createInvoker(
    RestaurantController_4.getAllRestaurants(),
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

  // @LINE:38
  private[this] lazy val controllers_RestaurantController_getByStreetName11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbystname/"), DynamicPart("stname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getByStreetName11_invoker = createInvoker(
    RestaurantController_4.getByStreetName(fakeValue[String]),
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

  // @LINE:40
  private[this] lazy val controllers_RestaurantController_getRestaurantByName12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbyname/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantByName12_invoker = createInvoker(
    RestaurantController_4.getRestaurantByName(fakeValue[String]),
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

  // @LINE:42
  private[this] lazy val controllers_RestaurantController_getRestaurantById13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbyid/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantById13_invoker = createInvoker(
    RestaurantController_4.getRestaurantById(fakeValue[Integer]),
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

  // @LINE:44
  private[this] lazy val controllers_RestaurantController_getRestaurantByTime14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/getbyTime")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantByTime14_invoker = createInvoker(
    RestaurantController_4.getRestaurantByTime(),
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

  // @LINE:46
  private[this] lazy val controllers_RestaurantController_getRestaurantNearBy15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/nearby/"), DynamicPart("lat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantNearBy15_invoker = createInvoker(
    RestaurantController_4.getRestaurantNearBy(fakeValue[String], fakeValue[String], fakeValue[Integer]),
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

  // @LINE:48
  private[this] lazy val controllers_RestaurantController_getRestaurantNearByRests16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/nearbyrests")))
  )
  private[this] lazy val controllers_RestaurantController_getRestaurantNearByRests16_invoker = createInvoker(
    RestaurantController_4.getRestaurantNearByRests(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "getRestaurantNearByRests",
      Nil,
      "GET",
      """""",
      this.prefix + """rests/nearbyrests"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_RestaurantController_createRestaurant17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restsadd")))
  )
  private[this] lazy val controllers_RestaurantController_createRestaurant17_invoker = createInvoker(
    RestaurantController_4.createRestaurant(),
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

  // @LINE:54
  private[this] lazy val controllers_RestaurantController_deleteRestaurantById18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/delid/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_deleteRestaurantById18_invoker = createInvoker(
    RestaurantController_4.deleteRestaurantById(fakeValue[Integer]),
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

  // @LINE:56
  private[this] lazy val controllers_RestaurantController_updateRestaurant19_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("rests/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestaurantController_updateRestaurant19_invoker = createInvoker(
    RestaurantController_4.updateRestaurant(fakeValue[Integer]),
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_6.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_HelloWorldController_hello4_route(params) =>
      call { 
        controllers_HelloWorldController_hello4_invoker.call(HelloWorldController_5.hello())
      }
  
    // @LINE:21
    case controllers_AdminController_getAllAdmins5_route(params) =>
      call { 
        controllers_AdminController_getAllAdmins5_invoker.call(AdminController_0.getAllAdmins())
      }
  
    // @LINE:23
    case controllers_AdminController_getAdminById6_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_getAdminById6_invoker.call(AdminController_0.getAdminById(email))
      }
  
    // @LINE:25
    case controllers_AdminController_createAdmin7_route(params) =>
      call { 
        controllers_AdminController_createAdmin7_invoker.call(AdminController_0.createAdmin())
      }
  
    // @LINE:27
    case controllers_AdminController_deleteAdminById8_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_deleteAdminById8_invoker.call(AdminController_0.deleteAdminById(email))
      }
  
    // @LINE:29
    case controllers_AdminController_updateAdminById9_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_AdminController_updateAdminById9_invoker.call(AdminController_0.updateAdminById(email))
      }
  
    // @LINE:36
    case controllers_RestaurantController_getAllRestaurants10_route(params) =>
      call { 
        controllers_RestaurantController_getAllRestaurants10_invoker.call(RestaurantController_4.getAllRestaurants())
      }
  
    // @LINE:38
    case controllers_RestaurantController_getByStreetName11_route(params) =>
      call(params.fromPath[String]("stname", None)) { (stname) =>
        controllers_RestaurantController_getByStreetName11_invoker.call(RestaurantController_4.getByStreetName(stname))
      }
  
    // @LINE:40
    case controllers_RestaurantController_getRestaurantByName12_route(params) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_RestaurantController_getRestaurantByName12_invoker.call(RestaurantController_4.getRestaurantByName(name))
      }
  
    // @LINE:42
    case controllers_RestaurantController_getRestaurantById13_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_getRestaurantById13_invoker.call(RestaurantController_4.getRestaurantById(id))
      }
  
    // @LINE:44
    case controllers_RestaurantController_getRestaurantByTime14_route(params) =>
      call { 
        controllers_RestaurantController_getRestaurantByTime14_invoker.call(RestaurantController_4.getRestaurantByTime())
      }
  
    // @LINE:46
    case controllers_RestaurantController_getRestaurantNearBy15_route(params) =>
      call(params.fromPath[String]("lat", None), params.fromQuery[String]("lon", None), params.fromQuery[Integer]("dist", None)) { (lat, lon, dist) =>
        controllers_RestaurantController_getRestaurantNearBy15_invoker.call(RestaurantController_4.getRestaurantNearBy(lat, lon, dist))
      }
  
    // @LINE:48
    case controllers_RestaurantController_getRestaurantNearByRests16_route(params) =>
      call { 
        controllers_RestaurantController_getRestaurantNearByRests16_invoker.call(RestaurantController_4.getRestaurantNearByRests())
      }
  
    // @LINE:50
    case controllers_RestaurantController_createRestaurant17_route(params) =>
      call { 
        controllers_RestaurantController_createRestaurant17_invoker.call(RestaurantController_4.createRestaurant())
      }
  
    // @LINE:54
    case controllers_RestaurantController_deleteRestaurantById18_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_deleteRestaurantById18_invoker.call(RestaurantController_4.deleteRestaurantById(id))
      }
  
    // @LINE:56
    case controllers_RestaurantController_updateRestaurant19_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_RestaurantController_updateRestaurant19_invoker.call(RestaurantController_4.updateRestaurant(id))
      }
  }
}
