<%@page import="javax.xml.bind.ParseConversionEvent"%>
<%@page import="sun.nio.ch.WindowsAsynchronousChannelProvider"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Language" content="en-us" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Personal Details</title>

<style type="text/css">
.newStyle1 {
	color: #0066FF;
}
.newStyle2 {
	color: #0000FF;
	font-size: 40px;
	font-weight: bold;
	font-style: normal;
}

</style>
<script type='text/javascript'>

function formValidator(){
	// Make quick references to our fields
	var uname = document.getElementById("uname");
	var ans = document.getElementById('ans');
	var fnm = document.getElementById('fnm');
	var lnm = document.getElementById('lnm');
	var fn = document.getElementById('fn');
	var ln = document.getElementById('ln');


	// Check each input in the order that it appears in the form!
	if(isAlphanumeric(uname, "Please enter only letters and numbers for your name")){
		if(isAlphanumeric(ans, "Numbers and Letters Only for Address")){
			if(isAlphabet(fnm, "Please enter only letters")){
 					if(isAlphabet(lnm, "Please enter only letters")){
							if(isAlphabet(fn, "Please enter only letters")){
								if(isAlphabet(ln, "Please enter only letters")){

				if(madeSelection(state, "Please Choose a State")){
					if(lengthRestriction(username, 6, 8)){
						if(emailValidator(email, "Please enter a valid email address")){
							return true;
						}
					}
				}
			}
		}
	}
	
	
	return false;
	
}

function notEmpty(elem, helperMsg){
	if(elem.value.length == 0){
		alert(helperMsg);
		elem.focus(); // set the focus to this input
		return false;
	}
	return true;
}

function isNumeric(elem, helperMsg){
	var numericExpression = /^[0-9]+$/;
	if(elem.value.match(numericExpression)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

function isAlphabet(elem, helperMsg){
	var alphaExp = /^[a-zA-Z]+$/;
	if(elem.value.match(alphaExp)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}

function isAlphanumeric(elem, helperMsg){
	var alphaExp = /^[0-9a-zA-Z]+$/;
	if(elem.value.match(alphaExp)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}



function madeSelection(elem, helperMsg){
	if(elem.value == "Please Choose"){
		alert(helperMsg);
		elem.focus();
		return false;
	}else{
		return true;
	}
}

function emailValidator(elem, helperMsg){
	var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
	if(elem.value.match(emailExp)){
		return true;
	}else{
		alert(helperMsg);
		elem.focus();
		return false;
	}
}
</script>

 
</head>
<body>
    
    
    
    
    
    <center><span class="newStyle2">New User Registration..</span></center>
    <form name="form2" method="post" action="registration.jsp">
<table style="width: 54%; height: 410px;" align="center" bgcolor="white"><font color="blue">
<tr>
		<td colspan="4" bgcolor="#2E7BA5"><font color="white">User Name And Password </font></td>
	</tr>
	<tr>
	<td style="width: 125px; height: 27px;"><span class="newStyle1">User Name</span></td>
		<td colspan="3" style="height: 27px">
                    <input type="text" name="uname" style="width: 173px"  /></td>
	</tr>
	<tr>
	<td style="width: 125px; height: 26px;"><span class="newStyle1">Password</span></td>
		<td colspan="3" style="height: 26px">
                    <input type="password" name="pas1" style="width: 173px"  /></td>
	</tr>
        
        <tr>
           
	<td style="width: 125px; height: 26px;"><span class="newStyle1"> Re-enter Password</span></td>
		<td colspan="3" style="height: 26px">
	<input type="password" name="pass" style="width: 173px" />
            
              </td>
	</tr>
        
	<tr>
	<td style="width: 125px; height: 29px;"><span class="newStyle1">Secrete Question?</span></td>
                    <td colspan="3" style="height: 29px">&nbsp;<select name="sta">
						<option id="j0">What is my First School Name?</option>
						<option id="aj0">Who is my best friend?</option>
						<option id="net0">What is my mobile no?</option>
						<option id="php0">What is your favourite chat?</option>		
                                                <option id="phpq0">What is your favourite color?</option>		
                        </select>&nbsp;&nbsp; </td></tr>
	<tr>
        <td style="width: 125px; height: 27px;"><span class="newStyle1">Answer</span></td>
		<td colspan="3" style="height: 27px">
	<input type="password" name="ans" style="width: 173px" /></td>
    	</tr>


	

	<tr>
		<td colspan="4" bgcolor="#2E7BA5" style="height: 23px"><font color="white">Personal Details</font></td>
	</tr>
	<tr>
		<td style="width: 125px"><span class="newStyle1">First Name</span></td>
		<td style="width: 246px"><input type="text" name="fnm" /></td>
		<td style="width: 83px"><span class="newStyle1">Last Name</span></td>
		<td style="width: 147px"><input type="text" name="lnm" /></td>		
	</tr>
	<tr>
	<td style="width:125px"><span class="newStyle1">Father's/Husband's First Name</span></td>
	<td style="width: 246px"><input type="text" name="fn" /></td>
	<td style="width:125px"><span class="newStyle1">Father's/Husband's Last Name</span></td>
	<td style="width: 147px"><input type="text" name="ln" /></td>
	</tr>
	<tr>
			<td class="tableb labelBOLD" width="160" align="right">
				<span class="newStyle1">Date of Birth:<font class="error" align="center"> * </font>  
				</span>  </td>

<td class="tableb labelBOLD" style="width: 246px">
			 	<select class="Text" name="day" id="day">
 				 <option value="" selected="" name="date">Day</option>  		                                            <option value="01">01</option>
						                                            <option value="02">02</option>
                                                                                                <option value="03">03</option>
						                                            <option value="04">04</option>

						                                            <option value="05">05</option>
						                                            <option value="06">06</option>
						                                            <option value="07">07</option>
						                                            <option value="08">08</option>
						                                            <option value="09">09</option>
				                                           			<option value="10">10 </option>

					                                           			<option value="11">11 </option>
					                                           			<option value="12">12 </option>
					                                           			<option value="13">13 </option>
					                                           			<option value="14">14 </option>
					                                           			<option value="15">15 </option>
					                                           			<option value="16">16 </option>

					                                           			<option value="17">17 </option>
					                                           			<option value="18">18 </option>
					                                           			<option value="19">19 </option>
					                                           			<option value="20">20 </option>
					                                           			<option value="21">21 </option>
					                                           			<option value="22">22 </option>

					                                           			<option value="23">23 </option>
					                                           			<option value="24">24 </option>
					                                           			<option value="25">25 </option>
					                                           			<option value="26">26 </option>
					                                           			<option value="27">27 </option>
					                                           			<option value="28">28 </option>

					                                           			<option value="29">29 </option>
					                                           			<option value="30">30 </option>
					                                           			<option value="31">31 </option>
					                                    		</select>
                                    
	                                    	<select name="month" class="Text" id="month">
	                                            <option value="">Month</option>
	                                            <option value="01">Jan</option>

	                                            <option value="02">Feb</option>
	                                            <option value="03">Mar</option>
	                                            <option value="04">Apr</option>
	                                            <option value="05">May</option>
	                                            <option value="06">Jun</option>
	                                            <option value="07">Jul</option>

	                                            <option value="08">Aug</option>
	                                            <option value="09">Sep</option>
	                                            <option value="10">Oct</option>
	                                            <option value="11">Nov</option>
	                                            <option value="12">Dec</option>
	                                   	 </select>

                                    
	                                     <select  class="Text" name="year" id="year"> 
	        					                                       <option value="" selected="">Year</option>
	                                		                                                	<option value="1910">1910</option>
					                                                	<option value="1911">1911</option>
					                                                	<option value="1912">1912</option>
					                                                	<option value="1913">1913</option>
					                                                	<option value="1914">1914</option>

					                                                	<option value="1915">1915</option>
					                                                	<option value="1916">1916</option>
					                                                	<option value="1917">1917</option>
					                                                	<option value="1918">1918</option>
					                                                	<option value="1919">1919</option>
					                                                	<option value="1920">1920</option>

					                                                	<option value="1921">1921</option>
					                                                	<option value="1922">1922</option>
					                                                	<option value="1923">1923</option>
					                                                	<option value="1924">1924</option>
					                                                	<option value="1925">1925</option>
					                                                	<option value="1926">1926</option>

					                                                	<option value="1927">1927</option>
					                                                	<option value="1928">1928</option>
					                                                	<option value="1929">1929</option>
					                                                	<option value="1930">1930</option>
					                                                	<option value="1931">1931</option>
					                                                	<option value="1932">1932</option>

					                                                	<option value="1933">1933</option>
					                                                	<option value="1934">1934</option>
					                                                	<option value="1935">1935</option>
					                                                	<option value="1936">1936</option>
					                                                	<option value="1937">1937</option>
					                                                	<option value="1938">1938</option>

					                                                	<option value="1939">1939</option>
					                                                	<option value="1940">1940</option>
					                                                	<option value="1941">1941</option>
					                                                	<option value="1942">1942</option>
					                                                	<option value="1943">1943</option>
					                                                	<option value="1944">1944</option>

					                                                	<option value="1945">1945</option>
					                                                	<option value="1946">1946</option>
					                                                	<option value="1947">1947</option>
					                                                	<option value="1948">1948</option>
					                                                	<option value="1949">1949</option>
					                                                	<option value="1950">1950</option>

					                                                	<option value="1951">1951</option>
					                                                	<option value="1952">1952</option>
					                                                	<option value="1953">1953</option>
					                                                	<option value="1954">1954</option>
					                                                	<option value="1955">1955</option>
					                                                	<option value="1956">1956</option>

					                                                	<option value="1957">1957</option>
					                                                	<option value="1958">1958</option>
					                                                	<option value="1959">1959</option>
					                                                	<option value="1960">1960</option>
					                                                	<option value="1961">1961</option>
					                                                	<option value="1962">1962</option>

					                                                	<option value="1963">1963</option>
					                                                	<option value="1964">1964</option>
					                                                	<option value="1965">1965</option>
					                                                	<option value="1966">1966</option>
					                                                	<option value="1967">1967</option>
					                                                	<option value="1968">1968</option>

					                                                	<option value="1969">1969</option>
					                                                	<option value="1970">1970</option>
					                                                	<option value="1971">1971</option>
					                                                	<option value="1972">1972</option>
					                                                	<option value="1973">1973</option>
					                                                	<option value="1974">1974</option>

					                                                	<option value="1975">1975</option>
					                                                	<option value="1976">1976</option>
					                                                	<option value="1977">1977</option>
					                                                	<option value="1978">1978</option>
					                                                	<option value="1979">1979</option>
					                                                	<option value="1980">1980</option>

					                                                	<option value="1981">1981</option>
					                                                	<option value="1982">1982</option>
					                                                	<option value="1983">1983</option>
					                                                	<option value="1984">1984</option>
					                                                	<option value="1985">1985</option>
					                                                	<option value="1986">1986</option>

					                                                	<option value="1987">1987</option>
					                                                	<option value="1988">1988</option>
					                                                	<option value="1989">1989</option>
					                                                	<option value="1990">1990</option>
					                                                	<option value="1991">1991</option>
					                                                	<option value="1992">1992</option>

					                                                	<option value="1993">1993</option>
					                                                	<option value="1994">1994</option>
					                                                	<option value="1995">1995</option>
					                                    </select>
			</td>
		</tr>
	
	<tr>
		<td style="width: 125px"><span class="newStyle1">Mobile No.</span></td>
		<td style="width: 246px"><input type="text" name="mblno" /></td>
		<td style="width: 83px"><span class="newStyle1">Email</span></td>
		<td style="width: 147px"><input type="text" name="email" /></td>
	</tr>
	<tr>
	<td style="width:125px"><span class="newStyle1">Landline No</span></td>
		<td style="width: 246px"><input type="text" name="land" /></td>
		<td style="width:83px"><span class="newStyle1">Gender</span></td>
			<td style="width: 147px"><select name="gen">
			<option></option>
		                         <option id="male">Male</option>
                                         <option id="female">Female</option></select>
</td>
	</tr>
	<tr>
	<td style="width: 125px"><span class="newStyle1">Nationality</span></td>
		<td style="width: 246px"><input type="text" name="na" /></td>

	</tr>
	<tr>
		<td style="width: 125px; height: 60px;"><span class="newStyle1">Address</span></td>
		<td colspan="3" style="height: 60px">
		<textarea name="add" style="width: 326px; height: 49px"></textarea></td>
	</tr>
	<tr>
	<td style="width: 125px"><span class="newStyle1">Pin Code</span></td>
		<td style="width: 246px"><input type="text" name="pin" /></td>

	</tr>
	<tr>
		<td style="width: 125px"><span class="newStyle1">City</span></td>
		<td style="width: 246px"><input type="text" name="city" /></td>
		<td style="width: 83px"><span class="newStyle1">State</span></td>
		<td style="width: 147px"><select name="state0">
												            					<option value="Assam"> Assam</option>
            				            					<option value="Andhra Pradesh"> Andhra Pradesh</option>
            				            					<option value="Andaman &amp; Nicobar"> Andaman &amp; Nicobar</option>
            				            					<option value="Bihar"> Bihar</option>

            				            					<option value="Chandigarh"> Chandigarh</option>
            				            					<option value="Chhatisgarh"> Chhatisgarh</option>
            				            					<option value="Delhi"> Delhi</option>
            				            					<option value="Daman &amp; Diu"> Daman &amp; Diu</option>

            				            					<option value="Nagar Haveli"> Nagar Haveli</option>
            				            					<option value="Gujarat"> Gujarat</option>
            				            					<option value="Goa"> Goa</option>
            				            					<option value="Himachal Pradesh"> Himachal Pradesh</option>
            				            					<option value="Haryana"> Haryana</option>

            				            					<option value="Jammu &amp; Kashmir"> Jammu &amp; Kashmir</option>
            				            					<option value="Jharkhand"> Jharkhand</option>
            				            					<option value="Karnataka"> Karnataka</option>
            				            					<option value="Kerala"> Kerala</option>

            				            					<option value="Lakshadweep"> Lakshadweep</option>
            				            					<option value="Manipur"> Manipur</option>
            				            					<option value="Mizoram"> Mizoram</option>
            				            					<option value="Meghalaya"> Meghalaya</option>
            				            					<option value="Madhya Pradesh"> Madhya Pradesh</option>

            				            					<option value="Maharashtra" selected=""> Maharashtra</option>
            				            					<option value="Nagaland"> Nagaland</option>
            				            					<option value="Orissa"> Orissa</option>
            				            					<option value="Punjab"> Punjab</option>
            				            					<option value="Pondicherry"> Pondicherry</option>

            				            					<option value="Rajasthan"> Rajasthan</option>
            				            					<option value="Sikkim"> Sikkim</option>
            				            					<option value="Tripura"> Tripura</option>
            				            					<option value="Tamil Nadu"> Tamil Nadu</option>
            				            					<option value="Uttaranchal"> Uttaranchal</option>

            				            					<option value="Uttar Pradesh"> Uttar Pradesh</option>
            				            					<option value="West Bengal"> West Bengal</option>		                         </select></td>
	</tr>
	<tr>
		<td style="width: 125px"><span class="newStyle1">Qualification</span></td>
		<td style="width: 246px"><select name="qul">
		                         <option id="BSc">Bsc</option>
		                         <option id="BCA">BCA</option>
		                         <option id="BE">BE</option>
		                         <option id="MCA">MCA</option>
		                         <option id="ME">ME</option>
		                         <option id="MTech">MTech</option>
		                      </select></td>
		<td style="width: 83px"><span class="newStyle1">Maritalstatus</span></td>
		<td style="width: 147px">&nbsp;<select name="sta">
						<option id="j0">Single</option>
						<option id="aj0">Married</option>
						<option id="net0">Unmarried</option>
						<option id="php0">Widow</option>		
		                </select>&nbsp;&nbsp; </td>
	</tr>
	<tr>
		<td colspan="4" bgcolor="#2E7BA5"><font color="white">Account Details </font></td>
	</tr>
	<tr>
		<td style="width: 125px"><span class="newStyle1">Bank Account No</span></td>
	<td style="width: 246px"><input type="text" name="acc" /></td>
	<td style="width:125px"><span class="newStyle1">Branch Name</span></td>
	<td style="width: 147px"><input type="text" name="bname" /></td>
	
		
	</tr>
	<tr>
		<td style="width: 125px"><span class="newStyle1">City</span></td>
		<td style="width: 246px"><input type="text" name="city" /></td>
		<td style="width: 83px"><span class="newStyle1">State</span></td>
		<td style="width: 147px"><select name="state1">
												            					<option value="Assam"> Assam</option>
            				            					<option value="Andhra Pradesh"> Andhra Pradesh</option>
            				            					<option value="Andaman &amp; Nicobar"> Andaman &amp; Nicobar</option>
            				            					<option value="Bihar"> Bihar</option>

            				            					<option value="Chandigarh"> Chandigarh</option>
            				            					<option value="Chhatisgarh"> Chhatisgarh</option>
            				            					<option value="Delhi"> Delhi</option>
            				            					<option value="Daman &amp; Diu"> Daman &amp; Diu</option>

            				            					<option value="Nagar Haveli"> Nagar Haveli</option>
            				            					<option value="Gujarat"> Gujarat</option>
            				            					<option value="Goa"> Goa</option>
            				            					<option value="Himachal Pradesh"> Himachal Pradesh</option>
            				            					<option value="Haryana"> Haryana</option>

            				            					<option value="Jammu &amp; Kashmir"> Jammu &amp; Kashmir</option>
            				            					<option value="Jharkhand"> Jharkhand</option>
            				            					<option value="Karnataka"> Karnataka</option>
            				            					<option value="Kerala"> Kerala</option>

            				            					<option value="Lakshadweep"> Lakshadweep</option>
            				            					<option value="Manipur"> Manipur</option>
            				            					<option value="Mizoram"> Mizoram</option>
            				            					<option value="Meghalaya"> Meghalaya</option>
            				            					<option value="Madhya Pradesh"> Madhya Pradesh</option>

            				            					<option value="Maharashtra" selected=""> Maharashtra</option>
            				            					<option value="Nagaland"> Nagaland</option>
            				            					<option value="Orissa"> Orissa</option>
            				            					<option value="Punjab"> Punjab</option>
            				            					<option value="Pondicherry"> Pondicherry</option>

            				            					<option value="Rajasthan"> Rajasthan</option>
            				            					<option value="Sikkim"> Sikkim</option>
            				            					<option value="Tripura"> Tripura</option>
            				            					<option value="Tamil Nadu"> Tamil Nadu</option>
            				            					<option value="Uttaranchal"> Uttaranchal</option>

            				            					<option value="Uttar Pradesh"> Uttar Pradesh</option>
            				            					<option value="West Bengal"> West Bengal</option>		                         </select></td>
	</tr>
	<tr>
		<td style="width: 125px"><span class="newStyle1">PAN Card No.</span></td>
		<td colspan="3"><input type="text" name="pan" /></td>
	</tr>
	<tr>
		<td style="width: 125px"><span class="newStyle1">Deposite Amount</span></td>
		<td colspan="3"><input type="text" name="da" /></td>
	</tr>
        <tr>
		<td style="width: 125px"><span class="newStyle1">Balance</span></td>
		<td colspan="3"><input type="text" name="ba" /></td>
	</tr>
	<tr bgcolor="#FFFFFF">
            <td style="width: 125px; height: 7px; color: #0066FF; font-family: 'Monotype Corsiva'; font-size: medium; font-weight: bold; background-color: #FFFFFF;">&nbsp;<input type="submit" value="Submit" onclick="formValidator"/></td>
		<td colspan="3" style="height: 7px"><input type="reset" value="Reset" /></td>
	</tr>
    </font>

</table>
</form>
<%@page import="java.sql.*" %>
     <%! Connection con; %>
        <%! Statement stmt;%>
        <%! String bal,dam,pas,unam,rpass,sque,ans,fname,lname,gname,gfname,day,month,year,mno,email,lno,gender,natlity,add,pcode,city,state,qua,mstatus,acc,bname,bcity,bstate,pan; %>

        <%

        unam=request.getParameter("uname");
       pas=request.getParameter("pas1");
        rpass=request.getParameter("pass");
        sque=request.getParameter("que");
        ans=request.getParameter("ans");
        fname=request.getParameter("fnm");
        lname=request.getParameter("lnm");
        gname=request.getParameter("fn");
        gfname=request.getParameter("ln");
        day=request.getParameter("day");
        month=request.getParameter("month");
        year=request.getParameter("year");
        mno=request.getParameter("mblno");
        email=request.getParameter("email");
        lno=request.getParameter("land");
        gender=request.getParameter("gen");
        natlity=request.getParameter("na");
        add=request.getParameter("add");
        pcode=request.getParameter("pin");
        city=request.getParameter("city");
        state=request.getParameter("state0");
        qua=request.getParameter("qul");
        mstatus=request.getParameter("sta");
        acc=request.getParameter("acc");
        bname=request.getParameter("bname");
        bcity=request.getParameter("city");
        bstate=request.getParameter("state1");
        pan=request.getParameter("pan");
        dam=request.getParameter("da");
        bal=request.getParameter("ba");

       try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		
		Connection con=DriverManager.getConnection("jdbc:odbc:sto");

		System.out.println("Connection established");
		
		PreparedStatement smnt=con.prepareStatement("insert into registration(uname,pass,repass,secretques,answer,fname,lname,f1name,l1name,day,month,year,mobile,email,landline,gender,nationality,address,pincode,city,state,qualification,maritalstatus,baacno,bname,bcity,bstate,Panno,depositeamt,balance) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	
                smnt.setString(1,unam);
                smnt.setString(2,pas);
                smnt.setString(3,rpass);
                 smnt.setString(4,sque);
                smnt.setString(5,ans);
                smnt.setString(6,fname);
                smnt.setString(7,lname);                             
                smnt.setString(8,gname);
                smnt.setString(9,gfname);
                smnt.setString(10,day);
                smnt.setString(11,month);
                smnt.setString(12,year);
                smnt.setString(13,mno);
                smnt.setString(14,email);
                smnt.setString(15,lno);
                smnt.setString(16,gender);
                smnt.setString(17,natlity);
                smnt.setString(18,add);
                smnt.setString(19,pcode);
                smnt.setString(20,city);
                smnt.setString(21,state);
                smnt.setString(22,qua);
                smnt.setString(23,mstatus);
                smnt.setString(24,acc);
                smnt.setString(25,bname);
                smnt.setString(26,bcity);
                smnt.setString(27,bstate);
                smnt.setString(28,pan);
                smnt.setString(29,dam);
                smnt.setString(30,bal);
                smnt.executeUpdate();
       
		smnt.close();
		con.close();
		

		
	
	}
	catch(Exception e)
	{
		System.out.println("Exception "+e);
	}
             %>

</body>
</html>
