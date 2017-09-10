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
            
            int i = 0;
            double capital = 0; 
            int meses = 0; 
            double taxa = 0;
            double totaljuros = 0;
            double totalpar = 0;
            
            try{ if (request.getParameter ("enviar") != null){
            capital = Double.parseDouble(request.getParameter("capital"));
            meses = Integer.parseInt(request.getParameter("meses"));
            taxa = Double.parseDouble(request.getParameter("taxa"));}
            }
            catch(Exception e){out.println("entre com um valor válido");}
                
               
            Double amorti = capital / meses;
            double juros = 0;
            Double par = capital + juros;
               

            
     %>
        <form>
            <b>Capital</b><br/>    
            <input type="number" step="0.01" name="capital" />
          
            <br/> <b>Meses</b><br/>        
            <input type="number" name="meses" />
            
            <br/> <b>Taxa de Juros</b><br/>
            <input type="number" step="0.01" name="taxa" /><br/><br/>            
            <input class="btn" type="submit" name="enviar" value="Gerar Amortização"/>
        </form>
            <br/>
            <hr>
          <%if(capital > 0 && meses>0 && taxa>0){%>
        <table border="2" class="tabela1">
            <th> Parcelas </th>
            <th> Juros </th>
            <th> Total da parcela </th>
            <th> Valor amortizado </th>
            <th>Amortização </th>
            <%for(i=1; i<=meses; i++){
            totalpar = totalpar + par; 
            totaljuros = totaljuros + taxa;
            %>
            
            <tr>
                <td><%=i%></td>
                
                <td>R$ <%= String.format("%.2f", juros = capital * taxa / 100) %></td>
                
                <td>R$ <%=String.format("%.2f", par+juros)%></td>
                
                <td>R$ <%=String.format("%.2f", capital = capital-amorti)%></td>
                
                <td>R$ <%=String.format("%.2f", amorti)%></td>
              
            </tr>
            <%}%>
            <tr>
                    <td>total</td>
                    <td> <%=String.format("R$ %.2f", totaljuros)%> </td>
                    <td><center>//</center></td>
                    <td><center>//</center></td>
                    <td><%=String.format("R$ %.2f", totalpar)%></td>
                </tr>
        </table><%}%>
        </div>
       
    </body>
</html>
