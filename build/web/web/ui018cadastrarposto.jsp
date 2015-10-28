<%-- 
    Document   : ui018cadastrarposto
    Created on : 22/10/2015, 00:12:34
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <head>
        <title>Consultar Posto | DigiMon</title>
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
                    <h1>Cadastro de Posto</h1>
                    <form action="#" method="post" id="formularioJ">
                        <fieldset>
                            <legend>Dados Endereço</legend>
                            <div class="campo"> 
                                <label for="logradouroJ">Logradouro:</label><br> 
                                <input type="text" name="logradouro" id="logradouroJ"  class= "campoObrig" placeholder="Ex: Rua, Av" size="46" maxlength="30"><span id="x_logradouroJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="numeroJ">Número:</label><br> 
                                <input type="text" name="numero" id="numeroJ"  class="campoObrig" maxlength="9" ><span id="x_numeroJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="complementoJ">Complemento:</label><br> 
                                <input type="text" name="complemento" id="complementoJ"  class="campoObrig"  placeholder="Ex. bloco A" size="20" maxlength="10" ><span id="x_complementoJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="bairroJ">Bairro:</label><br> 
                                <input type="text" name="bairro" id="bairroJ"  placeholder="Ex: Centro" class="campoObrig" maxlength="20" size="30"><span id="x_bairroJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="cepJ">CEP:</label><br> 
                                <input type="text" name="cep" id="cepJ"  class="campoObrig" placeholder="_____-___" maxlength="10" size="10"><span id="x_cepJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="cidadeJ">Cidade:</label><br> 
                                <input type="text" name="cidade" id="cidadeJ"  class="campoObrig" maxlength="30" placeholder="Ex: São Paulo" size="27"><span id="x_cidadeJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="ufJ">UF</label><br> 
                                <select id="ufJ" name="uf" > 
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
                                </select><span id="x_ufJ" class="tSpan"></span>
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
