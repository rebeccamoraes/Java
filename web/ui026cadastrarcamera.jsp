<%-- 
    Document   : ui026cadastrarcamera
    Created on : 22/10/2015, 00:15:10
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <!-- Head -->
        <%@ include file="head.jsp" %>
    <!-- fim Head -->
    <body class="insideSystem ui025">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->
            <span id="titlePag">Cadastrar Câmera | DigiMon</span>
            
            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Cadastro de Câmera</h1>
                    <form action="#" method="post" id="formularioJ">
					<fieldset>
						<legend>Dados da Câmera</legend><br>
						<div class="campo"> 
                            <label for="fabricanteJ">Fabricante :</label> <br>
                            <input type="text" name="fabricante" class="campoObrig iLetras"  maxlength="20" id="fabricanteJ"><span id="x_fabricanteJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="modeloJ">Modelo:</label> <br>
                            <input type="text" name="modelo" class="campoObrig" maxlength="20" id="modeloJ"><span id="x_modeloJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="numserieJ">Número de Série:</label> <br>
                            <input type="text" name="numserie" class="campoObrig" maxlength="15" id="numserieJ" ><span id="x_numserieJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="latitudeJ">Latitude:</label> <br>
                            <input type="text" name="latitude" class="campoObrig" id="latitudeJ" ><span id="x_latitudeJ" class="tSpan"></span>
                        </div>
                        <div class="campo"> 
                            <label for="longitudeJ">Longitude:</label> <br>
                            <input type="text" name="longitude" class="campoObrig" id="longitudeJ" ><span id="x_longitudeJ" class="tSpan"></span>
                        </div>
						<div class="campo"> 
                            <label for="kmJ">Km:</label> <br>
                            <input type="text" name="km" class="campoObrig" id="kmJ" ><span id="x_kmJ" class="tSpan"></span>
                        </div>
						<div class="campo">
							<label for="idRodoviaJ">ID Rodovia:</label><br>
								<select id="idRodoviaJ" name="idRodovia" class="campoObrig">
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
								</select><span id="x_idRodoviaJ" class="tSpan"></span>
						</div>
						
					</fieldset>					
					
					<div class="botoes" id="botoes">
						<input type="reset" value="Cancelar" name="Limpar" id="limparJ" class="botaoJ">
						<input type="submit" value="Enviar" name="enviar" id="enviarJ" class="botaoJ">
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