package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class for_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con; 
 Statement stmt;
 ResultSet rs;
 String id,msg1,msg2; 
 int flag; 
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("     ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");


        id=request.getParameter("email");
     
 
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
             con=DriverManager.getConnection("jdbc:odbc:market","uname","pass");
              stmt=con.createStatement();
             rs=stmt.executeQuery("Select * from registration where email like '"+id+"'");

                        if(!rs.next())
                 {
                   out.println("Sorry, could not find that publisher. " +
                "Please <A HREF='forgot.jsp'>try again</A>.");
                
                                 } else {
                          
      out.write("\n");
      out.write("               <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("               <th>uname</th>\n");
      out.write("               <th>password</th>\n");
      out.write("               \n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("               <td> ");
      out.print( rs.getString(1) );
      out.write(" </td>\n");
      out.write("               <td> ");
      out.print( rs.getString(2) );
      out.write(" </td>\n");
      out.write("               \n");
      out.write("           </tr>\n");
      out.write("       </TABLE>\n");
      out.write("      \n");
      out.write("                          %>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t");

                   }
                
      out.write(" \n");
      out.write("                \n");
      out.write("                \n");
      out.write("     \n");
      out.write("            \n");
      out.write("\n");
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
