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
        <title>Search</title>
    </head>
    <body>
        <%@ page import="java.sql.*" %>
        <%! Connection con;%>
        <%! Statement smnt;%>
        <%! ResultSet rs;%>
        <table border="2">
            <tr>
                <th>ID</th>
                <th>Code</th>
                <th>Company Name</th>
                <th>Previous High</th>
                <th>Open</th>
                <th>Last High(price)</th>   
                <th>Today's High</th>
                <th>Today's Low</th>
                <th>Volume</th>
            
               
            </tr>
           
                
        <%
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                smnt=con.createStatement();
                String com=""+request.getParameter("com");
                
              //  com="DLF";
                rs=smnt.executeQuery("select * from StockWatchlist where cname like '%"+com+"%'");
                
                while(rs.next())
                  {
                
                    
                       
                %>
                 <tr>
                 <td><%=rs.getString("ID")%></td>
                <td><%=rs.getString("Code")%></td>
                <td><%=rs.getString("cname")%></td>
                <td><%=rs.getString("phigh")%></td>
               <td><%=rs.getString("open")%></td>
               <td><%=rs.getString("yprice")%></td>
               <td><%=rs.getString("thigh")%></td>
               <td><%=rs.getString("tlow")%></td>
               <td><%=rs.getString("vol")%></td>
               <td><%=rs.getString("cprice")%></td>
               

                
                
                 </tr>
                <%
                
                }
            }
            catch(Exception e)
                                       {
                
            }

%>
           
        </table>
    </body>
</html>
