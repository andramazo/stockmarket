<%@ page language="java" import="java.util.*"%>
<html>
<head>
<script type="text/javascript">
function change()
{
var answer = document.getElementById('selc').value;
document.getElementById('textvalue').value=answer;
}
</script>
</head>
<body>
<h1>Use of Select Box in JSP</h1>
<table border="1" width="41%" height="53" cellspacing="0" cellpadding="3" 
    bgcolor="#000080" bordercolorlight="#FFFFFF">
<tr>
<td width="100%" height="18" colspan="2"><b>
<font color="#FF00FF">Select items from select box</font></b></td>
</tr>
<tr>
<td width="17%" height="23">
<select name="ActionSelect" onChange="change()" id="selc" >
<%Iterator itr;%>
<% List data= (List)request.getAttribute("data");
for (itr=data.iterator(); itr.hasNext(); )
{
String value=(String)itr.next();
%>
<option value=<%=value%> <%=value%></option>
<%}%> 
</select>
</td>
<td width="83%" height="23"><input type="text" id="textvalue" />
</td>
</tr>
</table>
</body>
</html>