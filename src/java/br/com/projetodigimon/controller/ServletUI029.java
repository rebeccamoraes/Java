/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.controller;

import br.com.projetodigimon.dao.DaoCarga;
import br.com.projetodigimon.dao.DaoPessoaFisica;
import br.com.projetodigimon.dao.DaoProduto;
import br.com.projetodigimon.dao.DaoVeiculo;
import br.com.projetodigimon.model.Carga;
import br.com.projetodigimon.model.Frete;
import br.com.projetodigimon.model.MotoristaPesquisaBean;
import br.com.projetodigimon.model.PessoaFisica;
import br.com.projetodigimon.model.PessoaJuridicaPesquisaBean;
import br.com.projetodigimon.model.Produto;
import br.com.projetodigimon.model.TransportadorPesquisaBean;
import br.com.projetodigimon.model.Veiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sora
 */
@WebServlet(name = "ServletUI029", urlPatterns = {"/web/ServletUI029"})
public class ServletUI029 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String filtro = request.getParameter("filtro");
        //Veiculo
        //VeiculoPesquisaBean veiculo = new VeiculoPesquisaBean();
        Veiculo veiculo = new Veiculo();
        DaoVeiculo daoVeiculo = new DaoVeiculo();
        List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();

        //Transportador & pessoa juridica
        TransportadorPesquisaBean transportador = new TransportadorPesquisaBean();
        PessoaJuridicaPesquisaBean pessoaj = new PessoaJuridicaPesquisaBean();

        //Pessoa fisica
        // PessoaFisicaPesquisaBean pessoaf = new PessoaFisicaPesquisaBean();
        PessoaFisica pf = new PessoaFisica();
        DaoPessoaFisica daoPessoaF = new DaoPessoaFisica();
        List<PessoaFisica> listaPessoaFisica = new ArrayList<PessoaFisica>();

        //Motorista
        MotoristaPesquisaBean motorista = new MotoristaPesquisaBean();

        //Carga (usei a entidade inteira)
        Carga carga = new Carga();
        DaoCarga daoCarga = new DaoCarga();
        List<Carga> listaCarga = new ArrayList<Carga>();

        //Produto 
        //ProdutoPesquisaBean produto = new ProdutoPesquisaBean();
        Produto produto = new Produto();
        List<Produto> listaProduto = new ArrayList<Produto>();
        DaoProduto daoProduto = new DaoProduto();

        //Frete  (usei a entidade inteira)
        Frete frete = new Frete();
        try {
            if (filtro.equalsIgnoreCase("VEICULO")) {
                veiculo.setPlaca(request.getParameter("placa"));

                listaVeiculo = daoVeiculo.listar(veiculo);  //Atribuindo a instância de listVeiculo o método daoveiculo.listar
                request.setAttribute("Veiculos", listaVeiculo); //Atribuindo uma lista de nome "Veiculos" os resultados de listaVeiculo

            } else if (filtro.equalsIgnoreCase("TRANSPORTADOR")) {
                transportador.setRntrc(request.getParameter("rntrc"));
                pessoaj.setCnpj(request.getParameter("cnpj"));
                pessoaj.setNome(request.getParameter("nome"));  // conferir se é nome fantasia ou nome.
                //inserir dao.listar + try catch

            } else if (filtro.equalsIgnoreCase("PESSOA_JURIDICA")) {
                pessoaj.setCnpj(request.getParameter("cnpj"));
                pessoaj.setNome(request.getParameter("nome"));
                //inserir dao.listar + try catch

            } else if (filtro.equalsIgnoreCase("PESSOA_FISICA")) {
                pf.setCpf(request.getParameter("cpf"));
                pf.setNome(request.getParameter("nome"));

                listaPessoaFisica = daoPessoaF.listar(pf);
                request.setAttribute("Pessoasf", listaPessoaFisica);

            } else if (filtro.equalsIgnoreCase("MOTORISTA")) {
                motorista.setCnh(Integer.parseInt(request.getParameter("cnh")));
                pf.setNome(request.getParameter("nome")); // Conferir de onde vai vir o nome

            } else if (filtro.equalsIgnoreCase("CARGA")) {
                carga.setTipo(request.getParameter("tipo"));
                carga.setRemetente(request.getParameter("remetente"));
                carga.setDestinatario(request.getParameter("destinatario"));

                listaCarga = daoCarga.listar(carga);
                request.setAttribute("Cargas", listaCarga);
                //inserir dao.listar + try catch

            } else if (filtro.equalsIgnoreCase("PRODUTO")) {
                produto.setMercadoria(request.getParameter("mercadoria"));
                listaProduto = daoProduto.listar(produto);
                request.setAttribute("Produtos", listaProduto);
                //inserir dao.listar + try catch

            } else if (filtro.equalsIgnoreCase("FRETE")) {
                frete.setTipo(request.getParameter("tipo"));
                //inserir dao.listar + try catch
                //Ver como vai ser o periodo
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro no Dao " + filtro);
            //Inserir um jsp de erro ?
        }

        //Dispatcher de teste        
        RequestDispatcher rd = request.getRequestDispatcher("ui029pesquisa.jsp");
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletUI029.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletUI029.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
