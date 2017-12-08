<%-- 
    Document   : calbuy
    Created on : Apr 26, 2012, 11:03:59 AM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buy Share table</title>
    </head>
    <body><center>
       <%@ page import="java.sql.*" %>
        <%! Connection con,con1;%>
        <%! Statement smnt,smnt1,smnt2,smnt3,smnt5,rup,sm,sm1;%>
        <%! ResultSet rs,rs1,rs2,rs3,rs4;%>
        <%!String cn,da;%>
        <%!String q ="";%>
        <%@page session="true" %>
<%
cn=request.getParameter("cname");
da=request.getParameter("Text1");
int yp=Integer.parseInt(request.getParameter("Text2"));
int un=Integer.parseInt(request.getParameter("Text3"));
int pr=Integer.parseInt(request.getParameter("Text4"));
int ta=Integer.parseInt(request.getParameter("Text5"));
  int bal=0;          
try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                
                smnt=con.createStatement( );
                int vol=0;
               // smnt.executeUpdate("");
              rs1=smnt.executeQuery("select vol from stockwatchlist where cname like '%"+request.getParameter("cname") +"'");
            smnt3=con.createStatement( );
               
               rs3=smnt3.executeQuery("select balance from registration where uname like '%"+session.getAttribute("uname") +"'");
                       
                if(rs1.next())
                                       {
                        vol=Integer.parseInt(""+rs1.getString("vol"));
               
                                        if(vol < un)
                                                                                       {
                                               out.println("Not Enough Stock");
                                                             } 
                                      
               else  if(rs3.next())
                   {
                bal=Integer.parseInt(""+rs3.getString("balance"));
               //   out.println(bal);
                      if(bal < ta)
                                            {
          out.println("Not Enough Balance");
      } 
      else
                                      {
                    
               q="update StockWatchlist set vol="+(vol-un)+" where  cname like '%"+request.getParameter("cname") +"'";
               smnt.executeUpdate(q);
               smnt1=con.createStatement();
               smnt5=con.createStatement();
               sm=con.createStatement();
               
               q="update registration  set balance="+(bal-ta)+" where  uname like '%"+session.getAttribute("uname") +"'";
               sm.executeUpdate(q);
           out.println("update registration  set balance="+(bal-ta)+" where  uname like '"+session.getAttribute("uname") +"'");
               
               sm1=con.createStatement();
               rs4=sm1.executeQuery("select * from mystock where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("cname")+"'");
               int i=0;
               out.println("select * from mystock where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("cname")+"'");
               if(rs4.next())
                                     {
                       i=smnt1.executeUpdate("update mystock  set stock=stock+"+un+" where  uname like '%"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("cname")+"'");
             out.println("update mystock  set stock=stock+"+un+" where  uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("cname")+"'");
                        }
                             else
                                       i=  smnt1.executeUpdate("insert into mystock values('"+session.getAttribute("uname") +"','"+cn+"',"+un+")");
               
                smnt5.executeUpdate("insert into buy values('"+session.getAttribute("uname") +"','"+cn+"','"+new java.util.Date().toString()+"','"+yp+"','"+un+"','"+pr+"','"+ta+"')");
                out.println("insert into buy values('"+session.getAttribute("uname") +"','"+cn+"','"+new java.util.Date().toString()+"','"+yp+"','"+un+"','"+pr+"','"+ta+"'");
               
                if(i>0)
                                   
                  out.println("Share Purchased");
                                                          
       %>
        <%@ page import="java.sql.*" %>
      
        <table border="2">
            <tr>
                <th>User name</th>
                <th>Company Name</th>
                <th>Date</th>
                <th>Yesterday's price</th>
                <th>Unit</th>   
                <th>Buying Price</th>
                <th>Total Amount </th>
                            
            </tr>
           
                
        <%
      
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select * from buy where uname like '%"+session.getAttribute("uname") +"' order by date desc ");
                
                while(rs.next())
                  {
                
                    
                       
                %>
                 <tr>
                <td><%=rs.getString("uname")%></td>
                <td><%=rs.getString("cname")%></td>
                <td><%=rs.getString("date")%></td>
                <td><%=rs.getString("yprice")%></td>
               <td><%=rs.getString("unit")%></td>
               <td><%=rs.getString("price")%></td>
               <td><%=rs.getString("tamt")%></td>            
                                 </tr>

       <% }
   //  smnt2.close();
       %>
       </table>
       <%
                    }
                                                    
                               }}
            
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
%>
           
 
</center>
    
    </body>
</html>
