
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sat Jul 07 20:21:03 GMT-03:00 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAtividadeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def contribuir: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.contribuir",
      """
        function(atividadeId0,pessoaId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/atividades/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("atividadeId", atividadeId0) + "/contribuir/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pessoaId", pessoaId1)})
        }
      """
    )
  
    // @LINE:13
    def listarFavela: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.listarFavela",
      """
        function(favelaId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/atividades/favelas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("favelaId", favelaId0)})
        }
      """
    )
  
    // @LINE:9
    def criar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.criar",
      """
        function(pessoaId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/pessoas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pessoaId", pessoaId0) + "/atividades"})
        }
      """
    )
  
    // @LINE:14
    def listarCidade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.listarCidade",
      """
        function(uf0,cidade1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/atividades/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uf", encodeURIComponent(uf0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cidade", encodeURIComponent(cidade1))})
        }
      """
    )
  
    // @LINE:16
    def cancelarContribuicao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AtividadeController.cancelarContribuicao",
      """
        function(atividadeId0,pessoaId1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/atividades/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("atividadeId", atividadeId0) + "/contribuir/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pessoaId", pessoaId1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReversePessoaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def detalhes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.detalhes",
      """
        function(pessoaId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/pessoas/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pessoaId", pessoaId0)})
        }
      """
    )
  
    // @LINE:6
    def acessar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PessoaController.acessar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/pessoas"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseMunicipioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def listarUf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MunicipioController.listarUf",
      """
        function(uf0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/municipios/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uf", encodeURIComponent(uf0))})
        }
      """
    )
  
  }

  // @LINE:11
  class ReverseFavelaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def listarCidade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavelaController.listarCidade",
      """
        function(uf0,cidade1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/favelas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uf", encodeURIComponent(uf0)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cidade", encodeURIComponent(cidade1))})
        }
      """
    )
  
    // @LINE:11
    def listarUf: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FavelaController.listarUf",
      """
        function(uf0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/favelas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("uf", encodeURIComponent(uf0))})
        }
      """
    )
  
  }


}
