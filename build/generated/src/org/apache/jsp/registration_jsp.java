package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.util.ArrayList;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("        \n");
      out.write("        <form method=\"get\" action=\"error.jsp\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        ");
 
                            try
                            {
                                ArrayList<String> s=(ArrayList<String>)session.getAttribute("errorMessage");
                                for(String er :s)
                                       {
                                           out.println(er);
                                       }
                            } 
                            catch(NullPointerException e)
                            {
                               System.out.println(e); 
                            }
                        
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr><td>Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"name\"></td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr><td>Address</td>\n");
      out.write("                        <td><input type=\"text\" name=\"add\"></td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr><td>Contact no</td>\n");
      out.write("                        <td><input type=\"text\" name=\"con\"></td>\n");
      out.write("                    </tr>   \n");
      out.write("                    <tr><td>Login id</td>\n");
      out.write("                        <td><input type=\"text\" name=\"login\"></td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr><td>Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"pass\"></td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr><td>re-enter password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"rpass\"></td>\n");
      out.write("                    </tr> \n");
      out.write("                    <tr><td><input type=\"submit\" value=\"submit\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>  \n");
      out.write("            </form>\n");
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
