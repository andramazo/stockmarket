package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con; 
 Statement stmt;
 String bal,dam,pas,unam,rpass,sque,ans,fname,lname,gname,gfname,day,month,year,mno,email,lno,gender,natlity,add,pcode,city,state,qua,mstatus,acc,bname,bcity,bstate,pan; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("     ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        ");


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

		
		Connection con=DriverManager.getConnection("jdbc:odbc:market");

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
             
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
