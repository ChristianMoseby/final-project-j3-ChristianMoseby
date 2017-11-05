
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
    <img src="/assets/images/couple-at-dinner-table-cropped.jpg" height=200">

</div>
<div class="container">
    <div class="jumbotron" text="center"> </div>
        <h1> Date Plans Generator</h1>
    </div>

<br>

<form method="POST" action="/getActivities">
    <label>What type of date would you like? </label>
    <br>
    <br>
    <select name="activityTypeId" class="selectpicker" data-style="btn-default">
        """),_display_(/*32.10*/for(activityType <- activityTypes) yield /*32.44*/{_display_(Seq[Any](format.raw/*32.45*/("""
        """),format.raw/*33.9*/("""<option value=""""),_display_(/*33.25*/activityType/*33.37*/.getActivityTypeId()),format.raw/*33.57*/("""">"""),_display_(/*33.60*/activityType/*33.72*/.getActivityTypeName()),format.raw/*33.94*/("""</option>
        """)))}),format.raw/*34.10*/("""
    """),format.raw/*35.5*/("""</select>
    <br>
    <br>
    <label>What is your relationship status?</label>
    <br>
    <br>
    <select name="statusId" class="selectpicker" data-style="btn-default">
        """),_display_(/*42.10*/for(status <- statuses) yield /*42.33*/{_display_(Seq[Any](format.raw/*42.34*/("""
        """),format.raw/*43.9*/("""<option value=""""),_display_(/*43.25*/status/*43.31*/.getStatusId()),format.raw/*43.45*/("""">"""),_display_(/*43.48*/status/*43.54*/.getStatusName()),format.raw/*43.70*/("""</option>
        """)))}),format.raw/*44.10*/("""
    """),format.raw/*45.5*/("""</select>
    <br>
    <br>
    <label>What is your budget?</label>
    <br>
    <br>
    <select name="priceId" class="selectpicker" data-style="btn-default">
        """),_display_(/*52.10*/for(price<- prices) yield /*52.29*/{_display_(Seq[Any](format.raw/*52.30*/("""
        """),format.raw/*53.9*/("""<option value=""""),_display_(/*53.25*/price/*53.30*/.getPriceId()),format.raw/*53.43*/("""">"""),_display_(/*53.46*/price/*53.51*/.getPriceName()),format.raw/*53.66*/("""</option>
        """)))}),format.raw/*54.10*/("""
    """),format.raw/*55.5*/("""</select>
    <br>
    <br>
    <label>What time of day?</label>
    <br>
    <br>
    <select name="timeOfDayId" class="selectpicker" data-style="btn-default">
        """),_display_(/*62.10*/for(day<- days) yield /*62.25*/{_display_(Seq[Any](format.raw/*62.26*/("""
        """),format.raw/*63.9*/("""<option value=""""),_display_(/*63.25*/day/*63.28*/.getTimeOfDayId()),format.raw/*63.45*/("""">"""),_display_(/*63.48*/day/*63.51*/.getTimeOfDayName()),format.raw/*63.70*/("""</option>
        """)))}),format.raw/*64.10*/("""
    """),format.raw/*65.5*/("""</select>
    <br>
    <br>
    <label>Which season? </label>
    <br>
    <br>
    <select name="timeOfYearId" class="selectpicker" data-style="btn-default">
        """),_display_(/*72.10*/for(year<- years) yield /*72.27*/{_display_(Seq[Any](format.raw/*72.28*/("""
        """),format.raw/*73.9*/("""<option value=""""),_display_(/*73.25*/year/*73.29*/.getTimeOfYearId()),format.raw/*73.47*/("""">"""),_display_(/*73.50*/year/*73.54*/.getTimeOfYearName()),format.raw/*73.74*/("""</option>
        """)))}),format.raw/*74.10*/("""
    """),format.raw/*75.5*/("""</select>
    <br>
    <br>
    <p><input type="submit" value="Plan my date!"></p>


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
                  DATE: Sun Nov 05 14:55:00 CST 2017
                  SOURCE: C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/app/views/generate.scala.html
                  HASH: fb687db49503cfdc954b99f8219bcb02f18273f0
                  MATRIX: 809->1|1016->112|1046->116|2088->1131|2138->1165|2177->1166|2214->1176|2257->1192|2278->1204|2319->1224|2349->1227|2370->1239|2413->1261|2464->1281|2497->1287|2714->1477|2753->1500|2792->1501|2829->1511|2872->1527|2887->1533|2922->1547|2952->1550|2967->1556|3004->1572|3055->1592|3088->1598|3291->1774|3326->1793|3365->1794|3402->1804|3445->1820|3459->1825|3493->1838|3523->1841|3537->1846|3573->1861|3624->1881|3657->1887|3861->2064|3892->2079|3931->2080|3968->2090|4011->2106|4023->2109|4061->2126|4091->2129|4103->2132|4143->2151|4194->2171|4227->2177|4429->2352|4462->2369|4501->2370|4538->2380|4581->2396|4594->2400|4633->2418|4663->2421|4676->2425|4717->2445|4768->2465|4801->2471
                  LINES: 27->1|32->1|34->3|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|64->33|65->34|66->35|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|75->44|76->45|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|86->55|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|96->65|103->72|103->72|103->72|104->73|104->73|104->73|104->73|104->73|104->73|104->73|105->74|106->75
                  -- GENERATED --
              */
          