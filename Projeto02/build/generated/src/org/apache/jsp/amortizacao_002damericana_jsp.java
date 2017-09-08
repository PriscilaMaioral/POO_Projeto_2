package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class amortizacao_002damericana_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Amortização Americana</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
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
      out.write("            <h2>Amortização Americana</h2>\n");
      out.write("            \n");
      out.write("            ");

                //INICIALIZAÇÃO DAS VARIÁVEIS NO TAMANHO 0
            float parcela = 0;
            float capital = 0;
            float juros = 0;
            int meses = 0;
            
            //TRATAMENTO DE EXCESSÕES COM TRY CATCH
            try{capital = Float.parseFloat(request.getParameter("C"));}
            catch(Exception e){}
            try{juros = Float.parseFloat(request.getParameter("j"));}
            catch(Exception e){}
            try{meses = Integer.parseInt(request.getParameter("m"));}
            catch(Exception e){}
            
            //OPERAÇÃO AMORTIZAÇÃO AMERICANA
            juros = capital * (juros/100);
            parcela = juros;
            float cap = capital; 
            
      out.write("\n");
      out.write("            \n");
      out.write("            <form> \n");
      out.write("                <label for=\"C\"><b>Capital</b></label><br>\n");
      out.write("                <input type=\"text\" name=\"C\" id=\"C\">\n");
      out.write("                <br>\n");
      out.write("                <label for=\"m\"><b>Meses</b></label><br>\n");
      out.write("                <input type=\"text\" name=\"m\" id=\"m\">\n");
      out.write("                <br>\n");
      out.write("                <label for=\"j\"><b>Juros</b></label><br>\n");
      out.write("                <input type=\"text\" name=\"j\" id=\"j\">\n");
      out.write("                \n");
      out.write("                <br><br>\n");
      out.write("                <input class=\"btn\" type=\"submit\" value=\"Gerar Amortização\">\n");
      out.write("                <br><br>\n");
      out.write("            </form>\n");
      out.write("            <hr>\n");
      out.write("            ");
if(capital > 0 && meses>0 && juros>0){
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
                        parcela = capital + juros;
                        cap = capital;
                        capital = 0;
                    }
                    if( i != meses){
                        cap = 0;
                    }                   
                
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
      out.print(String.format("R$ %.2f", juros));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(String.format("R$ %.2f", parcela));
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>");
}
      out.write("\n");
      out.write("        </div>\n");
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
