package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class buy1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  ResultSet rs;  
  ResultSet rs1;  
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
      out.write("\n");
      out.write("<Script language=\"JavaScript\">\n");
      out.write("    \n");
      out.write("         function validation() {\n");
      out.write("             \n");
      out.write("         \n");
      out.write("         if(document.f1.Text3.value == \"\"){alert(\"Please Enter the unit\"); return;}\n");
      out.write("         else if(document.f1.Text3.value == \"0\"){alert(\"Please Enter Unit except zero\"); return;}\n");
      out.write("         else{\n");
      out.write("         var a=parseInt(document.f1.Text3.value);\n");
      out.write("         var b= parseInt(document.f1.Text4.value);\n");
      out.write("        document.f1.Text5.value=(a*b);\n");
      out.write("         }\n");
      out.write("         }\n");
      out.write("     </Script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("<h1 class=\"newStyle1\">Buy</h1>\n");
      out.write("<form action=\"calbuy.jsp\" method=\"post\" name=\"f1\">\n");
      out.write("<table class=\"style1\" cellpadding=\"3\" cellspacing=\"2\">\n");
      out.write("<tr><td>Company name</td>\n");
      out.write("<td style=\"width: 182px\">\n");
      out.write("    \n");
      out.write("<input name=\"cname\" type=\"text\" style=\"width: 180px\" value=\"DLF\"  /> \n");
      out.write("   \n");
      out.write(" </td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>\n");
      out.write("Date\n");
      out.write("    </td><td style=\"width: 182px\"><input name=\"Text1\" type=\"text\" style=\"width: 180px\" value=\"");
      out.print(new java.util.Date());
      out.write("\"/>\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>Yesterday's Price</td>\n");
      out.write("<td>\n");
      out.write("    \n");
      out.write("     ");
      out.write("\n");
      out.write("      ");

      try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con=DriverManager.getConnection("jdbc:odbc:sto");
            
                                
               Statement smnt,smnt1;
               String q ="";
               String am;
               am=request.getParameter("cname");
              smnt=con.createStatement();
              rs=smnt.executeQuery("select yprice from StockWatchList where cname like 'DLF'");
             
                      if(rs.next())
                                                       {
                      q=rs.getString("yprice");                                  
                      }
              
      out.write("\n");
      out.write("          <input name=\"Text2\" type=\"text\" style=\"width: 180px\" value=\"");
      out.print(q);
      out.write("\" />\n");
      out.write("    ");

                          }
       catch(Exception e)
      {
         System.out.println(e.toString()); 
      }
              
          
      out.write("\n");
      out.write("    \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("Unit</td>\n");
      out.write("   \n");
      out.write("<td style=\"width: 182px\">\n");
      out.write("    <input name=\"Text3\" type=\"text\" style=\"width: 180px\" /></td>\n");
      out.write("    <td>\n");
      out.write("              <input type=\"button\" class=\"button\" name=\"cal\" value=\"calculate\" onclick='validation()' />\n");
      out.write("   \n");
      out.write("    </td>\n");
      out.write("</tr>\n");
      out.write("          \n");
      out.write("<tr><td>\n");
      out.write("Price\n");
      out.write("</td>     <td>\n");
      out.write("     \n");
      out.write("     ");
      out.write("\n");
      out.write("      ");

      try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con=DriverManager.getConnection("jdbc:odbc:sto");
            
                                
               Statement smnt,smnt1;
               String q ="";
              
              smnt=con.createStatement();
              rs1=smnt.executeQuery("select cprice from StockWatchList where cname like 'DLF'");
             
                      if(rs1.next())
                                                       {
                      q=rs1.getString("cprice");                                  
                      }
              
      out.write("\n");
      out.write("                   \n");
      out.write("                       <input name=\"Text4\" type=\"text\" style=\"width: 175px\" value=\"");
      out.print(q);
      out.write("\" />\n");
      out.write("    ");

                          }
       catch(Exception e)
      {
         System.out.println(e.toString()); 
      }
              
          
      out.write("\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</td></tr>\n");
      out.write("<tr><td>\n");
      out.write("\n");
      out.write("Total Amount\n");
      out.write("</td><td>          \n");
      out.write("<input name=\"Text5\" type=\"text\" style=\"width: 175px\" />\n");
      out.write("</td></tr>\n");
      out.write("          <tr><form action=\"calbuy.jsp\" method=\"post\"><td><input name=\"Submit1\" type=\"submit\" value=\"Buy Share\" style=\"width: 72px\" /></td>\n");
      out.write("<td><input name=\"Reset1\" type=\"reset\" value=\"Cancel\" style=\"width: 72px\" /></td></form></tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("          </form>\n");
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
