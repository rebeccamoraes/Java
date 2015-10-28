<%-- 
    Document   : ui017consultarbalanca
    Created on : 22/10/2015, 00:11:51
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <!-- Head -->
        <%@ include file="head.jsp" %>
    <!-- fim Head -->
    <body class="insideSystem">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->
            <span id="titlePag">Consultar Balança | DigiMon</span>

            
            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Consulta de Balança</h1>
                    <form action="#" method="post" id="formularioJ">
                        <fieldset>
                            <legend>Dados Balança</legend>
                            <div class="campo">
                                <label for="idBalancaJ">ID da Balança:</label><br>
                                <input type="text" name="idBalanca" id="idBalancaJ" class="campoObrig" disabled><span id="x_idBalancaJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="numSerieJ">Número Série:</label><br> 
                                <input type="text" name="numSerie" id="numSerieJ"  class="campoObrig" ><span id="x_numSerieJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="fabricanteJ">Fabricante:</label><br> 
                                <input type="text" name="fabricante" id="fabricanteJ" maxlength="20" class="campoObrig" ><span id="x_fabricanteJ" class="tSpan"></span>
                            </div>
                            <div class="campo"> 
                                <label for="modeloJ">Modelo:</label><br> 
                                <input type="text" name="modelo" id="modeloJ" maxlength="20" class="campoObrig" ><span id="x_modeloJ" class="tSpan"></span>
                            </div>
                            <div class="campo">
				<label for="idPostoJ">ID Posto:</label><br>
                                    <select id="idPostoJ" name="idPosto" class="campoObrig">
						<option value="01">01</option>
						<option value="02">02</option>
						<option value="03">03</option>
						<option value="04">04</option>
						<option value="05">05</option>
						<option value="06">06</option>
						<option value="07">07</option>
						<option value="08">08</option>
						<option value="09">09</option>
						<option value="10">10</option>
				</select><span id="x_idPostoJ" class="tSpan"></span>
			</div>
                        </fieldset>
                       

                        <!--BOTÕES-->
                        <div class="botoes" id="botoes">
                            <input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
                            <input type="submit" value="ALTERAR" name="enviar" id="enviarJ" class="botaoJ">
                        </div>
                        <!--FIM BOTÕES-->	

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