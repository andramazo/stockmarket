<%-- 
    Document   : TopGainers
    Created on : Feb 27, 2012, 2:23:40 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UForum</title>
    </head>
    <body>
         
        <%@ page import="java.sql.*" %>
        <%! Connection con;%>
        <%! Statement smnt,smnt2;%>
        <%! ResultSet rs;%>
       
           
                
        <%
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
               smnt2=con.createStatement();
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select * from que");
                 int coo=1;
                while(rs.next())
                  {
                coo=Integer.parseInt(rs.getString("code"))+1;
                   
                                       }
                 rs.close();
                 smnt.close();
                 String date=""+new java.util.Date().getMonth()+"/"+new java.util.Date().getDate()+"/"+new java.util.Date().getYear();
              //   out.println("insert into que values('"+coo+"','"+request.getParameter("data") +"','"+date+"','"+request.getParameter("aut")+"')");
               int i=smnt2.executeUpdate("insert into que values('"+coo+"','"+request.getParameter("data") +"','"+new java.util.Date()+"','"+request.getParameter("aut")+"')");
          //      int i=0;
               out.println(i);
                 smnt2.close();
                con.commit();
                con.close();
                 if(i>0)
                                       {
                   
                
                    %>
        
                    <jsp:forward page="fo.jsp"></jsp:forward>
        <%
                        

                
                
               
                             }
                              }
catch(Exception e)
{
       }                      
                
                
                 
                   
               
%>
       
    </body>
</html>
