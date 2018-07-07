
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sat Jul 07 18:45:43 GMT-03:00 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAtividadeController AtividadeController = new controllers.ReverseAtividadeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePessoaController PessoaController = new controllers.ReversePessoaController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMunicipioController MunicipioController = new controllers.ReverseMunicipioController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseFavelaController FavelaController = new controllers.ReverseFavelaController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAtividadeController AtividadeController = new controllers.javascript.ReverseAtividadeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePessoaController PessoaController = new controllers.javascript.ReversePessoaController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMunicipioController MunicipioController = new controllers.javascript.ReverseMunicipioController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseFavelaController FavelaController = new controllers.javascript.ReverseFavelaController(RoutesPrefix.byNamePrefix());
  }

}
