
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kakhila/PlaySampleApp/Myapps/conf/routes
// @DATE:Wed Mar 22 16:27:35 IST 2017


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
