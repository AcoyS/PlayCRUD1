
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>CRUD</title>
		<div class = "css">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<link id="bootstrap-style" href= """"),_display_(Seq[Any](/*10.39*/routes/*10.45*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*10.90*/("""" rel="stylesheet">
			<link href=""""),_display_(Seq[Any](/*11.17*/routes/*11.23*/.Assets.at("bootstrap/css/bootstrap-responsive.min.css"))),format.raw/*11.79*/("""" rel="stylesheet">
			<link id="base-style" href=""""),_display_(Seq[Any](/*12.33*/routes/*12.39*/.Assets.at("bootstrap/css/style.css"))),format.raw/*12.76*/("""" rel="stylesheet">
			<link id="base-style-responsive" href=""""),_display_(Seq[Any](/*13.44*/routes/*13.50*/.Assets.at("bootstrap/css/style-responsive.css"))),format.raw/*13.98*/("""" rel="stylesheet">
			<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>	
			<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.49*/routes/*15.55*/.Assets.at("stylesheets/main.css"))),format.raw/*15.89*/("""">
			<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*16.54*/routes/*16.60*/.Assets.at("images/favicon.png"))),format.raw/*16.92*/("""">
			<script src=""""),_display_(Seq[Any](/*17.18*/routes/*17.24*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*17.69*/("""" type="text/javascript"></script>
			<script src=""""),_display_(Seq[Any](/*18.18*/routes/*18.24*/.Assets.at("bootstrap/js/bootstrap.min.js"))),format.raw/*18.67*/("""" type="text/javascript"></script>
		</div>
	</head>
    <body>
			<!-- start: Header -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<a class="brand" href="index.html"><span>Daftar Produk</span></a>
								
				<!-- start: Header Menu -->
				<div class="nav-no-collapse header-nav">
					<ul class="nav pull-right">
						<li class="dropdown hidden-phone">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="icon-calendar"></i>
								<span class="badge red">
								0 </span>
							</a>
							<ul class="dropdown-menu tasks">
								<li class="dropdown-menu-title">
 									<span>Anda tidak memiliki tugas</span>
									<a href="#refresh"><i class="icon-repeat"></i></a>
								</li>
								<li>
                            		<a class="dropdown-menu-sub-footer">Lihat semua tugas</a>
								</li>	
							</ul>
						</li>
						<li class="dropdown hidden-phone">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="icon-envelope"></i>
								<span class="badge red">
								0 </span>
							</a>
							<ul class="dropdown-menu messages">
								<li class="dropdown-menu-title">
 									<span>Tidak ada pesan</span>
									<a href="#refresh"><i class="icon-repeat"></i></a>
								</li>	
								<li>
                            		<a class="dropdown-menu-sub-footer">Lihat semua pesan</a>
								</li>	
							</ul>
						</li>
						
						<!-- start: User Dropdown -->
						<li class="dropdown">
							<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
								<i class="halflings-icon white user"></i> User
								<span class="caret"></span>
							</a>
							<ul class="dropdown-menu">
								<li class="dropdown-menu-title">
 									<span>Account Settings</span>
								</li>
								<li><a href="#"><i class="halflings-icon user"></i> Profile</a></li>
								<li><a href="login.html"><i class="halflings-icon off"></i> Logout</a></li>
							</ul>
						</li>
						<!-- end: User Dropdown -->
					</ul>
				</div>
			</div>
		</div>
	</div>
        """),_display_(Seq[Any](/*89.10*/content)),format.raw/*89.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 18 13:52:30 ICT 2015
                    SOURCE: D:/crud3/app/views/main.scala.html
                    HASH: 5e56deda9603f68c4ed5f6a2a43019d8bd7c0f60
                    MATRIX: 771->1|880->16|1113->213|1128->219|1195->264|1267->300|1282->306|1360->362|1448->414|1463->420|1522->457|1621->520|1636->526|1706->574|2016->848|2031->854|2087->888|2179->944|2194->950|2248->982|2304->1002|2319->1008|2386->1053|2474->1105|2489->1111|2554->1154|4948->3512|4977->3519
                    LINES: 26->1|29->1|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|117->89|117->89
                    -- GENERATED --
                */
            