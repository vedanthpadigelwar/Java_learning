package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action='/webform_serviceclient/servletform'>\n");
      out.write("          UserName: <input type =\"text\" name=\"username\"  \n");
      out.write("                           required \n");
      out.write("               placeholder=\"4 to 8 characters long\" /><br/>\n");
      out.write("          </br>\n");
      out.write("          Password:<input type =\"password\" name=\"password\" required placeholder=\"5 to 12 characters long\"/></br>\n");
      out.write("           </br>\n");
      out.write("          Name: <input type =\"text\" name=\"name\" required placeholder=\"alphabes only\"/><br/>\n");
      out.write("          </br>\n");
      out.write("          address: <input type =\"text\" name=\"address\" required  placeholder=\"optional\"/><br/>\n");
      out.write("          </br>\n");
      out.write("          country1: \n");
      out.write("           <select value=\"country1\">\n");
      out.write("               <option selected disabled>select your country</option>\n");
      out.write("            <option value=\"india\">india</option>\n");
      out.write("            <option value=\"saab\">australia</option>\n");
      out.write("            <option value=\"mercedes\">usa</option>\n");
      out.write("            <option value=\"audi\">uk</option>\n");
      out.write("            </select>\n");
      out.write("          <br/>\n");
      out.write("          </br>\n");
      out.write("          zipcode: <input type =\"number\" name=\"zipcode\" required  placeholder=\"must be numeric\"/><br/>\n");
      out.write("          </br>\n");
      out.write("          email id: <input type =\"text\" name=\"email id\" required placeholder=\"must be a valid email id\"/><br/>\n");
      out.write("          </br>\n");
      out.write("          gender: <input type =\"radio\" name=\"gender\" value = \"male\"/>male\n");
      out.write("                  <input type =\"radio\" name=\"gender\" value = \"female\"/>female\n");
      out.write("                  <input type =\"radio\" name=\"gender\" value = \"others\"/>others\n");
      out.write("          <br/>\n");
      out.write("          language: <input type =\"checkbox\" name=\"language\" value=\"english\" /> english\n");
      out.write("                    <input type =\"checkbox\" name=\"language\" value=\"french\"/> french\n");
      out.write("          <br/>\n");
      out.write("          \n");
      out.write("            about:<textarea rows=\"4\" cols=\"50\">\n");
      out.write("              optional\n");
      out.write("             </textarea>\n");
      out.write("          </br>\n");
      out.write("          </br>\n");
      out.write("          \n");
      out.write("          <input type = \"submit\" value =\"submit\">\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("    \n");
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
