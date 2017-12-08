<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Deposite</title>
<style type="text/css">
.style1 {
	text-align: center;
}
.style2 {
	text-align: center;
	color: #FF00FF;
}
</style>
</head>

<body>
<div class="style2">
	<strong>Deposite Amount</strong></div>
<form method="post" action="MyDeposit.jsp">

<div class="style1">

    Enter the amount&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        <input name="amt" type="text" />

	<br />
	<br />


<br />
	<br />

<input name="Submit1" type="submit" value="Deposite" />



</div>
 <%@ page import="java.sql.*" %>
        <%! Connection con;%>
        <%! Statement smnt;%>
        <%! ResultSet rs;%>
        <table border="2">
            <tr>
                <th>uname</th>
                <th>date</th>
                <th>balance</th>
                <th>Total balance</th>
                          
               
            </tr>
           
                
        <%
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select * from depoamt where uname like '"+session.getAttribute("uname") +"'");
                
                while(rs.next())
                  {
                
                    
                       
                %>
                 <tr>
                <td><%=rs.getString("uname")%></td>
                <td><%=rs.getString("date")%></td>
                <td><%=rs.getString("bal")%></td>
                <td><%=rs.getString("total")%></td>
               
                
                
                 </tr>
                <%
                
                }
            }
            catch(Exception e)
                                       {
                
            }

%>

</table>
</form>
</body>

</html>
