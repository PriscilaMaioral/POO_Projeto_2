<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <style>
     input[type=number] {
    width: 40%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
    border: 3px solid #ccc;
    -webkit-transition: 0.5s;
    transition: 0.5s;
    outline: none;
}
input[type=number]:focus {
    border: 3px solid #D6DBDF;
}
input[type=submit] {
    background-color: #4CAF50; 
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    border-radius: 2px;
}
table, td, th {    
    border: 1px solid #ddd;
    text-align: left;
}

table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    padding: 15px;
}
body {  
    background-color: #F2F3F4;
    
}
</style>
        <title>Amortização Constante</title>
    </head>
    <body>
    <center>
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
            catch(Exception e){out.println("<h1><font color='red'>Entre com um dado válido</font></h1>");}
                
               
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
    </center>
    </body>
</html>
