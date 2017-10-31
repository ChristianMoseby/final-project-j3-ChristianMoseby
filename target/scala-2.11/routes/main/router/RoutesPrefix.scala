
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/conf/routes
// @DATE:Tue Oct 31 13:59:18 CDT 2017


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
