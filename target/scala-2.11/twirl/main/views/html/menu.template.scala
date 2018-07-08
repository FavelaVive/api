
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object menu_Scope0 {
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

class menu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""<!-- Left side column. contains the logo and sidebar -->
	  <aside class="main-sidebar">
	    <!-- sidebar: style can be found in sidebar.less -->
	    <section class="sidebar" style="height: auto;">
	      <!-- Sidebar user panel -->
	      <div class="user-panel">
	        <div class="pull-left image">
			    <img id="image_user" src=""""),_display_(/*8.35*/routes/*8.41*/.Assets.versioned("assets/img/ico-user.svg")),format.raw/*8.85*/("""" width="160" height="160" class="img-circle" alt="User Image">    
	        </div>
	        <div class="pull-left info reticencias" style="max-width: 175px;">
	          <p>Favela Vive</p>
	          <a href="#">Empresa Cliente</a>
	        </div>
	      </div>
	      <!-- sidebar menu: : style can be found in sidebar.less -->
	      <ul class="sidebar-menu">
	        <li class="header">MENU</li>
	        <li class="">
	          <a href="#">
	            <i class="fa fa-eye"></i> <span>Visão Geral</span>
	          </a>
	        </li>
	        <li>
	          <a href="#">
	            <i class="fa fa-user"></i> <span>Meus Dados</span>
	          </a>
	        </li>
	        <li>
	          <a href="#">
	            <i class="fa fa-sign-out"></i> <span>Sair</span>
	          </a>
	        </li>
	      </ul>
	    </section>
	    <!-- /.sidebar -->
	  </aside>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object menu extends menu_Scope0.menu
              /*
                  -- GENERATED --
                  DATE: Sun Jul 08 00:40:36 GMT-03:00 2018
                  SOURCE: C:/Users/Bruno/Documents/Projetos/Play/favelavive/app/views/menu.scala.html
                  HASH: a052497379768360bd21c9553e059b4dfa334df3
                  MATRIX: 825->3|1198->350|1212->356|1276->400
                  LINES: 32->1|39->8|39->8|39->8
                  -- GENERATED --
              */
          