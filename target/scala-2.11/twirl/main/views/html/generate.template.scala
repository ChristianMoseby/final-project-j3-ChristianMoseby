
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

<div class="container">
    <div class="col-sm-2">
        <img src="/assets/images/date-night.png" width="400" class="img-rounded">
    </div>
</div>
<div class="container">
    <h2>Date Activity Generator</h2>
    <div class="well">Select your answers to receive date activities tailored to your needs.</div>
</div>
<br>
<form method="POST" action="/getActivities">
    <div class="container">
     <label>What type of date would you like? </label>
    <select name="activityTypeId" class="selectpicker" data-style="btn-default btn-sm">
        """),_display_(/*32.10*/for(activityType <- activityTypes) yield /*32.44*/{_display_(Seq[Any](format.raw/*32.45*/("""
        """),format.raw/*33.9*/("""<option value=""""),_display_(/*33.25*/activityType/*33.37*/.getActivityTypeId()),format.raw/*33.57*/("""">"""),_display_(/*33.60*/activityType/*33.72*/.getActivityTypeName()),format.raw/*33.94*/("""</option>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</select>
        <br>
        <br>
    <label>What is your relationship status?</label>
    <select name="statusId" class="selectpicker" data-style="btn-default btn-sm">
        """),_display_(/*40.10*/for(status <- statuses) yield /*40.33*/{_display_(Seq[Any](format.raw/*40.34*/("""
        """),format.raw/*41.9*/("""<option value=""""),_display_(/*41.25*/status/*41.31*/.getStatusId()),format.raw/*41.45*/("""">"""),_display_(/*41.48*/status/*41.54*/.getStatusName()),format.raw/*41.70*/("""</option>
        """)))}),format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""</select>
        <br>
        <br>
    <label>What is your budget?</label>
    <select name="priceId" class="selectpicker" data-style="btn-default btn-sm">
        """),_display_(/*48.10*/for(price<- prices) yield /*48.29*/{_display_(Seq[Any](format.raw/*48.30*/("""
        """),format.raw/*49.9*/("""<option value=""""),_display_(/*49.25*/price/*49.30*/.getPriceId()),format.raw/*49.43*/("""">"""),_display_(/*49.46*/price/*49.51*/.getPriceName()),format.raw/*49.66*/("""</option>
        """)))}),format.raw/*50.10*/("""
    """),format.raw/*51.5*/("""</select>
        <br>
        <br>
    <label>What time of day?</label>
    <select name="timeOfDayId" class="selectpicker" data-style="btn-default btn-sm">
        """),_display_(/*56.10*/for(day<- days) yield /*56.25*/{_display_(Seq[Any](format.raw/*56.26*/("""
        """),format.raw/*57.9*/("""<option value=""""),_display_(/*57.25*/day/*57.28*/.getTimeOfDayId()),format.raw/*57.45*/("""">"""),_display_(/*57.48*/day/*57.51*/.getTimeOfDayName()),format.raw/*57.70*/("""</option>
        """)))}),format.raw/*58.10*/("""
    """),format.raw/*59.5*/("""</select>
    <br>
    <br>
    <label>Which season? </label>
    <select name="timeOfYearId" class="selectpicker" data-style="btn-default btn-sm">
        """),_display_(/*64.10*/for(year<- years) yield /*64.27*/{_display_(Seq[Any](format.raw/*64.28*/("""
        """),format.raw/*65.9*/("""<option value=""""),_display_(/*65.25*/year/*65.29*/.getTimeOfYearId()),format.raw/*65.47*/("""">"""),_display_(/*65.50*/year/*65.54*/.getTimeOfYearName()),format.raw/*65.74*/("""</option>
        """)))}),format.raw/*66.10*/("""
    """),format.raw/*67.5*/("""</select>
    </div>
<br>
<br>
<p><input type="submit"class="btn btn-default" value="Search Date Activities"></p>
</form>
</body>
</html>
"""))
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
                  DATE: Mon Nov 06 22:56:40 CST 2017
                  SOURCE: C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/app/views/generate.scala.html
                  HASH: 9454d2c1d6d32a507cd0068bea03822d757f04eb
                  MATRIX: 809->1|1016->112|1046->116|2191->1234|2241->1268|2280->1269|2317->1279|2360->1295|2381->1307|2422->1327|2452->1330|2473->1342|2516->1364|2567->1384|2600->1390|2812->1575|2851->1598|2890->1599|2927->1609|2970->1625|2985->1631|3020->1645|3050->1648|3065->1654|3102->1670|3153->1690|3186->1696|3384->1867|3419->1886|3458->1887|3495->1897|3538->1913|3552->1918|3586->1931|3616->1934|3630->1939|3666->1954|3717->1974|3750->1980|3949->2152|3980->2167|4019->2168|4056->2178|4099->2194|4111->2197|4149->2214|4179->2217|4191->2220|4231->2239|4282->2259|4315->2265|4504->2427|4537->2444|4576->2445|4613->2455|4656->2471|4669->2475|4708->2493|4738->2496|4751->2500|4792->2520|4843->2540|4876->2546
                  LINES: 27->1|32->1|34->3|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|64->33|65->34|66->35|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|74->43|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|81->50|82->51|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|90->59|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|98->67
                  -- GENERATED --
              */
          