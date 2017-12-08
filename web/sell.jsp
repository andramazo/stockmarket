<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Sell</title>
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
             
         
         if(document.f1.Text4.value == ""){alert("Please Enter the unit"); return;}
         else if(document.f1.Text4.value == "0"){alert("Please Enter Unit except zero"); return;}
         else{
         var a=parseInt(document.f1.Text4.value);
         var b= parseInt(document.f1.Text5.value);
        document.f1.Text6.value=(a*b);
         }
         }
     </Script>

</head>
<body>
    <form action="calsell.jsp" method="post" name="f1">
<center>
<h1 class="newStyle1">Sell</h1>

<table class="style1" cellpadding="3" cellspacing="2">
<tr><td>Company name</td>
<td>
    <%@page import="java.sql.*" session="true" %>
     <%!  ResultSet rs;  %>
      <%
      try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con=DriverManager.getConnection("jdbc:odbc:sto");
            
                                
               Statement smnt,smnt1;
               String q ="";
               String am;
               am=request.getParameter("cm");
              smnt=con.createStatement();
              rs=smnt.executeQuery("select cname from StockWatchList where cname like '%"+request.getParameter("cm") +"'");
             
                      if(rs.next())
                                                       {
                      q=rs.getString("cname");                                  
                      }
              %>
          <input name="Text2" type="text" style="width: 180px" value="<%=q%>" />
    <%
                          }
       catch(Exception e)
      {
         System.out.println(e.toString()); 
      }
              
          %>
    
</td>
</tr>
<tr><td>
Date
</td><td style="width: 182px"><input name="Text2" type="text" style="width: 180px" value="<%=new java.util.Date()%>" />
	</td>
</tr>
<tr><td>Purchase Price</td>
<td>
     <%@page import="java.sql.*" session="true" %>
     <%!  ResultSet rs1;  %>
      <%
      try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con=DriverManager.getConnection("jdbc:odbc:sto");
            
                                
               Statement smnt,smnt1;
               String q ="";
               String am;
               am=request.getParameter("cm");
              smnt=con.createStatement();
              rs1=smnt.executeQuery("select price from buy where cname like '%"+request.getParameter("cm") +"'");
             
                      if(rs1.next())
                                                       {
                      q=rs1.getString("price");                                  
                      }
              %>
          <input name="Text3" type="text" style="width: 180px" value="<%=q%>" />
    <%
                          }
       catch(Exception e)
      {
         System.out.println(e.toString()); 
      }
              
          %>
   
</td>
</tr>
<tr>
<td>
Unit</td>
<td style="width: 182px">
<input name="Text4" type="text" style="width: 180px" />
</td>
    <td>
              <input type="button" class="button" name="cal" value="calculate" onclick='validation()' />
   
    </td>
</tr>
<tr><td>
Price
</td><td>
    <%@page import="java.sql.*" session="true" %>
     <%!  ResultSet rs2;  %>
      <%
      try{
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
               Connection con=DriverManager.getConnection("jdbc:odbc:sto");
            
                                
               Statement smnt,smnt1;
               String q ="";
              
              smnt=con.createStatement();
              rs2=smnt.executeQuery("select cprice from StockWatchList where cname like '%"+request.getParameter("cm") +"'");
             
                      if(rs2.next())
                                                       {
                      q=rs2.getString("cprice");                                  
                      }
              %>
                   
                       <input name="Text5" type="text" style="width: 175px" value="<%=q%>" />
    <%
                          }
       catch(Exception e)
      {
         System.out.println(e.toString()); 
      }
              
          %>
    
    
</td></tr>
<tr><td>

Total Amount
</td><td><input name="Text6" type="text" style="width: 175px" />
</td></tr>
<tr><td><input name="Submit1" type="submit" value="sell" style="width: 72px" /></td>
<td><input name="Reset1" type="reset" value="cancel" style="width: 72px" /></td></tr>
</table>
</center>
    </form>
</body>
</html>