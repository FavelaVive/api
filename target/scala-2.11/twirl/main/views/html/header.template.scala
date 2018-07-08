
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
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

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.2*/("""<header class="main-header">
	    <!-- Logo -->
	    <span class="logo hidden-xs">
	      <!-- mini logo for sidebar mini 50x50 pixels -->
	      <span class="logo-mini" style="text-align: center;">
	      	<a href="#"><img height="30" src=""""),_display_(/*6.44*/controllers/*6.55*/.routes.Assets.versioned("/assets/img/logo-ico.svg")),format.raw/*6.107*/("""" class="image-responsive"></a>
	      </span>
	      <!-- logo for regular state and mobile devices -->
	      <span class="logo-lg">
	      	<a href="#"><img height="30" src=""""),_display_(/*10.44*/controllers/*10.55*/.routes.Assets.versioned("/assets/img/logo.svg")),format.raw/*10.103*/("""" class="image-responsive"></a>
	      </span>
	    </span>
	
	    <!-- Header Navbar: style can be found in header.less -->
	    <nav class="navbar navbar-static-top">
	      <!-- Sidebar toggle button-->
	      <a href="#" class="sidebar-toggle lte-toggle" data-toggle="offcanvas" role="button">
		    <img class="visible-xs-inline lte-logo" height="30" src=""""),_display_(/*18.65*/controllers/*18.76*/.routes.Assets.versioned("/assets/img/logo.svg")),format.raw/*18.124*/("""">
	      </a>

	      <!-- Navbar Right Menu -->
	      <div class="navbar-custom-menu">
	        <ul class="nav navbar-nav">
	          <!-- Control Sidebar Toggle Button -->
		      <li class="dropdown user user-menu">
		      	<ul class="dropdown-menu">
		        </ul>
			  </li>
	        </ul>
	      </div>
	
	    </nav>
	  </header>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Sun Jul 08 01:30:35 GMT-03:00 2018
                  SOURCE: C:/Users/Bruno/Documents/Projetos/Play/favelavive/app/views/header.scala.html
                  HASH: 3778df51dd0c4124c7f94dfb4c2ba100856890a8
                  MATRIX: 829->1|1102->248|1121->259|1194->311|1403->493|1423->504|1493->552|1890->922|1910->933|1980->981
                  LINES: 32->1|37->6|37->6|37->6|41->10|41->10|41->10|49->18|49->18|49->18
                  -- GENERATED --
              */
          