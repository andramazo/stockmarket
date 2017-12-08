package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.*;

public final class try_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 

    String que="",dat="",aut="",code="";
    int i=1;
    Connection cn;
    Statement stmt;
    ResultSet rs,rs1;

    code=request.getQueryString();


      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
    
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String jdbcUri = "jdbc:oracle:thin:@agrawal:1521:OGD";
            cn= DriverManager.getConnection(jdbcUri, "scott", "tiger");
            stmt=cn.createStatement();

            rs=stmt.executeQuery("select * from forum_que where que_code = '"+code+"' ");

            rs.next();
            que=rs.getString(2);
            dat=rs.getString(3);
            aut=rs.getString(4);

            rs.close();


            rs1=stmt.executeQuery("select * from forum_ans where que_code='"+code+"' ");


            
      out.write("  \n");
      out.write("<font size=\"25\" color=\"green\">    \n");
      out.write("    <table  width=\"850\" border=2 align=\"left\" cellpadding=\"2\" cellspacing=\"2\">  \n");
      out.write("        <tr align=\"left\" >\t    \n");
      out.write("            <td  align=\"left\" ><a href=\"forum_ans.jsp?");
      out.print(code);
      out.write('"');
      out.write('>');
      out.print(que);
      out.write("</a></td>\n");
      out.write("            <td  align=\"left\" width=\"150\">");
      out.print(dat);
      out.write("</td>\n");
      out.write("            <td  align=\"left\" width=\"100\">");
      out.print(aut);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</font>\n");
      out.write("\n");
      out.write("<br><br><br><br>\n");
      out.write("\n");
      out.write("<table  width=\"850\" border=0 align=\"left\" cellpadding=\"2\" cellspacing=\"2\">\n");
      out.write("    <th bgcolor=\"#FF99CC\">No</th>\n");
      out.write("    <th bgcolor=\"#FF99CC\">Answer</th>\n");
      out.write("    <th bgcolor=\"#FF99CC\">Date & Time</th>\n");
      out.write("    <th bgcolor=\"#FF99CC\">Author</th>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    ");
          while(rs1.next()) {
    que=rs1.getString(2);
        dat=rs1.getString(3);
        aut=rs1.getString(4);
        
      out.write("\n");
      out.write("    <tr align=\"left\" >\t    \n");
      out.write("        <td bgcolor=\"gray\" bordercolor=\"#FFCCFF\" height=\"40\" width=\"20\" align=\"left\"  >");
      out.print(i);
      out.write("</td>\n");
      out.write("        <td  align=\"left\" bgcolor=\"#CCFFFF\">");
      out.print(que);
      out.write("</td>\n");
      out.write("        <td  align=\"left\" bgcolor=\"#CCFFFF\" width=\"150\">");
      out.print(dat);
      out.write("</td>\n");
      out.write("        <td align=\"left\" bgcolor=\"#CCFFFF\" width=\"100\">");
      out.print(aut);
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("\t\n");
      out.write("    ");
i++;} rs1.close();cn.close();

             }//end of try
             catch(Exception e) {
      out.write("exception");


             e.printStackTrace();
             }



         
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("  ");
for(int j=0;j<i;j++){
      out.write("<br><br><br>");
}
      out.write("\n");
      out.write("    \n");
      out.write(" <head>\n");
      out.write("     <Script language=\"JavaScript\">\n");
      out.write("         function validation() {\n");
      out.write("         if(document.form2.data.value == \"\"){alert(\"Please Enter Your Answer\"); return;}\n");
      out.write("         else if(document.form2.aut.value == \"\"){alert(\"Please Enter Your Name\"); return;}\n");
      out.write("         else{document.form2.action=\"forum_ans_process.jsp?");
      out.print(code);
      out.write("\";}\n");
      out.write("         }\n");
      out.write("     </Script>\n");
      out.write(" </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <form name=\"form2\"  method=\"post\" >\n");
      out.write("        <pre>\n");
      out.write("            Your Answer   <input type=\"text\" name=\"data\" size=\"100\"><br><br>\n");
      out.write("            Author        <input type=\"text\" name=\"aut\" size=\"30\">\n");
      out.write("            <input type=\"submit\" class=\"button\" name=\"Login\" value=\"Post your Answer\" onclick='validation()'>\t\t\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("        </pre>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write(" \n");
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
