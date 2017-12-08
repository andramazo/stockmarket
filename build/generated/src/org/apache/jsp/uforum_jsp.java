package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class uforum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Forum</title>\n");
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
      out.write("                <th>Code</th>\n");
      out.write("                <th>Problem</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>Author</th>\n");
      out.write("                <th>Answer Count</th>\n");
      out.write("                            \n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("        ");

            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:market");
                Statement smnt2=con.createStatement();
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select * from que");
                 int coo=1;
                while(rs.next())
                  {
                coo=Integer.parseInt(rs.getString("code"))+1;
                   
                                       }
                smnt2.executeUpdate("insert into que values('"+coo+"','"+request.getParameter("data") +"','"+new java.util.Date()+"','"+request.getParameter("aut")+"')");
                
                rs.close();
                
                
                
                
                
                
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select * from que");
                
                while(rs.next())
                  {
                 String co=rs.getString("code");
                   
                       
                
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                <td>");
      out.print(co);
      out.write("</td>\n");
      out.write("                <td ><a href=\"\">");
      out.print(rs.getString("problem"));
      out.write("</a></td>\n");
      out.write("                <td>");
      out.print(rs.getString("date"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("author"));
      out.write("</td>\n");
      out.write("\n");
      out.write("                ");

            //    String co=rs.getString("code");
            
                    int c=0;
                Statement stmt1=con.createStatement();
                ResultSet rs1=stmt1.executeQuery("Select * from ans where code like '"+co+"'");
              while(rs1.next())
                                   {
                                   c++;
                                   
                                    }
                        
                        
                
                
                
      out.write("\n");
      out.write("                <td>");
      out.print(c);
      out.write("</td>\n");
      out.write("               \n");
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
      out.write("<form method=\"post\" action=\"uforum.jsp\">\n");
      out.write("<pre>\n");
      out.write("            Your Query   <input type=\"text\" name=\"data\" size=\"100\"><br><br>\n");
      out.write("            Author       <input type=\"text\" name=\"aut\" size=\"30\" />\n");
      out.write("                  \n");
      out.write("            <input type=\"submit\" class=\"button\" name=\"Login\" value=\"Post Your Question\" onclick='validation()'>\t\t\t\t\t\n");
      out.write("            &nbsp;        </pre>\n");
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
