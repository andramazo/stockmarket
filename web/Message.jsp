<%-- 
    Document   : Message
    Created on : Mar 30, 2012, 1:19:55 AM
    Author     : Aparna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Message</title>
    </head>
    <body>
    <center>
        <%=session.getAttribute("msg") %>
    </center>
    </body>
</html>
