<%-- 
    Document   : ui024cadastrarpesagem
    Created on : 22/10/2015, 00:14:03
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <head>
        <title>Registrar Pesagem| DigiMon</title>
        <link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
        <link href='https://fonts.googleapis.com/css?family=Cantarell:400,700' rel='stylesheet' type='text/css'>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="dist/js/novo.js" defer=""></script>
    </head>
    <body class="insideSystem">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->

            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Cadastro de Pesagem</h1>	
                    <form name="form" method="post" action="#" id="formularioJ" class="formulario">	

                        <fieldset>
                            <legend>Dados da Pesagem</legend>
                            <div class="campo"> 
                                <label for="dataJ">Data:</label><br> 
                                <input type="text" name="data" id="dataJ" class="campoObrig" maxlength="10" placeholder="Data"><span id="x_dataJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="horaJ">Hora:</label><br> 
                                <input type="text" name="hora" id="horaJ" class="campoObrig" maxlength="8" placeholder="Hora"><span id="x_horaJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="pbtJ">PBT:</label><br> 
                                <input type="text" name="pbt" id="pbtJ" class="campoObrig"  placeholder="Peso Bruto Total"><span id="x_pbtJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="pesoEixoJ">Peso Eixo:</label><br> 
                                <input type="text" name="pesoEixo" id="pesoEixoJ" class="campoObrig" placeholder="Peso Eixo"><span id="x_pesoEixoJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="idPostoJ">ID Posto:</label><br> 
                                <input type="text" name="idPosto" id="idPostoJ" class="campoObrig" placeholder="ID Posto"><span id="x_idPostoJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="idVeiculoJ">ID Veiculo:</label><br> 
                                <input type="text" name="idVeiculo" id="idVeiculoJ" class="campoObrig"  placeholder="ID Veículo"><span id="x_idVeiculoJ" class="tSpan"></span>
                            </div>

                        </fieldset>

                        <div class="botoes" id="botoes">
                            <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
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