<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="javax.servlet.*"%>
<%@ page import="java.util.Date"%>

<% 

    
    Connection cn;
    Statement stmt;
    ResultSet rs;
    String ans=request.getParameter("data"),dat="",code="";
    String aut=request.getParameter("aut");

%>

<%     
        try {
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                cn=DriverManager.getConnection("jdbc:odbc:sto");
            stmt=cn.createStatement();
            
            
            
            code=request.getQueryString();
                   String date=""+new java.util.Date().getMonth()+"/"+new java.util.Date().getDate()+"/"+new java.util.Date().getYear();      
           out.println("INSERT INTO ans VALUES('"+code+"','"+ans+"','"+date+"','"+aut+"')" );
               
         int i=   stmt.executeUpdate( "INSERT INTO ans VALUES('"+code+"','"+ans+"','"+new java.util.Date()+"','"+aut+"')" );
          if(i>0)
                           {
            
            stmt.close();
            cn.close();
response.sendRedirect("fans.jsp?"+code);   
}
                 }

        catch(Exception e) {
            e.printStackTrace();
        }
%>
