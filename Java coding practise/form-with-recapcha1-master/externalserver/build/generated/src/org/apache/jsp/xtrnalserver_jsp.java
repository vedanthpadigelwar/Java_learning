package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xtrnalserver_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("        <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("* {box-sizing: border-box}\n");
      out.write("\n");
      out.write("/* Full-width input fields */\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 5px 0 22px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: none;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr {\n");
      out.write("    border: 1px solid #f1f1f1;\n");
      out.write("    margin-bottom: 25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Set a style for all buttons */\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("    opacity: 0.9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button:hover {\n");
      out.write("    opacity:1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Extra styles for the cancel button */\n");
      out.write(".cancelbtn {\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Float cancel and signup buttons and add an equal width */\n");
      out.write(".cancelbtn, .signupbtn {\n");
      out.write("  float: left;\n");
      out.write("  width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Add padding to container elements */\n");
      out.write(".container {\n");
      out.write("    padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Clear floats */\n");
      out.write(".clearfix::after {\n");
      out.write("    content: \"\";\n");
      out.write("    clear: both;\n");
      out.write("    display: table;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change styles for cancel button and signup button on extra small screens */\n");
      out.write("@media screen and (max-width: 300px) {\n");
      out.write("    .cancelbtn, .signupbtn {\n");
      out.write("       width: 100%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body onload='assign()'>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <form action='externalserver/xtr_client_sservlet'method=\"post\" id='abc'>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("   \n");
      out.write("    <p>Please fill in this form to create an account.</p>\n");
      out.write("    <hr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          UserName: <input type =\"text\" name=\"username\"  \n");
      out.write("                           required \n");
      out.write("               placeholder=\"4 to 8 characters long\" /><br/>\n");
      out.write("          </br>\n");
      out.write("          Password:<input type =\"password\" name=\"password\" required placeholder=\"5 to 12 characters long\"/></br>\n");
      out.write("           </br>\n");
      out.write("          Name: <input type =\"text\" name=\"name\" required placeholder=\"alphabes only\"/><br/>\n");
      out.write("          </br>\n");
      out.write("          address: <input type =\"text\" name=\"address\"   placeholder=\"optional\"/><br/>\n");
      out.write("          </br>\n");
      out.write("          country1: \n");
      out.write("           </br>\n");
      out.write("           <select value=\"country1\">\n");
      out.write("               <option selected disabled>select your country</option>\n");
      out.write("            <option value=\"india\">india</option>\n");
      out.write("            <option value=\"saab\">australia</option>\n");
      out.write("            <option value=\"mercedes\">usa</option>\n");
      out.write("            <option value=\"audi\">uk</option>\n");
      out.write("            </select>\n");
      out.write("          <br/>\n");
      out.write("          </br>\n");
      out.write("          zipcode:\n");
      out.write("           </br>\n");
      out.write("           <input type =\"number\" name=\"zipcode\" required  placeholder=\"must be numeric\"/><br/>\n");
      out.write("          </br>\n");
      out.write("          email id: <input type =\"text\" name=\"email id\" required placeholder=\"must be a valid email id\"/><br/>\n");
      out.write("          </br>\n");
      out.write("          gender: <input type =\"radio\" name=\"gender\" value = \"male\"/>male\n");
      out.write("                  <input type =\"radio\" name=\"gender\" value = \"female\"/>female\n");
      out.write("                  <input type =\"radio\" name=\"gender\" value = \"others\"/>others\n");
      out.write("          <br/>\n");
      out.write("          language: <input type =\"checkbox\" name=\"language\" value=\"english\" style=\"margin-bottom:15px\" /> english\n");
      out.write("                    <input type =\"checkbox\" name=\"language\" value=\"french\" style=\"margin-bottom:15px\"/> french\n");
      out.write("          <br/>\n");
      out.write("          \n");
      out.write("           <p id=\"ve\"><b style=\"color: red\">Captcha: </b></p>\n");
      out.write("            <input id=\"captcha\" type =\"text\" name=\"captcha\" maxlength=\"3\"/>\n");
      out.write("          \n");
      out.write("           \n");
      out.write("          </br>\n");
      out.write("          \n");
      out.write("          <p>By creating an account you agree to our <a href=\"#\" style=\"color:dodgerblue\">Terms & Privacy</a>.</p>\n");
      out.write("\n");
      out.write("    <div class=\"clearfix\">\n");
      out.write("      <button type=\"button\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("       <input type = \"button\" class=\"cancelbtn\"value =\"submit\"onclick=\"pass()\" >\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("          \n");
      out.write("          <script type=\"text/javascript\">\n");
      out.write("var x,y,z;\n");
      out.write("\n");
      out.write("function assign(){\n");
      out.write("x = Math.floor(Math.random() * 10)+10;\n");
      out.write("document.getElementById(\"ve\").innerHTML = document.getElementById(\"ve\").innerHTML+ x;\n");
      out.write("\n");
      out.write("z = Math.floor(Math.random() * 4)+1;\n");
      out.write("\n");
      out.write("\n");
      out.write("if(z ==1){\n");
      out.write("    document.getElementById(\"ve\").innerHTML =document.getElementById(\"ve\").innerHTML+\" + \" ;\n");
      out.write("}\n");
      out.write("if(z==2)\n");
      out.write("{\n");
      out.write("    document.getElementById(\"ve\").innerHTML =document.getElementById(\"ve\").innerHTML+\" - \" ;\n");
      out.write("}\n");
      out.write("if(z==3)\n");
      out.write("{\n");
      out.write("    document.getElementById(\"ve\").innerHTML =document.getElementById(\"ve\").innerHTML+\" * \" ;\n");
      out.write("}\n");
      out.write("if(z==4)\n");
      out.write("{\n");
      out.write("    document.getElementById(\"ve\").innerHTML =document.getElementById(\"ve\").innerHTML+\" / \" ;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("y = Math.floor(Math.random() * 10)+1;\n");
      out.write("document.getElementById(\"ve\").innerHTML =document.getElementById(\"ve\").innerHTML+y ;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function pass(){\n");
      out.write("    var pas=\"/externalserver/xtr_client_sservlet?a=\"+x+\"&b=\"+y+\"&c=\"+z;\n");
      out.write("    document.getElementById(\"abc\").action=pas;\n");
      out.write("    document.getElementById(\"abc\").submit();\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   \n");
      out.write("    ");
      out.write("<hr/>\n");
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
