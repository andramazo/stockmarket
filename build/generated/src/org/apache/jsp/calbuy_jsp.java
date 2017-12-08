package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class calbuy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con,con1;
 Statement smnt,smnt1,smnt2,rup;
 ResultSet rs,rs1,rs2;
String cn,da;
String q ="";
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
      out.write("        <title>Buy Share table</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("    ");

        cn=request.getParameter("cname");
        da=request.getParameter("Text1");
        int yp=Integer.parseInt(request.getParameter("Text2"));
        int un=Integer.parseInt(request.getParameter("Text3"));
        int pr=Integer.parseInt(request.getParameter("Text4"));
        int ta=Integer.parseInt(request.getParameter("Text5"));
           
try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                
                smnt=con.createStatement( );
                int vol=0;
               // smnt.executeUpdate("");
              rs1=smnt.executeQuery("select vol from stockwatchlist where cname like '%"+request.getParameter("cname") +"'");
              
                if(rs1.next())
                                       {
                        vol=Integer.parseInt(""+rs1.getString("vol"));
               
                                        if(vol < un)
                                           {
                                         out.println("Not Enough Stock");
                                      } else 
                                                                           {
                                                   
              
               q="update StockWatchlist set vol="+(vol-un)+" where  cname like '%"+request.getParameter("cname") +"'";
               smnt.executeUpdate(q);
               
               smnt1=con.createStatement();
              int i=  smnt1.executeUpdate("insert into buy values('"+session.getAttribute("uname") +"','"+cn+"','"+new java.util.Date().toString()+"','"+yp+"','"+un+"','"+pr+"','"+ta+"')");
              if(i>0)
                                   {
                  out.println("Share Purchased");
                  
      out.write("\n");
      out.write("       <table border=\"2\">\n");
      out.write("           <tr><td>User Name</td>\n");
      out.write("              <td>Company Name</td>\n");
      out.write("                 <td>Yesterday's Price</td>\n");
      out.write("                    <td>Unit</td>\n");
      out.write("                       <td>Current Price</td>\n");
      out.write("                          <td>Total Amount</td>\n");
      out.write("       </tr>\n");
      out.write("       ");

       smnt2=con.createStatement( );
                
               // smnt.executeUpdate("");
              rs2=smnt.executeQuery("select * from buy where cname like '%"+request.getParameter("cname") +"'");
              
                while(rs2.next())
         {

      out.write("\n");
      out.write("           <tr><td>");
      out.print(rs2.getString("uname"));
      out.write("</td>\n");
      out.write("              <td>");
      out.print(rs2.getString("cname"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs2.getString("date"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs2.getString("yprice"));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs2.getString("unit"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs2.getString("price"));
      out.write("</td>\n");
      out.write("       ");
      out.print(rs2.getString("tamt"));
      out.write("\n");
      out.write("           </tr>\n");
      out.write("       ");
 }
       smnt2.close();
       
      out.write("\n");
      out.write("       </table>\n");
      out.write("        ");

              }
                                 }                                     
                                     
                                                                         
                }
               try{
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con1=DriverManager.getConnection("jdbc:odbc:market");
                rup=con1.createStatement();
                int mybal=0;
               // smnt.executeUpdate("");
                rs1.close();
              rs1=rup.executeQuery("select balance from registration where uname like '%"+session.getAttribute("uname") +"'");
              
                if(rs1.next())
                                       {
                    mybal=rs1.getInt("balance");
                    
                                       
                }
                      mybal=mybal-ta;
                rup.executeUpdate("update registration set balance="+ mybal +" where uname like '"+session.getAttribute("uname") +"'");
}
catch(Exception e)
       {
    
}
            
              smnt.close();
             //  rs1.close();
                smnt1.close();
             //   rs1.close();
                
             
           con.commit();
con.close();               
            }
            catch(Exception e)
                                       {
                out.println(e.toString());
            }

      out.write("\n");
      out.write("           \n");
      out.write(" \n");
      out.write("</center>\n");
      out.write("    \n");
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
