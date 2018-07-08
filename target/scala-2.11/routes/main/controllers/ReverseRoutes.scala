
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sun Jul 08 01:37:50 GMT-03:00 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def main(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAtividadeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def contribuir(atividadeId:Long, pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[Long]].unbind("atividadeId", atividadeId) + "/contribuir/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
    // @LINE:20
    def listarFavela(favelaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/atividades/favelas/" + implicitly[PathBindable[Long]].unbind("favelaId", favelaId))
    }
  
    // @LINE:15
    def criar(pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/pessoas/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId) + "/atividades")
    }
  
    // @LINE:16
    def contribuicoes(pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/pessoas/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId) + "/contribuicoes")
    }
  
    // @LINE:21
    def listarCidade(uf:String, cidade:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)) + "/" + implicitly[PathBindable[String]].unbind("cidade", dynamicString(cidade)))
    }
  
    // @LINE:23
    def cancelarContribuicao(atividadeId:Long, pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[Long]].unbind("atividadeId", atividadeId) + "/contribuir/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
  }

  // @LINE:12
  class ReversePessoaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def detalhes(pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/pessoas/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
    // @LINE:12
    def acessar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/pessoas")
    }
  
  }

  // @LINE:25
  class ReverseMunicipioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def listarUf(uf:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/municipios/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)))
    }
  
  }

  // @LINE:18
  class ReverseFavelaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def listarCidade(uf:String, cidade:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/favelas/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)) + "/" + implicitly[PathBindable[String]].unbind("cidade", dynamicString(cidade)))
    }
  
    // @LINE:18
    def listarUf(uf:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/favelas/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)))
    }
  
  }

  // @LINE:6
  class ReverseSimuladorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def simular(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/simular")
    }
  
  }


}
