<%-- 
    Document   : amortizacao-americana
    Created on : 06/09/2017, 16:19:28
    Author     : BRYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amortização Americana</title>
    </head>
    <body>
        <%@include file="WEB-INF/header.jspf"%>
        <div class="formatação">
            <h2>Amortização Americana</h2>
            
            <%
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
            %>
            
            <form> 
                <label for="C"><b>Capital</b></label><br>
                <input type="text" name="C" id="C">
                <br>
                <label for="m"><b>Meses</b></label><br>
                <input type="text" name="m" id="m">
                <br>
                <label for="j"><b>Juros</b></label><br>
                <input type="text" name="j" id="j">
                
                <br><br>
                <input class="btn" type="submit" value="Gerar Amortização">
                <br><br>
            </form>
            <hr>
            <%if(capital > 0 && meses>0 && juros>0){%>
            <table border="1" class="tabela">
                    <th>Parcelas</th>
                    <th>Saldo Devedor</th>
                    <th>Amortização</th>
                    <th>Valor dos Juros</th>
                    <th>Valor da Prestação</th>
                    
                <%for(int i = 1; i <= meses; i++){
                    
                    if(i == meses){
                        parcela = capital + juros;
                        cap = capital;
                        capital = 0;
                    }
                    if( i != meses){
                        cap = 0;
                    }                   
                %>                
                <tr>
                    <td><%=i%></td>
                    <td><%=String.format("R$ %.2f", capital)%></td>
                    <td><%=String.format("R$ %.2f", cap)%></td>
                    <td><%=String.format("R$ %.2f", juros)%></td>
                    <td><%=String.format("R$ %.2f", parcela)%></td>
                </tr>
                <%}%>
            </table><%}%>
        </div>
       
    </body>
</html>