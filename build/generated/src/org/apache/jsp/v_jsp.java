package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class v_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
      out.write("\n");
      out.write("\n");
      out.write("<HTML>\n");
      out.write("    <HEAD>\n");
      out.write("        <TITLE>Fetching Data From a Database</TITLE>\n");
      out.write("    </HEAD>\n");
      out.write("\n");
      out.write("    <BODY>\n");
      out.write("       \n");
      out.write("        <FORM ACTION=\"forgot.jsp\" METHOD=\"POST\">\n");
      out.write("            Please enter the email-ID \n");
      out.write("            <BR>\n");
      out.write("            <input type=\"text\" name=\"id\" />\n");
      out.write("            <BR>\n");
      out.write("           <input type=\"submit\" value=\"submit\" />\n");
      out.write("        </FORM>\n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("        ");
 
            Connection connection = DriverManager.getConnection(
                "jdbc:odbc:market", "uname", "pass");

            Statement statement = connection.createStatement();

            String id = request.getParameter("id");  

            ResultSet resultset = 
                statement.executeQuery("select * from registration where email = '" + id + "'") ; 

            if(!resultset.next()) {
                out.println("Sorry, could not find that publisher. " +
                "Please <A HREF='forgot.jsp'>try again</A>.");
            } else {
        
      out.write("\n");
      out.write("\n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("               <TH>uname</TH>\n");
      out.write("               <TH>password</TH>\n");
      out.write("               \n");
      out.write("           </TR>\n");
      out.write("           <TR>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(1) );
      out.write(" </TD>\n");
      out.write("               <TD> ");
      out.print( resultset.getString(2) );
      out.write(" </TD>\n");
      out.write("               \n");
      out.write("           </TR>\n");
      out.write("       </TABLE>\n");
      out.write("       <BR />\n");
      out.write("       ");
 
           } 
       
      out.write("\n");
      out.write("    </BODY>\n");
      out.write("</HTML>");
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
