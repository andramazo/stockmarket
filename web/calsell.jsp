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
        <title>Sell Share table</title>
    </head>
    <body><center>
       <%@ page import="java.sql.*" %>
        <%! Connection con,con1;%>
        <%! Statement smnt,smnt1,smnt2,smnt3,smnt5,smnt6,smnt7,rup,sm,sm1;%>
        <%! ResultSet rs,rs1,rs2,rs3,rs4,rs6;%>
        <%!String cna,da;%>
        <%!String q ="",p="";%>
        <%@page session="true" %>
<%
cna=request.getParameter("Text1");
da=request.getParameter("Text2");
int bp=Integer.parseInt(request.getParameter("Text3"));
int uni=Integer.parseInt(request.getParameter("Text4"));
int pri=Integer.parseInt(request.getParameter("Text5"));
int tam=Integer.parseInt(request.getParameter("Text6"));
  int bal=0;    
  int vol=0,unit=0; 
int i=0;
int pro=bp-pri;
int los=pri-bp;  
int tp=uni*pro;
int tl=uni*los; 
try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                
                smnt=con.createStatement( );
               rs1=smnt.executeQuery("select stock from mystock where uname like '%"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
              //out.println("select stock from mystock where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
             
                 smnt3=con.createStatement( );
                rs3=smnt3.executeQuery("select balance from registration where uname like '%"+session.getAttribute("uname") +"'");
             // out.println("select balance from registration where uname like '"+session.getAttribute("uname") +"'");
                  smnt6=con.createStatement();
                  rs6=smnt6.executeQuery("select vol from StockWatchlist where cname  like '"+request.getParameter("Text1") +"' ");     
                     if(rs1.next())
                                       {
                        vol=Integer.parseInt(""+rs1.getString("stock"));
                  //      out.println(""+vol);
                                        if(vol < uni)
                                                                                                
                   out.println("You can't sell the share.Because You don't have enogh share");
                                                                              
                                      
                                                       else if(rs6.next())
                                                                                              {        
                                    unit=Integer.parseInt(""+rs6.getString("vol"));
                                    
              smnt=con.createStatement();
              q="update mystock  set stock=stock-"+uni+" where  uname like '%"+session.getAttribute("uname") +"' and cname  like '"+request.getParameter("Text1") +"'";
              smnt.executeUpdate(q);
                              
                                      
                   if(rs3.next())
                   {
                bal=Integer.parseInt(""+rs3.getString("balance"));
              //out.println(bal);
            smnt5=con.createStatement();
           q="update registration  set balance="+(bal+tam)+" where  uname like '"+session.getAttribute("uname") +"'";
            smnt5.executeUpdate(q);
            //out.println(q);
             // out.println(bal);
                   
                 //   out.println(unit);
                    smnt1=con.createStatement();
               smnt5=con.createStatement();
               sm=con.createStatement();
               sm1=con.createStatement();
               rs4=sm1.executeQuery("select * from mysell where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
               
               //out.println("anu");
               //out.println("select * from mysell where uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
                          if(rs4.next())
                              {
                       i=smnt1.executeUpdate("update mysell  set stock=stock+"+uni+" where  uname like '%"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
                 //     out.println("update mystock  set stock=stock+"+uni+" where  uname like '"+session.getAttribute("uname") +"' and cname like '"+request.getParameter("Text1")+"'");
                        
                                                           }      else{
                i=  smnt1.executeUpdate("insert into mysell values('"+session.getAttribute("uname") +"','"+cna+"',"+uni+")");
                              }
                smnt5.executeUpdate("insert into sell values('"+session.getAttribute("uname") +"','"+cna+"','"+new java.util.Date().toString()+"','"+bp+"','"+uni+"','"+pri+"','"+tam+"')");
               // out.println("insert into sell values('"+session.getAttribute("uname") +"','"+cna+"','"+new java.util.Date().toString()+"','"+bp+"','"+uni+"','"+pri+"','"+tam+"'");
               q="update StockWatchlist set vol="+(unit+uni)+" where  cname like '"+request.getParameter("Text1") +"'";
               smnt.executeUpdate(q);
               sm.executeUpdate(q);
               //out.println("q");
               
                     
               
                if(i>0)
                                   
                  out.println("Share Purchased");
               
                        if(bp >= pri)
                                                       {               
                                    out.println("You profit of per share is="+pro);
                        out.println("\nTotal profit of this company's share is"+tp);
                        } else{
                   out.println("Your loss per share is="+los);
                   out.println("Your Total loss of this company's share is"+tl);
                        }
                    %>
        <%@ page import="java.sql.*" %>
      
        <table border="2">
            <tr>
                <th>User name</th>
                <th>Company Name</th>
                <th>Date</th>
                <th>Purchase price</th>
                <th>Unit</th>   
                <th>Buying Price</th>
                <th>Total Amount </th>
                            
            </tr>
           
                
        <%
      
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select * from sell where uname like '%"+session.getAttribute("uname") +"' order by date desc ");
                
                while(rs.next())
                  {
                
                    
                       
                %>
                 <tr>
                <td><%=rs.getString("uname")%></td>
                <td><%=rs.getString("cname")%></td>
                <td><%=rs.getString("date")%></td>
                <td><%=rs.getString("pprice")%></td>
               <td><%=rs.getString("unit")%></td>
               <td><%=rs.getString("price")%></td>
               <td><%=rs.getString("tamt")%></td>            
                                 </tr>

       <% }}
   //  smnt2.close();
       %>
       </table>
       <%
                          
                                                    
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
