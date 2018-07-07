
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sat Jul 07 20:21:03 GMT-03:00 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseAtividadeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def contribuir(atividadeId:Long, pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[Long]].unbind("atividadeId", atividadeId) + "/contribuir/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
    // @LINE:13
    def listarFavela(favelaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/atividades/favelas/" + implicitly[PathBindable[Long]].unbind("favelaId", favelaId))
    }
  
    // @LINE:9
    def criar(pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/pessoas/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId) + "/atividades")
    }
  
    // @LINE:14
    def listarCidade(uf:String, cidade:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)) + "/" + implicitly[PathBindable[String]].unbind("cidade", dynamicString(cidade)))
    }
  
    // @LINE:16
    def cancelarContribuicao(atividadeId:Long, pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "api/atividades/" + implicitly[PathBindable[Long]].unbind("atividadeId", atividadeId) + "/contribuir/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
  }

  // @LINE:6
  class ReversePessoaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def detalhes(pessoaId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/pessoas/" + implicitly[PathBindable[Long]].unbind("pessoaId", pessoaId))
    }
  
    // @LINE:6
    def acessar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "api/pessoas")
    }
  
  }

  // @LINE:18
  class ReverseMunicipioController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def listarUf(uf:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/municipios/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)))
    }
  
  }

  // @LINE:11
  class ReverseFavelaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def listarCidade(uf:String, cidade:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/favelas/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)) + "/" + implicitly[PathBindable[String]].unbind("cidade", dynamicString(cidade)))
    }
  
    // @LINE:11
    def listarUf(uf:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "api/favelas/" + implicitly[PathBindable[String]].unbind("uf", dynamicString(uf)))
    }
  
  }


}
