<%-- 
    Document   : amortizacao-constante
    Created on : 06/09/2017, 16:14:29
    Author     : BRYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Amortização Constante</title>
    </head>
    <body>
        <%@include file="WEB-INF/header.jspf"%>
        <div class="formatação">
            <h2>Amortização Constante</h2>
     <%
            //Declaração da variavel i com valor 0 para evitar sujeira de memória
            int i = 0;
            float ca = 0; 
            int mes = 0; 
            float jur = 0;
            //Declaração da variável ca utilizada para pegar o valor do form
            try{ if (request.getParameter ("enviar") != null){
            ca = Float.parseFloat(request.getParameter("ca"));
            mes = Integer.parseInt(request.getParameter("mes"));
            jur = Float.parseFloat(request.getParameter("jur"));}
            }
            catch(Exception e){out.println("entre com um valor válido");}
                
               
              float amorti = ca / mes;
               float juros = 0;
               float par = ca + juros;
               

            
     %>
        <form>
            <b>Capital</b><br/>    
            <input type="number" step="0.01" name="ca" />
          
            <br/> <b>Meses</b><br/>        
            <input type="number" name="mes" />
            
            <br/> <b>Juros</b><br/>
            <input type="number" step="0.01" name="jur" /><br/><br/>            
            <input class="btn" type="submit" name="enviar" value="Gerar Amortização"/>
        </form>
            <br/>
            <hr>
          <%if(ca > 0 && mes>0 && jur>0){%>
        <table border="2" class="tabela1">
            <th> Parcelas </th>
            <th> Juros </th>
            <th> Total da parcela </th>
            <th> Valor amortizado </th>
            <th>Amortização </th>
            <%for(i=1; i<=mes; i++){%>
            
            <tr>
                <td><%=i%></td>
                
                <td>R$ <%= String.format("%.2f", juros = ca * jur / 100) %></td>
                
                <td>R$ <%=String.format("%.2f", par+juros)%></td>
                
                <td>R$ <%=String.format("%.2f", ca = ca-amorti)%></td>
                
                <td>R$ <%=String.format("%.2f", amorti)%></td>
              
            </tr>
            <%}%>
        </table><%}%>
        </div>
       
    </body>
</html>
