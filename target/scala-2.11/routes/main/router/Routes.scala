
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sat Jul 07 21:14:09 GMT-03:00 2018

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
  SimuladorController_0: javax.inject.Provider[controllers.SimuladorController],
  // @LINE:9
  PessoaController_3: javax.inject.Provider[controllers.PessoaController],
  // @LINE:12
  AtividadeController_4: javax.inject.Provider[controllers.AtividadeController],
  // @LINE:14
  FavelaController_1: javax.inject.Provider[controllers.FavelaController],
  // @LINE:21
  MunicipioController_2: javax.inject.Provider[controllers.MunicipioController],
  // @LINE:25
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    SimuladorController_0: javax.inject.Provider[controllers.SimuladorController],
    // @LINE:9
    PessoaController_3: javax.inject.Provider[controllers.PessoaController],
    // @LINE:12
    AtividadeController_4: javax.inject.Provider[controllers.AtividadeController],
    // @LINE:14
    FavelaController_1: javax.inject.Provider[controllers.FavelaController],
    // @LINE:21
    MunicipioController_2: javax.inject.Provider[controllers.MunicipioController],
    // @LINE:25
    Assets_5: controllers.Assets
  ) = this(errorHandler, SimuladorController_0, PessoaController_3, AtividadeController_4, FavelaController_1, MunicipioController_2, Assets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SimuladorController_0, PessoaController_3, AtividadeController_4, FavelaController_1, MunicipioController_2, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/simular""", """@controllers.SimuladorController@.simular()"""),
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
  private[this] lazy val controllers_SimuladorController_simular0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/simular")))
  )
  private[this] lazy val controllers_SimuladorController_simular0_invoker = createInvoker(
    SimuladorController_0.get.simular(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SimuladorController",
      "simular",
      Nil,
      "GET",
      """## SIMULADOR""",
      this.prefix + """api/simular"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_PessoaController_acessar1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas")))
  )
  private[this] lazy val controllers_PessoaController_acessar1_invoker = createInvoker(
    PessoaController_3.get.acessar(),
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

  // @LINE:10
  private[this] lazy val controllers_PessoaController_detalhes2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PessoaController_detalhes2_invoker = createInvoker(
    PessoaController_3.get.detalhes(fakeValue[Long]),
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

  // @LINE:12
  private[this] lazy val controllers_AtividadeController_criar3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas/"), DynamicPart("pessoaId", """[^/]+""",true), StaticPart("/atividades")))
  )
  private[this] lazy val controllers_AtividadeController_criar3_invoker = createInvoker(
    AtividadeController_4.get.criar(fakeValue[Long]),
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

  // @LINE:14
  private[this] lazy val controllers_FavelaController_listarUf4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/favelas/"), DynamicPart("uf", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavelaController_listarUf4_invoker = createInvoker(
    FavelaController_1.get.listarUf(fakeValue[String]),
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

  // @LINE:15
  private[this] lazy val controllers_FavelaController_listarCidade5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/favelas/"), DynamicPart("uf", """[^/]+""",true), StaticPart("/"), DynamicPart("cidade", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavelaController_listarCidade5_invoker = createInvoker(
    FavelaController_1.get.listarCidade(fakeValue[String], fakeValue[String]),
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

  // @LINE:16
  private[this] lazy val controllers_AtividadeController_listarFavela6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/favelas/"), DynamicPart("favelaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_listarFavela6_invoker = createInvoker(
    AtividadeController_4.get.listarFavela(fakeValue[Long]),
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

  // @LINE:17
  private[this] lazy val controllers_AtividadeController_listarCidade7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("uf", """[^/]+""",true), StaticPart("/"), DynamicPart("cidade", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_listarCidade7_invoker = createInvoker(
    AtividadeController_4.get.listarCidade(fakeValue[String], fakeValue[String]),
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

  // @LINE:18
  private[this] lazy val controllers_AtividadeController_contribuir8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("atividadeId", """[^/]+""",true), StaticPart("/contribuir/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_contribuir8_invoker = createInvoker(
    AtividadeController_4.get.contribuir(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:19
  private[this] lazy val controllers_AtividadeController_cancelarContribuicao9_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("atividadeId", """[^/]+""",true), StaticPart("/contribuir/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_cancelarContribuicao9_invoker = createInvoker(
    AtividadeController_4.get.cancelarContribuicao(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:21
  private[this] lazy val controllers_MunicipioController_listarUf10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/municipios/"), DynamicPart("uf", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MunicipioController_listarUf10_invoker = createInvoker(
    MunicipioController_2.get.listarUf(fakeValue[String]),
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

  // @LINE:25
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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
    case controllers_SimuladorController_simular0_route(params) =>
      call { 
        controllers_SimuladorController_simular0_invoker.call(SimuladorController_0.get.simular())
      }
  
    // @LINE:9
    case controllers_PessoaController_acessar1_route(params) =>
      call { 
        controllers_PessoaController_acessar1_invoker.call(PessoaController_3.get.acessar())
      }
  
    // @LINE:10
    case controllers_PessoaController_detalhes2_route(params) =>
      call(params.fromPath[Long]("pessoaId", None)) { (pessoaId) =>
        controllers_PessoaController_detalhes2_invoker.call(PessoaController_3.get.detalhes(pessoaId))
      }
  
    // @LINE:12
    case controllers_AtividadeController_criar3_route(params) =>
      call(params.fromPath[Long]("pessoaId", None)) { (pessoaId) =>
        controllers_AtividadeController_criar3_invoker.call(AtividadeController_4.get.criar(pessoaId))
      }
  
    // @LINE:14
    case controllers_FavelaController_listarUf4_route(params) =>
      call(params.fromPath[String]("uf", None)) { (uf) =>
        controllers_FavelaController_listarUf4_invoker.call(FavelaController_1.get.listarUf(uf))
      }
  
    // @LINE:15
    case controllers_FavelaController_listarCidade5_route(params) =>
      call(params.fromPath[String]("uf", None), params.fromPath[String]("cidade", None)) { (uf, cidade) =>
        controllers_FavelaController_listarCidade5_invoker.call(FavelaController_1.get.listarCidade(uf, cidade))
      }
  
    // @LINE:16
    case controllers_AtividadeController_listarFavela6_route(params) =>
      call(params.fromPath[Long]("favelaId", None)) { (favelaId) =>
        controllers_AtividadeController_listarFavela6_invoker.call(AtividadeController_4.get.listarFavela(favelaId))
      }
  
    // @LINE:17
    case controllers_AtividadeController_listarCidade7_route(params) =>
      call(params.fromPath[String]("uf", None), params.fromPath[String]("cidade", None)) { (uf, cidade) =>
        controllers_AtividadeController_listarCidade7_invoker.call(AtividadeController_4.get.listarCidade(uf, cidade))
      }
  
    // @LINE:18
    case controllers_AtividadeController_contribuir8_route(params) =>
      call(params.fromPath[Long]("atividadeId", None), params.fromPath[Long]("pessoaId", None)) { (atividadeId, pessoaId) =>
        controllers_AtividadeController_contribuir8_invoker.call(AtividadeController_4.get.contribuir(atividadeId, pessoaId))
      }
  
    // @LINE:19
    case controllers_AtividadeController_cancelarContribuicao9_route(params) =>
      call(params.fromPath[Long]("atividadeId", None), params.fromPath[Long]("pessoaId", None)) { (atividadeId, pessoaId) =>
        controllers_AtividadeController_cancelarContribuicao9_invoker.call(AtividadeController_4.get.cancelarContribuicao(atividadeId, pessoaId))
      }
  
    // @LINE:21
    case controllers_MunicipioController_listarUf10_route(params) =>
      call(params.fromPath[String]("uf", None)) { (uf) =>
        controllers_MunicipioController_listarUf10_invoker.call(MunicipioController_2.get.listarUf(uf))
      }
  
    // @LINE:25
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
