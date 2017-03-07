package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inquiry_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <table>\n");
      out.write("                <tr>       \n");
      out.write("                    <td> Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"address\"/></td>\n");
      out.write("                </tr>  \n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact Number:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"contact\"/></td>\n");
      out.write("                </tr> \n");
      out.write("                <tr>\n");
      out.write("                    <td>Email:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Query:</td>\n");
      out.write("                    <td> <textarea rows=\"5\" cols=\"16\"></textarea> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Respond via mobile<input type=\"checkbox\" name=\"mobile\" value=\"mob\"/></td>\n");
      out.write("                    <td>Respond via email<input type=\"checkbox\" name=\"cemail\" value=\"email\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> <p>If you opt respond via mobile specify the date and time our executive to contact you </p></td>\n");
      out.write("            </tr>\n");
      out.write("           <tr>\n");
      out.write("               <td>\n");
      out.write("                    Date\n");
      out.write("                    <select name=\"day\">\n");
      out.write("                    <option value=\"\">day</option>\n");
      out.write("                    <option value=\"1\">1</option>\n");
      out.write("                    <option value=\"2\">2</option>\n");
      out.write("                    <option value=\"3\">3</option>\n");
      out.write("                    <option value=\"4\">4</option>\n");
      out.write("                        </select>\n");
      out.write("            <select name=\"month\">\n");
      out.write("                    <option value=\"\">month</option>\n");
      out.write("                    <option value=\"1\">Jan</option>\n");
      out.write("                    <option value=\"2\">Feb</option>\n");
      out.write("                    <option value=\"3\">March</option>\n");
      out.write("                    <option value=\"4\">April</option>\n");
      out.write("                        </select>\n");
      out.write("           <select name=\"year\">\n");
      out.write("                    <option value=\"\">year</option>\n");
      out.write("                    <option value=\"1\">2016</option>\n");
      out.write("                    <option value=\"2\">2017</option>\n");
      out.write("                    <option value=\"3\">2018</option>\n");
      out.write("                    <option value=\"4\">2019</option>\n");
      out.write("                        </select>\n");
      out.write("               </td>\n");
      out.write("               <td>Time\n");
      out.write("                   <select name=\"time\">\n");
      out.write("                    <option value=\"\">time</option>\n");
      out.write("                    <option value=\"1\">1</option>\n");
      out.write("                    <option value=\"2\">2</option>\n");
      out.write("                    <option value=\"3\">3</option>\n");
      out.write("                    <option value=\"4\">4</option>\n");
      out.write("                        </select>\n");
      out.write("               </td>  \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><input type=\"submit\" value=\"submit\"/></td>\n");
      out.write("                 s          </tr>                 \n");
      out.write("                </table>\n");
      out.write("             ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("          ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("        </form>\n");
      out.write("       \n");
      out.write("     </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.mobile.equals('mob') && param.contact.equals('')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            enter the contact number\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cemail.equals('email') && param.email.equals('')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            enter the email\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.mobile.equals('mob') && (param.day.equals('') || param.month.equals('') || param.year.equals('') ||param.time.equals('')) }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            enter date and time\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
