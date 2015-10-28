<%-- 
    Document   : ui002login
    Created on : 22/10/2015, 03:38:55
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br" class="initial">
    <!-- Head -->
        <%@ include file="head.jsp" %>
    <!-- fim Head -->
    <body class="login">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="headerhome.jsp" %>  
            <!-- end header -->
            <span id="titlePag">Login | DigiMon</span>

            <div id="main">
				<a href="#"><img src="dist/imagens/teste.png" width="320" height="105" class="logo" id="logoo" alt="Logo"/></a>
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <img src="dist/imagens/iconeLogin.png" alt="Icone Login" class="iconeLogin"/>
                    <form name="form" method="post" action="#" id="formularioJ" class="formulario">
                        <div class="campo"> 
                            <input type="text" name="usuario" placeholder="usuario" id="usuarioJ" class="campoObrig" maxlength="15"><span id="x_usuarioJ" class="tSpan"></span></br>
                        </div></br>
                        <div class="campo">
                            <input type="password" name="senha" placeholder="senha" id="senhaJ" class="campoObrig" maxlength="15"><span id="x_senhaJ" class="tSpan"></span>
                        </div>

                        <div class="botoes" id="botoes">
                            <p><a href="http://www2.projetodigimon.com.br/ui031recuperarsenha.cshtml">Esqueci minha senha</a></p>
                            <input type="submit" value="Entrar" name="entrar" id="entrarJ" class="botaoJ">
                        </div>
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