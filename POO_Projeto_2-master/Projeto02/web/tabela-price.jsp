<%-- 
    Document   : tabela-price
    Created on : 06/09/2017, 16:26:40
    Author     : BRYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabela Price</title>
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
submit {
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
body {  
    background-color: #F2F3F4;
}
</style>
    </head>
    <body>
    <center>
        <%@include file="WEB-INF/header.jspf"%>
        <div id="formatação">
            <h2>(Tabela Price)</h2>
            <%
            double capital = 0;
            double taxa = 0;
            double devedor = 0;
            double amortizacao = 0;
            double prestacao = 0;
            int meses = 0;
            
            try{capital = Double.parseDouble(request.getParameter("C"));}
            catch(Exception e){}
            try{taxa = Double.parseDouble(request.getParameter("j"));}
            catch(Exception e){}
            try{meses = Integer.parseInt(request.getParameter("m"));}
            catch(Exception e){}

            taxa = taxa/100;
            double linha1 = capital * taxa;
            double x = Math.pow((1+taxa),meses);
            double linha2 = 1-(1/x);
                                    
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
                <input type="submit" value="Gerar Amortização" class="btn">
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
                        prestacao = 0;
                        juros = 0;
                        amortizacao = 0;
                    }
                    else{
                        prestacao = linha1/linha2;
                        juros = devedor * taxa;
                        devedor = (devedor+juros)- prestacao;
                        amortizacao = prestacao - juros;
                    }                   
                %>                
                <tr>
                    <td><%=i%></td>
                    <td><%=String.format("R$ %.2f", devedor)%></td>
                    <td><%=String.format("R$ %.2f", prestacao)%></td>
                    <td><%=String.format("R$ %.2f", juros)%></td>
                    <td><%=String.format("R$ %.2f", amortizacao)%></td>
                </tr>
                <%}%>
            </table><%}%>
        </div>
    </center>
    </body>
</html>