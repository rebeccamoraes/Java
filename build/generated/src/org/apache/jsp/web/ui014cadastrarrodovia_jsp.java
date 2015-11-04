package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ui014cadastrarrodovia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/web/head.jsp");
    _jspx_dependants.add("/web/header.jsp");
    _jspx_dependants.add("/web/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <title>Bem-Vindo | DigiMon</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"dist/css/estilo.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"dist/imagens/favicon-32x32.png\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <script type=\"text/javascript\" src=\"dist/js/novo.js\" defer=\"\"></script>\n");
      out.write("</head>");
      out.write("\n");
      out.write("<body class=\"insideSystem\">\n");
      out.write("    <div id=\"interface\">\n");
      out.write("        <span id=\"titlePag\">Cadastrar Rodovia | DigiMon</span>\n");
      out.write("        <!-- begin header -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <a href=\"ui005home.jsp\"><img src=\"dist/imagens/logoo.png\" class=\"logo\" id=\"logoo\" alt=\"Logo\"/></a>\n");
      out.write("        <ul class=\"menu\" id=\"menu\">\n");
      out.write("            <li><a href=\"ui005home.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"#\">Transportador<img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de transportador\"/></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Frete<img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Frete\"/></a>\n");
      out.write("                        <!--Criação da class submenu-->\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"http://www2.projetodigimon.com.br/Home/ui006cadastrarfrete\">Cadastrar</a></li>\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Veículo <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Veículo\"/></a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"http://www2.projetodigimon.com.br/Home/ui008cadastrarveiculo\">Cadastrar</a></li>\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Motorista <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Motorista\"/></a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"http://www2.projetodigimon.com.br/Home/ui020cadastrarmotorista\">Cadastrar</a></li>\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#\">ANTT / DNIT <img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Órgão\"/></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Posto de Pesagem<img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Posto\"/></a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"ui018cadastrarposto.jsp\">Cadastrar</a></li>\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Rodovia <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Rodovia\"/></a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"ui014cadastrarrodovia.jsp\">Cadastrar </a></li>\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Transportador <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Transportador\"/></a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"http://www2.projetodigimon.com.br/Home/ui010cadastrartransportador\">Cadastrar </a></li>\n");
      out.write("                            <li><a href=\"http://www2.projetodigimon.com.br/Home/ui011consultartransportador\">Consultar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Câmera <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Câmera\"/></a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"ui026cadastrarcamera.jsp\">Cadastrar </a></li>\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Balança <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Balança\"/></a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"ui016cadastrarbalanca.jsp\">Cadastrar</a></li>\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#\">Posto de Pesagem <img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Pesagem\"/></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Pesagem <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Pesagem\"/></a>\n");
      out.write("                        <ul class=\"submenu\">\n");
      out.write("                            <li><a href=\"ui024cadastrarpesagem.jsp\">Registrar </a></li>\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li> \n");
      out.write("            <li><a href=\"#\">Relatório <img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Relatório\"/></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui030relatorio\">Emitir</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#\">Usuário<img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Usuário\"/></a>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui012cadastrarusuario\">Cadastrar</a></li>\n");
      out.write("                    <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li> \n");
      out.write("            <li><a href=\"#\">Ajuda<img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Ajuda\"/></a>\n");
      out.write("                <ul class=\"penultimo\">\n");
      out.write("                   <li><a href=\"http://www2.projetodigimon.com.br/Home/ui034faleconosco\">Fale Conosco</a></li>\n");
      out.write("                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui033faq\">FAQ</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <!--Aqui tem uma ul diferente-->\n");
      out.write("            <li class=\"last\"><img src=\"dist/imagens/iconeMenu.png\" class=\"iconeMenu\" alt=\"Menu do Usuário\"/>\n");
      out.write("                <ul class=\"last\">\n");
      out.write("                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui032minhaconta\">Minha Conta</a></li>\n");
      out.write("                    <li><a href=\"#\">Sair</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <!--aqui termina a ul do botao sair e minha conta-->\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"darkBox\"></div>\n");
      out.write("</div>");
      out.write("  \n");
      out.write("        <!-- end header -->\n");
      out.write("\n");
      out.write("        <div id=\"main\">\n");
      out.write("            <div class=\"centro\">\n");
      out.write("\n");
      out.write("                <!-- =======================NÃO EDITE ACIMA ====================-->\n");
      out.write("\n");
      out.write("                <h1>Cadastro de Rodovia</h1>\n");
      out.write("                <form action=\"ServletUI014\" method=\"post\" id=\"formularioJ\">\n");
      out.write("                    <fieldset>\n");
      out.write("                        <legend>Dados Rodovia</legend>\n");
      out.write("                        <div class=\"campo\"> \n");
      out.write("                            <label for=\"nomeJ\">Nome:</label><br> \n");
      out.write("                            <input type=\"text\" name=\"nome\" id=\"nomeJ\" class=\"campoObrig\" placeholder=\"Nome da rodovia\" size=\"37\" maxlength=\"6\"><span id=\"x_nomeJ\" class=\"tSpan\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"campo\"> \n");
      out.write("                            <label for=\"extensaoKMJ\">Extensão KM:</label><br> \n");
      out.write("                            <input type=\"text\" name=\"extensaoKm\" id=\"extensaoKMJ\" placeholder=\"km\" class=\"campoObrig\" size=\"10\"><span id=\"x_extensaoKMJ\" class=\"tSpan\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"campo\"> \n");
      out.write("                            <label for=\"cidadeInicialJ\">Cidade Inicial:</label><br> \n");
      out.write("                            <input type=\"text\" name=\"cidadeInicial\" id=\"cidadeInicialJ\" placeholder=\"Cidade Inicial\" size=\"46\" maxlength=\"30\" class=\"campoObrig iLetras\"><span id=\"x_cidadeInicialJ\" class=\"tSpan\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"campo\"> \n");
      out.write("                            <label for=\"ufInicialJ\">UF:</label><br> \n");
      out.write("                            <select id=\"ufInicialJ\" name=\"ufInicial\"> \n");
      out.write("                                <option value=\"AC\">AC</option> \n");
      out.write("                                <option value=\"AL\">AL</option> \n");
      out.write("                                <option value=\"AM\">AM</option> \n");
      out.write("                                <option value=\"AP\">AP</option> \n");
      out.write("                                <option value=\"BA\">BA</option> \n");
      out.write("                                <option value=\"CE\">CE</option> \n");
      out.write("                                <option value=\"DF\">DF</option> \n");
      out.write("                                <option value=\"ES\">ES</option> \n");
      out.write("                                <option value=\"GO\">GO</option> \n");
      out.write("                                <option value=\"MA\">MA</option> \n");
      out.write("                                <option value=\"MT\">MT</option> \n");
      out.write("                                <option value=\"MS\">MS</option> \n");
      out.write("                                <option value=\"MG\">MG</option> \n");
      out.write("                                <option value=\"PA\">PA</option> \n");
      out.write("                                <option value=\"PB\">PB</option> \n");
      out.write("                                <option value=\"PR\">PR</option> \n");
      out.write("                                <option value=\"PE\">PE</option> \n");
      out.write("                                <option value=\"PI\">PI</option> \n");
      out.write("                                <option value=\"RJ\" selected>RJ</option> \n");
      out.write("                                <option value=\"RN\">RN</option> \n");
      out.write("                                <option value=\"RO\">RO</option> \n");
      out.write("                                <option value=\"RS\">RS</option> \n");
      out.write("                                <option value=\"RR\">RR</option> \n");
      out.write("                                <option value=\"SC\">SC</option> \n");
      out.write("                                <option value=\"SE\">SE</option> \n");
      out.write("                                <option value=\"SP\">SP</option> \n");
      out.write("                                <option value=\"TO\">TO</option>\n");
      out.write("                            </select><span id=\"x_ufInicialJ\" class=\"tSpan\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"campo\"> \n");
      out.write("                            <label for=\"cidadeFinalJ\">Cidade Final:</label><br> \n");
      out.write("                            <input type=\"text\" name=\"cidadeFinal\" id=\"cidadeFinalJ\" placeholder=\"Cidade Final\" size=\"46\" maxlength=\"30\" class=\"campoObrig iLetras\"><span id=\"x_cidadeFinalJ\" class=\"tSpan\"></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"campo\"> \n");
      out.write("                            <label for=\"ufFinalJ\">UF:</label><br> \n");
      out.write("                            <select id=\"ufFinalJ\" name=\"ufFinal\"> \n");
      out.write("                                <option value=\"AC\">AC</option> \n");
      out.write("                                <option value=\"AL\">AL</option> \n");
      out.write("                                <option value=\"AM\">AM</option> \n");
      out.write("                                <option value=\"AP\">AP</option> \n");
      out.write("                                <option value=\"BA\">BA</option> \n");
      out.write("                                <option value=\"CE\">CE</option> \n");
      out.write("                                <option value=\"DF\">DF</option> \n");
      out.write("                                <option value=\"ES\">ES</option> \n");
      out.write("                                <option value=\"GO\">GO</option> \n");
      out.write("                                <option value=\"MA\">MA</option> \n");
      out.write("                                <option value=\"MT\">MT</option> \n");
      out.write("                                <option value=\"MS\">MS</option> \n");
      out.write("                                <option value=\"MG\">MG</option> \n");
      out.write("                                <option value=\"PA\">PA</option> \n");
      out.write("                                <option value=\"PB\">PB</option> \n");
      out.write("                                <option value=\"PR\">PR</option> \n");
      out.write("                                <option value=\"PE\">PE</option> \n");
      out.write("                                <option value=\"PI\">PI</option> \n");
      out.write("                                <option value=\"RJ\" selected>RJ</option> \n");
      out.write("                                <option value=\"RN\">RN</option> \n");
      out.write("                                <option value=\"RO\">RO</option> \n");
      out.write("                                <option value=\"RS\">RS</option> \n");
      out.write("                                <option value=\"RR\">RR</option> \n");
      out.write("                                <option value=\"SC\">SC</option> \n");
      out.write("                                <option value=\"SE\">SE</option> \n");
      out.write("                                <option value=\"SP\">SP</option> \n");
      out.write("                                <option value=\"TO\">TO</option>\n");
      out.write("                            </select><span id=\"x_ufFinalJ\" class=\"tSpan\"></span>\n");
      out.write("                        </div>\n");
      out.write("                    </fieldset>\n");
      out.write("                    <div class=\"botoes\" id=\"botoes\">\n");
      out.write("                        <input type=\"reset\" value=\"CANCELAR\" name=\"Limpar\" id=\"limparJ\" class=\"botaoJ\">\n");
      out.write("                        <input type=\"submit\" value=\"ENVIAR\" name=\"enviar\" id=\"enviarJ\" class=\"botaoJ\">\n");
      out.write("                    </div><!--Fim div botoes-->\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->\n");
      out.write("\n");
      out.write("            </div><!--Fim div centro-->\t\t\n");
      out.write("            <div id=\"clear\"></div><!--Fim div clear-->\n");
      out.write("        </div><!--Fim div main conteúdo-->\t\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("    <div id=\"rodape\">\n");
      out.write("    <div class=\"main\">\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            &copy 2015 - Projeto Digimon | Forsoft Rio\n");
      out.write("        </div><!--Fim div Footer-->\n");
      out.write("    </div><!--Fim div main do rodape-->\n");
      out.write("    </div><!--Fim div \"rodape\"-->\n");
      out.write("</div><!--Fim div Interface-->");
      out.write(" \n");
      out.write("    </div><!--Fim div Interface-->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
