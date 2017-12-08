<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

 <html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.style1 {
	margin-right: 0px;
}
</style>
        
        <title>Forum</title>
        
        <Script language="JavaScript">
         function validation() {
         if(document.form2.data.value == ""){alert("Please Enter Your Answer"); return;}
         else if(document.form2.aut.value == ""){alert("Please Enter Your Name"); return;}
         else{document.form2.action="uforum.jsp?<%=code%>";}
         }
     </Script>
    </head>
    <body>
        <%-- 
    Document   : TopGainers
    Created on : Feb 27, 2012, 2:23:40 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String code="";%>
        
<!DOCTYPE html>
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
<br />
<br />        
        <%@ page import="java.sql.*" %>
        <%! Connection con;%>
        <%! Statement smnt;%>
        <%! ResultSet rs;%>
       <center>
           <h1>Post Your Question Here</h1>
       <table border="2" cellpadding="12" cellspacing="2">
            <tr>
                <th>Code</th>
                <th>Problem</th>
                <th>Date</th>
                <th>Author</th>
                <th>Answer Count</th>
                            
               
            </tr>
           
                
        <%
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:sto");
                smnt=con.createStatement( );
                rs=smnt.executeQuery("select * from que");
                
                while(rs.next())
                  {
                 String co=rs.getString("code");
                   
                       
                %>
                 <tr>
                <td><%=co%></td>
                <td ><a href="fans.jsp?<%=co%>"><%=rs.getString("problem")%></a></td>
                <td><%=rs.getString("date")%></td>
                <td><%=rs.getString("author")%></td>

                <%
            //    String co=rs.getString("code");
            
                    int c=0;
                Statement stmt1=con.createStatement();
                ResultSet rs1=stmt1.executeQuery("Select * from ans where code like '"+co+"'");
              while(rs1.next())
                                   {
                                   c++;
                                   
                                    }
                        
                      rs1.close();
                    stmt1.close();                       
                
                
                %>
                <td><%=c%></td>
            
                 </tr>
                <%
              
                
                }
                con.close();
            }
            
            catch(Exception e)
                                       {
                
            }

%>
           
        </table>
</center>
<form name="form2" method="post" >
    <p>
<pre>
            Your Query   <input type="text" name="data" size="80" /><br><br>
            Author       <input type="text" name="aut" size="30" />
                  
            <input type="submit" class="button" name="Login" value="Post Your Question" onclick='validation()' />					
            &nbsp;        </pre>
    </p>
</form>
       
    </body>
        </html>
