package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.*;
import java.sql.*;

public final class fans_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("    ");
 

    String que="",dat="",aut="",code="";
    int i=1;
    Connection cn;
    Statement stmt;
    ResultSet rs,rs1;

    code=request.getQueryString();
//out.println(code);

      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".style1 {\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("     <Script language=\"JavaScript\">\n");
      out.write("         function validation() {\n");
      out.write("         if(document.form2.data.value == \"\"){alert(\"Please Enter Your Answer\"); return;}\n");
      out.write("         else if(document.form2.aut.value == \"\"){alert(\"Please Enter Your Name\"); return;}\n");
      out.write("         else{document.form2.action=\"forum_ans_process.jsp?");
      out.print(code);
      out.write("\";}\n");
      out.write("         }\n");
      out.write("     </Script>\n");
      out.write("     <title>\n");
      out.write("         Forum Answer\n");
      out.write("     </title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("    <div id=\"main_body\">\n");
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
      out.write("\n");
      out.write("    \n");
      out.write("       <br /><br /><br /><br />\n");
      out.write("<center>\n");
      out.write("    <h1>Post Your Answers Here...</h1>\n");
      out.write("<table  width=\"850\" border=\"2\" align=\"left\" cellpadding=\"2\" cellspacing=\"2\">\n");
      out.write("    <font color=\"000000\">  \n");
      out.write("    <tr> <th>No</th>\n");
      out.write("    <th>Answer</th>\n");
      out.write("    <th>Date And Time</th>\n");
      out.write("    <th>Author</th>\n");
      out.write(" </tr>\n");
      out.write("\n");
    
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                cn=DriverManager.getConnection("jdbc:odbc:market");
            stmt=cn.createStatement();

            


            rs1=stmt.executeQuery("select * from ans where code='"+code+"' ");
 
            while(rs1.next()) {
    que=rs1.getString("answer");
        dat=rs1.getString("date");
        aut=rs1.getString("author");
        
      out.write("\n");
      out.write("    <tr>\t    \n");
      out.write("        <td bgcolor=\"gray\" bordercolor=\"#FFCCFF\" height=\"40\" width=\"20\" align=\"left\"  >");
      out.print(i);
      out.write("</td>\n");
      out.write("        <td  align=\"left\">");
      out.print(que);
      out.write("</td>\n");
      out.write("        <td  align=\"left\" width=\"150\">");
      out.print(dat);
      out.write("</td>\n");
      out.write("        <td align=\"left\" width=\"100\">");
      out.print(aut);
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("\t\n");
      out.write("   ");

i++;
    }
rs1.close();              
cn.close();
        }
        catch(Exception e){}


      out.write("\n");
      out.write("    </font>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("  ");
for(int j=0;j<i;j++){
      out.write("<br /><br /><br />");
}
      out.write("\n");
      out.write("    \n");
      out.write(" </center>\n");
      out.write("    <form name=\"form2\"  method=\"post\" ><p>\n");
      out.write("        <pre>\n");
      out.write("            Your Answer   <input type=\"text\" name=\"data\" size=\"80\" /><br /><br />\n");
      out.write("            Author        <input type=\"text\" name=\"aut\" size=\"30\" />\n");
      out.write("            <input type=\"submit\" class=\"button\" name=\"Login\" value=\"Post your Answer\" onclick='validation()' />\t\t\n");
      out.write("            \n");
      out.write("        </pre>\n");
      out.write("            </p>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write(" \n");
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
