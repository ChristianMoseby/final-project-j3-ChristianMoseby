
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
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/assets/lib/bootstrap/css/bootstrap.min.css">
    <script src="/assets/lib/jquery/jquery.min.js"></script>
    <script src="/assets/lib/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/assets/lib/bootstrap-select/css/bootstrap-select.min.css">
    <script src="/assets/lib/bootstrap-select/js/bootstrap-select.js"></script>
</head>
<body>
<h1 align="center">Date Plans Generator </h1>
<br>
    <form method="POST" action="/getActivities">
        <label>What type of date would you like? </label>
        <br>
        <br>
        <select name="activityTypeId" class="selectpicker" data-style="btn-default">
            """),_display_(/*22.14*/for(activityType <- activityTypes) yield /*22.48*/{_display_(Seq[Any](format.raw/*22.49*/("""
            """),format.raw/*23.13*/("""<option value=""""),_display_(/*23.29*/activityType/*23.41*/.getActivityTypeId()),format.raw/*23.61*/("""">"""),_display_(/*23.64*/activityType/*23.76*/.getActivityTypeName()),format.raw/*23.98*/("""</option>
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</select>
        <br>
        <br>
    <label>What is your relationship status?</label>
        <br>
        <br>
    <select name="statusId" class="selectpicker" data-style="btn-default">
        """),_display_(/*32.10*/for(status <- statuses) yield /*32.33*/{_display_(Seq[Any](format.raw/*32.34*/("""
        """),format.raw/*33.9*/("""<option value=""""),_display_(/*33.25*/status/*33.31*/.getStatusId()),format.raw/*33.45*/("""">"""),_display_(/*33.48*/status/*33.54*/.getStatusName()),format.raw/*33.70*/("""</option>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</select>
    <br>
    <br>
    <label>What is your budget?</label>
        <br>
        <br>
    <select name="priceId" class="selectpicker" data-style="btn-default">
        """),_display_(/*42.10*/for(price<- prices) yield /*42.29*/{_display_(Seq[Any](format.raw/*42.30*/("""
        """),format.raw/*43.9*/("""<option value=""""),_display_(/*43.25*/price/*43.30*/.getPriceId()),format.raw/*43.43*/("""">"""),_display_(/*43.46*/price/*43.51*/.getPriceName()),format.raw/*43.66*/("""</option>
        """)))}),format.raw/*44.10*/("""
    """),format.raw/*45.5*/("""</select>
    <br>
    <br>
    <label>What time of day?</label>
        <br>
        <br>
    <select name="timeOfDayId" class="selectpicker" data-style="btn-default">
        """),_display_(/*52.10*/for(day<- days) yield /*52.25*/{_display_(Seq[Any](format.raw/*52.26*/("""
        """),format.raw/*53.9*/("""<option value=""""),_display_(/*53.25*/day/*53.28*/.getTimeOfDayId()),format.raw/*53.45*/("""">"""),_display_(/*53.48*/day/*53.51*/.getTimeOfDayName()),format.raw/*53.70*/("""</option>
        """)))}),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""</select>
    <br>
    <br>
    <label>Which season? </label>
        <br>
        <br>
    <select name="timeOfYearId" class="selectpicker" data-style="btn-default">
        """),_display_(/*62.10*/for(year<- years) yield /*62.27*/{_display_(Seq[Any](format.raw/*62.28*/("""
        """),format.raw/*63.9*/("""<option value=""""),_display_(/*63.25*/year/*63.29*/.getTimeOfYearId()),format.raw/*63.47*/("""">"""),_display_(/*63.50*/year/*63.54*/.getTimeOfYearName()),format.raw/*63.74*/("""</option>
        """)))}),format.raw/*64.10*/("""
    """),format.raw/*65.5*/("""</select>
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
                  DATE: Fri Nov 03 13:40:06 CDT 2017
                  SOURCE: C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/app/views/generate.scala.html
                  HASH: acc1e059d27396b8ec890de21d60cb03a765843f
                  MATRIX: 809->1|1016->112|1046->116|1912->955|1962->989|2001->990|2043->1004|2086->1020|2107->1032|2148->1052|2178->1055|2199->1067|2242->1089|2297->1113|2334->1123|2567->1329|2606->1352|2645->1353|2682->1363|2725->1379|2740->1385|2775->1399|2805->1402|2820->1408|2857->1424|2908->1444|2941->1450|3152->1634|3187->1653|3226->1654|3263->1664|3306->1680|3320->1685|3354->1698|3384->1701|3398->1706|3434->1721|3485->1741|3518->1747|3730->1932|3761->1947|3800->1948|3837->1958|3880->1974|3892->1977|3930->1994|3960->1997|3972->2000|4012->2019|4063->2039|4096->2045|4306->2228|4339->2245|4378->2246|4415->2256|4458->2272|4471->2276|4510->2294|4540->2297|4553->2301|4594->2321|4645->2341|4678->2347
                  LINES: 27->1|32->1|34->3|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|56->25|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|64->33|65->34|66->35|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|75->44|76->45|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|86->55|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|96->65
                  -- GENERATED --
              */
          