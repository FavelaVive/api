
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sun Jul 08 01:37:50 GMT-03:00 2018

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
  SimuladorController_1: javax.inject.Provider[controllers.SimuladorController],
  // @LINE:9
  HomeController_0: javax.inject.Provider[controllers.HomeController],
  // @LINE:12
  PessoaController_4: javax.inject.Provider[controllers.PessoaController],
  // @LINE:15
  AtividadeController_5: javax.inject.Provider[controllers.AtividadeController],
  // @LINE:18
  FavelaController_2: javax.inject.Provider[controllers.FavelaController],
  // @LINE:25
  MunicipioController_3: javax.inject.Provider[controllers.MunicipioController],
  // @LINE:29
  Assets_6: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    SimuladorController_1: javax.inject.Provider[controllers.SimuladorController],
    // @LINE:9
    HomeController_0: javax.inject.Provider[controllers.HomeController],
    // @LINE:12
    PessoaController_4: javax.inject.Provider[controllers.PessoaController],
    // @LINE:15
    AtividadeController_5: javax.inject.Provider[controllers.AtividadeController],
    // @LINE:18
    FavelaController_2: javax.inject.Provider[controllers.FavelaController],
    // @LINE:25
    MunicipioController_3: javax.inject.Provider[controllers.MunicipioController],
    // @LINE:29
    Assets_6: controllers.Assets
  ) = this(errorHandler, SimuladorController_1, HomeController_0, PessoaController_4, AtividadeController_5, FavelaController_2, MunicipioController_3, Assets_6, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SimuladorController_1, HomeController_0, PessoaController_4, AtividadeController_5, FavelaController_2, MunicipioController_3, Assets_6, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/simular""", """@controllers.SimuladorController@.simular()"""),
    ("""GET""", this.prefix, """@controllers.HomeController@.main()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/pessoas""", """@controllers.PessoaController@.acessar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/pessoas/""" + "$" + """pessoaId<[^/]+>""", """@controllers.PessoaController@.detalhes(pessoaId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/pessoas/""" + "$" + """pessoaId<[^/]+>/atividades""", """@controllers.AtividadeController@.criar(pessoaId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/pessoas/""" + "$" + """pessoaId<[^/]+>/contribuicoes""", """@controllers.AtividadeController@.contribuicoes(pessoaId:Long)"""),
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
    SimuladorController_1.get.simular(),
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
  private[this] lazy val controllers_HomeController_main1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_main1_invoker = createInvoker(
    HomeController_0.get.main(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "main",
      Nil,
      "GET",
      """## ADMIN""",
      this.prefix + """"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_PessoaController_acessar2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas")))
  )
  private[this] lazy val controllers_PessoaController_acessar2_invoker = createInvoker(
    PessoaController_4.get.acessar(),
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

  // @LINE:13
  private[this] lazy val controllers_PessoaController_detalhes3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PessoaController_detalhes3_invoker = createInvoker(
    PessoaController_4.get.detalhes(fakeValue[Long]),
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

  // @LINE:15
  private[this] lazy val controllers_AtividadeController_criar4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas/"), DynamicPart("pessoaId", """[^/]+""",true), StaticPart("/atividades")))
  )
  private[this] lazy val controllers_AtividadeController_criar4_invoker = createInvoker(
    AtividadeController_5.get.criar(fakeValue[Long]),
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

  // @LINE:16
  private[this] lazy val controllers_AtividadeController_contribuicoes5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/pessoas/"), DynamicPart("pessoaId", """[^/]+""",true), StaticPart("/contribuicoes")))
  )
  private[this] lazy val controllers_AtividadeController_contribuicoes5_invoker = createInvoker(
    AtividadeController_5.get.contribuicoes(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AtividadeController",
      "contribuicoes",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """api/pessoas/""" + "$" + """pessoaId<[^/]+>/contribuicoes"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_FavelaController_listarUf6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/favelas/"), DynamicPart("uf", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavelaController_listarUf6_invoker = createInvoker(
    FavelaController_2.get.listarUf(fakeValue[String]),
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

  // @LINE:19
  private[this] lazy val controllers_FavelaController_listarCidade7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/favelas/"), DynamicPart("uf", """[^/]+""",true), StaticPart("/"), DynamicPart("cidade", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FavelaController_listarCidade7_invoker = createInvoker(
    FavelaController_2.get.listarCidade(fakeValue[String], fakeValue[String]),
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

  // @LINE:20
  private[this] lazy val controllers_AtividadeController_listarFavela8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/favelas/"), DynamicPart("favelaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_listarFavela8_invoker = createInvoker(
    AtividadeController_5.get.listarFavela(fakeValue[Long]),
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

  // @LINE:21
  private[this] lazy val controllers_AtividadeController_listarCidade9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("uf", """[^/]+""",true), StaticPart("/"), DynamicPart("cidade", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_listarCidade9_invoker = createInvoker(
    AtividadeController_5.get.listarCidade(fakeValue[String], fakeValue[String]),
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

  // @LINE:22
  private[this] lazy val controllers_AtividadeController_contribuir10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("atividadeId", """[^/]+""",true), StaticPart("/contribuir/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_contribuir10_invoker = createInvoker(
    AtividadeController_5.get.contribuir(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:23
  private[this] lazy val controllers_AtividadeController_cancelarContribuicao11_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/atividades/"), DynamicPart("atividadeId", """[^/]+""",true), StaticPart("/contribuir/"), DynamicPart("pessoaId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AtividadeController_cancelarContribuicao11_invoker = createInvoker(
    AtividadeController_5.get.cancelarContribuicao(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:25
  private[this] lazy val controllers_MunicipioController_listarUf12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/municipios/"), DynamicPart("uf", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MunicipioController_listarUf12_invoker = createInvoker(
    MunicipioController_3.get.listarUf(fakeValue[String]),
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

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_6.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_SimuladorController_simular0_invoker.call(SimuladorController_1.get.simular())
      }
  
    // @LINE:9
    case controllers_HomeController_main1_route(params) =>
      call { 
        controllers_HomeController_main1_invoker.call(HomeController_0.get.main())
      }
  
    // @LINE:12
    case controllers_PessoaController_acessar2_route(params) =>
      call { 
        controllers_PessoaController_acessar2_invoker.call(PessoaController_4.get.acessar())
      }
  
    // @LINE:13
    case controllers_PessoaController_detalhes3_route(params) =>
      call(params.fromPath[Long]("pessoaId", None)) { (pessoaId) =>
        controllers_PessoaController_detalhes3_invoker.call(PessoaController_4.get.detalhes(pessoaId))
      }
  
    // @LINE:15
    case controllers_AtividadeController_criar4_route(params) =>
      call(params.fromPath[Long]("pessoaId", None)) { (pessoaId) =>
        controllers_AtividadeController_criar4_invoker.call(AtividadeController_5.get.criar(pessoaId))
      }
  
    // @LINE:16
    case controllers_AtividadeController_contribuicoes5_route(params) =>
      call(params.fromPath[Long]("pessoaId", None)) { (pessoaId) =>
        controllers_AtividadeController_contribuicoes5_invoker.call(AtividadeController_5.get.contribuicoes(pessoaId))
      }
  
    // @LINE:18
    case controllers_FavelaController_listarUf6_route(params) =>
      call(params.fromPath[String]("uf", None)) { (uf) =>
        controllers_FavelaController_listarUf6_invoker.call(FavelaController_2.get.listarUf(uf))
      }
  
    // @LINE:19
    case controllers_FavelaController_listarCidade7_route(params) =>
      call(params.fromPath[String]("uf", None), params.fromPath[String]("cidade", None)) { (uf, cidade) =>
        controllers_FavelaController_listarCidade7_invoker.call(FavelaController_2.get.listarCidade(uf, cidade))
      }
  
    // @LINE:20
    case controllers_AtividadeController_listarFavela8_route(params) =>
      call(params.fromPath[Long]("favelaId", None)) { (favelaId) =>
        controllers_AtividadeController_listarFavela8_invoker.call(AtividadeController_5.get.listarFavela(favelaId))
      }
  
    // @LINE:21
    case controllers_AtividadeController_listarCidade9_route(params) =>
      call(params.fromPath[String]("uf", None), params.fromPath[String]("cidade", None)) { (uf, cidade) =>
        controllers_AtividadeController_listarCidade9_invoker.call(AtividadeController_5.get.listarCidade(uf, cidade))
      }
  
    // @LINE:22
    case controllers_AtividadeController_contribuir10_route(params) =>
      call(params.fromPath[Long]("atividadeId", None), params.fromPath[Long]("pessoaId", None)) { (atividadeId, pessoaId) =>
        controllers_AtividadeController_contribuir10_invoker.call(AtividadeController_5.get.contribuir(atividadeId, pessoaId))
      }
  
    // @LINE:23
    case controllers_AtividadeController_cancelarContribuicao11_route(params) =>
      call(params.fromPath[Long]("atividadeId", None), params.fromPath[Long]("pessoaId", None)) { (atividadeId, pessoaId) =>
        controllers_AtividadeController_cancelarContribuicao11_invoker.call(AtividadeController_5.get.cancelarContribuicao(atividadeId, pessoaId))
      }
  
    // @LINE:25
    case controllers_MunicipioController_listarUf12_route(params) =>
      call(params.fromPath[String]("uf", None)) { (uf) =>
        controllers_MunicipioController_listarUf12_invoker.call(MunicipioController_3.get.listarUf(uf))
      }
  
    // @LINE:29
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_6.versioned(path, file))
      }
  }
}
