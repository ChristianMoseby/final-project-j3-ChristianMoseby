
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object activity_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class activity extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Activity,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(activity:Activity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<body>



<h1><a href=""""),_display_(/*9.15*/activity/*9.23*/.getWebsite),format.raw/*9.34*/(""""> """),_display_(/*9.38*/activity/*9.46*/.getActivityName()),format.raw/*9.64*/("""</a></h1>

<img src="/getPhoto/"""),_display_(/*11.22*/activity/*11.30*/.getActivityId),format.raw/*11.44*/("""" width="500">

</body>
</html>
"""))
      }
    }
  }

  def render(activity:Activity): play.twirl.api.HtmlFormat.Appendable = apply(activity)

  def f:((Activity) => play.twirl.api.HtmlFormat.Appendable) = (activity) => apply(activity)

  def ref: this.type = this

}


}

/**/
object activity extends activity_Scope0.activity
              /*
                  -- GENERATED --
                  DATE: Tue Oct 31 13:57:31 CDT 2017
                  SOURCE: C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/app/views/activity.scala.html
                  HASH: 2c17de8a97ca0722982c2ff95da6f3001aacd20d
                  MATRIX: 753->1|867->20|897->24|986->87|1002->95|1033->106|1063->110|1079->118|1117->136|1178->170|1195->178|1230->192
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|40->9|40->9|40->9|42->11|42->11|42->11
                  -- GENERATED --
              */
          