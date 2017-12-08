<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Buy</title>
<style type="text/css">
.newStyle1 {
	font-family: "Times New Roman", Times, serif;
	font-size: 36px;
	font-weight: bold;
	color: #000080;
}
.style1 {
	margin-right: 0px;
}
</style>
<%@page session="true" %>
<Script language="JavaScript">
    
         function validation() {
             
         
         if(document.f1.cna.value == ""){alert("Please Enter the Company name"); return;}
         
         }
         
     </Script>
</head>

<body>

<center>
<h1 class="newStyle1">Buy</h1>
<form action="buy1.jsp" method="post" name="f1">
<table class="style1" cellpadding="3" cellspacing="2">
<tr><td>Company name</td>
<td style="width: 182px">
    
<input name="cna" type="text" style="width: 180px" /> 
   
 </td>
</tr>

          <tr><form action="buy1.jsp" method="post"><td><input name="Submit1" type="submit" value="Buy Share" style="width: 72px" /></td>
<td><input name="Reset1" type="reset" value="Cancel" style="width: 72px" /></td></form></tr>

</table>
          </form>
</center>
    
</body>
</html>
