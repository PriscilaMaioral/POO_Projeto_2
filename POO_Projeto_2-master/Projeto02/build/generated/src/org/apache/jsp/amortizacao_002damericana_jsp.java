package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amortizacao_002damericana_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Amortização Americana</title>\n");
      out.write("        <style>\n");
      out.write("    input[type=number] {\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    border: 3px solid #ccc;\n");
      out.write("    -webkit-transition: 0.5s;\n");
      out.write("    transition: 0.5s;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("input[type=number]:focus {\n");
      out.write("    border: 3px solid #D6DBDF;\n");
      out.write("}\n");
      out.write("submit {\n");
      out.write("    background-color: #4CAF50; \n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 15px 32px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 2px;\n");
      out.write("}\n");
      out.write("body {  \n");
      out.write("    background-color: FCFBE3;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
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
      out.write("        <div class=\"formatação\">\n");
      out.write("            <h2>Amortização Americana</h2>\n");
      out.write("            \n");
      out.write("            ");

            double par = 0;
            double capital = 0;
            double taxa = 0;
            double totaljuros = 0;
            double totalpar = 0;
            int meses = 0;
            
            
            try{ if(request.getParameter("enviar") != null){
            capital = Double.parseDouble(request.getParameter("capital"));
            taxa = Double.parseDouble(request.getParameter("juros"));
            meses = Integer.parseInt(request.getParameter("meses"));}
            }
            catch(Exception e){out.println("entre com um dado válido");}
            
            
            taxa = capital * (taxa/100);
            par = taxa;
            double cap = capital; 
            
      out.write("\n");
      out.write("            \n");
      out.write("            <form> \n");
      out.write("                <label for=\"C\"><b>Capital</b></label><br>\n");
      out.write("                <input type=\"number\" step=\"0.01\" name=\"capital\" id=\"capital\">\n");
      out.write("                <br>\n");
      out.write("                <label for=\"m\"><b>Meses</b></label><br>\n");
      out.write("                <input type=\"number\" name=\"meses\" id=\"meses\">\n");
      out.write("                <br>\n");
      out.write("                <label for=\"j\"><b>Taxa de Juros</b></label><br>\n");
      out.write("                <input type=\"number\" step=\"0.01\" name=\"juros\" id=\"juros\">\n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                <input class=\"btn\" type=\"submit\" name=\"enviar\" value=\"Gerar Amortização\">\n");
      out.write("                <br><br>\n");
      out.write("            </form>\n");
      out.write("            <hr>\n");
      out.write("            ");
if(capital > 0 && meses>0 && taxa>0){
      out.write("\n");
      out.write("            <table border=\"1\" class=\"tabela\">\n");
      out.write("                    <th>Parcelas</th>\n");
      out.write("                    <th>Saldo Devedor</th>\n");
      out.write("                    <th>Amortização</th>\n");
      out.write("                    <th>Valor dos Juros</th>\n");
      out.write("                    <th>Valor da Prestação</th>\n");
      out.write("                    \n");
      out.write("                ");
for(int i = 1; i <= meses; i++){
                    
                    if(i == meses){
                        par = capital + taxa;
                        cap = capital;
                        capital = 0;
                    }
                    if( i != meses){
                        cap = 0;
                    }    
                 totalpar = totalpar + par; 
                 totaljuros = totaljuros + taxa;
                
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(String.format("R$ %.2f", capital));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(String.format("R$ %.2f", cap));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(String.format("R$ %.2f", taxa));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(String.format("R$ %.2f", par));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>total</td>\n");
      out.write("                    <td> <center>//</center> </td>\n");
      out.write("                    <td> <center>//</center> </td>\n");
      out.write("                    <td>");
      out.print(String.format("R$ %.2f", totaljuros));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(String.format("R$ %.2f", totalpar));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
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
