<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>About</title>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.style1 {
	margin-right: 0px;
}
</style>
</head>

<body>

<div id="main_body">
<div id="content" class="style1">

<!-- HEADER -->
<div id="header">

<ul class="logo">
<li><a href="#" title="Financial Services">text</a></li>
</ul>

<ul class="call">
<li>text</li>
</ul>

<ul class="menu">
<li class="home"><a href=".//home.jsp" title="Home">Home</a></li>
<li class="about"><a href=".//about.jsp" title="About">About US</a></li>
<li class="services"><a href=".//services.jsp" title="Services">Services</a></li>
<li class="contacts"><a href=".//contactus.jsp" title="Contacts">Contacts</a></li>
</ul>

<div id="welcome">
<h2>Welcome To Dave Company Web site</h2>
<p>welcome to online e-broking web-site of Dave Broking Pvt Ltd.,This site gives facility to do broking online and maintainance of porfolio is very easy <a href="#">more...</a></p>
</div>

<ul class="choose">
<li><a href=".//login.jsp" title="Login Here">Login for E-Broking</a></li>
</ul>

</div>

<!-- BODY -->
<br />
<br />
<br />
<br />
<br />
<br />

<%-- 
    Document   : for
    Created on : Apr 3, 2012, 5:12:36 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Foegot</title>
    </head>
    <body>
        <center>
    <%@page import="java.sql.*" %>
     <%! Connection con; %>
        <%! Statement stmt;%>
        <%! ResultSet rs;%>
        <%! String id,msg1,msg2; %>
        <%! int flag; %>

        <%

        id=request.getParameter("email");
     
 
             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 
             con=DriverManager.getConnection("jdbc:odbc:sto","uname","pass");
              stmt=con.createStatement();
             rs=stmt.executeQuery("Select * from registration where email like '"+id+"'");

                        if(!rs.next())
                 {
                   out.println("Sorry, could not find that publisher. " +
                "Please <A HREF='forgot.jsp'>try again</A>.");
                
                                 } else {
                          %>
                          
               <table border="0">
            <tr>
               <th>uname</th>
               <th>password</th>
               
           </tr>
           <tr>
               <td> <%= rs.getString(1) %> </td>
               <td> <%= rs.getString(2) %> </td>
               
           </tr>
       
                          </table> 
                          
               <br />
               



</div>
</div>

		
			
		<%
                   }
                %> 
                <br />
                <br />
                <br />
                <div id="footer">
<p><a href=".//home.jsp">HOME</a> | <a href=".//about.jsp">ABOUT US</a> | <a href="services.jsp">SERVICES</a> | <a href="./download.jsp">Downloads</a> | <a href="news.jsp">NEWS &amp; EVENTS</a> | <a href=".//contactus.jsp">CONTACTS US</a><br/>
Copyright &copy; Your Company Name. Designed by Miss Dave Anushree Narendrakumar</p>
</div>

     </center>
            

    </body>
</html>
