<%-- 
    Document   : ui003contato
    Created on : Oct 22, 2015, 3:52:51 PM
    Author     : md10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br" class="initial">
    <head>
        <title>Contato | DigiMon</title>
        <link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
        <link href='https://fonts.googleapis.com/css?family=Cantarell:400,700' rel='stylesheet' type='text/css'>
        <link rel="icon" type="image/png" sizes="32x32" href="dist/imagens/favicon-32x32.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="dist/js/novo.js" defer=""></script>
    </head>
    <body class="home">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="headerhome.jsp" %>  
            <!-- end header -->


            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h2>Fale Conosco</h2>
                    <form action="#" method="post" id="formularioJ">
                        <fieldset>
                            <div class="rc">
                                <div class="campo">
                                    <label for="nomeJ">Nome:</label><br> 
                                    <input type="text" size="45" name="nome" id="nomeJ"><span id="x_nomeJ" class=""></span>
                                </div><br>
                                <div class="campo"> 
                                    <label for="telefoneJ">Telefone:</label><br> 
                                    <input type="text" size="14" name="telefone" id="telefoneJ"><span id="x_telefoneJ" class=""></span>
                                </div>
                                <div class="campo"> 
                                    <label for="emailJ">Email:</label><br> 
                                    <input type="text" size="24" name="email" id="emailJ"><span id="x_emailJ" class=""></span>
                                </div>
                                <div class="campo">
                                    <textarea name="comentário" placeholder="Insira aqui a sua mensagem..." rows="13" cols="54"></textarea>

                                </div>
                            </div>				
                        </fieldset>
                        <div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                        </div><!--Fim div botoes-->
                    </form>



                    <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->

                </div><!--Fim div centro-->		
                <div id="clear"></div><!--Fim div clear-->
            </div><!--Fim div main conteúdo-->	
            <div id="rodape">
                <div class="main">
                    <div id="footer">
                        &copy 2015 - Projeto Digimon | Forsoft Rio
                    </div><!--Fim div Footer-->
                </div><!--Fim div main do rodape-->
            </div><!--Fim div "rodape"-->
        </div><!--Fim div Interface-->
    </body>
</html>