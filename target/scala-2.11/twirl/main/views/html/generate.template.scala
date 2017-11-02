
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object generate_Scope0 {
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

class generate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[List[ActivityType],List[Price],List[Status],List[Day],List[Year],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(activityTypes:List[ActivityType], prices:List[Price], statuses:List[Status], days:List[Day], years:List[Year]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.113*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<body>


<h1>Date Plans Generator </h1>
<br>
<form method="POST" action="/getActivities">
    <label> <h4> What type of date would you like? </h4></label>
    <select name="activityTypeId">
        """),_display_(/*13.10*/for(activityType <- activityTypes) yield /*13.44*/{_display_(Seq[Any](format.raw/*13.45*/("""
        """),format.raw/*14.9*/("""<option value=""""),_display_(/*14.25*/activityType/*14.37*/.getActivityTypeId()),format.raw/*14.57*/("""">"""),_display_(/*14.60*/activityType/*14.72*/.getActivityTypeName()),format.raw/*14.94*/("""</option>
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</select>
    <br>
    <br>
    <label><h4>What is your relationship status?</h4></label>
    <select name="statusId">
        """),_display_(/*21.10*/for(status <- statuses) yield /*21.33*/{_display_(Seq[Any](format.raw/*21.34*/("""
        """),format.raw/*22.9*/("""<option value=""""),_display_(/*22.25*/status/*22.31*/.getStatusId()),format.raw/*22.45*/("""">"""),_display_(/*22.48*/status/*22.54*/.getStatusName()),format.raw/*22.70*/("""</option>
        """)))}),format.raw/*23.10*/("""
    """),format.raw/*24.5*/("""</select>
    <br>
    <br>
    <label><h4>What is your budget?</h4> </label>
    <select name="priceId">
        """),_display_(/*29.10*/for(price<- prices) yield /*29.29*/{_display_(Seq[Any](format.raw/*29.30*/("""
        """),format.raw/*30.9*/("""<option value=""""),_display_(/*30.25*/price/*30.30*/.getPriceId()),format.raw/*30.43*/("""">"""),_display_(/*30.46*/price/*30.51*/.getPriceName()),format.raw/*30.66*/("""</option>
        """)))}),format.raw/*31.10*/("""
    """),format.raw/*32.5*/("""</select>
    <br>
    <br>
    <label><h4>What time of day?</h4> </label>
    <select name="timeOfDayId">
        """),_display_(/*37.10*/for(day<- days) yield /*37.25*/{_display_(Seq[Any](format.raw/*37.26*/("""
        """),format.raw/*38.9*/("""<option value=""""),_display_(/*38.25*/day/*38.28*/.getTimeOfDayId()),format.raw/*38.45*/("""">"""),_display_(/*38.48*/day/*38.51*/.getTimeOfDayName()),format.raw/*38.70*/("""</option>
        """)))}),format.raw/*39.10*/("""
    """),format.raw/*40.5*/("""</select>
    <br>
    <br>
    <label><h4>Which season?</h4> </label>
    <select name="timeOfYearId">
        """),_display_(/*45.10*/for(year<- years) yield /*45.27*/{_display_(Seq[Any](format.raw/*45.28*/("""
        """),format.raw/*46.9*/("""<option value=""""),_display_(/*46.25*/year/*46.29*/.getTimeOfYearId()),format.raw/*46.47*/("""">"""),_display_(/*46.50*/year/*46.54*/.getTimeOfYearName()),format.raw/*46.74*/("""</option>
        """)))}),format.raw/*47.10*/("""
    """),format.raw/*48.5*/("""</select>
    <br>
    <br>
    <p><input type="submit" value="Plan my date!"></p>


</form>
</body>
</html>"""))
      }
    }
  }

  def render(activityTypes:List[ActivityType],prices:List[Price],statuses:List[Status],days:List[Day],years:List[Year]): play.twirl.api.HtmlFormat.Appendable = apply(activityTypes,prices,statuses,days,years)

  def f:((List[ActivityType],List[Price],List[Status],List[Day],List[Year]) => play.twirl.api.HtmlFormat.Appendable) = (activityTypes,prices,statuses,days,years) => apply(activityTypes,prices,statuses,days,years)

  def ref: this.type = this

}


}

/**/
object generate extends generate_Scope0.generate
              /*
                  -- GENERATED --
                  DATE: Thu Nov 02 16:08:38 CDT 2017
                  SOURCE: C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/app/views/generate.scala.html
                  HASH: 2a0cdaa0d562bd17216fd2c523d440ce768eeb9b
                  MATRIX: 809->1|1016->112|1046->116|1315->358|1365->392|1404->393|1441->403|1484->419|1505->431|1546->451|1576->454|1597->466|1640->488|1691->508|1724->514|1884->647|1923->670|1962->671|1999->681|2042->697|2057->703|2092->717|2122->720|2137->726|2174->742|2225->762|2258->768|2405->888|2440->907|2479->908|2516->918|2559->934|2573->939|2607->952|2637->955|2651->960|2687->975|2738->995|2771->1001|2919->1122|2950->1137|2989->1138|3026->1148|3069->1164|3081->1167|3119->1184|3149->1187|3161->1190|3201->1209|3252->1229|3285->1235|3430->1353|3463->1370|3502->1371|3539->1381|3582->1397|3595->1401|3634->1419|3664->1422|3677->1426|3718->1446|3769->1466|3802->1472
                  LINES: 27->1|32->1|34->3|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|55->24|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|63->32|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|69->38|70->39|71->40|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|77->46|77->46|78->47|79->48
                  -- GENERATED --
              */
          