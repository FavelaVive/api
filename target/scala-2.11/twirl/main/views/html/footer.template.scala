
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object footer_Scope0 {
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

class footer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.2*/("""<footer class="main-footer" style="margin-left:0px;">
	      <div class="pull-right hidden-xs">
	        <b>Versão</b> 0.0.1
	      </div>
	      <strong>Favela Vive - 2018.</strong>
	      <a href="#" target="_blank"><i style="margin-left:10px;color:#444;" class="fa fa-facebook-official" aria-hidden="true"></i></a>
	      <a href="#" target="_blank"><i style="margin-left:5px;color:#444;" class="fa fa-instagram" aria-hidden="true"></i></a>
	</footer>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object footer extends footer_Scope0.footer
              /*
                  -- GENERATED --
                  DATE: Sun Jul 08 00:58:37 GMT-03:00 2018
                  SOURCE: C:/Users/Bruno/Documents/Projetos/Play/favelavive/app/views/footer.scala.html
                  HASH: 6db609c9384b83de450a497283b5dd6a57d1e8ea
                  MATRIX: 829->1
                  LINES: 32->1
                  -- GENERATED --
              */
          