package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class port_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con;
 Statement smnt;
 ResultSet rs;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>PortFolio</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <table border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Code</th>\n");
      out.write("                <th>Company Name</th>\n");
      out.write("                <th>Previos High</th>\n");
      out.write("                <th>Open</th>\n");
      out.write("                <th>Last High(price)</th>   \n");
      out.write("                <th>Today's High</th>\n");
      out.write("                <th>Today's Low</th>\n");
      out.write("                <th>Volume</th>\n");
      out.write("            \n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("        ");

            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select ID,Code,Symbol,Prev,Open,Last,High,Low,Vol from StockWatchlist");
                
                while(rs.next())
                  {
                
                    
                       
                
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("ID"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("Code"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("Symbol"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("Prev"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("Open"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("Last"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("High"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("Low"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("Vol"));
      out.write("</td>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                 </tr>\n");
      out.write("                ");

                
                }
            }
            catch(Exception e)
                                       {
                
            }


      out.write("\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
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
