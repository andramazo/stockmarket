<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Language" content="en-us" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Sign-In to your Account&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; U</title>
<style type="text/css">
.newStyle1 {
	color: #0066FF;
	font-weight: bold;
	font-size: larger;
}
.newStyle2 {
	font-size: 44px;
	color: #0000FF;
	font-weight: 900;
}
</style>
<script src="validate.jsp" type="text/javascript"></script>

</head>

<body alink="#C0C0C0" class="newStyle1">
<center>
<br />

<br />
&nbsp;&nbsp; <span class="newStyle2">Sign-In to your Account</span><br />
<br />
<br />
<br />
<form method="post" action="CLogin.jsp">
<label id="Label1">
&nbsp;&nbsp;&nbsp; <span class="newStyle1">Username:</span>&nbsp;&nbsp; </label>
<input name="Text1" type="text" style="width: 210px; height: 26px" /><div> </div>
<div>
&nbsp;<div>

  <label id="Label2" >  &nbsp;&nbsp;&nbsp; <span class="newStyle1">Password:</span>&nbsp;&nbsp;</label>
<input name="Text2" type="password" style="width: 210px; height: 26px" />
<br />
<br />

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input name="Button2" type="Submit" value="Login..." style="width: 135px; color: #0066FF; font-family: 'Monotype Corsiva'; font-size: larger; font-style: oblique; font-weight: bold" /><br />

</div>
</div>
</form>
<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Forgot Password...??
    <form method="post" action="forgot.jsp">
<input name="button" type="submit" value="Get It..." style="width: 135px; height: 38px; color: #0066FF; font-family: 'Monotype Corsiva'; font-size: larger; font-style: oblique; font-weight: bold" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </form></p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
    New User.....
    <form method="post" action="registration.jsp">
    <input name="Button1" type="submit" value="Create Account" style="width: 160px; height: 33px; color: #0066FF; font-family: 'Monotype Corsiva'; font-size: larger; font-style: oblique; font-weight: bold" />
    </form>
</p>


</center>
           <%@ page import="java.sql.*" %>
         <%! String id; %>
  <%

        id=request.getParameter("Text1");
      session.setAttribute("uname",id);
    %>
    
</body>

</html>
