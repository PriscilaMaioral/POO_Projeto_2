package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amortizacao_002dconstante_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/header.jspf");
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
      out.write("        \n");
      out.write("        <title>Amortização Constante</title>\n");
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
      out.write("        <div class=\"formatação\">\n");
      out.write("            <h2>Amortização Constante</h2>\n");
      out.write("     ");

            //Declaração da variavel i com valor 0 para evitar sujeira de memória
            int i = 0;
            double capital = 0; 
            int meses = 0; 
            double taxa = 0;
            double totaljuros = 0;
            double totalpresta = 0;
            //Declaração da variável ca utilizada para pegar o valor do form
            try{ if (request.getParameter ("enviar") != null){
            capital = Double.parseDouble(request.getParameter("capital"));
            meses = Integer.parseInt(request.getParameter("meses"));
            taxa = Double.parseDouble(request.getParameter("taxa"));}
            }
            catch(Exception e){out.println("entre com um valor válido");}
                
               
             Double amorti = capital / meses;
             double juros = 0;
             Double par = capital + juros;
               

            
     
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <b>Capital</b><br/>    \n");
      out.write("            <input type=\"number\" step=\"0.01\" name=\"capital\" />\n");
      out.write("          \n");
      out.write("            <br/> <b>Meses</b><br/>        \n");
      out.write("            <input type=\"number\" name=\"meses\" />\n");
      out.write("            \n");
      out.write("            <br/> <b>Taxa de Juros</b><br/>\n");
      out.write("            <input type=\"number\" step=\"0.01\" name=\"taxa\" /><br/><br/>            \n");
      out.write("            <input class=\"btn\" type=\"submit\" name=\"enviar\" value=\"Gerar Amortização\"/>\n");
      out.write("        </form>\n");
      out.write("            <br/>\n");
      out.write("            <hr>\n");
      out.write("          ");
if(capital > 0 && meses>0 && taxa>0){
      out.write("\n");
      out.write("        <table border=\"2\" class=\"tabela1\">\n");
      out.write("            <th> Parcelas </th>\n");
      out.write("            <th> Juros </th>\n");
      out.write("            <th> Total da parcela </th>\n");
      out.write("            <th> Valor amortizado </th>\n");
      out.write("            <th>Amortização </th>\n");
      out.write("            ");
for(i=1; i<=meses; i++){
            totalpresta = totalpresta + par; 
            totaljuros = totaljuros + taxa;
            
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>R$ ");
      out.print( String.format("%.2f", juros = capital * taxa / 100) );
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>R$ ");
      out.print(String.format("%.2f", par+juros));
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>R$ ");
      out.print(String.format("%.2f", capital = capital-amorti));
      out.write("</td>\n");
      out.write("                \n");
      out.write("                <td>R$ ");
      out.print(String.format("%.2f", amorti));
      out.write("</td>\n");
      out.write("              \n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                    <td>total</td>\n");
      out.write("                    <td> ");
      out.print(String.format("R$ %.2f", totaljuros));
      out.write(" </td>\n");
      out.write("                    <td><center>//</center></td>\n");
      out.write("                    <td><center>//</center></td>\n");
      out.write("                    <td>");
      out.print(String.format("R$ %.2f", totalpresta));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("        </table>");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("       \n");
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
