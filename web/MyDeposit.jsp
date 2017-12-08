<%-- 
    Document   : MyDeposit
    Created on : Apr 24, 2012, 1:04:17 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Deposite</title>
    </head>
    <body>
     <%@page import="java.sql.*" session="true" %>
     <%!  ResultSet rs;  %>
      <%
      try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con=DriverManager.getConnection("jdbc:odbc:sto");
            
                String uname=""+session.getAttribute("uname");
                 
               Statement smnt,smnt1;
               String q ="";
               String am;
               am=request.getParameter("amt");
              int bal=0;
              smnt=con.createStatement();
              rs=smnt.executeQuery("select total from depoamt where uname like '"+session.getAttribute("uname") +"'");
             bal=0;
                      while(rs.next())
                                                       {
                         bal=Integer.parseInt(rs.getString("total"));                                  
                      }
              rs.close();
              smnt.close();
              smnt=con.createStatement();
              if(bal==0)
                                   {
              rs=smnt.executeQuery("select depositeamt from registration where uname like '"+uname+"'");
                           
              if(rs.next())
                                   {
                  bal=Integer.parseInt(rs.getString("depositeamt"));
              }
              }
              
              smnt.close();
             
              
              smnt1=con.createStatement();
             
              smnt1.executeUpdate("update registration set balance="+(bal+Integer.parseInt(request.getParameter("amt")))+" where uname like '"+uname+"'");
              smnt1.close();
              
               q="insert into depoamt values('"+uname+"','"+new java.util.Date()+"',"+Integer.parseInt(request.getParameter("amt"))+","+(bal+Integer.parseInt(request.getParameter("amt")))+")";
               smnt=con.createStatement();
                int i=0;
                i=smnt.executeUpdate(q);
                if(i>0)
                                       {
                    con.commit();
                   session.setAttribute("msg","Money Deposited");
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
    </body>
</html>

