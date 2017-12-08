<%-- 
    Document   : MyPass
    Created on : Apr 19, 2012, 2:36:29 PM
    Author     : Aparna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mypass</title>
    </head>
    <%@page import="java.sql.*" session="true" %>
      <%
      try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con=DriverManager.getConnection("jdbc:odbc:sto");
              
                String uname=""+session.getAttribute("uname");
                 
               Statement smnt;
               String q ="";
               String pass;
               pass=request.getParameter("pass2");
              
               q="update registration set pass='"+pass+"' where uname like '"+uname+"'";
               smnt=con.createStatement();
                int i=0;
                i=smnt.executeUpdate(q);
                if(i>0)
                                       {
                    con.commit();
                   session.setAttribute("msg","Password changed Successfully");
                    %>
                    <jsp:forward page="Message.jsp" ></jsp:forward>
                    <%
                }
                else
                                       {
                     session.setAttribute("msg","Sorry try Again....");
                       %>
                    <jsp:forward page="Message.jsp" ></jsp:forward>
                    <%
                }
                   
              
                             }
       catch(Exception e)
      {
         System.out.println(e.toString()); 
      }
              
                
              //  if(type.equals("MainBranch"))
             
    
%> 
</html>
