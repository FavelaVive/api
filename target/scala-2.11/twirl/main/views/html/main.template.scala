
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Favela Vive - Analytics</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <!--[if lt IE 9]>
        <script src='https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js'></script>
        <script src='https://oss.maxcdn.com/respond/1.4.2/respond.min.js'></script>
        <![endif]-->

		<!-- Bootstrap 3.3.6 -->
		<link href=""""),_display_(/*14.16*/routes/*14.22*/.Assets.versioned("assets/admin/AdminLTE-2.3.11/bootstrap/css/bootstrap.min.css")),format.raw/*14.103*/("""" rel="stylesheet">
		<link href=""""),_display_(/*15.16*/routes/*15.22*/.Assets.versioned("assets/fonts/font-awesome-4.7.0/css/font-awesome.min.css")),format.raw/*15.99*/("""" rel="stylesheet">
		<link rel="stylesheet" href=""""),_display_(/*16.33*/routes/*16.39*/.Assets.versioned("assets/admin/AdminLTE-2.3.11/dist/css/AdminLTE.min.css")),format.raw/*16.114*/("""">
		<link rel="stylesheet" href=""""),_display_(/*17.33*/routes/*17.39*/.Assets.versioned("assets/admin/AdminLTE-2.3.11/dist/css/skins/skin-yellow.min.css")),format.raw/*17.123*/("""">
        <link href=""""),_display_(/*18.22*/routes/*18.28*/.Assets.versioned("assets/css/jquery-ui.min.css")),format.raw/*18.77*/("""" rel="stylesheet">
    </head>
    <body class="skin-yellow sidebar-collapse sidebar-mini">        
        <!-- wrapper -->
	    <div class="wrapper" style="height: auto;">
	      """),_display_(/*23.9*/header()),format.raw/*23.17*/("""
	      """),_display_(/*24.9*/menu()),format.raw/*24.15*/("""
	      
	      """),format.raw/*26.8*/("""<div class="content-wrapper" style="min-height: 921px;">
		      <section class="content-header">
			  	<h1>Sobre Pintura</h1>
			  </section>
			  
			  <section class="content">
			  	<div class="row">
			  		<div class="col-sm-12">
					<div class="box box-default">
             			<div class="box-body">
             				<div id="chart"></div>
             			</div>
			  		</div>
		    	</div>
		      </section>
	      </div>
	    </div>
	    <!-- //wrapper -->
        
        <!-- Footer -->
	    """),_display_(/*46.7*/footer()),format.raw/*46.15*/("""
	    """),format.raw/*47.6*/("""<!-- //Footer -->
	
		<!-- jQuery 2.2.3 -->
		<script src=""""),_display_(/*50.17*/routes/*50.23*/.Assets.versioned("assets/admin/AdminLTE-2.3.11/plugins/jQuery/jquery-2.2.3.min.js")),format.raw/*50.107*/(""""></script>
		<script src=""""),_display_(/*51.17*/routes/*51.23*/.Assets.versioned("assets/js/jquery-ui.min.js")),format.raw/*51.70*/(""""></script>
		<!-- Bootstrap 3.3.6 -->
		<script src=""""),_display_(/*53.17*/routes/*53.23*/.Assets.versioned("assets/js/bootstrap.min.js")),format.raw/*53.70*/(""""></script>
		<!-- FastClick -->
		<script src=""""),_display_(/*55.17*/routes/*55.23*/.Assets.versioned("assets/admin/AdminLTE-2.3.11/plugins/fastclick/fastclick.js")),format.raw/*55.103*/(""""></script>
		<!-- AdminLTE App -->
		<script src=""""),_display_(/*57.17*/routes/*57.23*/.Assets.versioned("assets/admin/AdminLTE-2.3.11/dist/js/app.min.js")),format.raw/*57.91*/(""""></script>
		<script src=""""),_display_(/*58.17*/routes/*58.23*/.Assets.versioned("assets/js/highcharts.js")),format.raw/*58.67*/(""""></script>
		
		<script>
  			$(function () """),format.raw/*61.20*/("""{"""),format.raw/*61.21*/("""
  				"""),format.raw/*62.7*/("""var xValues = ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set','Out','Nov','Dez'];
  				var yValues = [15,8,5,2,1,4,1,3,5,9,27];
  				
  				Highcharts.setOptions("""),format.raw/*65.29*/("""{"""),format.raw/*65.30*/("""
  	    		    """),format.raw/*66.14*/("""lang: """),format.raw/*66.20*/("""{"""),format.raw/*66.21*/("""
  	    		    	"""),format.raw/*67.15*/("""noData: 'Não há dados',
  	    		        decimalPoint: ',',
  	    		        thousandsSep: '.'
  	    		    """),format.raw/*70.14*/("""}"""),format.raw/*70.15*/("""
  	    		"""),format.raw/*71.10*/("""}"""),format.raw/*71.11*/(""");
  	    		
  		    	Highcharts.chart('chart', """),format.raw/*73.36*/("""{"""),format.raw/*73.37*/("""    
  		    		"""),format.raw/*74.11*/("""chart: """),format.raw/*74.18*/("""{"""),format.raw/*74.19*/("""
  		    	        """),format.raw/*75.18*/("""type: 'line'
  		    	    """),format.raw/*76.14*/("""}"""),format.raw/*76.15*/(""",
  		    		credits: """),format.raw/*77.20*/("""{"""),format.raw/*77.21*/("""
  		    			"""),format.raw/*78.12*/("""enabled: false
  		    		"""),format.raw/*79.11*/("""}"""),format.raw/*79.12*/(""",
  		            title: """),format.raw/*80.24*/("""{"""),format.raw/*80.25*/("""
  		                """),format.raw/*81.21*/("""text: 'Atividades'
  		            """),format.raw/*82.17*/("""}"""),format.raw/*82.18*/(""",
  		            subtitle: """),format.raw/*83.27*/("""{"""),format.raw/*83.28*/("""
  		                """),format.raw/*84.21*/("""text: 'Pintura'
  		            """),format.raw/*85.17*/("""}"""),format.raw/*85.18*/(""",
  		            colors: ['#f39c12'],
  		            tooltip: """),format.raw/*87.26*/("""{"""),format.raw/*87.27*/("""
  		                """),format.raw/*88.21*/("""pointFormat: """"),format.raw/*88.35*/("""{"""),format.raw/*88.36*/("""point.y"""),format.raw/*88.43*/("""}"""),format.raw/*88.44*/(""""
  		            """),format.raw/*89.17*/("""}"""),format.raw/*89.18*/(""",
  		            yAxis: """),format.raw/*90.24*/("""{"""),format.raw/*90.25*/("""
  		                """),format.raw/*91.21*/("""title: """),format.raw/*91.28*/("""{"""),format.raw/*91.29*/("""
  		                    """),format.raw/*92.25*/("""text: 'Ocorrências'
  		                """),format.raw/*93.21*/("""}"""),format.raw/*93.22*/(""",
  		            """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/(""",
  		            xAxis: """),format.raw/*95.24*/("""{"""),format.raw/*95.25*/("""
  		                """),format.raw/*96.21*/("""categories: (xValues == null || xValues.lenght == 0? null : xValues),
  		            """),format.raw/*97.17*/("""}"""),format.raw/*97.18*/(""",
  		            series: ["""),format.raw/*98.26*/("""{"""),format.raw/*98.27*/("""
  		                """),format.raw/*99.21*/("""name: 'Total por mês',
  		                data: (yValues == null || yValues.lenght == 0? null : yValues)
  		            """),format.raw/*101.17*/("""}"""),format.raw/*101.18*/("""]
  		        """),format.raw/*102.13*/("""}"""),format.raw/*102.14*/(""");
  			"""),format.raw/*103.6*/("""}"""),format.raw/*103.7*/(""");
  		</script>
    </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Jul 08 01:29:33 GMT-03:00 2018
                  SOURCE: C:/Users/Bruno/Documents/Projetos/Play/favelavive/app/views/main.scala.html
                  HASH: 4b86efed1aad6723f13dc9a1f6cec647c2997989
                  MATRIX: 825->0|1426->574|1441->580|1544->661|1607->697|1622->703|1720->780|1800->833|1815->839|1912->914|1975->950|1990->956|2096->1040|2148->1065|2163->1071|2233->1120|2447->1308|2476->1316|2512->1326|2539->1332|2584->1350|3138->1878|3167->1886|3201->1893|3291->1956|3306->1962|3412->2046|3468->2075|3483->2081|3551->2128|3635->2185|3650->2191|3718->2238|3796->2289|3811->2295|3913->2375|3994->2429|4009->2435|4098->2503|4154->2532|4169->2538|4234->2582|4310->2630|4339->2631|4374->2639|4576->2813|4605->2814|4648->2829|4682->2835|4711->2836|4755->2852|4894->2963|4923->2964|4962->2975|4991->2976|5069->3026|5098->3027|5142->3043|5177->3050|5206->3051|5253->3070|5308->3097|5337->3098|5387->3120|5416->3121|5457->3134|5511->3160|5540->3161|5594->3187|5623->3188|5673->3210|5737->3246|5766->3247|5823->3276|5852->3277|5902->3299|5963->3332|5992->3333|6086->3399|6115->3400|6165->3422|6207->3436|6236->3437|6271->3444|6300->3445|6347->3464|6376->3465|6430->3491|6459->3492|6509->3514|6544->3521|6573->3522|6627->3548|6696->3589|6725->3590|6772->3609|6801->3610|6855->3636|6884->3637|6934->3659|7049->3746|7078->3747|7134->3775|7163->3776|7213->3798|7366->3922|7396->3923|7440->3938|7470->3939|7507->3948|7536->3949
                  LINES: 32->1|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|54->23|54->23|55->24|55->24|57->26|77->46|77->46|78->47|81->50|81->50|81->50|82->51|82->51|82->51|84->53|84->53|84->53|86->55|86->55|86->55|88->57|88->57|88->57|89->58|89->58|89->58|92->61|92->61|93->62|96->65|96->65|97->66|97->66|97->66|98->67|101->70|101->70|102->71|102->71|104->73|104->73|105->74|105->74|105->74|106->75|107->76|107->76|108->77|108->77|109->78|110->79|110->79|111->80|111->80|112->81|113->82|113->82|114->83|114->83|115->84|116->85|116->85|118->87|118->87|119->88|119->88|119->88|119->88|119->88|120->89|120->89|121->90|121->90|122->91|122->91|122->91|123->92|124->93|124->93|125->94|125->94|126->95|126->95|127->96|128->97|128->97|129->98|129->98|130->99|132->101|132->101|133->102|133->102|134->103|134->103
                  -- GENERATED --
              */
          