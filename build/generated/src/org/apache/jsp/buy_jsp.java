package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.*;
import java.util.Date;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Buy</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".newStyle1 {\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\n");
      out.write("\tfont-size: 36px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tcolor: #000080;\n");
      out.write("}\n");
      out.write(".style1 {\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<Script language=\"JavaScript\">\n");
      out.write("    \n");
      out.write("         function validation() {\n");
      out.write("             \n");
      out.write("         \n");
      out.write("          \n");
      out.write("         var a=parseInt(document.f1.cnam.value);\n");
      out.write("          \n");
      out.write("        document.f2.Text5.value=(a);\n");
      out.write("         \n");
      out.write("         }\n");
      out.write("     </Script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<h1 class=\"newStyle1\">Buy</h1>\n");
      out.write("\n");
      out.write("<table class=\"style1\" cellpadding=\"3\" cellspacing=\"2\">\n");
      out.write("<tr><td>Company name</td>\n");
      out.write("<td style=\"width: 182px\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
 

    
    Connection cn;
    Statement stmt;
    ResultSet rs;
   String cm="",c="";


      out.write("\n");
      out.write("<form name=\"f1\"><select name=\"cnam\"  style=\"width: 179px\" onSelect=\"validation()\" >\n");
      out.write("\n");
      out.write("    ");
 
                        
        try {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                cn=DriverManager.getConnection("jdbc:odbc:sto");
            stmt=cn.createStatement();
            
           
         rs=stmt.executeQuery( "Select cname from StockWatchlist" );
   
   
          while(rs.next())
                           {
            c=rs.getString("cname");
          
      out.write("\n");
      out.write("          <option value=\"");
      out.print(c);
      out.write('"');
      out.write('>');
      out.print(c);
      out.write("</option>");
   
}

            
        
        }

        catch(Exception e) {
            e.printStackTrace();
        }
            
   
      out.write("\n");
      out.write("   \n");

   cm=request.getParameter("cnam");

      out.write("   \n");
      out.write(" </select>\n");
      out.write("</form>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("    <form method=\"post\" action=\"buy2.jsp?");
      out.print(cm);
      out.write("\" name=\"f2\">\n");
      out.write("     <input type=\"text\" name=\"Text5\" /><input name=\"Submit1\" type=\"submit\" value=\"selected\" style=\"width: 72px\" />\n");
      out.write("     </form>\n");
      out.write(" </td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("    \n");
      out.write("</body>\n");
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
