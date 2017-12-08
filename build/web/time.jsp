<%-- 
    Document   : time
    Created on : Mar 27, 2012, 1:26:26 PM
    Author     : SONY
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current Date And Time</title>
    </head>
    <body>
     <% 
  // get client locale
  java.util.Locale locale = request.getLocale();
 
  // get Dateformat for client's locale
  java.text.DateFormat dateFormat =
	 java.text.DateFormat.getDateTimeInstance(
		 java.text.DateFormat.LONG,
		 java.text.DateFormat.LONG, locale);
 
%>
 
<%=dateFormat.format( new java.util.Date() ) %>
    </body>
</html>
