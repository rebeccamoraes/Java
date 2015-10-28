<%-- 
    Document   : ui002login
    Created on : 22/10/2015, 03:38:55
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br" class="initial">
    <head>
        <title>Login | DigiMon</title>
        <link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
        <link href='https://fonts.googleapis.com/css?family=Cantarell:400,700' rel='stylesheet' type='text/css'>
        <link rel="icon" type="image/png" sizes="32x32" href="dist/imagens/favicon-32x32.png">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="dist/js/novo.js" defer=""></script>
    </head>
    <body class="login">
        <div id="interface">
            <div id="header">
                <div class="main">
                    <ul class="menu" id="menu">
                    <li><a href="inicio.jsp">Home</a></li>
					<li><a href="ui001sobre.jsp">Sobre</a></li>
					<li><a href="ui003contato.jsp">Contato </a></li>
					<li><a href="http://www2.projetodigimon.com.br/ui004cadastrotac.cshtml ">Registre-se</a></li> 
					<li><a href="ui002login.jsp">Login</a></li>
				</div>

            </div><!-- Fim da div header -->

            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <img src="dist/imagens/iconeLogin.png" alt="Icone Login" class="iconeLogin"/>
                    <form name="form" method="post" action="#" id="formularioJ" class="formulario">
                        <div class="campo"> 
                            <input type="text" name="usuario" placeholder="usuario" id="usuarioJ" class="campoObrig"><span id="x_usuarioJ" class="tSpan"></span></br>
                        </div></br>
                        <div class="campo">
                            <input type="password" name="senha" placeholder="senha" id="senhaJ" class="campoObrig"><span id="x_senhaJ" class="tSpan"></span>
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