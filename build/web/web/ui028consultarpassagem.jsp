<%-- 
    Document   : ui028consultarpassagem
    Created on : 22/10/2015, 00:16:12
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <head>
        <title>Consulta de Passagem | DigiMon</title>
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

                    <h1>Consulta de Passagem</h1>
                    <form name="form" method="post" action="#" id="formularioJ" class="formulario">	
                        <fieldset>
                            <legend>Dados da passagem</legend><br>
                            <div class="campo">
                                <label for="idPassagemJ">Id Passagem:</label><br>
                                <input type="text" name="idPassagem" id="idPassagemJ" disabled class="campoObrig iLetras"><span class="tSpan" id="x_idPassagemJ"></span>
                            </div>
                            <div class="campo">
                                <label for="placaJ">Placa do Veículo:</label><br>
                                <input type="text" name="placa" id="placaJ" disabled class="campoObrig"><span class="tSpan" id="x_placaJ"></span>
                            </div>
                            <div class="campo">
                                <label for="dataJ">Data:</label><br>
                                <input type="text" name="data" id="dataJ" disabled class="campoObrig"><span class="tSpan" id="x_dataJ"></span>
                            </div><br>
                            <div class="campo">
                                <label for="horaJ">Hora:</label><br> 
                                <input type="text" name="hora" id="horaJ" disabled class="campoObrig"><span class="tSpan" id="x_dataHoraJ"></span>
                            </div>
                        </fieldset>
                        <fieldset>
                            <legend>Local da passagem</legend><br>
                            <div class="campo">
                                <label for="rodoviaJ">Rodovia:</label><br>
                                <input type="text" name="rodovia" id="rodoviaJ" disabled class="campoObrig iLetras"><span class="tSpan" id="x_rodoviaJ"></span>
                            </div>
                            <div class="campo">
                                <label for="kmJ">Km:</label><br>
                                <input type="text" name="km" id="kmJ" disabled class="campoObrig"><span class="tSpan" id="x_kmJ"></span>
                            </div>
                            <div class="campo">
                                <label for="latitudeJ">Latitude:</label><br>
                                <input type="text" name="latitude" id="latitudeJ" disabled class="campoObrig"><span class="tSpan" id="x_latitudeJ"></span>
                            </div>
                            <div class="campo">
                                <label for="longitudeJ">Longitude:</label><br> 
                                <input type="text" name="longitude" id="longitudeJ" disabled class="campoObrig"><span class="tSpan" id="x_longitudeJ"></span>
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