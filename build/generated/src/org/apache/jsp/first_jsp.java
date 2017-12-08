package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>First page</title>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".style1 {\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("   \n");
      out.write("          <center>\n");
      out.write("            \n");
      out.write("              \n");
      out.write("           <table>\n");
      out.write("               <tr align=\"center\">\n");
      out.write("        \n");
      out.write("        </tr>\n");
      out.write("       \n");
      out.write("             <tr align=\"center\">\n");
      out.write("                 <td style=\"width: 206px; height: 42px;\" colspan=\"2\"><font  size=\"40px\" face=\"MonoType Corsiva\" color=\"blue\">\n");
      out.write("           <marquee>Welcome To Dave E-Broking Pvt Ltd.....</marquee></font>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("                     <br />\n");
      out.write("                     <br />\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <td  align=\"left\" style=\"width: 206px\"  ><font color=\"blue\">\n");
      out.write("                        <strong style=\"font-size: 26px;font-weight: bold;\">Welcome:-<span style=\"font-size: 26px;font-weight: bold\"><font color=\"007FFF\" face=\"MonoType Corsiva\"> <label id=\"Label1\">");
      out.print(session.getAttribute("uname") );
      out.write("</label></font></span></strong>\n");
      out.write("                    </font>\n");
      out.write("                </td>\n");
      out.write("                <td align=\"right\">\n");
      out.write("                  <a href=\"home.jsp\">Logout</a></td>\n");
      out.write("                  \n");
      out.write("            </tr>\n");
      out.write("    <br />\n");
      out.write("    <br />\n");
      out.write("            <tr align=\"center\">\n");
      out.write("                <td  >\n");
      out.write("                <table>\n");
      out.write("                <tr>\n");
      out.write("                <td><a href=\"change.jsp\" target=\"Iframe1\">Change Password</a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td><a href=\"buy.jsp\" target=\"Iframe1\">Buy Shares</a></td>\n");
      out.write("                </tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                <td><a href=\"sell.jsp\" target=\"Iframe1\">Sell Shares</a></td>\n");
      out.write("                </tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                <td><a href=\"see.jsp\" target=\"Iframe1\">See Market Price</a></td>\n");
      out.write("                </tr>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("                <td><a href=\"deposite.jsp\" target=\"Iframe1\">Deposite Amount</a></td>\n");
      out.write("                </tr>\n");
      out.write("                    <tr>\n");
      out.write("                <td><a href=\"search.jsp\" target=\"Iframe1\">Search For Company Details</a></td>\n");
      out.write("                </tr>\n");
      out.write("                    <tr>\n");
      out.write("                <td><a href=\"port.jsp\" target=\"Iframe1\">Portfolio </a></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                    </td>\n");
      out.write("                <td rowspan=\"6\" >\n");
      out.write("                    <iframe name=\"Iframe1\" style=\"width: 790px; height: 500px\" src=\"see.jsp\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</iframe>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("              \n");
      out.write("             \n");
      out.write("\n");
      out.write("           \n");
      out.write("                  \n");
      out.write("              </table>\n");
      out.write("                 \n");
      out.write("             </center>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
