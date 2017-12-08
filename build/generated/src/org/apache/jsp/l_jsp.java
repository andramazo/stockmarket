package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class l_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("<body bgcolor=\"pink\">\n");
      out.write("<form name=\"f1\" method=\"post\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td>User Name</td><td><input type=\"text\" name=\"t1\" ></td>\n");
      out.write("</tr>\n");
      out.write("<td>Password</td>\n");
      out.write("<td><input type=\"\"password\"\" name=\"t2\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td><input type=\"submit\" name=\"b1\" value=\"LogIn\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");

String user=request.getParameter("t1");
String pass=request.getParameter("t2");

     try{
    
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     Connection con=DriverManager.getConnection("jdbc:odbc:mydsn", "jp", "jp");
     Statement st=con.createStatement();
     ResultSet rs=st.executeQuery("select username,password from userlog");
     while(rs.next())
         {
         String username=rs.getString(1);
         String password=rs.getString(2);
         if(user.equals(username) && pass.equals(password))
             {
             
      out.write("\n");
      out.write("             ");
      if (true) {
        _jspx_page_context.forward("/Training_solutions/LoginSuccess.jsp");
        return;
      }
      out.write("\n");
      out.write("         ");
}
         else
         out.println("Login Failed,Please try Againe");
         
      out.write("\n");
      out.write("        \n");
      out.write("         ");

     }
}catch(Exception e1)
{}


      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("================\n");
      out.write("LoginSuccess.jsp\n");
      out.write("-----\n");
      out.write("<h1>U sucessfuly Entered</h1>");
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
