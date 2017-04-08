package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">\n");
      out.write("\t<link rel = \"stylesheet\" href = \"sak.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"modal modal-transparent fade\" id=\"modal-transparent\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" style=\"\n");
      out.write("    margin-top: 5%;\">\n");
      out.write("    <div class=\"modal-content\" style=\"height:400px;width:400px\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button> \n");
      out.write("        <center><h4 class=\"modal-title\" id=\"myModalLabel\" style=\"font-family:'Calibri';font-size: 50px;\">Welcome!</h4></center>\n");
      out.write("      </div>\n");
      out.write("       <div class=\"modal-body\">\n");
      out.write("      <form method=\"get\" action=\"okok\">\n");
      out.write("            <table>\n");
      out.write("                ");
 
             Cookie c[]=request.getCookies();
             String uid="",pass="";
            if(c!=null)
            {
               for(int i=0;i<c.length;i++)
                {
               if(c[i].getName().equals("user"))
               {
                uid=c[i].getValue();
               }
               if(c[i].getName().equals("pass"))
               {
                pass=c[i].getValue();
                
               }
                }
            }
               
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\t\t\t\t<td style=\"font-family:'Calibri';font-size: 30px;\">Login id</td>\n");
      out.write("\t\t\t\t<td style=\"font-family:'Calibri';font-size: 30px;\">&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"login\" ></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><br></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td style=\"font-family:'Calibri';font-size: 30px;\">Password</td>\n");
      out.write("\t\t\t\t\t<td style=\"font-family:'Calibri';font-size: 30px;\">&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"pass\"></td>\n");
      out.write("\t\t </tr> \n");
      out.write("  <!-- <tr>\n");
      out.write("   <td> <p  style=\"text-size: 20px; margin-left:65%;\"></br><a href=\"\">Forget Password?</a></p></td>\n");
      out.write("    </tr>-->\n");
      out.write("      \n");
      out.write("   <tr><td><br><br></td></tr>\n");
      out.write("     <tr> \n");
      out.write("          <td style=\"font-size:16px;\">Remember me</td>\n");
      out.write("          <td><input type=\"checkbox\" name=\"check\"></td>\n");
      out.write("      </tr> \n");
      out.write("      <tr><td><br><br></td></tr>   \n");
      out.write("      \n");
      out.write("    <tr>\n");
      out.write("    <td><button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\">Submit</button>\n");
      out.write("    </td>\n");
      out.write("    <td>&nbsp;&nbsp;&nbsp;</td>\n");
      out.write("    <td><button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\">Reset</button>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t  </form>\n");
      out.write("\t </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("<!-- include jQuery -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.10.2.min.js\"></script>\n");
      out.write("  \n");
      out.write("<!-- include bootstrap -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>\n");
      out.write(" <script>\n");
      out.write(" \n");
      out.write("$(\".modal-transparent\").on('show.bs.modal', function () {\n");
      out.write("  setTimeout( function() {\n");
      out.write("    $(\".modal-backdrop\").addClass(\"modal-backdrop-transparent\");\n");
      out.write("  }, 0);\n");
      out.write("});\n");
      out.write("$(\".modal-transparent\").on('hidden.bs.modal', function () {\n");
      out.write("  $(\".modal-backdrop\").addClass(\"modal-backdrop-transparent\");\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(\".modal-fullscreen\").on('show.bs.modal', function () {\n");
      out.write("  setTimeout( function() {\n");
      out.write("    $(\".modal-backdrop\").addClass(\"modal-backdrop-fullscreen\");\n");
      out.write("  }, 0);\n");
      out.write("});\n");
      out.write("$(\".modal-fullscreen\").on('hidden.bs.modal', function () {\n");
      out.write("  $(\".modal-backdrop\").addClass(\"modal-backdrop-fullscreen\");\n");
      out.write("});\n");
      out.write("\n");
      out.write(" </script>\n");
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
