
   _$("pesquisaJ").onchange = function x (){
   var pesquisa = _$("pesquisaJ").value;
   if(pesquisa == "Veiculo"){
        aparece("formVeiculo");
        localStorage.setItem('filtro', 'Veiculo');
   }else{
       fechar("formVeiculo");
   }
   if(pesquisa == "Motorista"){
       aparece("formMotorista");   
       localStorage.setItem('filtro', 'Motorista');
   }else{
       fechar("formMotorista");
   }
   if(pesquisa == "Transportador"){
       aparece("formTransportador");   
       localStorage.setItem('filtro', 'Transportador');
   }else{
       fechar("formTransportador");
   }
   if(pesquisa == "PJ"){
       aparece("formPJ");   
       localStorage.setItem('filtro', 'PJ');
   }else{
       fechar("formPJ");
   }
   if(pesquisa == "Carga"){
       aparece("formCarga");   
       localStorage.setItem('filtro', 'Carga');
   }else{
       fechar("formCarga");
   }
   if(pesquisa == "PF"){
       aparece("formPF");   
       localStorage.setItem('filtro', 'PF');
   }else{
       fechar("formPF");
   }
   if(pesquisa == "Produto"){
       aparece("formProduto");   
       localStorage.setItem('filtro', 'Produto');
   }else{
       fechar("formProduto");
   }
   if(pesquisa == "Frete"){
       aparece("formFrete");   
       localStorage.setItem('filtro', 'Frete');
   }else{
       fechar("formFrete");
   }
   
}

   window.onload = function pesquisa(){
    var filtro = localStorage.getItem('filtro');
    _$("pesquisaJ").value = filtro;
    aparece("form" + filtro);
    
    var _gebt = document.getElementsByTagName("li")
	
	for (var i = 1; i < _gebt.length; i++) {
		_gebt[i].onmousemove = function x(){
			aparece("darkBox");
		}
		
		_$("menu").onmouseout = function y(){
			fechar("darkBox");
		}
	}
 }