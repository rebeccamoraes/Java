<%-- 
    Document   : ui003contato
    Created on : Oct 22, 2015, 3:52:51 PM
    Author     : md10
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
            <span id="titlePag">Contato | DigiMon</span>

            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Fale Conosco</h1>
                    <form action="#" method="post" id="formularioJ">
                        ----------------------------------------------------------------------------------------------------------------------------------------
                        <div class="rc">
                            <div class="campo">
                                <label for="nomeJ">Nome:</label><br> 
                                <input type="text" size="45" name="nome" id="nomeJ" class="campoObrig iLetras" maxlength="40"><span id="x_nomeJ" class="tSpan"></span>
                            </div><br>
                            <div class="campo"> 
                                <label for="telefoneJ">Telefone:</label><br> 
                                <input type="text" size="14" name="telefone" id="telefoneJ"  class="campoObrig" maxlength="14"><span id="x_telefoneJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="emailJ">Email:</label><br> 
                                <input type="text" size="24" name="email" id="emailJ"  class="campoObrig" maxlength="100"><span id="x_emailJ" class="tSpan"></span>
                            </div>
                            <br>
                            <div class="campo">
                                <label for="assuntoJ">Assunto:</label><br>
                                <input type="text" name="assunto" id="assuntoJ"  class="campoObrig" maxlength="40"><span id="x_assuntoJ" class="tSpan"></span>
                            </div>
                            <br>
                            <div class="campo">
                                <textarea name="comentario" placeholder="Insira aqui a sua mensagem..." rows="13" cols="54"  class="campoObrig"></textarea><span id="x_comentarioJ" class="tSpan"></span>

                            </div>
                        </div>				
                        ----------------------------------------------------------------------------------------------------------------------------------------
                        <div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                        </div><!--Fim div botoes-->
                    </form>



                    <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->

                </div><!--Fim div centro-->		
                <div id="clear"></div><!--Fim div clear-->
            </div><!--Fim div main conteúdo-->	
            <!-- Include do footer -->
                <%@ include file="footer.jsp" %> 
            <!-- Fim do include do footer-->
    </body>
</html>