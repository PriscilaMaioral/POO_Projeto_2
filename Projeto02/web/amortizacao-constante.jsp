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
        <link rel="stylesheet" type="text/css" href="css/main.css">
        <title>Amortização Constante</title>
    </head>
    <body>
        <%@include file="WEB-INF/header.jspf"%>
        <div class="formatação">
            <h2>Amortização Constante</h2>
     <%
            //Declaração da variavel i com valor 0 para evitar sujeira de memória
            int i = 0;
            
            //Declaração da variável ca utilizada para pegar o valor do form
            float ca = 0; 
            try{ca = Float.parseFloat(request.getParameter("ca"));}
            catch(Exception e){}
            
            //Criação da variável mes utilizada para pegar o valor do form
             int mes = 0; 
             try{mes = Integer.parseInt(request.getParameter("mes"));}
            catch(Exception e){}
             
             //Criação da variável jur utilizada para pegar o valor do form
              float jur = 0;
              try{jur = Float.parseFloat(request.getParameter("jur"));}
            catch(Exception e){}
                
               
              float amorti = ca / mes;
               float juros = 0;
               float par = ca + juros;
               

            
     %>
        <form>
            <b>Capital</b><br/>    
            <input type="number" name="ca" />
          
            <br/> <b>Meses</b><br/>        
            <input type="number" name="mes" />
            
            <br/> <b>Juros</b><br/>
            <input type="number" name="jur" /><br/><br/>            
            <input class="btn" type="submit" value="Gerar Amortização"/>
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
        <%@include file="WEB-INF/footer.jspf"%>
    </body>
</html>
