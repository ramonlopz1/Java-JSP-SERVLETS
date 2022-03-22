<%-- 
    Document   : computador
    Created on : 22/03/2022, 19:26:22
    Author     : W10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Computador de bordo</title>
    </head>
    <body>
        <h1>Resultado do cálculo</h1>
        
        <form>
            Distância máxima
            <input type="text" size="10" value="<%= request.getAttribute("distancia")%>"><br>
            Valor gasto para abastecer
            <input type="text" size="10" value="<%= request.getAttribute("valor")%>"><br>
            <input type="submit" value="Retornar" onclick="history.back()">
        </form>
    </body>
</html>
