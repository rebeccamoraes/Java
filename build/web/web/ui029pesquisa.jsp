<%-- 
    Document   : ui029pesquisa
    Created on : 22/10/2015, 02:49:52
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <head>
        <title>Pesquisa | DigiMon</title>
        <link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
        <link href='https://fonts.googleapis.com/css?family=Cantarell:400,700' rel='stylesheet' type='text/css'>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="dist/js/novo.js" defer=""></script>
        <script type="text/javascript" src="dist/js/jquery-1.11.3.js" defer=""></script>
    </head>
    <body class="pesquisa">
        <div id="interface">


            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->
            <div id="main">
                <div class="centro" id="centro">

                    <form action="" id="formulario">
                        <div class="teste">
                            <h1>Pesquisa</h1>
                            <input type="search" id="search" placeholder="Pesquise aqui..." />
                            <button class="icon" id="pesquisar"><i class="fa fa-search"></i></button>

                            <div id="selecionar">
                                <input type="button" value="Pesquisar por" class="opcao">
                            </div>
                        </div>
                    </form>
                    <div class="janelaFormulario" id="janelaFormulario">
                        <fieldset>
                            <legend>
                                <label>
                                    <input type="radio" name="sex" value="Transportador" id="transpotadorP">Transportador<br>
                                </label>
                            </legend>
                            <div class="janelaConteudo">
                                <label for="freteP">
                                    <input type="checkbox" value="nomeBanco" id="freteP" name="freteP" disabled class="transportadorP">Frete<br>
                                </label>
                                <label for="veiculoP">
                                    <input type="checkbox" value="nomeBanco" id="veiculoP" name="veiculoP" disabled class="transportadorP">Veículo<br>
                                </label>
                                <label for="motoristaP">
                                    <input type="checkbox" value="nomeBanco" id="motoristaP" name="motoristaP" disabled class="transportadorP">Motorista<br>
                                </label>
                            </div>
                        </fieldset>
                        <fieldset>
                            <legend>
                                <label for="orgaoP">
                                    <input type="radio" name="sex" value="female" id="orgaoP">Orgão
                                </label>	
                            </legend>
                            <div class="janelaConteudo">
                                <label for="postoP">
                                    <input type="checkbox" value="nomeBanco" id="postoP" name="postoP" disabled class="orgaoP">Posto<br>
                                </label>
                                <label for="rodoviaP">
                                    <input type="checkbox" value="nomeBanco" id="rodoviaP" name="rodoviaP" disabled class="orgaoP">Rodovia<br>
                                </label>
                                <label for="transportadorP">
                                    <input type="checkbox" value="nomeBanco" id="transportadorP" name="transportadorP" disabled class="orgaoP">Transportador<br>
                                </label>
                                <label for="cameraP">
                                    <input type="checkbox" value="nomeBanco" id="cameraP" name="cameraP" disabled class="orgaoP">Câmera<br>
                                </label>
                                <label for="balancaP">
                                    <input type="checkbox" value="nomeBanco" id="balancaP" name="balancaP" disabled class="orgaoP">Balança<br>
                                </label>
                            </div>
                        </fieldset>
                        <fieldset>
                            <legend>
                                <label for="pesagemP">
                                    <input type="radio" name="sex" value="female" id="pesagemP">Posto Pesagem
                                </label>
                            </legend>
                            <div class="janelaConteudo">
                                <label for="pesagemPP">
                                    <input type="checkbox" value="nomeBanco" id="pesagemPP" name="pesagemP" disabled class="pesagemP">Pesagem
                                </label>
                            </div>
                        </fieldset>
                        <div class="fechar" id="fechar">Ok</div>	

                    </div>

                </div>
                <!--
                       <h1>Teste de Pesquisa</h1>
                       <input type="text" name="nome" id="pesquisar" ><span id="x_nomeJ" class="tSpan"></span>
                       <img src="dist/imagens/lupa.png" id="lupa">
       
               
                <!--BOTÕES-
                <div class="botoes" id="botoes">
                        <input type="reset" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ">
                        <input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
                </div>
                --FIM BOTÕES-->	



                <!--AQUI TERMINA A PARTE EDITÁVEL-->

                <div id="clear"></div>
            </div>
            <div id="rodape">
                <div class="main">
                    <div id="footer">
                        &copy 2015 - Projeto Digimon | Forsoft Rio
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>