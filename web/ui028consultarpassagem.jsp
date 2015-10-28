<%-- 
    Document   : ui028consultarpassagem
    Created on : 22/10/2015, 00:16:12
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
            <span id="titlePag">Consultar Pesagem | DigiMon</span>
            
            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Consulta de Passagem</h1>
                    <form name="form" method="post" action="#" id="formularioJ" class="formulario">	
                        <fieldset>
                            <legend>Dados da passagem</legend><br>                          
                            <div class="campo">
                                <label for="dataJ">Data:</label><br>
                                <input type="text" name="data" id="dataJ" disabled class="campoObrig"><span class="tSpan" id="x_dataJ"></span>
                            </div>
                            <div class="campo">
                                <label for="horaJ">Hora:</label><br> 
                                <input type="text" name="hora" id="horaJ" disabled class="campoObrig"><span class="tSpan" id="x_dataHoraJ"></span>
                            </div>                            
                            <div class="campo">
				<label for="idCameraJ">ID Câmera</label><br>
                                    <select id="idCameraJ" name="idCamera" class="campoObrig">
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
				</select><span id="x_idCameraJ" class="tSpan"></span>
                            </div>
                            <div class="campo">
				<label for="idVeículoJ">ID Veículo:</label><br>
                                    <select id="idVeículoJ" name="idVeiculo" class="campoObrig">
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
				</select><span id="x_idVeículoJ" class="tSpan"></span>
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
           <!-- Include do footer -->
             <%@ include file="footer.jsp" %> 
        <!-- Fim do include do footer-->
    </body>
</html>