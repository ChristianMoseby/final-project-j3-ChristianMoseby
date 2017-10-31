
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
<form method="POST">
    <label> <h4> What type of date would you like? </h4></label>
    <select name="activityTypeId">
        """),_display_(/*12.10*/for(activityType <- activityTypes) yield /*12.44*/{_display_(Seq[Any](format.raw/*12.45*/("""
        """),format.raw/*13.9*/("""<option value=""""),_display_(/*13.25*/activityType/*13.37*/.getActivityTypeId()),format.raw/*13.57*/("""">"""),_display_(/*13.60*/activityType/*13.72*/.getActivityTypeName()),format.raw/*13.94*/("""</option>
        """)))}),format.raw/*14.10*/("""
    """),format.raw/*15.5*/("""</select>
    <br>
    <br>
    <label><h4>What is your relationship status?</h4></label>
    <select name="statusId">
        """),_display_(/*20.10*/for(status <- statuses) yield /*20.33*/{_display_(Seq[Any](format.raw/*20.34*/("""
        """),format.raw/*21.9*/("""<option value=""""),_display_(/*21.25*/status/*21.31*/.getStatusId()),format.raw/*21.45*/("""">"""),_display_(/*21.48*/status/*21.54*/.getStatusName()),format.raw/*21.70*/("""</option>
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</select>
    <br>
    <br>
    <label><h4>What is your budget?</h4> </label>
    <select name="priceId">
        """),_display_(/*28.10*/for(price<- prices) yield /*28.29*/{_display_(Seq[Any](format.raw/*28.30*/("""
        """),format.raw/*29.9*/("""<option value=""""),_display_(/*29.25*/price/*29.30*/.getPriceId()),format.raw/*29.43*/("""">"""),_display_(/*29.46*/price/*29.51*/.getPriceName()),format.raw/*29.66*/("""</option>
        """)))}),format.raw/*30.10*/("""
    """),format.raw/*31.5*/("""</select>
    <br>
    <br>
    <label><h4>What time of day?</h4> </label>
    <select name="timeOfDayId">
        """),_display_(/*36.10*/for(day<- days) yield /*36.25*/{_display_(Seq[Any](format.raw/*36.26*/("""
        """),format.raw/*37.9*/("""<option value=""""),_display_(/*37.25*/day/*37.28*/.getTimeOfDayId()),format.raw/*37.45*/("""">"""),_display_(/*37.48*/day/*37.51*/.getTimeOfDayName()),format.raw/*37.70*/("""</option>
        """)))}),format.raw/*38.10*/("""
    """),format.raw/*39.5*/("""</select>
    <br>
    <br>
    <label><h4>Which season?</h4> </label>
    <select name="timeOfYearId">
        """),_display_(/*44.10*/for(year<- years) yield /*44.27*/{_display_(Seq[Any](format.raw/*44.28*/("""
        """),format.raw/*45.9*/("""<option value=""""),_display_(/*45.25*/year/*45.29*/.getTimeOfYearId()),format.raw/*45.47*/("""">"""),_display_(/*45.50*/year/*45.54*/.getTimeOfYearName()),format.raw/*45.74*/("""</option>
        """)))}),format.raw/*46.10*/("""
    """),format.raw/*47.5*/("""</select>
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
                  DATE: Sun Oct 29 15:02:22 CDT 2017
                  SOURCE: C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/app/views/generate.scala.html
                  HASH: 3c7b1a153368eaa242ff2e292c7a7884496c4986
                  MATRIX: 809->1|1016->112|1046->116|1289->332|1339->366|1378->367|1415->377|1458->393|1479->405|1520->425|1550->428|1571->440|1614->462|1665->482|1698->488|1858->621|1897->644|1936->645|1973->655|2016->671|2031->677|2066->691|2096->694|2111->700|2148->716|2199->736|2232->742|2379->862|2414->881|2453->882|2490->892|2533->908|2547->913|2581->926|2611->929|2625->934|2661->949|2712->969|2745->975|2893->1096|2924->1111|2963->1112|3000->1122|3043->1138|3055->1141|3093->1158|3123->1161|3135->1164|3175->1183|3226->1203|3259->1209|3404->1327|3437->1344|3476->1345|3513->1355|3556->1371|3569->1375|3608->1393|3638->1396|3651->1400|3692->1420|3743->1440|3776->1446
                  LINES: 27->1|32->1|34->3|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|44->13|45->14|46->15|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|54->23|59->28|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|61->30|62->31|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|69->38|70->39|75->44|75->44|75->44|76->45|76->45|76->45|76->45|76->45|76->45|76->45|77->46|78->47
                  -- GENERATED --
              */
          