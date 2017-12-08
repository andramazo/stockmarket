package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class o_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function change()\n");
      out.write("{\n");
      out.write("var answer = document.getElementById('selc').value;\n");
      out.write("document.getElementById('textvalue').value=answer;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1>Use of Select Box in JSP</h1>\n");
      out.write("<table border=\"1\" width=\"41%\" height=\"53\" cellspacing=\"0\" cellpadding=\"3\" \n");
      out.write("    bgcolor=\"#000080\" bordercolorlight=\"#FFFFFF\">\n");
      out.write("<tr>\n");
      out.write("<td width=\"100%\" height=\"18\" colspan=\"2\"><b>\n");
      out.write("<font color=\"#FF00FF\">Select items from select box</font></b></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"17%\" height=\"23\">\n");
      out.write("<select name=\"ActionSelect\" onChange=\"change()\" id=\"selc\" >\n");
Iterator itr;
      out.write('\n');
 List data= (List)request.getAttribute("data");
for (itr=data.iterator(); itr.hasNext(); )
{
String value=(String)itr.next();

      out.write("\n");
      out.write("<option value=");
      out.print(value);
      out.write(' ');
      out.print(value);
      out.write("</option>\n");
}
      out.write(" \n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("<td width=\"83%\" height=\"23\"><input type=\"text\" id=\"textvalue\" />\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</body>\n");
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
}
