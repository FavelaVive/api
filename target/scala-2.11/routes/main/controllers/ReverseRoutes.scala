
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sat Jul 07 21:14:09 GMT-03:00 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:25
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:12
  class ReverseAtividadeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def contribuir(atividadeId:Long, pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[Long]].unbind("atividadeId", atividadeId) + "/contribuir/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
    // @LINE:16
    def listarFavela(favelaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/atividades/favelas/" + implicitly[PathBindable[Long]].unbind("favelaId", favelaId))
    }
  
    // @LINE:12
    def criar(pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/pessoas/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId) + "/atividades")
    }
  
    // @LINE:17
    def listarCidade(uf:String, cidade:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)) + "/" + implicitly[PathBindable[String]].unbind("cidade", dynamicString(cidade)))
    }
  
    // @LINE:19
    def cancelarContribuicao(atividadeId:Long, pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[Long]].unbind("atividadeId", atividadeId) + "/contribuir/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
  }

  // @LINE:9
  class ReversePessoaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def detalhes(pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/pessoas/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
    // @LINE:9
    def acessar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/pessoas")
    }
  
  }

  // @LINE:21
  class ReverseMunicipioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def listarUf(uf:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/municipios/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)))
    }
  
  }

  // @LINE:14
  class ReverseFavelaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def listarCidade(uf:String, cidade:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/favelas/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)) + "/" + implicitly[PathBindable[String]].unbind("cidade", dynamicString(cidade)))
    }
  
    // @LINE:14
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
