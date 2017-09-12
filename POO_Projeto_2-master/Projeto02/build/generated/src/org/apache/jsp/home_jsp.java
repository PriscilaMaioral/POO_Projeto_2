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
      out.write("        <style>\n");
      out.write("            body {  \n");
      out.write("    background-color: #F2F3F4;\n");
      out.write("}\n");
      out.write("#exp {\n");
      out.write("    text-align: justify;\n");
      out.write("    margin: 10px;\n");
      out.write("    font-family: garamond;\n");
      out.write("    font-size: 17px;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("       \n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 20px 22px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 30px;\n");
      out.write("    font-family: garamond;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("    background-color: #111;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("    background-color: #A3E4D7;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("html,body\n");
      out.write("{\n");
      out.write("    margin:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style> \n");
      out.write("    <nav>\n");
      out.write("       \n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"home.jsp\" class=\"btn\">Home</a></li>\n");
      out.write("            <li><a href=\"amortizacao-constante.jsp\"class=\"btn\">Armotização Constante</a></li>\n");
      out.write("            <li><a href=\"amortizacao-americana.jsp\" class=\"btn\">Armotização Americana</a></li>\n");
      out.write("            <li><a href=\"tabela-price.jsp\" class=\"btn\">Tabela Price</a></li>\t\t\t\n");
      out.write("\t</ul>\n");
      out.write("    </nav>\n");
      out.write("<hr/>");
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("            <img align=\"right\" src=\"https://s26.postimg.org/obpg6lgnd/imghome.png\">\n");
      out.write("            <br></div>\n");
      out.write("    <div id=\"exp\" ><center><h2>Aplicação para calculo do sistemas de amortização, podendo ser feito o cálculo para \n");
      out.write("                amortização Americana, Constante e Tabela Price</h2></center>\n");
      out.write("            <br>\n");
      out.write("            <b>Amortização Americana</b>\n");
      out.write("            <br>\n");
      out.write("            O Sistema de Amortização Americano é uma forma de pagamento de empréstimos que se caracteriza pelo pagamento apenas dos juros da dívida,\n");
      out.write("            deixando o valor da dívida constante, que pode ser paga em apenas um único pagamento.\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <b>Amortização Constante</b>\n");
      out.write("            <br>\n");
      out.write("             Sistema de Amortização Constante (SAC)é uma forma de amortização de um empréstimo por prestações que \n");
      out.write("             incluem os juros, amortizando assim partes iguais do valor total do empréstimo.\n");
      out.write("             <br>\n");
      out.write("             <br>\n");
      out.write("             <b>Tabela Price</b>\n");
      out.write("             <br>\n");
      out.write("             Tabela Price, também chamado de sistema francês de amortização, é um método usado em amortização de empréstimo cuja principal \n");
      out.write("             característica é apresentar prestações (ou parcelas) iguais.\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("          ");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<style>\n");
      out.write("#footer {\n");
      out.write("width: 100%;\n");
      out.write("bottom: 0;\n");
      out.write("position: absolute;\n");
      out.write("background-color: #333;\n");
      out.write("height: auto;\n");
      out.write("color: white;\n");
      out.write("text-align: left;\n");
      out.write("}\n");
      out.write("#pig {\n");
      out.write("height: 13%;\n");
      out.write("width: auto;  \n");
      out.write("bottom: 10px;\n");
      out.write("position: absolute;\n");
      out.write("right: 50px;\n");
      out.write("}    \n");
      out.write("html, body {\n");
      out.write("  margin: 0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<div id=\"footer\">\n");
      out.write("    <ul>Integrantes do Grupo: \n");
      out.write("        <li>Bryan Ichiro Higa</li>\n");
      out.write("        <li>Danilo Pelozone Lima</li>\n");
      out.write("        <li>Priscila Maioral Maelaro</ul>\n");
      out.write("            </div>\n");
      out.write("<img src=\"https://image.flaticon.com/icons/png/512/20/20687.png\" id=\"pig\">\n");
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
