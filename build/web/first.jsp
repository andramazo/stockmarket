<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>First page</title>

<style type="text/css">
.style1 {
	margin-right: 0px;
}
</style>
</head>

<body>


<div>
   <%@page session="true" %>
          <center>
            
              
           <table>
               <tr align="center">
        
        </tr>
       
             <tr align="center">
                 <td style="width: 206px; height: 42px;" colspan="2"><font  size="40px" face="MonoType Corsiva" color="blue">
           <marquee>Welcome To Dave E-Broking Pvt Ltd.....</marquee></font>
                </td>
            </tr>
                     <br />
                     <br />
            <tr align="center">
                <td  align="left" style="width: 206px"  ><font color="blue">
                        <strong style="font-size: 26px;font-weight: bold;">Welcome:-<span style="font-size: 26px;font-weight: bold"><font color="007FFF" face="MonoType Corsiva"> <label id="Label1"><%=session.getAttribute("uname") %></label></font></span></strong>
                    </font>
                </td>
                <td align="right">
                  <a href="home.jsp">Logout</a></td>
                  
            </tr>
    <br />
    <br />
            <tr align="center">
                <td  >
                <table>
                <tr>
                <td><a href="change.jsp" target="Iframe1">Change Password</a></td>
                </tr>
                <tr>
                <td><a href="buy.jsp" target="Iframe1">Buy Shares</a></td>
                </tr>
				<tr>
                <td><a href="sell1.jsp" target="Iframe1">Sell Shares</a></td>
                </tr>
				<tr>
                <td><a href="see.jsp" target="Iframe1">See Market Price</a></td>
                </tr>
				<tr>
                <td><a href="deposite.jsp" target="Iframe1">Deposite Amount</a></td>
                </tr>
                    <tr>
                <td><a href="search.jsp" target="Iframe1">Search For Company Details</a></td>
                </tr>
                    <tr>
                <td><a href="port.jsp" target="Iframe1">Portfolio </a></td>
                </tr>

                </table>
                    </td>
                <td rowspan="6" >
                    <iframe name="Iframe1" style="width: 790px; height: 500px" src="see.jsp">
				
			</iframe>
                    </td>

            </tr>
              
             

           
                  
              </table>
                 
             </center>
</div>



</div>
</div>

</body>
</html>


