
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
 <title>Bootstrap Example</title>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="/assets/lib/bootstrap/css/bootstrap.min.css">
 <script src="/assets/lib/jquery/jquery.min.js"></script>
 <script src="/assets/lib/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container-fluid">
 <h1>Hello World!</h1>
 <p>Resize the browser window to see the effect.</p>
 <div class="row">
  <div class="col-sm-4" style="background-color:lavender;">.col-sm-4</div>
  <div class="col-sm-4" style="background-color:lavenderblush;">.col-sm-4</div>
  <div class="col-sm-4" style="background-color:lavender;">.col-sm-4</div>
 </div>
</div>

</body>
</html>

"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Oct 26 16:54:00 CDT 2017
                  SOURCE: C:/Users/Christian/IdeaProjects/final-project-j3-ChristianMoseby/app/views/index.scala.html
                  HASH: c24db4f45aa6c32105c881717ae6e22f940013ca
                  MATRIX: 745->1|857->18|885->20
                  LINES: 27->1|32->1|33->2
                  -- GENERATED --
              */
          