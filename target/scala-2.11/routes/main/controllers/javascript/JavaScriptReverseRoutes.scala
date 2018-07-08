
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sat Jul 07 21:14:09 GMT-03:00 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:25
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseAtividadeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def contribuir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.contribuir",
      """
        function(atividadeId0,pessoaId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/atividades/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("atividadeId", atividadeId0) + "/contribuir/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pessoaId", pessoaId1)})
        }
      """
    )
  
    // @LINE:16
    def listarFavela: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.listarFavela",
      """
        function(favelaId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/atividades/favelas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("favelaId", favelaId0)})
        }
      """
    )
  
    // @LINE:12
    def criar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.criar",
      """
        function(pessoaId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/pessoas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pessoaId", pessoaId0) + "/atividades"})
        }
      """
    )
  
    // @LINE:17
    def listarCidade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.listarCidade",
      """
        function(uf0,cidade1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/atividades/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uf", encodeURIComponent(uf0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cidade", encodeURIComponent(cidade1))})
        }
      """
    )
  
    // @LINE:19
    def cancelarContribuicao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.cancelarContribuicao",
      """
        function(atividadeId0,pessoaId1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/atividades/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("atividadeId", atividadeId0) + "/contribuir/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pessoaId", pessoaId1)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReversePessoaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def detalhes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.detalhes",
      """
        function(pessoaId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/pessoas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pessoaId", pessoaId0)})
        }
      """
    )
  
    // @LINE:9
    def acessar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.acessar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/pessoas"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseMunicipioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def listarUf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MunicipioController.listarUf",
      """
        function(uf0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/municipios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uf", encodeURIComponent(uf0))})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseFavelaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def listarCidade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavelaController.listarCidade",
      """
        function(uf0,cidade1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/favelas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uf", encodeURIComponent(uf0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cidade", encodeURIComponent(cidade1))})
        }
      """
    )
  
    // @LINE:14
    def listarUf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavelaController.listarUf",
      """
        function(uf0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/favelas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uf", encodeURIComponent(uf0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseSimuladorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def simular: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SimuladorController.simular",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/simular"})
        }
      """
    )
  
  }


}
