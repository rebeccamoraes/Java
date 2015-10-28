package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.PesquisarRelatorioBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Alan Lones
 * @review and correction Alan Lones
 */

@WebServlet(name = "ServletUI033", urlPatterns = {"/ServletUI033"})
public class ServletUI033 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        PesquisarRelatorioBean rb = new PesquisarRelatorioBean();
        
        try {
            
            rb.setIdRelatorio(Long.parseLong(request.getParameter("idRelatorio")));
            rb.setNome(request.getParameter("nome"));
            rb.setAssunto(request.getParameter("assunto"));
            
            out.println("ID Relatório: "+ rb.getIdRelatorio() +"<br>");
            out.println("Assunto: "+ rb.getAssunto() +"<br>");
            out.println("Nome: "+ rb.getNome() +"<br>");
            
        } finally {
            out.close();
        }
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
