
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabela Price</title>
    </head>
    <body>
        <%@include file="WEB-INF/header.jspf"%>
        <div id="formatação">
            <h2>Tabela Price</h2>
            <%
            double capital = 0;
            double taxa = 0;
            double devedor = 0;
            double amorti = 0;
            double par = 0;
            int meses = 0;
            double totaljuros = 0;
            double totalpar = 0;
            
            
            try{ if (request.getParameter("enviar")!= null) {
            capital = Double.parseDouble(request.getParameter("capital"));
            taxa = Double.parseDouble(request.getParameter("juros"));
            meses = Integer.parseInt(request.getParameter("meses"));}
            }
            catch(Exception e){out.println("entre com um valor válido");}

            taxa = taxa/100;
            double linha1 = capital * taxa;
            double x = Math.pow((1+taxa),meses);
            double linha2 = 1-(1/x);
                                    
            %>
            <form> 
                <label for="C"><b>Capital</b></label><br>
                <input type="number" step="0.01" name="capital" id="C">
                <br>
                <label for="m"><b>Meses</b></label><br>
                <input type="number" step="0.01" name="meses" id="m">
                <br>
                <label for="j"><b>Taxa de Juros</b></label><br>
                <input type="number" step="0.01" name="juros" id="j">
                
                <br><br>
                <input type="submit" name="enviar" value="Gerar Amortização" class="btn">
                <br/><br/>
            </form>
            <hr>
            <%if(capital > 0 && meses>0 && taxa>0){%>
            <table border="1" class="tabela">
                <th>Parcelas</th>
                    <th>Saldo Devedor</th>
                    <th>Valor da Prestação</th>
                    <th>Valor dos Juros</th>
                    <th>Amortização</th>
                    
                <%for(int i = 1; i <= meses; i++){
                    
                    double juros = 0;
                    
                    if(i == 1){
                        devedor = capital;
                        par = 0;
                        juros = 0;
                        amorti = 0;
                    }
                    else{
                        par = linha1/linha2;
                        juros = devedor * taxa;
                        devedor = (devedor+juros)- par;
                        amorti = par - juros;
                    }          
                totalpar = totalpar + par; 
                totaljuros = totaljuros + juros;
                %>                
                <tr>
                    <td><%=i%></td>
                    <td><%=String.format("R$ %.2f", devedor)%></td>
                    <td><%=String.format("R$ %.2f", par)%></td>
                    <td><%=String.format("R$ %.2f", juros)%></td>
                    <td><%=String.format("R$ %.2f", amorti)%></td>
                </tr>
                <%}%>
                <tr>
                    <td>total</td>
                    <td> // </td>
                    <td> // </td>
                    <td><%=String.format("R$ %.2f", totaljuros)%></td>
                    <td><%=String.format("R$ %.2f", totalpar)%></td>
                </tr>
            </table><%}%>
        </div>
      
    </body>
</html>