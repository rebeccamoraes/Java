package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Endereco;
import br.com.projetodigimon.model.PostoPesagem;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Erico
 * @review and correction Alan Lones
 */
@WebServlet(name = "ServletUI020", urlPatterns = {"/ServletUI020"})
public class ServletUI020 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        PostoPesagem postoPesagem = new PostoPesagem();
      
        Endereco endereco = new Endereco();
        
        endereco.setLogradouro(request.getParameter("logradouro"));
        endereco.setNumero(request.getParameter("num"));
        endereco.setComplemento(request.getParameter("complemento"));
        endereco.setCep(request.getParameter("cep"));
        endereco.setBairro(request.getParameter("bairro"));
        endereco.setCidade(request.getParameter("cidade"));
        endereco.setUf(request.getParameter("uf"));
        endereco.setPais(request.getParameter("pais"));
        
        postoPesagem.setEndereco(endereco);
        
        out.println("<html><body>");
        out.println("Logradouro: "+postoPesagem.getEndereco().getLogradouro()+"<br>");
        out.println("Numero: "+postoPesagem.getEndereco().getNumero()+"<br>");
        out.println("Complemento: "+postoPesagem.getEndereco().getComplemento()+"<br>");
        out.println("Cep: "+postoPesagem.getEndereco().getCep()+"<br>");
        out.println("Bairro: "+postoPesagem.getEndereco().getBairro()+"<br>");
        out.println("Cidade: "+postoPesagem.getEndereco().getCidade()+"<br>");
        out.println("UF: "+postoPesagem.getEndereco().getUf()+"<br>");
        out.println("Pais: "+postoPesagem.getEndereco().getPais()+"<br>");
        out.println("</body></html>");
       
        
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
        processRequest(request, response);
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
        processRequest(request, response);
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
