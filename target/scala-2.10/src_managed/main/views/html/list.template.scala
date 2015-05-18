
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Computer],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Computer], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Application.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.115*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
	
    """),_display_(Seq[Any](/*40.6*/if(flash.containsKey("success"))/*40.38*/ {_display_(Seq[Any](format.raw/*40.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*42.37*/flash/*42.42*/.get("success"))),format.raw/*42.57*/("""
        </div>
    """)))})),format.raw/*44.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*48.24*/link(0, "name"))),format.raw/*48.39*/("""" method="GET">
        </form>
        
        <a class="btn btn-success" id="add" href=""""),_display_(Seq[Any](/*51.52*/routes/*51.58*/.Application.create())),format.raw/*51.79*/(""""><i class="halflings-icon white plus"></i> Tambah Produk</a>
		<br>
		<br>
		<br>
        
    </div>
    
    """),_display_(Seq[Any](/*58.6*/if(currentPage.getTotalRowCount == 0)/*58.43*/ {_display_(Seq[Any](format.raw/*58.45*/("""
        
        <div class="well">
            <em>Tidak ada yang dapat ditampilkan</em>
        </div>
        
    """)))}/*64.7*/else/*64.12*/{_display_(Seq[Any](format.raw/*64.13*/("""

	<div class="row-fluid sortable">		
		<div class="box span12">
			<div class="box-header" data-original-title>
				<h2><i class="halflings-icon white user"></i><span class="break"></span>Produk</h2>
			</div>
			<div class="box-content">
				<table class="table table-striped table-bordered bootstrap-datatable datatable">
					<thead>
						<tr>
							"""),_display_(Seq[Any](/*75.9*/header("name", "Kode Produk"))),format.raw/*75.38*/("""
							"""),_display_(Seq[Any](/*76.9*/header("introduced", "Nama"))),format.raw/*76.37*/("""
							"""),_display_(Seq[Any](/*77.9*/header("discontinued", "Deskripsi"))),format.raw/*77.44*/("""
						</tr>
					</thead>   
					<tbody>
						"""),_display_(Seq[Any](/*81.8*/for(computer <- currentPage.getList) yield /*81.44*/ {_display_(Seq[Any](format.raw/*81.46*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*83.39*/routes/*83.45*/.Application.edit(computer.id))),format.raw/*83.75*/("""">"""),_display_(Seq[Any](/*83.78*/computer/*83.86*/.name)),format.raw/*83.91*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*85.30*/if(computer.introduced == null)/*85.61*/ {_display_(Seq[Any](format.raw/*85.63*/("""
                                <em>-</em>
                            """)))}/*87.31*/else/*87.36*/{_display_(Seq[Any](format.raw/*87.37*/("""
                                """),_display_(Seq[Any](/*88.34*/computer/*88.42*/.introduced.format("dd MMM yyyy"))),format.raw/*88.75*/("""
                            """)))})),format.raw/*89.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*92.30*/if(computer.discontinued == null)/*92.63*/ {_display_(Seq[Any](format.raw/*92.65*/("""
                                <em>-</em>
                            """)))}/*94.31*/else/*94.36*/{_display_(Seq[Any](format.raw/*94.37*/("""
                                """),_display_(Seq[Any](/*95.34*/computer/*95.42*/.discontinued.format("dd MMM yyyy"))),format.raw/*95.77*/("""
                            """)))})),format.raw/*96.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*99.18*/("""	
					</tbody>
				</table>            
			</div>
		</div><!--/span-->
	</div><!--/row-->
        
    """)))})),format.raw/*106.6*/("""
        
""")))})),format.raw/*108.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Computer],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Computer],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 18 14:45:00 ICT 2015
                    SOURCE: D:/crud3/app/views/list.scala.html
                    HASH: 2b264564b34c7495122c31b0771d662b5832a185
                    MATRIX: 818->1|1009->860|1023->866|1134->896|1187->913|1199->916|1238->933|1283->942|1317->968|1405->1032|1462->1053|1496->1065|1535->1068|1562->1073|1600->243|1611->247|2143->114|2172->241|2200->748|2230->858|2258->1089|2296->1092|2308->1096|2347->1098|2390->1106|2431->1138|2471->1140|2588->1221|2602->1226|2639->1241|2691->1262|2785->1320|2822->1335|2950->1427|2965->1433|3008->1454|3156->1567|3202->1604|3242->1606|3380->1727|3393->1732|3432->1733|3824->2090|3875->2119|3919->2128|3969->2156|4013->2165|4070->2200|4155->2250|4207->2286|4247->2288|4347->2352|4362->2358|4414->2388|4453->2391|4470->2399|4497->2404|4601->2472|4641->2503|4681->2505|4773->2579|4786->2584|4825->2585|4895->2619|4912->2627|4967->2660|5029->2690|5154->2779|5196->2812|5236->2814|5328->2888|5341->2893|5380->2894|5450->2928|5467->2936|5524->2971|5586->3001|5692->3075|5829->3180|5872->3191
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|66->40|68->42|68->42|68->42|70->44|74->48|74->48|77->51|77->51|77->51|84->58|84->58|84->58|90->64|90->64|90->64|101->75|101->75|102->76|102->76|103->77|103->77|107->81|107->81|107->81|109->83|109->83|109->83|109->83|109->83|109->83|111->85|111->85|111->85|113->87|113->87|113->87|114->88|114->88|114->88|115->89|118->92|118->92|118->92|120->94|120->94|120->94|121->95|121->95|121->95|122->96|125->99|132->106|134->108
                    -- GENERATED --
                */
            