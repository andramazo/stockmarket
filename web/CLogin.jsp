<%-- 
    Document   : CLogin
    Created on : Apr 3, 2012, 5:00:55 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clogin</title>
    </head>
    <body>
        <%@page import="java.sql.*" %>
        
         <%! Connection con; %>
        <%! Statement stmt;%>
        <%! ResultSet rs;%>
        <%! String pass,uname; %>
        <%! int flag=1; %>

        <%

        uname=request.getParameter("Text1");
        pass=request.getParameter("Text2");

       
        try
        {
 
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
             con=DriverManager.getConnection("jdbc:odbc:sto");
 
             stmt=con.createStatement();
             rs=stmt.executeQuery("Select * from registration");
               
             while(rs.next())
                 {
                    if(rs.getString("uname").equals(uname) && rs.getString("pass").equals(pass))
                                               { flag=1;
                                                 session.setAttribute("uname", uname);
                        %>
                      
                        <jsp:forward page="first.jsp"></jsp:forward>
                       
        <%
                                               }

             flag=0;
              }
                                
             if(flag==0)
             {
                 %>
			<script>alert("Invalid username or password.");</script>
			<jsp:forward page="custlogin.jsp"></jsp:forward>
		<%
                }
             }
             catch(Exception e)
                {
             out.println(e);

             }

             %>

    </body>
</html>
