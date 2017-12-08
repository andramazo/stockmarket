package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class custlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String id; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Sign-In to your Account&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; U</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".newStyle1 {\n");
      out.write("\tcolor: #0066FF;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-size: larger;\n");
      out.write("}\n");
      out.write(".newStyle2 {\n");
      out.write("\tfont-size: 44px;\n");
      out.write("\tcolor: #0000FF;\n");
      out.write("\tfont-weight: 900;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script src=\"validate.jsp\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body alink=\"#C0C0C0\" class=\"newStyle1\">\n");
      out.write("<center>\n");
      out.write("<br />\n");
      out.write("\n");
      out.write("<br />\n");
      out.write("&nbsp;&nbsp; <span class=\"newStyle2\">Sign-In to your Account</span><br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<form method=\"post\" action=\"CLogin.jsp\">\n");
      out.write("<label id=\"Label1\">\n");
      out.write("&nbsp;&nbsp;&nbsp; <span class=\"newStyle1\">Username:</span>&nbsp;&nbsp; </label>\n");
      out.write("<input name=\"Text1\" type=\"text\" style=\"width: 210px; height: 26px\" /><div> </div>\n");
      out.write("<div>\n");
      out.write("&nbsp;<div>\n");
      out.write("\n");
      out.write("  <label id=\"Label2\" >  &nbsp;&nbsp;&nbsp; <span class=\"newStyle1\">Password:</span>&nbsp;&nbsp;</label>\n");
      out.write("<input name=\"Text2\" type=\"password\" style=\"width: 210px; height: 26px\" />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input name=\"Button2\" type=\"Submit\" value=\"Login...\" style=\"width: 135px; color: #0066FF; font-family: 'Monotype Corsiva'; font-size: larger; font-style: oblique; font-weight: bold\" /><br />\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Forgot Password...??\n");
      out.write("    <form method=\"post\" action=\"forgot.jsp\">\n");
      out.write("<input name=\"button\" type=\"submit\" value=\"Get It...\" style=\"width: 135px; height: 38px; color: #0066FF; font-family: 'Monotype Corsiva'; font-size: larger; font-style: oblique; font-weight: bold\" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    </form></p>\n");
      out.write("\n");
      out.write("<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; \n");
      out.write("    New User.....\n");
      out.write("    <form method=\"post\" action=\"registration.jsp\">\n");
      out.write("    <input name=\"Button1\" type=\"submit\" value=\"Create Account\" style=\"width: 160px; height: 33px; color: #0066FF; font-family: 'Monotype Corsiva'; font-size: larger; font-style: oblique; font-weight: bold\" />\n");
      out.write("    </form>\n");
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("</center>\n");
      out.write("           \n");
      out.write("         ");
      out.write("\n");
      out.write("  ");


        id=request.getParameter("Text1");
      session.setAttribute("uname",id);
    
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
}
