package org.apache.jsp.WEB_002dINF.jsp.console;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kedacom.security.util.ContextUtil;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/commons/include/get.jsp");
    _jspx_dependants.add("/commons/include/foot.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_htmlEscape_defaultHtmlEscape_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_htmlEscape_defaultHtmlEscape_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_htmlEscape_defaultHtmlEscape_nobody.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("﻿\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- head引入 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_spring_htmlEscape_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9; IE=8; IE=7; IE=EDGE\"/>\r\n");
      out.write("<link rel=\"icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/favicon.ico\" type=\"image/x-icon\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/common.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t__ctx = '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\t\r\n");
      out.write("\tfunction back() {\r\n");
      out.write("\t\twindow.history.go(-1);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tvar Keybord = {\r\n");
      out.write("\t\tENTER : 13\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t#gridRedForZxq {color:red;}\r\n");
      out.write("    .gridBlueZxq {color:blue;font-weight:bold }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- header start -->\r\n");
      out.write("<div class=\"navbar navbar-fixed-top\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"navbar-inner\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("            <a class=\"brand\" href=\"main.do\">\r\n");
      out.write("                <div class=\"logo\"></div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <!-- start: Header Menu -->\r\n");
      out.write("            <div class=\"nav pull-right right-nav\">\r\n");
      out.write("                您好，");
      out.print(ContextUtil.getCurrentUser().getFullname());
      out.write("&nbsp;\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/j_spring_security_logout\">&nbsp;&nbsp;<i class=\"glyphicon glyphicon-share\"></i>&nbsp;&nbsp;退出</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- header end -->\r\n");
      out.write("<!-- 内容开始 -->\r\n");
      out.write("<div id=\"wrapper\" class=\"container-fluid all\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div id=\"sidebar\" class=\"col-lg-2 col-md-2 col-sm-2 col-xs-2 sidebar \">\r\n");
      out.write("            <ul class=\"nav\" id=\"left\">\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"maincontent\" class=\"col-lg-10 col-md-10 col-sm-10 col-xs-10 maincontent\">\r\n");
      out.write("            <div id=\"rightContain\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"loadingModal\" data-backdrop=\"false\">\r\n");
      out.write("    <div style=\"width: 200px;height:20px; z-index: 20000; position: absolute; text-align: center; left: 50%; top: 50%;margin-left:-100px;margin-top:-10px\">\r\n");
      out.write("        <div class=\"progress progress-striped active\" style=\"margin-bottom: 0;\">\r\n");
      out.write("            <div class=\"progress-bar\" style=\"width: 100%;\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <h5>努力加载中,请稍后...</h5>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div><form id=\"tempSearchForm\"></form></div>\r\n");
      out.write("<!-- 内容结束 -->\r\n");
      out.write("\r\n");
      out.write("<footer class=\"site-footer\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <p class=\"\">\r\n");
      out.write("             版权所有©1995-");
java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(    
				     "yyyy");    
			   java.util.Date currentTime = new java.util.Date();    
			  // java.util.Calendar.YEAR
			   java.lang.String time = simpleDateFormat.format(currentTime).toString();  
			   out.println( time);  
      out.write(" 苏州科达科技股份有限公司 (苏ICP备10015492号-1) \r\n");
      out.write("        </p>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    $(function () {\r\n");
      out.write("        var resList = eval('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${resList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("        $.each(resList, function (i, v) {\r\n");
      out.write("            $(\"#left\").append\r\n");
      out.write("            (\r\n");
      out.write("                '<li id=\"' + v.resId + '\">\\n' +\r\n");
      out.write("                '    <a id=\"link' + v.resId + '\" href=\"javascript:void(0);\" data-url=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("' + v.defaultUrl + '\">\\n' +\r\n");
      out.write("                '        <i class=\"glyphicon glyphicon-book\"></i>' + v.resName + '\\n' +\r\n");
      out.write("                '    </a>\\n' +\r\n");
      out.write("                '</li>'\r\n");
      out.write("            );\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(\"#left li a\").on(\"click\", function () {\r\n");
      out.write("            $(\"#rightContain\").load($(this).attr(\"data-url\"));\r\n");
      out.write("            $(\"#left li a\").removeClass(\"active\");\r\n");
      out.write("            $(this).addClass(\"active\");\r\n");
      out.write("            $(\"#tempSearchForm\").html('');\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var leftLiAList = $(\"#left li a\");\r\n");
      out.write("        if (leftLiAList != undefined && leftLiAList != null && leftLiAList.length > 0) {\r\n");
      out.write("            $(\"#left li a:eq(0)\").click();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("</script>");
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

  private boolean _jspx_meth_spring_htmlEscape_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:htmlEscape
    org.springframework.web.servlet.tags.HtmlEscapeTag _jspx_th_spring_htmlEscape_0 = (org.springframework.web.servlet.tags.HtmlEscapeTag) _jspx_tagPool_spring_htmlEscape_defaultHtmlEscape_nobody.get(org.springframework.web.servlet.tags.HtmlEscapeTag.class);
    _jspx_th_spring_htmlEscape_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_htmlEscape_0.setParent(null);
    _jspx_th_spring_htmlEscape_0.setDefaultHtmlEscape(true);
    int[] _jspx_push_body_count_spring_htmlEscape_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_htmlEscape_0 = _jspx_th_spring_htmlEscape_0.doStartTag();
      if (_jspx_th_spring_htmlEscape_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_htmlEscape_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_htmlEscape_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_htmlEscape_0.doFinally();
      _jspx_tagPool_spring_htmlEscape_defaultHtmlEscape_nobody.reuse(_jspx_th_spring_htmlEscape_0);
    }
    return false;
  }
}
