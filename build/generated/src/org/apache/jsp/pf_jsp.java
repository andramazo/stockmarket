package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class pf_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con;
 Statement smnt;
 String title,topic;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\"><head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Online-learning.com - Online Courses in Information Design, XML, and Writing </title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Online-learning.com%20-%20Online%20Courses%20in%20Information%20Design,%20XML,%20and%20Writing_files/oll2.css\" type=\"text/css\">\r\n");
      out.write("<meta name=\"keywords\" content=\"elearning courses, online training, online learning, online courses, blended learning courses, mentored courses, instructor-led courses, technical writing courses, technical writing training, learning XML, XML courses, XML training, learning XSL, XSL courses, XSL training, single source courses, single source training, user interface design courses, user interface design training, user interface analysis courses, user interface analysis training, interaction design courses, interaction design training, graphic design courses, graphic design training, web-based course design, web-based training design, SCORM, learning CSS, CSS courses, CSS training, learning XHTML, XHTML courses, XHTML training, learning HTML, HTML courses, HTML training\">\r\n");
      out.write("<meta name=\"description\" content=\"Professional, university-certified online courses and training for future technical writers, web designers and programmers in technical writing, graphic design, user interface design, and XML \">\r\n");
      out.write("<script type=\"text/javascript\" src=\"Online-learning.com%20-%20Online%20Courses%20in%20Information%20Design,%20XML,%20and%20Writing_files/swfobject.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tswfobject.registerObject(\"myFlashContent\", \"9.0.0\");\r\n");
      out.write("\t\t</script><style media=\"screen\" type=\"text/css\">#myFlashContent {visibility:hidden}\r\n");
      out.write(".style1 {\r\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\tfont-size: medium;\r\n");
      out.write("}\r\n");
      out.write(".style2 {\r\n");
      out.write("\tcolor: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write(".style3 {\r\n");
      out.write("\tbackground-color: #164469;\r\n");
      out.write("\tbackground: #164469;\r\n");
      out.write("}\r\n");
      out.write(".style4 {\r\n");
      out.write("\tbackground-color: #FFFFFF;\r\n");
      out.write("}\r\n");
      out.write(".style5 {\r\n");
      out.write("\tcolor: #164469;\r\n");
      out.write("}\r\n");
      out.write(".style6 {\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write(".style7 {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("}\r\n");
      out.write(".style8 {\r\n");
      out.write("\tbackground-color: #164469;\r\n");
      out.write("}\r\n");
      out.write(".style9 {\r\n");
      out.write("\tfont-weight: normal;\r\n");
      out.write("}\r\n");
      out.write(".style10 {\r\n");
      out.write("\tfont-size: xx-small;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function MM_openBrWindow(theURL,winName,features) { //v2.0\r\n");
      out.write("  window.open(theURL,winName,features);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <form method=\"post\" action=\"pf.jsp\">\r\n");
      out.write("<div class=\"page\">\r\n");
      out.write("<div class=\"header\"><img src=\"Online-learning.com%20-%20Online%20Courses%20in%20Information%20Design,%20XML,%20and%20Writing_files/top1.jpg\" alt=\"Online-learning.com - Online courses in Information Design\" width=\"888\" height=\"150\"></div>\r\n");
      out.write("<div class=\"menu\">\r\n");
      out.write("<ul class=\"hmenu\">\r\n");
      out.write("    \t<li>\r\n");
      out.write("\t<span class=\"style1\">\r\n");
      out.write("\t<a href=\"home.htm\" style=\"color: #164469\">Home</a></span>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t\t<span class=\"style1\">\r\n");
      out.write("\t\t\t<a href=\"register.php.htm\" style=\"color: #164469\">Admission</a></span>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t<span class=\"style1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"register.html\" style=\"color: #164469\">Courses</a></span>\r\n");
      out.write("\t\t</li>\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t<span class=\"style1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"postforum.htm\" style=\"color: #164469\">Forum</a></span>\r\n");
      out.write("\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t<span class=\"style1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"home.htm\" style=\"color: #164469\">Reference Material</a></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t<span class=\"style1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"home_faqs.html\" style=\"color: #164469\">FAQs</a></span>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t<span class=\"style1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"home_contacts.html\" style=\"color: #164469\">Exam</a></span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t<span class=\"style1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"home_contacts.html\" style=\"color: #164469\">Contact</a></span>\r\n");
      out.write("        <li>\r\n");
      out.write("\t\t    <span class=\"style1\">\r\n");
      out.write("\r\n");
      out.write("             <a href=\"login.htm\" style=\"color: #164469\">Login</a></span>\r\n");
      out.write("   </li>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("<div class=\"space\"> &nbsp;</div>\r\n");
      out.write("<div class=\"contentHome\" style=\"margin-top: 259; height: 325px;\">\r\n");
      out.write("<div class=\"content\">\r\n");
      out.write(" <h2 class=\"style2\"><span class=\"style3\"><span class=\"style4\">&nbsp;Post New Thread&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t<span class=\"style2\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t</span></span></span></h2>\r\n");
      out.write("\t<table style=\"width: 94%; height: 21px\" class=\"style8\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td class=\"style2\" style=\"height: 20px\">\r\n");
      out.write("\t\t\t&nbsp; Your Message</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<form method=\"post\" action=\"\">\r\n");
      out.write("\t<h5>\r\n");
      out.write("\t<label id=\"Label1\">Tittle:</label> <input name=\"Text1\" type=\"text\" style=\"width: 541px\" /></h5>\r\n");
      out.write("\t<h5>\r\n");
      out.write("\t<label id=\"Label1\">Topic:</label></h5>\r\n");
      out.write("\t<p><textarea name=\"TextArea1\" style=\"width: 592px; height: 128px\"></textarea>&nbsp;</p>\r\n");
      out.write("\t<h5><fieldset name=\"Group1\" style=\"width: 590px\">\r\n");
      out.write("\t<legend style=\"width: 76px\">Attachments</legend>\r\n");
      out.write("\t<span class=\"style9\"><br />\r\n");
      out.write("\tUpload/ Attach File(s):\r\n");
      out.write("\t<input name=\"Upload/ Attach File(s):\" type=\"button\" value=\"Upload/ Attach File(s):\" style=\"width: 172px\" /><br />\r\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t<span class=\"style10\">&nbsp;Valid file extensions: bmp doc docx gif jpeg jpg \r\n");
      out.write("\tpdf png pps ppt pptx psd rar txt zip</span></span></fieldset>&nbsp;</h5>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\t\t\r\n");
      out.write("\r\n");
      out.write("                <input class=\"style7\" name=\"sbutton\" id=\"vB_Editor_001_save\" value=\"Submit New Thread\" accesskey=\"s\" tabindex=\"1\" type=\"submit\" style=\"width: 158px\" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<input class=\"button\" name=\"preview\" value=\"Preview Post\" accesskey=\"r\" tabindex=\"1\" type=\"submit\">\r\n");
      out.write("\r\n");
      out.write("\t\t&nbsp;<br />\r\n");
      out.write("\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"sidebar\">\r\n");
      out.write("<div class=\"side\">\r\n");
      out.write("<a href=\"http://www.online-learning.com/difference.html\">\r\n");
      out.write("<article class=\"col2 pad_left2\">\r\n");
      out.write("                                                        <div class=\"pad_left1\">\r\n");
      out.write("                                                                <h4 class=\"style6\"> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSmiley \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAttachment</h4>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                        <div class=\"wrapper\">\r\n");
      out.write("                                                                <table style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/8.gif\" id=\"vB_Editor_001_smilie_567\" alt=\":8)\" title=\"8)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/bow.gif\" id=\"vB_Editor_001_smilie_535\" alt=\":(bow):\" title=\"(bow)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/hi.gif\" id=\"vB_Editor_001_smilie_546\" alt=\":(hi):\" title=\"(hi)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/a_002.gif\" id=\"vB_Editor_001_smilie_568\" alt=\":'(\" title=\"=(\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/-_002.gif\" id=\"vB_Editor_001_smilie_569\" alt=\":|\" title=\"=\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/clap.gif\" id=\"vB_Editor_001_smilie_537\" alt=\":(clap):\" title=\"(clap)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/mm.gif\" id=\"vB_Editor_001_smilie_548\" alt=\":(mm):\" title=\"(mm)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/devil.gif\" id=\"vB_Editor_001_smilie_538\" alt=\"&gt;-)\" title=\"(devil)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/think.gif\" id=\"vB_Editor_001_smilie_560\" alt=\":(think):\" title=\"(think)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/Kiss.gif\" id=\"vB_Editor_001_smilie_571\" alt=\":Kiss:\" title=\"Kiss\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/doh.gif\" id=\"vB_Editor_001_smilie_539\" alt=\":(doh):\" title=\"(doh)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/P.gif\" id=\"vB_Editor_001_smilie_572\" alt=\":P\" title=\"P\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/nod.gif\" id=\"vB_Editor_001_smilie_551\" alt=\":(nod):\" title=\"(nod)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/-.gif\" id=\"vB_Editor_001_smilie_530\" alt=\":(\" title=\"(\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/s.gif\" id=\"vB_Editor_001_smilie_573\" alt=\":s\" title=\"S\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/envy.gif\" id=\"vB_Editor_001_smilie_541\" alt=\":(envy):\" title=\"(envy)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/whew.gif\" id=\"vB_Editor_001_smilie_563\" alt=\":(whew):\" title=\"(whew)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/a_003.gif\" id=\"vB_Editor_001_smilie_531\" alt=\"O.o\" title=\"(\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/x.gif\" id=\"vB_Editor_001_smilie_574\" alt=\":x\" title=\"X\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/giggle.gif\" id=\"vB_Editor_001_smilie_542\" alt=\":(giggle):\" title=\"(giggle)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/punch.gif\" id=\"vB_Editor_001_smilie_553\" alt=\":(punch):\" title=\"(punch)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/a.gif\" id=\"vB_Editor_001_smilie_575\" alt=\":^)\" title=\"^)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/grin.gif\" id=\"vB_Editor_001_smilie_543\" alt=\":(grin):\" title=\"(grin)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/rofl.gif\" id=\"vB_Editor_001_smilie_554\" alt=\":(rofl):\" title=\"(rofl)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<img src=\"newthread.php_files/yawn.gif\" id=\"vB_Editor_001_smilie_565\" alt=\"|-O\" title=\"(yawn)\" border=\"\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                </article>\r\n");
      out.write("</a>\r\n");
      out.write("</div><div class=\"space\"> &nbsp;</div>\r\n");
      out.write("<div class=\"side\">\r\n");
      out.write("<h4 class=\"style6\">\r\n");
      out.write("<a href=\"http://www.online-learning.com/course_certification.html\" class=\"style5\">P</a><a href=\"http://www.online-learning.com/course_certification.html\">ost \r\n");
      out.write("Icons</a></h4>\r\n");
      out.write("<table style=\"width: 91%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"width: 19px\">\r\n");
      out.write("\t\t<input name=\"iconid\" value=\"V1\" id=\"rb_iconid_25\" tabindex=\"1\" onclick=\"swap_posticon('pi_25')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 22px\"><label for=\"rb_iconid_25\">\r\n");
      out.write("\t\t<img title=\"Heart 32\" src=\"newthread.php_files/Heart_32.png\" alt=\"Heart 32\" id=\"pi_25\" onclick=\"swap_posticon('pi_25')\" height=\"26\"></label>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td style=\"width: 11px\">\r\n");
      out.write("\t\t<input name=\"iconid1\" value=\"V1\" id=\"rb_iconid_19\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 18px\"><label for=\"rb_iconid_19\">\r\n");
      out.write("\t\t<img title=\"Favorite 32\" src=\"newthread.php_files/Favorite_32.png\" alt=\"Favorite 32\" id=\"pi_19\" onclick=\"swap_posticon('pi_19')\"></label>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td style=\"width: 16px\">\r\n");
      out.write("\t\t<input name=\"iconid2\" value=\"V1\" id=\"rb_iconid_26\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 37px\"><label for=\"rb_iconid_45\">\r\n");
      out.write("\t\t<img title=\"Android Facebook 32\" src=\"newthread.php_files/Android-Facebook-32.png\" alt=\"Android Facebook 32\" id=\"pi_45\" onclick=\"swap_posticon('pi_45')\"></label>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"width: 19px\">\r\n");
      out.write("\t\t<input name=\"iconid3\" value=\"V1\" id=\"rb_iconid_27\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 22px\"><label for=\"rb_iconid_41\">\r\n");
      out.write("\t\t<img title=\"Music 32\" src=\"newthread.php_files/Music_32.png\" alt=\"Music 32\" id=\"pi_41\" onclick=\"swap_posticon('pi_41')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 11px\">\r\n");
      out.write("\t\t<input name=\"iconid4\" value=\"V1\" id=\"rb_iconid_28\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 18px\"><label for=\"rb_iconid_42\">\r\n");
      out.write("\t\t<img title=\"Photo 32\" src=\"newthread.php_files/Photo_32.png\" alt=\"Photo 32\" id=\"pi_42\" onclick=\"swap_posticon('pi_42')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 16px\">\r\n");
      out.write("\t\t<input name=\"iconid5\" value=\"V1\" id=\"rb_iconid_29\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 37px\"><label for=\"rb_iconid_40\">\r\n");
      out.write("\t\t<img title=\"MotionGraphic 32\" src=\"newthread.php_files/MotionGraphic-32.png\" alt=\"MotionGraphic 32\" id=\"pi_40\" onclick=\"swap_posticon('pi_40')\"></label></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"width: 19px\">\r\n");
      out.write("\t\t<input name=\"iconid6\" value=\"V1\" id=\"rb_iconid_30\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 22px\"><label for=\"rb_iconid_46\">\r\n");
      out.write("\t\t<img title=\"Android Gmail 32\" src=\"newthread.php_files/Android-Gmail-32.png\" alt=\"Android Gmail 32\" id=\"pi_46\" onclick=\"swap_posticon('pi_46')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 11px\">\r\n");
      out.write("\t\t<input name=\"iconid7\" value=\"V1\" id=\"rb_iconid_31\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 18px\"><label for=\"rb_iconid_66\">\r\n");
      out.write("\t\t<img title=\"Zip 32\" src=\"newthread.php_files/Zip-32.png\" alt=\"Zip 32\" id=\"pi_66\" onclick=\"swap_posticon('pi_66')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 16px\">\r\n");
      out.write("\t\t<input name=\"iconid8\" value=\"V1\" id=\"rb_iconid_32\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 37px\"><label for=\"rb_iconid_64\">\r\n");
      out.write("\t\t<img title=\"Txt 32\" src=\"newthread.php_files/Txt-32.png\" alt=\"Txt 32\" id=\"pi_64\" onclick=\"swap_posticon('pi_64')\"></label></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"width: 19px\">\r\n");
      out.write("\t\t<input name=\"iconid9\" value=\"V1\" id=\"rb_iconid_33\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 22px\"><label for=\"rb_iconid_48\">\r\n");
      out.write("\t\t<img title=\"Dll 32\" src=\"newthread.php_files/dll_32.png\" alt=\"Dll 32\" id=\"pi_48\" onclick=\"swap_posticon('pi_48')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 11px\">\r\n");
      out.write("\t\t<input name=\"iconid10\" value=\"V1\" id=\"rb_iconid_34\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 18px\"><label for=\"rb_iconid_47\">\r\n");
      out.write("\t\t<img title=\"Database 32\" src=\"newthread.php_files/Database-32.png\" alt=\"Database 32\" id=\"pi_47\" onclick=\"swap_posticon('pi_47')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 16px\">\r\n");
      out.write("\t\t<input name=\"iconid11\" value=\"V1\" id=\"rb_iconid_35\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 37px\"><label for=\"rb_iconid_18\">\r\n");
      out.write("\t\t<img title=\"Document Code HTML 32\" src=\"newthread.php_files/Document%2520Code%2520HTML_32.png\" alt=\"Document Code HTML 32\" id=\"pi_18\" onclick=\"swap_posticon('pi_18')\"></label></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"width: 19px\">\r\n");
      out.write("\t\t<input name=\"iconid12\" value=\"V1\" id=\"rb_iconid_36\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 22px\"><label for=\"rb_iconid_54\">\r\n");
      out.write("\t\t<img title=\"7zip 32\" src=\"newthread.php_files/7zip_32.png\" alt=\"7zip 32\" id=\"pi_54\" onclick=\"swap_posticon('pi_54')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 11px\">\r\n");
      out.write("\t\t<input name=\"iconid13\" value=\"V1\" id=\"rb_iconid_37\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 18px\"><label for=\"rb_iconid_49\">\r\n");
      out.write("\t\t<img title=\"Dreamweaver 32\" src=\"newthread.php_files/Dreamweaver_32.png\" alt=\"Dreamweaver 32\" id=\"pi_49\" onclick=\"swap_posticon('pi_49')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 16px\">\r\n");
      out.write("\t\t<input name=\"iconid14\" value=\"V1\" id=\"rb_iconid_38\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 37px\"><label for=\"rb_iconid_43\">\r\n");
      out.write("\t\t<img title=\"Podcast 32\" src=\"newthread.php_files/Podcast_32.png\" alt=\"Podcast 32\" id=\"pi_43\" onclick=\"swap_posticon('pi_43')\"></label></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td style=\"width: 19px\">\r\n");
      out.write("\t\t<input name=\"iconid15\" value=\"V1\" id=\"rb_iconid_39\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 22px\"><label for=\"rb_iconid_15\">\r\n");
      out.write("\t\t<img title=\"Blog 32\" src=\"newthread.php_files/Blog-32.png\" alt=\"Blog 32\" id=\"pi_15\" onclick=\"swap_posticon('pi_15')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 11px\">\r\n");
      out.write("\t\t<input name=\"iconid16\" value=\"V1\" id=\"rb_iconid_40\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 18px\"><label for=\"rb_iconid_56\">\r\n");
      out.write("\t\t<img title=\"Doc 32\" src=\"newthread.php_files/Doc-32.png\" alt=\"Doc 32\" id=\"pi_56\" onclick=\"swap_posticon('pi_56')\"></label></td>\r\n");
      out.write("\t\t<td style=\"width: 16px\">\r\n");
      out.write("\t\t<input name=\"iconid17\" value=\"V1\" id=\"rb_iconid_41\" tabindex=\"1\" onclick=\"swap_posticon('pi_19')\" type=\"radio\" checked=\"checked\"></td>\r\n");
      out.write("\t\t<td style=\"width: 37px\"><label for=\"rb_iconid_0\">No icon</label></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"space\"> &nbsp;</div>\r\n");
      out.write("<div class=\"side\">\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"space\"> &nbsp;</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\"><a href=\"http://www.online-learning.com/search_site.html\">Search</a> | <a href=\"http://www.online-learning.com/sitemap.html\">Sitemap</a> |   <a href=\"http://courses.online-learning.com/\" onclick=\"MM_openBrWindow('http://courses.online-learning.com','Moodle','toolbar=yes,location=yes,status=yes,menubar=yes,scrollbars=yes,resizable=yes');return false;\">Course Login</a> | <a href=\"http://www.online-learning.com/comp_privacy.html\">Privacy statement</a><br>Copyright Â© 2011. All Rights Reserved.</div>\r\n");
      out.write("</div><div style=\"clear:left;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("    </form> \r\n");
      out.write(" \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("         \r\n");
      out.write("                \r\n");
      out.write("        ");

           title=request.getParameter("Text1");
           topic=request.getParameter("TextArea1");
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                con=DriverManager.getConnection("jdbc:odbc:ocp");
                System.out.println("Connection established");
                PreparedStatement ps=con.prepareStatement( "insert into viewforum(tittle,topic) values (?,?)"); 
               
            ps.setString(1,title);
            ps.setString(2,topic);
            ps.executeUpdate();
       
		ps.close();
		con.close();
		

		
	
	}
	catch(Exception e)
	{
		System.out.println("Exception "+e);
	}
             
      out.write("\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("</body></html>");
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