<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.*"%>
<%@page language="java" import="java.sql.*"%>
  
    <% 

    String que="",dat="",aut="",code="";
    int i=1;
    Connection cn;
    Statement stmt;
    ResultSet rs,rs1;

    code=request.getQueryString();
//out.println(code);
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href="css/styles.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.style1 {
	margin-right: 0px;
}
</style>
     <Script language="JavaScript">
         function validation() {
         if(document.form2.data.value == ""){alert("Please Enter Your Answer"); return;}
         else if(document.form2.aut.value == ""){alert("Please Enter Your Name"); return;}
         else{document.form2.action="forum_ans_process.jsp?<%=code%>";}
         }
     </Script>
     <title>
         Forum Answer
     </title>
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

    
       <br /><br /><br /><br />
<center>
    <h1>Post Your Answers Here...</h1>
<table  width="850" border="2" align="left" cellpadding="2" cellspacing="2">
    <font color="000000">  
    <tr> <th>No</th>
    <th>Answer</th>
    <th>Date And Time</th>
    <th>Author</th>
 </tr>

<%    
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                cn=DriverManager.getConnection("jdbc:odbc:sto");
            stmt=cn.createStatement();

            


            rs1=stmt.executeQuery("select * from ans where code='"+code+"' ");
 
            while(rs1.next()) {
    que=rs1.getString("answer");
        dat=rs1.getString("date");
        aut=rs1.getString("author");
        %>
    <tr>	    
        <td bgcolor="gray" bordercolor="#FFCCFF" height="40" width="20" align="left"  ><%=i%></td>
        <td  align="left"><%=que%></td>
        <td  align="left" width="150"><%=dat%></td>
        <td align="left" width="100"><%=aut%></td>
    </tr>
	
   <%
i++;
    }
rs1.close();              
cn.close();
        }
        catch(Exception e){}

%>
    </font>
</table>




    
  <%for(int j=0;j<i;j++){%><br /><br /><br /><%}%>
    
 </center>
    <form name="form2"  method="post" ><p>
        <pre>
            Your Answer   <input type="text" name="data" size="80" /><br /><br />
            Author        <input type="text" name="aut" size="30" />
            <input type="submit" class="button" name="Login" value="Post your Answer" onclick='validation()' />		
            
        </pre>
            </p>
    </form>
</div>
    </div>
</body>
 
</html>