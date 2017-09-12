<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Amortização Americana</title>
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
    </head>
    <body>
    <center>
        <%@include file="WEB-INF/header.jspf"%>
        <div class="formatação">
            <h2>Amortização Americana</h2>
            
            <%
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
            catch(Exception e){out.println("<h1><font color='red'>Entre com um dado válido</font></h1>");}
            
            
            taxa = capital * (taxa/100);
            par = taxa;
            double cap = capital; 
            %>
            
            <form> 
                <label for="C"><b>Capital</b></label><br>
                <input type="number" step="0.01" name="capital" id="capital">
                <br>
                <label for="m"><b>Meses</b></label><br>
                <input type="number" name="meses" id="meses">
                <br>
                <label for="j"><b>Taxa de Juros</b></label><br>
                <input type="number" step="0.01" name="juros" id="juros">
                
                <br><br>
                <input class="btn" type="submit" name="enviar" value="Gerar Amortização">
                <br><br>
            </form>
            <hr>
            <%if(capital > 0 && meses>0 && taxa>0){%>
            <table border="1" class="tabela">
                    <th>Parcelas</th>
                    <th>Saldo Devedor</th>
                    <th>Amortização</th>
                    <th>Valor dos Juros</th>
                    <th>Valor da Prestação</th>
                    
                <%for(int i = 1; i <= meses; i++){
                    
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
                %>                
                <tr>
                    <td><%=i%></td>
                    <td><%=String.format("R$ %.2f", capital)%></td>
                    <td><%=String.format("R$ %.2f", cap)%></td>
                    <td><%=String.format("R$ %.2f", taxa)%></td>
                    <td><%=String.format("R$ %.2f", par)%></td>
                </tr>
                <%}%>
                <tr>
                    <td>total</td>
                    <td> <center>//</center> </td>
                    <td> <center>//</center> </td>
                    <td><%=String.format("R$ %.2f", totaljuros)%></td>
                    <td><%=String.format("R$ %.2f", totalpar)%></td>
                </tr>
            </table><%}%>
        </div>
    </center>
    </body>
</html>