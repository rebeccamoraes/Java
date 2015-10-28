<%-- 
    Document   : ui027consultarcamera
    Created on : 22/10/2015, 00:15:26
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <head>
        <title>Consulta de Câmera | DigiMon</title>
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

                    <h1>Consulta de Câmera</h1>
                    <form action="#" method="post" id="formularioJ">
                        <fieldset>
                            <legend>Dados da Câmera</legend><br>
                            <div class="campo"> 
                                <label for="idJ">ID da Câmera:</label> <br>
                                <input type="text" name="id" class="campoObrig iLetras"  maxlength="20" id="idJ" size="32" disabled ><span id="x_idJ" class="tSpan"></span>
                            </div>

                            <div class="campo"> 
                                <label for="fabricanteJ">Fabricante :</label> <br>
                                <input type="text" name="fabricante" class="campoObrig iLetras"  maxlength="20" id="fabricanteJ" size="31" ><span id="x_fabricanteJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="modeloJ">Modelo:</label> <br>
                                <input type="text" name="modelo" class="campoObrig" maxlength="20" id="modeloJ" size="32" ><span id="x_modeloJ" class="tSpan" ></span>
                            </div>
                            <div class="campo"> 
                                <label for="numserieJ">Número de Série:</label> <br>
                                <input type="text" name="numserie" class="campoObrig" maxlength="15" id="numserieJ" size="31" ><span id="x_numserieJ" class="tSpan" ></span>
                            </div>
                            <div class="campo"> 
                                <label for="latitudeJ">Latitude:</label> <br>
                                <input type="text" name="latitude" class="campoObrig" id="latitudeJ" size="32"  ><span id="x_latitudeJ" class="tSpan" ></span>
                            </div>
                            <div class="campo"> 
                                <label for="longitudeJ">Longitude:</label> <br>
                                <input type="text" name="longitude" class="campoObrig" id="longitudeJ" size="31"><span id="x_longitudeJ" class="tSpan" ></span>
                            </div>

                        </fieldset>
                        <fieldset>
                            <legend> Dados da Rodovia</legend> <br>
                            <div class="campo"> 
                                <label for="nomeJ">Nome:</label> <br>
                                <input type="text" name="nome" class="campoObrig iLetras" maxlength="40" id="nomeJ" size="40"  ><span id="x_nomeJ" class="tSpan"></span>
                            </div>

                            <div class="campo"> 
                                <label for="nomeJ">Extensão km :</label> <br>
                                <input type="text" name="extensaokm" class="campoObrig"   id="extensaokmJ"  size="23" ><span id="x_extensaokmJ" class="tSpan"></span>
                            </div>
                            <br>
                            <div class="campo"> 
                                <label for="nomeJ">Cidade Inicial:</label><br> 
                                <input type="text" name="cidadeInicial" class="campoObrig" maxlength="40" id="cidadeInicialJ" size="40" ><span id="x_cidadeInicialJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="ufIncialJ">UF Inicial:</label> <br>						
                                <select id="ufIncialJ" name="ufInicial" >
                                    <option value="AC">AC</option> 
                                    <option value="AL">AL</option> 
                                    <option value="AM">AM</option> 
                                    <option value="AP">AP</option> 
                                    <option value="BA">BA</option> 
                                    <option value="CE">CE</option> 
                                    <option value="DF">DF</option> 
                                    <option value="ES">ES</option> 
                                    <option value="GO">GO</option> 
                                    <option value="MA">MA</option> 
                                    <option value="MT">MT</option> 
                                    <option value="MS">MS</option> 
                                    <option value="MG">MG</option> 
                                    <option value="PA">PA</option> 
                                    <option value="PB">PB</option> 
                                    <option value="PR">PR</option> 
                                    <option value="PE">PE</option> 
                                    <option value="PI">PI</option> 
                                    <option value="RJ" selected>RJ</option> 
                                    <option value="RN">RN</option> 
                                    <option value="RO">RO</option> 
                                    <option value="RS">RS</option> 
                                    <option value="RR">RR</option> 
                                    <option value="SC">SC</option> 
                                    <option value="SE">SE</option> 
                                    <option value="SP">SP</option> 
                                    <option value="TO">TO</option>								
                                </select>
                            </div>

                            <div class="campo">
                                <label for="nomeJ">Cidade Final:</label> <br>
                                <input type="text" name="cidadeFinal" class="campoObrig" maxlength="40" id="cidadeFinalJ" size="40" > <span id="x_cidadeFinalJ" class="tSpan"></span>
                            </div>

                            <div class="campo"> 
                                <label for="ufFinalJ">UF Final:</label><br> 								
                                <select id="ufFinalJ" name="ufFinal" >
                                    <option value="AC">AC</option> 
                                    <option value="AL">AL</option> 
                                    <option value="AM">AM</option> 
                                    <option value="AP">AP</option> 
                                    <option value="BA">BA</option> 
                                    <option value="CE">CE</option> 
                                    <option value="DF">DF</option> 
                                    <option value="ES">ES</option> 
                                    <option value="GO">GO</option> 
                                    <option value="MA">MA</option> 
                                    <option value="MT">MT</option> 
                                    <option value="MS">MS</option> 
                                    <option value="MG">MG</option> 
                                    <option value="PA">PA</option> 
                                    <option value="PB">PB</option> 
                                    <option value="PR">PR</option> 
                                    <option value="PE">PE</option> 
                                    <option value="PI">PI</option> 
                                    <option value="RJ" selected>RJ</option> 
                                    <option value="RN">RN</option> 
                                    <option value="RO">RO</option> 
                                    <option value="RS">RS</option> 
                                    <option value="RR">RR</option> 
                                    <option value="SC">SC</option> 
                                    <option value="SE">SE</option> 
                                    <option value="SP">SP</option> 
                                    <option value="TO">TO</option>								
                                </select>

                            </div><br>

                        </fieldset>
                        <div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ALTERAR" name="enviar" id="enviarJ" class="botaoJ">
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