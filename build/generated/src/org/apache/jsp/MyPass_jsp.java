package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class MyPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("      ");

      try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con=DriverManager.getConnection("jdbc:odbc:market");
              
                String uname=""+session.getAttribute("uname");
                String type=""+session.getAttribute("type");
                
                
               Statement smnt;
               String q ="";
               String pass;
               pass=request.getParameter("pass2");
               if(type.equals("uname"))
               q="update login set pass='"+pass+"' where uname like '"+uname+"'";
              if(type.equals("fname"))
               q="update registration set pass='"+pass+"' where uname like '"+uname+"'";
               smnt=con.createStatement();
                int i=0;i=smnt.executeUpdate(q);
                if(i>0)
                                       {
                   session.setAttribute("msg","Password changed Successfully");
                    
      out.write("\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("Message.jsp");
        return;
      }
      out.write("\n");
      out.write("                    ");

                }
                else
                                       {
                     session.setAttribute("msg","Sorry try Again....");
                       
      out.write("\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("Message.jsp");
        return;
      }
      out.write("\n");
      out.write("                    ");

                }
                   
              
                             }
       catch(Exception e)
      {
         System.out.println(e.toString()); 
      }
              
                
              //  if(type.equals("MainBranch"))
             
    

      out.write(" \n");
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
