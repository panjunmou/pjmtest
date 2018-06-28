package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <title>日报管理系统</title>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        @import url(http://fonts.googleapis.com/css?family=Exo:100,200,400);\r\n");
      out.write("        @import url(http://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-family: Arial;\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .body {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: -20px;\r\n");
      out.write("            left: -20px;\r\n");
      out.write("            right: -40px;\r\n");
      out.write("            bottom: -40px;\r\n");
      out.write("            width: auto;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login/city-skyline-wallpapers-008.jpg');\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            -webkit-filter: blur(5px);\r\n");
      out.write("            z-index: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .grad {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: -20px;\r\n");
      out.write("            left: -20px;\r\n");
      out.write("            right: -40px;\r\n");
      out.write("            bottom: -40px;\r\n");
      out.write("            width: auto;\r\n");
      out.write("            height: auto;\r\n");
      out.write("            background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, rgba(0, 0, 0, 0)), color-stop(100%, rgba(0, 0, 0, 0.65))); /* Chrome,Safari4+ */\r\n");
      out.write("            z-index: 1;\r\n");
      out.write("            opacity: 0.7;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: calc(50% - 35px);\r\n");
      out.write("            left: calc(50% - 255px);\r\n");
      out.write("            z-index: 2;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header div {\r\n");
      out.write("            float: left;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-family: 'Exo', sans-serif;\r\n");
      out.write("            font-size: 35px;\r\n");
      out.write("            font-weight: 200;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .header div span {\r\n");
      out.write("            color: #5379fa !important;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login {\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top: calc(50% - 75px);\r\n");
      out.write("            left: calc(50% - 50px);\r\n");
      out.write("            height: 150px;\r\n");
      out.write("            width: 350px;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            z-index: 2;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input[type=text] {\r\n");
      out.write("            width: 250px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            background: transparent;\r\n");
      out.write("            border: 1px solid rgba(255, 255, 255, 0.6);\r\n");
      out.write("            border-radius: 2px;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-family: 'Exo', sans-serif;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            padding: 4px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input[type=password] {\r\n");
      out.write("            width: 250px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            background: transparent;\r\n");
      out.write("            border: 1px solid rgba(255, 255, 255, 0.6);\r\n");
      out.write("            border-radius: 2px;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            font-family: 'Exo', sans-serif;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            padding: 4px;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input[type=submit] {\r\n");
      out.write("            width: 260px;\r\n");
      out.write("            height: 35px;\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            border: 1px solid #fff;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            border-radius: 2px;\r\n");
      out.write("            color: #a18d6c;\r\n");
      out.write("            font-family: 'Exo', sans-serif;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            font-weight: 400;\r\n");
      out.write("            padding: 6px;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input[type=submit]:hover {\r\n");
      out.write("            opacity: 0.8;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input[type=submit]:active {\r\n");
      out.write("            opacity: 0.6;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input[type=text]:focus {\r\n");
      out.write("            outline: none;\r\n");
      out.write("            border: 1px solid rgba(255, 255, 255, 0.9);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input[type=password]:focus {\r\n");
      out.write("            outline: none;\r\n");
      out.write("            border: 1px solid rgba(255, 255, 255, 0.9);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .login input[type=submit]:focus {\r\n");
      out.write("            outline: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ::-webkit-input-placeholder {\r\n");
      out.write("            color: rgba(255, 255, 255, 0.6);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        ::-moz-input-placeholder {\r\n");
      out.write("            color: rgba(255, 255, 255, 0.6);\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login/prefixfree.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"body\"></div>\r\n");
      out.write("<div class=\"grad\"></div>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("    <div>日报 <span>系统</span></div>\r\n");
      out.write("</div>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<div class=\"login\">\r\n");
      out.write("    <form class=\"form-horizontal\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/login.do\" method=\"post\">\r\n");
      out.write("        <input type=\"text\" placeholder=\"用户名\" name=\"username\" id=\"username\"><br>\r\n");
      out.write("        <input type=\"password\" placeholder=\"密码\" name=\"password\" id=\"password\"><br>\r\n");
      out.write("        <input type=\"submit\" value=\"登录\">\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ctx}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/res/js/jquery-1.11.2.js'></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
}
