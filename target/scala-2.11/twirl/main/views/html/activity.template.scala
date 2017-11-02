
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
<html lang="en" xmlns="http://www.w3.org/1999/html">
<body>



<h1> <a href=""""),_display_(/*9.16*/activity/*9.24*/.getWebsite),format.raw/*9.35*/(""""> """),_display_(/*9.39*/activity/*9.47*/.getActivityName()),format.raw/*9.65*/("""</a> </h1>


<img src="/getPhoto/"""),_display_(/*12.22*/activity/*12.30*/.getActivityId),format.raw/*12.44*/(""""class="img-rounded" width="500">
<br>
<br>
<form action="/restart">
<p><input type="submit" value="Start Over" ></p>
</form>


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
                  DATE: Thu Nov 02 13:06:24 CDT 2017
                  SOURCE: C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/app/views/activity.scala.html
                  HASH: 228eab44f13495b2525e95417490f4ca90ac26c6
                  MATRIX: 753->1|867->20|897->24|1023->124|1039->132|1070->143|1100->147|1116->155|1154->173|1218->210|1235->218|1270->232
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|40->9|40->9|40->9|43->12|43->12|43->12
                  -- GENERATED --
              */
          