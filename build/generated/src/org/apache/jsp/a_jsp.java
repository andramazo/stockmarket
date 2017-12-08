package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class a_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Dave Broking Pvt Ltd.</title>\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"main_body\">\n");
      out.write("<div id=\"content\">\n");
      out.write("\n");
      out.write("<!-- HEADER -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\n");
      out.write("<ul class=\"logo\">\n");
      out.write("<li><a href=\"#\" title=\"Financial Services\">text</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<ul class=\"call\">\n");
      out.write("<li>text</li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<ul class=\"menu\">\n");
      out.write("<li class=\"home\"><a href=\"#\" title=\"Home\">Home</a></li>\n");
      out.write("<li class=\"about\"><a href=\"#\" title=\"About\">About</a></li>\n");
      out.write("<li class=\"services\"><a href=\"#\" title=\"Services\">Services</a></li>\n");
      out.write("<li class=\"contacts\"><a href=\"#\" title=\"Contacts\">Contacts</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div id=\"welcome\">\n");
      out.write("<h2>Welcome To Dave Company Web site</h2>\n");
      out.write("<p>welcome to online e-broking web-site of Dave Broking Pvt Ltd.,This site gives facility to do broking online and maintainance of porfolio is very easy <a href=\"#\">more...</a></p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<ul class=\"choose\">\n");
      out.write("<li><a href=\"#\" title=\"Choose the right partner\">text</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- BODY -->\n");
      out.write("<div id=\"contentsection\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"leftPan\">\n");
      out.write("<h2>text</h2>\n");
      out.write("<p><span>Consetetur elitr, sed diam </span><br />Dolores et ea consetetur sadi pscing elit pscing elit consetetur pscing elitr, sed diam nonumy eirmod  elit <a href=\"#\">more...</a></p>\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"#\">Dolores et ea consetetur sadi pscing  </a></li>\n");
      out.write("<li><a href=\"#\">elit elit consetetur pscing elitr, sed</a></li>\n");
      out.write("<li><a href=\"#\">diam nonumy eirmod  elit pscing elit </a></li>\n");
      out.write("<li><a href=\"#\">consetetur pscing elitr, sed diam </a></li>\n");
      out.write("<li><a href=\"#\">nonumy eirmod lorem ipsum dolor </a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"middlePan\">\n");
      out.write("\n");
      out.write("<div id=\"services\">\n");
      out.write("<h2>text</h2>\n");
      out.write("<p class=\"with_img\">Dolores et ea sadi pscing elit consetetur pscing elitr, sed diam nonumy eirmod Dolores et ea sadi </p>\n");
      out.write("<p><span>Consetetur pscing elitr, sed diam </span><br />Dolores et ea consetetur sadi pscing elit pscing elit consetetur pscing elitr, sed diam nonumy eirmod  pscing elit <a href=\"#\">more...</a></p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"money\">\n");
      out.write("<h2>text</h2>\n");
      out.write("<img src=\"images/img_money.jpg\" alt=\"\" width=\"75\" height=\"112\" />\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"#\">Dolores et ea consetetur </a></li>\n");
      out.write("<li><a href=\"#\">sadi pscing elit elit pscing </a></li>\n");
      out.write("<li><a href=\"#\">elitr, sed diam nonumy </a></li>\n");
      out.write("<li><a href=\"#\">eirmod  elit pscing elit </a></li>\n");
      out.write("<li><a href=\"#\">consetetur pscing elitr</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"rightPan\">\n");
      out.write("\n");
      out.write("<div id=\"news\">\n");
      out.write("<h2>text</h2>\n");
      out.write("<ul>\n");
      out.write("\t<li class=\"dot\">20/11/2007 </li>\n");
      out.write("\t<li>Dolores et ea consetetur sadi pscing elit pscing elit consetetur pscing elitr, sed diam nonumy eirmod  pscing elit <a href=\"#\">more...</a></li>\n");
      out.write("\t<li class=\"dot\">20/11/2007</li>\n");
      out.write("\t<li>Dolores et ea consetetur sadi pscing elit pscing elit consetetur pscing elitr, sed diam nonumy eirmod  pscing elit <a href=\"#\">more...</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"time\">\n");
      out.write("<h2>text</h2>\n");
      out.write("<img src=\"images/img_time.jpg\" alt=\"\" width=\"90\" height=\"112\" />\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"#\">Dolores et ea consetetur </a></li>\n");
      out.write("<li><a href=\"#\">sadi pscing elit elit pscing </a></li>\n");
      out.write("<li><a href=\"#\">elitr, sed diam nonumy </a></li>\n");
      out.write("<li><a href=\"#\">eirmod  elit pscing elit </a></li>\n");
      out.write("<li><a href=\"#\">consetetur pscing elitr</a></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"clear\"></div> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- FOOTER -->\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("<p><a href=\"#\">HOME</a> | <a href=\"#\">ABOUT US</a> | <a href=\"#\">SERVICES</a> | <a href=\"#\">SOLUTIONS</a> | <a href=\"#\">SUPPORT INFO</a> | <a href=\"#\">NEWS &amp; EVENTS</a> | <a href=\"#\">CONTACTS</a><br/>\n");
      out.write("Copyright &copy; Your Company Name. Designed by <a href=\"http://www.freecsstemplates.com\" target=\"_blank\">FreeCSSTemplates.com</a></p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"sponsor\">\n");
      out.write("    <p>Sponsored by</p>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
