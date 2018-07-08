
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Bruno/Documents/Projetos/Play/favelavive/conf/routes
// @DATE:Sat Jul 07 21:14:09 GMT-03:00 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
