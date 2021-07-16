package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("        <link rel=\"stylesheet\" href=\"style.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Welcome, to your Profile Account</h1>\n");
      out.write("    </center>\n");
      out.write("    <hr/>\n");
      out.write("    \n");
      out.write("    ");

    request.getSession(false);
   String uname= session.getAttribute("myuser").toString();
    
    
      out.write("\n");
      out.write("    \n");
      out.write("    <center>\n");
      out.write("    <h2>Hello, ");
      out.print( uname);
      out.write(",</h2>\n");
      out.write("    <h4><b>Job Title: </b>Software Engineer</h4>\n");
      out.write("    \n");
      out.write("    <p id=\"p1\">Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n");
      out.write("        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when<br/>\n");
      out.write("        an unknown printer took a galley of type and scrambled it to make a type specimen book.\n");
      out.write("        It has survived not only five centuries, but also the leap into electronic typesetting,<br/>\n");
      out.write("        remaining essentially unchanged. It was popularised in the 1960s with the release of \n");
      out.write("        Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing <br/>\n");
      out.write("        software like Aldus PageMaker including versions of Lorem Ipsum.</p>\n");
      out.write("    \n");
      out.write("    <form action=\"Logout\"\n");
      out.write("        method=\"post\">\n");
      out.write("        <input type=\"submit\" value=\"Logout\"/>\n");
      out.write("    </form>\n");
      out.write("    </center>\n");
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
