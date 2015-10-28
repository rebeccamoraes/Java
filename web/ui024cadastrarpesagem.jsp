<%-- 
    Document   : ui024cadastrarpesagem
    Created on : 22/10/2015, 00:14:03
    Author     : Luiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
    <!-- Head -->
        <%@ include file="head.jsp" %>
    <!-- fim Head -->
    <body class="insideSystem ui024">
        <div id="interface">
            <!-- begin header -->
            <%@ include file="header.jsp" %>  
            <!-- end header -->
            <span id="titlePag">Cadastrar Pesagem | DigiMon</span>
            
            <div id="main">
                <div class="centro">

                    <!-- =======================NÃO EDITE ACIMA ====================-->

                    <h1>Cadastro de Pesagem</h1>	
                    <form name="form" method="post" action="#" id="formularioJ" class="formulario">	
								
                        <fieldset>
							<legend>Dados da Pesagem</legend>
							<div class="campo"> 
								<label for="dataHoraJ">Data e Hora:</label><br> 
								<input type="text" name="dataHora" id="dataHoraJ" class="campoObrig" maxlength="10" placeholder="Data e Hora"><span id="x_dataHoraJ" class="tSpan"></span>
							</div>
							<div class="campo"> 
								<label for="pbtJ">PBT:</label><br> 
								<input type="text" name="pbt" id="pbtJ" class="campoObrig"  placeholder="Peso Bruto Total"><span id="x_pbtJ" class="tSpan"></span>
							</div>
							<div class="campo"> 
								<label for="pesoEixoJ">Peso Eixo:</label><br> 
								<input type="text" name="pesoEixo" id="pesoEixoJ" class="campoObrig" placeholder="Peso Eixo"><span id="x_pesoEixoJ" class="tSpan"></span>
							</div>
							<br>
							<div class="campo">
									<label for="transbordoJ">Transbordo:</label><br> 
										<select id="transbordoJ" name="transbordo"> 
											<option  value="s">Sim</option>
											<option selected value="n">Não</option>
										</select><span id="x_transbordoJ" class="tSpan"></span>
							</div>
							<div class="campo">
									<label for="remanejamentoJ">Remanejamento:</label><br> 
										<select id="remanejamentoJ" name="remanejamento"> 
											<option  value="s">Sim</option>
											<option selected value="n">Não</option>
										</select><span id="x_remanejamentoJ" class="tSpan"></span>
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
							<div class="campo">
								<label for="idVeiculoJ">ID Veículo:</label><br>
									<select id="idVeiculoJ" name="idVeiculo" class="campoObrig">
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
									</select><span id="x_idVeiculoJ" class="tSpan"></span>
							</div>
							
						</fieldset>
		
						<div class="botoes" id="botoes">
							
							<input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
							<input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
						</div>
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