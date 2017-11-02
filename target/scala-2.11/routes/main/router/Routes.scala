
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/conf/routes
// @DATE:Thu Nov 02 16:08:38 CDT 2017

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
  HomeController_0: controllers.HomeController,
  // @LINE:10
  Assets_2: controllers.Assets,
  // @LINE:14
  DatingController_1: controllers.DatingController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:10
    Assets_2: controllers.Assets,
    // @LINE:14
    DatingController_1: controllers.DatingController
  ) = this(errorHandler, HomeController_0, Assets_2, DatingController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_2, DatingController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generate""", """controllers.DatingController.getGenerate"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generate""", """controllers.DatingController.postGenerate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getPhoto/""" + "$" + """id<[^/]+>""", """controllers.DatingController.getPhoto(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restart""", """controllers.DatingController.restart"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """generateRandom""", """controllers.DatingController.generateRandom"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getActivities""", """controllers.DatingController.getActivities"""),
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
    HomeController_0.index,
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

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_DatingController_getGenerate2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generate")))
  )
  private[this] lazy val controllers_DatingController_getGenerate2_invoker = createInvoker(
    DatingController_1.getGenerate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DatingController",
      "getGenerate",
      Nil,
      "GET",
      """""",
      this.prefix + """generate"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_DatingController_postGenerate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generate")))
  )
  private[this] lazy val controllers_DatingController_postGenerate3_invoker = createInvoker(
    DatingController_1.postGenerate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DatingController",
      "postGenerate",
      Nil,
      "POST",
      """""",
      this.prefix + """generate"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_DatingController_getPhoto4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getPhoto/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_DatingController_getPhoto4_invoker = createInvoker(
    DatingController_1.getPhoto(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DatingController",
      "getPhoto",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """getPhoto/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_DatingController_restart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restart")))
  )
  private[this] lazy val controllers_DatingController_restart5_invoker = createInvoker(
    DatingController_1.restart,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DatingController",
      "restart",
      Nil,
      "GET",
      """""",
      this.prefix + """restart"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_DatingController_generateRandom6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("generateRandom")))
  )
  private[this] lazy val controllers_DatingController_generateRandom6_invoker = createInvoker(
    DatingController_1.generateRandom,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DatingController",
      "generateRandom",
      Nil,
      "POST",
      """""",
      this.prefix + """generateRandom"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_DatingController_getActivities7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getActivities")))
  )
  private[this] lazy val controllers_DatingController_getActivities7_invoker = createInvoker(
    DatingController_1.getActivities,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.DatingController",
      "getActivities",
      Nil,
      "POST",
      """""",
      this.prefix + """getActivities"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:14
    case controllers_DatingController_getGenerate2_route(params) =>
      call { 
        controllers_DatingController_getGenerate2_invoker.call(DatingController_1.getGenerate)
      }
  
    // @LINE:15
    case controllers_DatingController_postGenerate3_route(params) =>
      call { 
        controllers_DatingController_postGenerate3_invoker.call(DatingController_1.postGenerate)
      }
  
    // @LINE:16
    case controllers_DatingController_getPhoto4_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_DatingController_getPhoto4_invoker.call(DatingController_1.getPhoto(id))
      }
  
    // @LINE:17
    case controllers_DatingController_restart5_route(params) =>
      call { 
        controllers_DatingController_restart5_invoker.call(DatingController_1.restart)
      }
  
    // @LINE:18
    case controllers_DatingController_generateRandom6_route(params) =>
      call { 
        controllers_DatingController_generateRandom6_invoker.call(DatingController_1.generateRandom)
      }
  
    // @LINE:19
    case controllers_DatingController_getActivities7_route(params) =>
      call { 
        controllers_DatingController_getActivities7_invoker.call(DatingController_1.getActivities)
      }
  }
}
