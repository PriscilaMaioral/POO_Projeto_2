package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/WEB-INF/header.jspf");
    _jspx_dependants.add("/WEB-INF/footer.jspf");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HOME</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("        <h1>POO PROJETO02</h1>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"home.jsp\" class=\"btn\">Home</a></li>\n");
      out.write("            <li><a href=\"amortizacao-constante.jsp\" class=\"btn\">Amortização Constante</a></li>\n");
      out.write("            <li><a href=\"amortizacao-americana.jsp\" class=\"btn\">Amortização Americana</a></li>\n");
      out.write("            <li><a href=\"tabela-price.jsp\" class=\"btn\">Tabela Price</a></li>\t\t\t\n");
      out.write("\t</ul>\n");
      out.write("    </nav>\n");
      out.write("<hr/>");
      out.write("\n");
      out.write("        \n");
      out.write("        <div id=\"meiohome\" style=\"text-align: center;\">\n");
      out.write("            \n");
      out.write("            <h2>Integrantes do Grupo</h2>\n");
      out.write("            <ul>\n");
      out.write("                <center>Bryan Ichiro Higa</center>\n");
      out.write("                <center>Danilo Pelozone Lima</center>\n");
      out.write("                <center>Priscila Maioral Maelaro</center>\n");
      out.write("                \n");
      out.write("             \n");
      out.write("            </ul>\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
