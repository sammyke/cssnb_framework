package org.apache.jsp.WEB_002dINF.views.tbl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_005flist1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!DOCTYPE html> \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>jqgrid测试</title>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>宁波市质量安全监管平台新版本</title>\r\n");
      out.write("    <meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\">\r\n");
      out.write("    <meta content=\"no-store\" http-equiv=\"Cache-Control\">\r\n");
      out.write("    <meta content=\"no-cache\" http-equiv=\"Pragma\">\r\n");
      out.write("    <meta content=\"0\" http-equiv=\"Expires\">\r\n");
      out.write("    <meta content=\"IE=edge, chrome=1\" http-equiv=\"X-UA-Compatible\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-validation/1.9.0/validate.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/global/css/base.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/global/css/icon.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"/favicon.ico\" rel=\"shortcut icon\" type=\"image/x-icon\">\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/global/css/template2.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/dataTable/css/datatable1.css?v=1\" />\r\n");
      out.write("\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-ui/css/cssnb/jquery-ui-1.8.21.custom.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/global/js/html5.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <!--[if lt IE 7]>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/global/js/iepngfix_tilebg.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    <title>预告信息列表</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1 id='banner'></h1>\r\n");
      out.write("    <div id=\"container\" class=\"page\">\r\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/tbl/members/list\" id=\"queryForm\" method=\"post\" name=\"queryForm\">\r\n");
      out.write("            <table>\r\n");
      out.write("                <tbody style=\"text-align: center\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td align=\"right\" width=\"50\">职位：</td>\r\n");
      out.write("                        <td align=\"left\" width=\"80\"><input name=\"zw\" size=\"15\" type=\"text\" value=\"\"></td>\r\n");
      out.write("                        <td align=\"right\" width=\"50\">姓名：</td>\r\n");
      out.write("                        <td align=\"left\" width=\"80\"><input name=\"name\" size=\"15\" type=\"text\" value=\"\"></td>\r\n");
      out.write("                        <td align=\"left\"><input name=\"Submit\" type=\"submit\" value=\"查询 \"></td>\r\n");
      out.write("                        <td align=\"left\"><input id=\"addForm\" name=\"Search\" type=\"button\" value=\"添加\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id='gridcontainer'  class=\"page\" style=\"display: none\">\r\n");
      out.write("        <form id=\"formoper\" method=\"post\" name=\"formoper\">\r\n");
      out.write("            <table border=\"1\" class=\"et1\" id=\"mytab\" style=\"\" >\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th colspan=\"4\" id=\"item\"></th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\">姓名：</td>\r\n");
      out.write("                    <td align=\"left\" colspan=\"3\"><input id=\"name\" name=\"name\" style=\"width:100px\" type=\"text\" value=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\">职位：</td>\r\n");
      out.write("                    <td align=\"left\" colspan=\"3\"><input id=\"zw\" name=\"zw\" style=\"width:100px\" type=\"text\" value=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\">areaid：</td>\r\n");
      out.write("                    <td align=\"left\" colspan=\"3\"><input id=\"areaid\" name=\"areaid\" style=\"width:100px\" type=\"text\"value=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\">depteid：</td>\r\n");
      out.write("                    <td><input id=\"depteid\" name=\"depteid\" style=\"width:100px\" type=\"text\" value=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\">passwd：</td>\r\n");
      out.write("                    <td><input id=\"passwd\" name=\"passwd\" style=\"width:100px\" type=\"text\" value=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\">keyno：</td>\r\n");
      out.write("                    <td><input id=\"keyno\" name=\"keyno\" style=\"width:100px\" type=\"text\" value=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\">px：</td>\r\n");
      out.write("                    <td><input id=\"px\" name=\"px\" style=\"width:100px\" type=\"text\" value=\"\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\"><input class=\"submitform\" id=\"submitform\" name=\"Submit\" type=\"button\" value=\"确定\"></td>\r\n");
      out.write("                    <td align=\"right\" width=\"30%\"><input id=\"hidForm\" name=\"cancer\" type=\"button\" value=\"收起\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div id='msgbox' style='display: none' title=''></div>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"dt_example\" class=\"page\">\r\n");
      out.write("        <div id=\"container\" style=\"text-align: center\">\r\n");
      out.write("            \r\n");
      out.write("                <table class=\"dtable\" id=\"example\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th width=\"5%\">编 号</th>\r\n");
      out.write("                            <th width=\"15%\">姓 名</th>\r\n");
      out.write("                            <th width=\"15%\">职 位</th>\r\n");
      out.write("                            <th width=\"20%\">区域</th>\r\n");
      out.write("                            <th width=\"15%\">部门</th>\r\n");
      out.write("                            <th width=\"15%\">其他</th>\r\n");
      out.write("                            <th width=\"15%\">操作</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/global/js/jquery.hoverIntent.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-ui/js/jquery-ui-1.8.21.custom.min.js\" type='text/javascript'></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/My97DatePicker/WdatePicker.js\" type='text/javascript'></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/global/js/jquery.form.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/jquery-validation/1.9.0/jquery.validate.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/dataTable/js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/dataTable/js/jquery.dataTables.pagination4.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/resources/dataTable/js/jquery.dataTables.reloadajax.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    var oTable=$(\"#example\").dataTable({\r\n");
      out.write("    //  \"bPaginate\": true, //开关，是否显示分页器\r\n");
      out.write("    //  \"bInfo\": true,//开关，是否显示表格的一些信息\r\n");
      out.write("    //  \"bFilter\": true, //开关，是否启用客户端过滤器\r\n");
      out.write("    //  \"sDom\": \"<>lfrtip<>\",\r\n");
      out.write("    //  \"bAutoWith\": false,\r\n");
      out.write("    //  \"bDeferRender\": false,\r\n");
      out.write("        \"bJQueryUI\": true,\r\n");
      out.write("    //  \"bLengthChange\": true,//开关，是否显示每页大小的下拉框\r\n");
      out.write("        \"bProcessing\": true,\r\n");
      out.write("    //  \"bScrollInfinite\": false,\r\n");
      out.write("    //  \"sScrollY\": \"800px\", //是否开启垂直迁移转变，以及指定迁移转变区域大小，可设值：\"\"disabled\"\"，\"\"2000px\"\"\r\n");
      out.write("    //  \"bSort\": true, //开关，是否启用各列具有按列排序的功能\r\n");
      out.write("    //  \"bSortClasses\": true,\r\n");
      out.write("    //  \"bStateSave\": false, //开关，是否打开客户端状况记录功能。这个数据是记录在cookies中的，打开了这个记录后，即使刷新一次页面，或从头打开浏览器，之前的状况都是保存下来的-------当值为true时aoColumnDefs不克不及隐蔽列\r\n");
      out.write("    //  \"sScrollX\": \"50％\", //是否开启程度迁移转变，以及指定迁移转变区域大小，可设值：\"\"disabled\"\"，\"\"2000％\"\"\r\n");
      out.write("    //  \"aaSorting\": [[0, \"asc\"]],\r\n");
      out.write("    //    \"aoColumnDefs\": [{ \"bVisible\": false,\"aTargets\": [0]}],//隐蔽列\r\n");
      out.write("        \"sDom\": '<\"top\"rf>t<\"bottom\"ipl><\"clear\">',\r\n");
      out.write("   \t    \"bAutoWidth\": false, //自适应宽度\r\n");
      out.write("        \"sPaginationType\": \"four_button\",\r\n");
      out.write("        \"oLanguage\": {\r\n");
      out.write("            \"sProcessing\": \"正在加载中......\",\r\n");
      out.write("            \"sLengthMenu\": \"每页 _MENU_ 条记录\",\r\n");
      out.write("            \"sZeroRecords\": \"没有找到记录\",\r\n");
      out.write("            \"sEmptyTable\": \"表中无数据存在！\",\r\n");
      out.write("            \"sInfo\": \"当前显示 _START_ 到 _END_ 条，共 _TOTAL_ 条记录\",\r\n");
      out.write("            \"sInfoFiltered\": \"数据表中共为 _MAX_ 笔记录\",\r\n");
      out.write("            \"sSearch\": \"搜索\",\r\n");
      out.write("            \"oPaginate\": {\r\n");
      out.write("                \"sFirst\": \"首页\",\r\n");
      out.write("                \"sPrevious\": \"上一页\",\r\n");
      out.write("                \"sNext\": \"下一页\",\r\n");
      out.write("                \"sLast\": \"末页\"\r\n");
      out.write("            }\r\n");
      out.write("        },\r\n");
      out.write("        \"aLengthMenu\": [[10, 20, 50, -1], [10, 20, 50, \"所有\"]],\r\n");
      out.write("      //  \"aaSorting\": [[0, \"desc\"]],\r\n");
      out.write("        \"fnRowCallback\": function(nRow, aData, iDisplayIndex, iDisplayIndexFull){ \r\n");
      out.write("            var index = iDisplayIndexFull + 1; \r\n");
      out.write("            $('td:eq(0)', nRow).html(index); \r\n");
      out.write("            return nRow;\r\n");
      out.write("         }\r\n");
      out.write("    });\r\n");
      out.write("    \r\n");
      out.write("    $(\"#addForm\").on(\"click\",function(){\r\n");
      out.write("        $(\"#gridcontainer\").show();\r\n");
      out.write("        $(\"#item\").html(\"\");\r\n");
      out.write("        $(\"#item\").html(\"信息添加\");\r\n");
      out.write("        $(\"#id\").val(\"\");\r\n");
      out.write("        $(\"#name\").val(\"\");\r\n");
      out.write("        $(\"#zw\").val(\"\");\r\n");
      out.write("        $(\"#areaid\").val(\"\");\r\n");
      out.write("        $(\"#depteid\").val(\"\");\r\n");
      out.write("        $(\"#passwd\").val(\"\");\r\n");
      out.write("        $(\"#keyno\").val(\"\");\r\n");
      out.write("        $(\"#px\").val(\"\");\r\n");
      out.write("        $(\"#dt_example\").hide();\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#hidForm\").on(\"click\",function(){\r\n");
      out.write("        $(\"#mytab #id\").remove();\r\n");
      out.write("        $(\"#gridcontainer\").hide();\r\n");
      out.write("        $(\"#dt_example\").show();\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#example\").on(\"click\",\".updateForm\",function(){\r\n");
      out.write("        var aPos = oTable.fnGetPosition($(this).closest(\"td\").get(0));\r\n");
      out.write("        var rowdata = oTable.fnGetData(aPos[0]);\r\n");
      out.write("        buirowIdx = aPos[0];\r\n");
      out.write("        var id=rowdata[0];\r\n");
      out.write("        $(\"#mytab\").append(\"<tr><td style='display:none'><input id='id' name='id'/><\\/td><\\/tr>\");\r\n");
      out.write("        $(\"#dt_example\").hide();\r\n");
      out.write("        $(\"#gridcontainer\").show();\r\n");
      out.write("        $(\"#item\").html(\"\");\r\n");
      out.write("        $(\"#item\").html(\"信息修改\");\r\n");
      out.write("        $(\"#name\").val(\"\");\r\n");
      out.write("        $(\"#zw\").val(\"\");\r\n");
      out.write("        $(\"#areaid\").val(\"\");\r\n");
      out.write("        $(\"#depteid\").val(\"\");\r\n");
      out.write("        $(\"#passwd\").val(\"\");\r\n");
      out.write("        $(\"#keyno\").val(\"\");\r\n");
      out.write("        $(\"#px\").val(\"\");\r\n");
      out.write("        $.post(\r\n");
      out.write("            \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/tbl/members/show\",\r\n");
      out.write("            {\"id\":id},\r\n");
      out.write("            function(data){\r\n");
      out.write("                $(\"#id\").val(data.id);\r\n");
      out.write("                $(\"#name\").val(data.name);\r\n");
      out.write("                $(\"#zw\").val(data.zw);\r\n");
      out.write("                $(\"#areaid\").val(data.areaid);\r\n");
      out.write("                $(\"#depteid\").val(data.depteid);\r\n");
      out.write("                $(\"#passwd\").val(data.passwd);\r\n");
      out.write("                $(\"#keyno\").val(data.keyno);\r\n");
      out.write("                $(\"#px\").val(data.px);\r\n");
      out.write("            },\r\n");
      out.write("            \"json\"\r\n");
      out.write("        );\r\n");
      out.write("    });\r\n");
      out.write("    $(\"#example\").on(\"click\",\".deleteForm\",function(){\r\n");
      out.write("        var aPos = oTable.fnGetPosition($(this).closest(\"td\").get(0));\r\n");
      out.write("        var rowdata = oTable.fnGetData(aPos[0]);\r\n");
      out.write("        var id=rowdata[0];\r\n");
      out.write("        if(confirm(\"继续删除\")){\r\n");
      out.write("        \t$.post(\r\n");
      out.write("            \t\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/tbl/members/delete\",\r\n");
      out.write("            \t{\"id\":id},\r\n");
      out.write("            \tfunction(data){\r\n");
      out.write("            \t\toTable.fnDeleteRow(aPos[0]);\r\n");
      out.write("            \t},\r\n");
      out.write("            \t\"json\"\r\n");
      out.write("        \t);\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("    var buirowIdx = -1;\r\n");
      out.write("    /*$(\"#submitform\").on(\"click\",function(){\r\n");
      out.write("        var name=$(\"#name\").val();\r\n");
      out.write("        var zw=$(\"#zw\").val();\r\n");
      out.write("        var areaid=$(\"#areaid\").val();\r\n");
      out.write("        var depteid=$(\"#depteid\").val();\r\n");
      out.write("        var passwd=$(\"#passwd\").val();\r\n");
      out.write("        var keyno=$(\"#keyno\").val();\r\n");
      out.write("        var px=$(\"#px\").val();\r\n");
      out.write("        if(name==\"\" || zw==\"\" || areaid==\"\" || depteid==\"\" || passwd==\"\" || keyno==\"\" || px==\"\"){\r\n");
      out.write("            alert(\"信息未填完\");\r\n");
      out.write("        }else{\r\n");
      out.write("        \tvar id=$(\"#id\").val();\r\n");
      out.write("        \tif(id!=null && id!=\"\"){\r\n");
      out.write("            \tvar options = {\r\n");
      out.write("                \turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/tbl/members/form\",\r\n");
      out.write("                \ttype:\"post\",\r\n");
      out.write("                \tdataType:\"json\",\r\n");
      out.write("                \tsuccess: function(data) {\r\n");
      out.write("                \t\toTable.fnUpdate(data.name,buirowIdx,1);\r\n");
      out.write("                    \toTable.fnUpdate(data.zw,buirowIdx,2);\r\n");
      out.write("                    \toTable.fnUpdate(data.areaid,buirowIdx,3);\r\n");
      out.write("                    \toTable.fnUpdate(data.depteid,buirowIdx,4);\r\n");
      out.write("                    \toTable.fnUpdate(data.keyno,buirowIdx,5);\r\n");
      out.write("                    \talert(\"确定!\");\r\n");
      out.write("            \t\t} \r\n");
      out.write("        \t\t};\r\n");
      out.write("            \t$('#formoper').ajaxSubmit(options);\r\n");
      out.write("            \treturn false;\r\n");
      out.write("        \t}else{\r\n");
      out.write("        \t\tvar options = {\r\n");
      out.write("            \t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/tbl/members/form\",\r\n");
      out.write("            \t\ttype:\"post\",\r\n");
      out.write("                \tdataType:\"json\",\r\n");
      out.write("                \tsuccess: function(data) {\r\n");
      out.write("                    \toTable.fnAddData([data.id,data.name,data.zw,data.areaid,data.depteid,data.keyno, '<input value=\"更新\" type=\"button\" class=\"updateForm\" /><input value=\"删除\" type=\"button\" class=\"deleteForm\" />']);\r\n");
      out.write("                    \talert(\"确定!\");\r\n");
      out.write("        \t\t\t} \r\n");
      out.write("    \t\t\t};\r\n");
      out.write("        \t\t$('#formoper').ajaxSubmit(options);\r\n");
      out.write("        \t\treturn false;       \r\n");
      out.write("        \t}\r\n");
      out.write("    \t}\r\n");
      out.write("    });\r\n");
      out.write("    */\r\n");
      out.write("    jQuery.validator.addMethod(\"stringCheck\", function(value, element) { \r\n");
      out.write("\t     return this.optional(element) || /^[\\u4e00-\\u9fa5]+$/.test(value); \r\n");
      out.write("}, \"只能包括中文\");\r\n");
      out.write("jQuery.validator.addMethod(\"intCheck\",function(value,elememt){\r\n");
      out.write("\t\t return this.optional(elememt) || /^[0-9]+$/.test(value);\r\n");
      out.write("},\"只能是数字\");\r\n");
      out.write("jQuery.validator.addMethod(\"passwdCheck\",function(value,elememt){\r\n");
      out.write("\t\t return this.optional(elememt) || /^[A-Za-z0-9]+$/.test(value);\r\n");
      out.write("},\"只能包括英文字母和数字\");\r\n");
      out.write("$(\"#formoper\").validate(\r\n");
      out.write("\t{\r\n");
      out.write("\t\trules:{\r\n");
      out.write("\t\t\tname:{\r\n");
      out.write("\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\tstringCheck:true,\r\n");
      out.write("\t\t\t\t/*remote: {\r\n");
      out.write("\t\t\t          url:\"{ctx}/tbl/members/check\",\r\n");
      out.write("\t\t\t          type:\"post\",\r\n");
      out.write("\t\t\t          async:true,\r\n");
      out.write("\t\t\t          dataType:\"json\",\r\n");
      out.write("\t\t\t          dataFilter:function(data){ \r\n");
      out.write("\t\t\t        \tdata = jQuery.parseJSON( data );\r\n");
      out.write("\t\t\t        \tconsole.log(data)\r\n");
      out.write("\t\t\t          \treturn data;}\r\n");
      out.write("\t\t\t        }*/\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tzw:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\tstringCheck:true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tareaid:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\tminlength:2,\r\n");
      out.write("\t\t\t\tintCheck:true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tdepteid:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\tminlength:12,\r\n");
      out.write("\t\t\t\tintCheck:true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tpasswd:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\tminlength:2,\r\n");
      out.write("\t\t\t\tpasswdCheck:true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tkeyno:{\r\n");
      out.write("\t\t\t\trequired: true,\r\n");
      out.write("\t\t\t\tstringCheck:true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tpx:{\r\n");
      out.write("\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\tintCheck:true\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\tmessages:{\r\n");
      out.write("\t\t\tname:{\r\n");
      out.write("\t\t\t\trequired:\"不能为空!\",\r\n");
      out.write("\t\t\t\tstringCheck:\"只能使用中文!\",\r\n");
      out.write("//\t\t\t\tremote:\"用户已存在!\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tzw:{\r\n");
      out.write("\t\t\t\trequired:\"不能为空!\",\r\n");
      out.write("\t\t\t\tstringCheck:\"只能使用中文!\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tareaid:{\r\n");
      out.write("\t\t\t\trequired:\"不能为空!\",\r\n");
      out.write("\t\t\t\tminlength:\"字段过短!\",\r\n");
      out.write("\t\t\t\tintCheck:\"只能用数字!\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tdepteid:{\r\n");
      out.write("\t\t\t\trequired:\"不能为空!\",\r\n");
      out.write("\t\t\t\tminlength:\"字段过短!\",\r\n");
      out.write("\t\t\t\tintCheck:\"只能用数字!\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tpasswd:{\r\n");
      out.write("\t\t\t\trequired:\"不能为空!\",\r\n");
      out.write("\t\t\t\tminlength:\"字段过短!\",\r\n");
      out.write("\t\t\t\tpasswdCheck:\"只能包括英文字母和数字!\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tkeyno:{\r\n");
      out.write("\t\t\t\trequired:\"不能为空!\",\r\n");
      out.write("\t\t\t\tstringCheck:\"只能使用中文!\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\tpx:{\r\n");
      out.write("\t\t\t\trequired:\"不能为空!\",\r\n");
      out.write("\t\t\t\tintCheck:\"只能用数字!\"\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\tsubmitHandler: function(form) { \r\n");
      out.write("\t\t\tvar id=$(\"#id\").val();\r\n");
      out.write("\t\t\tconsole.log(id);\r\n");
      out.write("\t\t\tif(id!=null && id!=\"\"){\r\n");
      out.write("\t\t\t\tconsole.log(1);\r\n");
      out.write("\t\t\t\tvar options = {\r\n");
      out.write("\t\t\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/tbl/members/form\",\r\n");
      out.write("\t\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\t\toTable.fnUpdate(data.name,buirowIdx,1);\r\n");
      out.write("\t\t\t\t\t\toTable.fnUpdate(data.zw,buirowIdx,2);\r\n");
      out.write("\t\t\t\t\t\toTable.fnUpdate(data.areaid,buirowIdx,3);\r\n");
      out.write("\t\t\t\t\t\toTable.fnUpdate(data.depteid,buirowIdx,4);\r\n");
      out.write("\t\t\t\t\t\toTable.fnUpdate(data.keyno,buirowIdx,5);\r\n");
      out.write("\t\t\t\t\t\talert(\"确定!\");\r\n");
      out.write("\t\t\t\t\t} };\r\n");
      out.write("\t\t\t\t    $('#formoper').ajaxSubmit(options);\r\n");
      out.write("\t\t\t\t    return false;\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tconsole.log(2);\r\n");
      out.write("\t\t\tvar options = {\r\n");
      out.write("\t\t\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/tbl/members/form\",\r\n");
      out.write("\t\t\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\t\toTable.fnAddData([data.id,data.name,data.zw,data.areaid,data.depteid,data.keyno, '<input value=\"更新\" type=\"button\" class=\"updateForm\" /><input value=\"删除\" type=\"button\" class=\"deleteForm\" />']);\r\n");
      out.write("\t\t\t\t\t\talert(\"确定!\");\r\n");
      out.write("\t\t\t} };\r\n");
      out.write("\t\t    $('#formoper').ajaxSubmit(options);\r\n");
      out.write("\t\t    return false;\t    \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("ctx");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("member");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.zw}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.areaid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.depteid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${member.keyno }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                            <td><input class=\"updateForm\" type=\"button\" value=\"更新\"><input class=\"deleteForm\" type=\r\n");
          out.write("                            \"button\" value=\"删除\"></td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
