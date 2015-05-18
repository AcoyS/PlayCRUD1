
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
object createForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Computer],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(computerForm: Form[Computer]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Tambah Data</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.save())/*11.37*/ {_display_(Seq[Any](format.raw/*11.39*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(computerForm("name"), '_label -> "Kode barang"))),format.raw/*15.71*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(computerForm("introduced"), '_label -> "Nama Barang"))),format.raw/*16.77*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(computerForm("discontinued"), '_label -> "Deskripsi"))),format.raw/*17.77*/("""

        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Tambah" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Application.list())),format.raw/*23.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*26.6*/("""
    
""")))})))}
    }
    
    def render(computerForm:Form[Computer]): play.api.templates.HtmlFormat.Appendable = apply(computerForm)
    
    def f:((Form[Computer]) => play.api.templates.HtmlFormat.Appendable) = (computerForm) => apply(computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 18 10:02:08 ICT 2015
                    SOURCE: D:/crud3/app/views/createForm.scala.html
                    HASH: a2a1d1aa5bac37466d85dc6e8f74d650d5ddd809
                    MATRIX: 787->1|919->52|951->76|1035->31|1063->50|1091->130|1129->134|1140->138|1178->140|1254->181|1294->212|1334->214|1421->265|1500->322|1550->336|1635->399|1685->413|1770->476|1962->632|1977->638|2018->657|2104->712
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|51->23|51->23|51->23|54->26
                    -- GENERATED --
                */
            