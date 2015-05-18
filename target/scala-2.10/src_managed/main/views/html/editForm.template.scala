
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Computer],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, computerForm: Form[Computer]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
    <h1>Edit Data</h1>
    
    """),_display_(Seq[Any](/*11.6*/form(routes.Application.update(id))/*11.41*/ {_display_(Seq[Any](format.raw/*11.43*/("""
        
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/inputText(computerForm("name"), '_label -> "Kode Produk"))),format.raw/*15.71*/("""
            """),_display_(Seq[Any](/*16.14*/inputText(computerForm("introduced"), '_label -> "Nama Produk"))),format.raw/*16.77*/("""
            """),_display_(Seq[Any](/*17.14*/inputText(computerForm("discontinued"), '_label -> "Deskripsi"))),format.raw/*17.77*/("""
            
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save" class="btn primary">  
            <a href=""""),_display_(Seq[Any](/*23.23*/routes/*23.29*/.Application.list())),format.raw/*23.48*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*26.6*/("""
    
    """),_display_(Seq[Any](/*28.6*/form(routes.Application.delete(id), 'class -> "topRight")/*28.63*/ {_display_(Seq[Any](format.raw/*28.65*/("""
        <input type="submit" value="Delete" class="btn danger">
    """)))})),format.raw/*30.6*/("""
    
""")))})),format.raw/*32.2*/("""
"""))}
    }
    
    def render(id:Long,computerForm:Form[Computer]): play.api.templates.HtmlFormat.Appendable = apply(id,computerForm)
    
    def f:((Long,Form[Computer]) => play.api.templates.HtmlFormat.Appendable) = (id,computerForm) => apply(id,computerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 18 10:02:08 ICT 2015
                    SOURCE: D:/crud3/app/views/editForm.scala.html
                    HASH: 370be59c1d500a98994da8fcee674489cee320c3
                    MATRIX: 790->1|932->62|964->86|1048->41|1076->60|1104->140|1142->144|1153->148|1191->150|1265->189|1309->224|1349->226|1436->277|1515->334|1565->348|1650->411|1700->425|1785->488|1985->652|2000->658|2041->677|2127->732|2173->743|2239->800|2279->802|2380->872|2418->879
                    LINES: 26->1|29->5|29->5|30->1|32->4|33->5|35->7|35->7|35->7|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|51->23|51->23|51->23|54->26|56->28|56->28|56->28|58->30|60->32
                    -- GENERATED --
                */
            