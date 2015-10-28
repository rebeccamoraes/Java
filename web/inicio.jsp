<%-- 
    Document   : index
    Created on : 21/10/2015, 23:52:09
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br" class="initial">
    <!-- Head -->
        <%@ include file="head.jsp" %>
    <!-- fim Head -->
    <body class="home">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="headerhome.jsp" %>  
            <!-- end header -->
            <span id="titlePag">Bem-Vindo | DigiMon</span>
            <div id="main">
                <div class="centro" >
                    <div class="logo">
                        <img src="dist/imagens/teste.png"  id="logoo" alt="Logo"/><br>
                        <span class="saibaMais">Saiba Mais</span>
                    </div>
                </div><!--Fim div centro-->		
                <div id="clear"></div><!--Fim div clear-->
            </div><!--Fim div main conteúdo-->	
            <!-- Include do footer -->
                <%@ include file="footer.jsp" %> 
            <!-- Fim do include do footer-->
    </body>
</html>
