
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sat Jul 07 20:21:03 GMT-03:00 2018

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
  PessoaController_2: javax.inject.Provider[controllers.PessoaController],
  // @LINE:9
  AtividadeController_3: javax.inject.Provider[controllers.AtividadeController],
  // @LINE:11
  FavelaController_0: javax.inject.Provider[controllers.FavelaController],
  // @LINE:18
  MunicipioController_1: javax.inject.Provider[controllers.MunicipioController],
  // @LINE:22
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PessoaController_2: javax.inject.Provider[controllers.PessoaController],
    // @LINE:9
    AtividadeController_3: javax.inject.Provider[controllers.AtividadeController],
    // @LINE:11
    FavelaController_0: javax.inject.Provider[controllers.FavelaController],
    // @LINE:18
    MunicipioController_1: javax.inject.Provider[controllers.MunicipioController],
    // @LINE:22
    Assets_4: controllers.Assets
  ) = this(errorHandler, PessoaController_2, AtividadeController_3, FavelaController_0, MunicipioController_1, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PessoaController_2, AtividadeController_3, FavelaController_0, MunicipioController_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/pessoas""", """@controllers.PessoaController@.acessar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/pessoas/""" + "$" + """pessoaId<[^/]+>""", """@controllers.PessoaController@.detalhes(pessoaId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/pessoas/""" + "$" + """pessoaId<[^/]+>/atividades""", """@controllers.AtividadeController@.criar(pessoaId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/favelas/""" + "$" + """uf<[^/]+>""", """@controllers.FavelaController@.listarUf(uf:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/favelas/""" + "$" + """uf<[^/]+>/""" + "$" + """cidade<[^/]+>""", """@controllers.FavelaController@.listarCidade(uf:String, cidade:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/atividades/favelas/""" + "$" + """favelaId<[^/]+>""", """@controllers.AtividadeController@.listarFavela(favelaId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/atividades/""" + "$" + """uf<[^/]+>/""" + "$" + """cidade<[^/]+>""", """@controllers.AtividadeController@.listarCidade(uf:String, cidade:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/atividades/""" + "$" + """atividadeId<[^/]+>/contribuir/""" + "$" + """pessoaId<[^/]+>""", """@controllers.AtividadeController@.contribuir(atividadeId:Long, pessoaId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/atividades/""" + "$" + """atividadeId<[^/]+>/contribuir/""" + "$" + """pessoaId<[^/]+>""", """@controllers.AtividadeController@.cancelarContribuicao(atividadeId:Long, pessoaId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/municipios/""" + "$" + """uf<[^/]+>""", """@controllers.MunicipioController@.listarUf(uf:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_PessoaController_acessar0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas")))
  )
  private[this] lazy val controllers_PessoaController_acessar0_invoker = createInvoker(
    PessoaController_2.get.acessar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "acessar",
      Nil,
      "POST",
      """## API""",
      this.prefix + """api/pessoas"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PessoaController_detalhes1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PessoaController_detalhes1_invoker = createInvoker(
    PessoaController_2.get.detalhes(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PessoaController",
      "detalhes",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """api/pessoas/""" + "$" + """pessoaId<[^/]+>"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AtividadeController_criar2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas/"), DynamicPart("pessoaId", """[^/]+""",true), StaticPart("/atividades")))
  )
  private[this] lazy val controllers_AtividadeController_criar2_invoker = createInvoker(
    AtividadeController_3.get.criar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "criar",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """api/pessoas/""" + "$" + """pessoaId<[^/]+>/atividades"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_FavelaController_listarUf3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/favelas/"), DynamicPart("uf", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavelaController_listarUf3_invoker = createInvoker(
    FavelaController_0.get.listarUf(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavelaController",
      "listarUf",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/favelas/""" + "$" + """uf<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_FavelaController_listarCidade4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/favelas/"), DynamicPart("uf", """[^/]+""",true), StaticPart("/"), DynamicPart("cidade", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavelaController_listarCidade4_invoker = createInvoker(
    FavelaController_0.get.listarCidade(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FavelaController",
      "listarCidade",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/favelas/""" + "$" + """uf<[^/]+>/""" + "$" + """cidade<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_AtividadeController_listarFavela5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/favelas/"), DynamicPart("favelaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_listarFavela5_invoker = createInvoker(
    AtividadeController_3.get.listarFavela(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "listarFavela",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """api/atividades/favelas/""" + "$" + """favelaId<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_AtividadeController_listarCidade6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("uf", """[^/]+""",true), StaticPart("/"), DynamicPart("cidade", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_listarCidade6_invoker = createInvoker(
    AtividadeController_3.get.listarCidade(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "listarCidade",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """api/atividades/""" + "$" + """uf<[^/]+>/""" + "$" + """cidade<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AtividadeController_contribuir7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("atividadeId", """[^/]+""",true), StaticPart("/contribuir/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_contribuir7_invoker = createInvoker(
    AtividadeController_3.get.contribuir(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "contribuir",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """api/atividades/""" + "$" + """atividadeId<[^/]+>/contribuir/""" + "$" + """pessoaId<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_AtividadeController_cancelarContribuicao8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("atividadeId", """[^/]+""",true), StaticPart("/contribuir/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_cancelarContribuicao8_invoker = createInvoker(
    AtividadeController_3.get.cancelarContribuicao(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "cancelarContribuicao",
      Seq(classOf[Long], classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """api/atividades/""" + "$" + """atividadeId<[^/]+>/contribuir/""" + "$" + """pessoaId<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MunicipioController_listarUf9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/municipios/"), DynamicPart("uf", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MunicipioController_listarUf9_invoker = createInvoker(
    MunicipioController_1.get.listarUf(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MunicipioController",
      "listarUf",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/municipios/""" + "$" + """uf<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """## ASSETS
 Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_PessoaController_acessar0_route(params) =>
      call { 
        controllers_PessoaController_acessar0_invoker.call(PessoaController_2.get.acessar())
      }
  
    // @LINE:7
    case controllers_PessoaController_detalhes1_route(params) =>
      call(params.fromPath[Long]("pessoaId", None)) { (pessoaId) =>
        controllers_PessoaController_detalhes1_invoker.call(PessoaController_2.get.detalhes(pessoaId))
      }
  
    // @LINE:9
    case controllers_AtividadeController_criar2_route(params) =>
      call(params.fromPath[Long]("pessoaId", None)) { (pessoaId) =>
        controllers_AtividadeController_criar2_invoker.call(AtividadeController_3.get.criar(pessoaId))
      }
  
    // @LINE:11
    case controllers_FavelaController_listarUf3_route(params) =>
      call(params.fromPath[String]("uf", None)) { (uf) =>
        controllers_FavelaController_listarUf3_invoker.call(FavelaController_0.get.listarUf(uf))
      }
  
    // @LINE:12
    case controllers_FavelaController_listarCidade4_route(params) =>
      call(params.fromPath[String]("uf", None), params.fromPath[String]("cidade", None)) { (uf, cidade) =>
        controllers_FavelaController_listarCidade4_invoker.call(FavelaController_0.get.listarCidade(uf, cidade))
      }
  
    // @LINE:13
    case controllers_AtividadeController_listarFavela5_route(params) =>
      call(params.fromPath[Long]("favelaId", None)) { (favelaId) =>
        controllers_AtividadeController_listarFavela5_invoker.call(AtividadeController_3.get.listarFavela(favelaId))
      }
  
    // @LINE:14
    case controllers_AtividadeController_listarCidade6_route(params) =>
      call(params.fromPath[String]("uf", None), params.fromPath[String]("cidade", None)) { (uf, cidade) =>
        controllers_AtividadeController_listarCidade6_invoker.call(AtividadeController_3.get.listarCidade(uf, cidade))
      }
  
    // @LINE:15
    case controllers_AtividadeController_contribuir7_route(params) =>
      call(params.fromPath[Long]("atividadeId", None), params.fromPath[Long]("pessoaId", None)) { (atividadeId, pessoaId) =>
        controllers_AtividadeController_contribuir7_invoker.call(AtividadeController_3.get.contribuir(atividadeId, pessoaId))
      }
  
    // @LINE:16
    case controllers_AtividadeController_cancelarContribuicao8_route(params) =>
      call(params.fromPath[Long]("atividadeId", None), params.fromPath[Long]("pessoaId", None)) { (atividadeId, pessoaId) =>
        controllers_AtividadeController_cancelarContribuicao8_invoker.call(AtividadeController_3.get.cancelarContribuicao(atividadeId, pessoaId))
      }
  
    // @LINE:18
    case controllers_MunicipioController_listarUf9_route(params) =>
      call(params.fromPath[String]("uf", None)) { (uf) =>
        controllers_MunicipioController_listarUf9_invoker.call(MunicipioController_1.get.listarUf(uf))
      }
  
    // @LINE:22
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
