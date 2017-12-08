<%@ page import="java.sql.*" %>
<% Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); %>

<HTML>
    <HEAD>
        <TITLE>Fetching Data From a Database</TITLE>
    </HEAD>

    <BODY>
       
        <FORM ACTION="forgot.jsp" METHOD="POST">
            Please enter the email-ID 
            <BR>
            <input type="text" name="id" />
            <BR>
           <input type="submit" value="submit" />
        </FORM>


       
        <% 
            Connection connection = DriverManager.getConnection(
                "jdbc:odbc:sto", "uname", "pass");

            Statement statement = connection.createStatement();

            String id = request.getParameter("id");  

            ResultSet resultset = 
                statement.executeQuery("select * from registration where email = '" + id + "'") ; 

            if(!resultset.next()) {
                out.println("Sorry, could not find that publisher. " +
                "Please <A HREF='forgot.jsp'>try again</A>.");
            } else {
        %>

        <TABLE BORDER="1">
            <TR>
               <TH>uname</TH>
               <TH>password</TH>
               
           </TR>
           <TR>
               <TD> <%= resultset.getString(1) %> </TD>
               <TD> <%= resultset.getString(2) %> </TD>
               
           </TR>
       </TABLE>
       <BR />
       <% 
           } 
       %>
    </BODY>
</HTML>