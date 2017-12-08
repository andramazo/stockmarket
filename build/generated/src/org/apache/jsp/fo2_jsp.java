package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.*;
import java.util.Date;

public final class fo2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 

    String city_name="";
    Connection cn;
    Statement stmt;
    ResultSet rs;
    String ans=request.getParameter("data"),dat="",code="";
    String aut=request.getParameter("aut");


      out.write('\n');
      out.write('\n');
     
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); 
            String jdbcUri = "jdbc:oracle:thin:@agrawal:1521:OGD"; 
            cn= DriverManager.getConnection(jdbcUri, "scott", "tiger"); 
            stmt=cn.createStatement();
            
            Date dt=new Date();
            dat=dt.toString();
            
            code=request.getQueryString();
           
            
            rs=stmt.executeQuery( "INSERT INTO forum_ans VALUES('"+code+"','"+ans+"','"+dat+"','"+aut+"')" );
            
            rs.close();
            cn.close();
            response.sendRedirect("forum_ans.jsp?"+code);
             }

        catch(Exception e) {
            e.printStackTrace();
        }

      out.write('\n');
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
