package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;

public final class calsell_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con,con1;
 Statement smnt,smnt1,smnt2,smnt3,smnt5,smnt6,rup,sm,sm1;
 ResultSet rs,rs1,rs2,rs3,rs4,rs6;
String cna,da;
String q ="",p="";
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
      out.write("        <title>Sell Share table</title>\n");
      out.write("    </head>\n");
      out.write("    <body><center>\n");
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

cna=request.getParameter("Text1");
da=request.getParameter("Text2");
int bp=Integer.parseInt(request.getParameter("Text3"));
int uni=Integer.parseInt(request.getParameter("Text4"));
int pri=Integer.parseInt(request.getParameter("Text5"));
int tam=Integer.parseInt(request.getParameter("Text6"));
  int bal=0;    
  int vol=0,unit=0;       
try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                
                smnt=con.createStatement( );
              
               // smnt.executeUpdate("");
              rs1=smnt.executeQuery("select stock from mystock where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
              smnt3=con.createStatement( );
               out.println("select stock from mystock where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
              rs3=smnt3.executeQuery("select balance from registration where uname like '%"+session.getAttribute("uname") +"'");
              out.println("select balance from registration where uname like '"+session.getAttribute("uname") +"'");
                  smnt6=con.createStatement();
                  rs6=smnt6.executeQuery("select vol from StockWatchlist where cname  like '"+request.getParameter("Text1") +"' ");     
                if(rs1.next())
                                       {
                        vol=Integer.parseInt(""+rs1.getString("stock"));
                        out.println(""+vol);
                                        if(vol < uni)
                                                                      {
                      out.println("You can't sell the share.Because You don't have enogh share");
                                                             } 
                                      
               else  if(rs3.next())
                   {
                bal=Integer.parseInt(""+rs3.getString("balance"));
                  out.println(bal);
                   if(rs6.next())
                                           {
                  unit=Integer.parseInt(""+rs6.getString("vol"));
                    out.println(unit);
                     }
               q="update StockWatchlist set vol="+(uni+unit)+" where  cname like '"+request.getParameter("Text1") +"'";
               smnt.executeUpdate(q);
                
               
               sm.executeUpdate(q);
               
                smnt1=con.createStatement();
                smnt5=con.createStatement();
               
               
               q="update registration  set balance="+(bal + tam)+" where  uname like '"+session.getAttribute("uname") +"'";
               smnt5.executeUpdate(q);
           out.println("update registration  set balance="+(bal + tam)+" where  uname like '"+session.getAttribute("uname") +"'");
               
               sm1=con.createStatement();
               //rs4=sm1.executeQuery("select stock from mystock where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
               int i=0;
               //out.println("select stock from mystock where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
               if(rs1.next())
                                     {
                       i=smnt1.executeUpdate("update mystock  set stock=stock-"+uni+" where  uname like '%"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
                       i=smnt5.executeUpdate("insert into sell values('"+session.getAttribute("uname") +"','"+cna+"','"+new java.util.Date().toString()+"','"+bp+"','"+uni+"','"+pri+"','"+tam+"')");
  
                                }
            
            
               
                if(i>0)
                                   
                  out.println("Shares are successfully Sell");
                                                          
       
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <table border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <th>User name</th>\n");
      out.write("                <th>Company Name</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>Purchase price</th>\n");
      out.write("                <th>Unit</th>   \n");
      out.write("                <th>Buying Price</th>\n");
      out.write("                <th>Total Amount </th>\n");
      out.write("                            \n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("        ");

      
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select * from sell where uname like '%"+session.getAttribute("uname") +"' order by date desc ");
                
                while(rs.next())
                  {
                
                    
                       
                
      out.write("\n");
      out.write("                 <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("uname"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("cname"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("date"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("pprice"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("unit"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("price"));
      out.write("</td>\n");
      out.write("               <td>");
      out.print(rs.getString("tamt"));
      out.write("</td>            \n");
      out.write("                                 </tr>\n");
      out.write("\n");
      out.write("       ");
 }
   //  smnt2.close();
       
      out.write("\n");
      out.write("       </table>\n");
      out.write("       ");

                    }
                                                    
                               }
            
           //  smnt.close();
            // rs2.close();
             //   smnt1.close();
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
