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
                            <label for="fabricanteJ">Fabricante :</label> <br>
                            <input type="text" name="fabricante" class="campoObrig iLetras"  maxlength="20" id="fabricanteJ"><span id="x_fabricanteJ" class="tSpan"></span>
                        </div><br>
                        <div class="campo"> 
                            <label for="modeloJ">Modelo:</label> <br>
                            <input type="text" name="modelo" class="campoObrig" maxlength="20" id="modeloJ"><span id="x_modeloJ" class="tSpan"></span>
                        </div><br>
                        <div class="campo"> 
                            <label for="numserieJ">Número de Série:</label> <br>
                            <input type="text" name="numserie" class="campoObrig" maxlength="15" id="numserieJ" ><span id="x_numserieJ" class="tSpan"></span>
                        </div><br>
						<div class="campo">
							<label for="idRodoviaJ" >ID Rodovia:</label><br>
								<select id="idRodoviaJ" name="idRodovia" class="campoObrig">
										<option value="01">0001</option>
										<option value="02">0002</option>
										<option value="03">0003</option>
										<option value="04">0004</option>
										<option value="05">0005</option>
										<option value="06">0006</option>
										<option value="07">0007</option>
										<option value="08">0008</option>
										<option value="09">0009</option>
										<option value="10">0010</option>
								</select><span id="x_idRodoviaJ" class="tSpan"></span>
						</div><br>
						<div class="campo">
							<label for="kmJ">Km:</label><br>
							<input type="text" name="km" class="campoObrig" id="kmJ" size="20" ><span id="x_kmJ" class="tSpan"></span>
						</div><br>
					</fieldset>	
					<fieldset>
						<legend>Dados de Localização</legend>
						<br>
						<div class="campo"> 
							<label for="latitudeJ">Latitude:</label> <br>
							<input type="text" name="latitude" class="campoObrig" id="latitudeJ" ><span id="x_latitudeJ" class="tSpan"></span>
						</div><br>
						<div class="campo"> 
							<label for="longitudeJ">Longitude:</label> <br>
							<input type="text" name="longitude" class="campoObrig" id="longitudeJ" ><span id="x_longitudeJ" class="tSpan"></span>
						</div><br>
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