package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class fo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String code="";
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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write(" <html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".style1 {\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("        \n");
      out.write("        <title>Forum</title>\n");
      out.write("        \n");
      out.write("        <Script language=\"JavaScript\">\n");
      out.write("         function validation() {\n");
      out.write("         if(document.form2.data.value == \"\"){alert(\"Please Enter Your Answer\"); return;}\n");
      out.write("         else if(document.form2.aut.value == \"\"){alert(\"Please Enter Your Name\"); return;}\n");
      out.write("         else{document.form2.action=\"uforum.jsp?");
      out.print(code);
      out.write("\";}\n");
      out.write("         }\n");
      out.write("     </Script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div id=\"main_body\">\n");
      out.write("<div id=\"content\" class=\"style1\">\n");
      out.write("\n");
      out.write("<!-- HEADER -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\n");
      out.write("<ul class=\"logo\">\n");
      out.write("<li><a href=\"#\" title=\"Financial Services\">text</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<ul class=\"call\">\n");
      out.write("<li>text</li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<ul class=\"menu\">\n");
      out.write("<li class=\"home\"><a href=\".//home.jsp\" title=\"Home\">Home</a></li>\n");
      out.write("<li class=\"about\"><a href=\".//about.jsp\" title=\"About\">About US</a></li>\n");
      out.write("<li class=\"services\"><a href=\".//services.jsp\" title=\"Services\">Services</a></li>\n");
      out.write("<li class=\"contacts\"><a href=\".//contactus.jsp\" title=\"Contacts\">Contacts</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div id=\"welcome\">\n");
      out.write("<h2>Welcome To Dave Company Web site</h2>\n");
      out.write("<p>welcome to online e-broking web-site of Dave Broking Pvt Ltd.,This site gives facility to do broking online and maintainance of porfolio is very easy <a href=\"#\">more...</a></p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<ul class=\"choose\">\n");
      out.write("<li><a href=\".//login.jsp\" title=\"Login Here\">Login for E-Broking</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- BODY -->\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("       <center>\n");
      out.write("           <h1>Post Your Question Here</h1>\n");
      out.write("       <table border=\"2\" cellpadding=\"12\" cellspacing=\"2\">\n");
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
                con=DriverManager.getConnection("jdbc:odbc:sto");
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
      out.write("                <td ><a href=\"fans.jsp?");
      out.print(co);
      out.write('"');
      out.write('>');
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
                        
                      rs1.close();
                    stmt1.close();                       
                
                
                
      out.write("\n");
      out.write("                <td>");
      out.print(c);
      out.write("</td>\n");
      out.write("            \n");
      out.write("                 </tr>\n");
      out.write("                ");

              
                
                }
                con.close();
            }
            
            catch(Exception e)
                                       {
                
            }


      out.write("\n");
      out.write("           \n");
      out.write("        </table>\n");
      out.write("</center>\n");
      out.write("<form name=\"form2\" method=\"post\" >\n");
      out.write("    <p>\n");
      out.write("<pre>\n");
      out.write("            Your Query   <input type=\"text\" name=\"data\" size=\"80\" /><br><br>\n");
      out.write("            Author       <input type=\"text\" name=\"aut\" size=\"30\" />\n");
      out.write("                  \n");
      out.write("            <input type=\"submit\" class=\"button\" name=\"Login\" value=\"Post Your Question\" onclick='validation()' />\t\t\t\t\t\n");
      out.write("            &nbsp;        </pre>\n");
      out.write("    </p>\n");
      out.write("</form>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("        </html>\n");
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
