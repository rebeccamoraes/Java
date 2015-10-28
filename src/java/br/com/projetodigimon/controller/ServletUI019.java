/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Balanca;
import br.com.projetodigimon.model.PostoPesagem;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cayo
 * @review and correction Alan Lones
 */
@WebServlet(name = "ServletUI019", urlPatterns = {"/ServletUI019"})
public class ServletUI019 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Balanca balanca = new Balanca();
        
        balanca.setIdBalanca(Long.parseLong(request.getParameter("idBalanca")));
        balanca.setNumSerie(request.getParameter("numSerie"));
        balanca.setModelo(request.getParameter("modelo"));
        balanca.setFabricante(request.getParameter("fabricante"));
        
        
        //PostoPesagem postoPesagem = new PostoPesagem();
        //postoPesagem.setIdPosto(Long.parseLong(request.getParameter("idPosto")));
        //balanca.setPostoPesagem(postoPesagem);
        
        out.println("<html><body>");
        out.println("ID da Balanca: "+balanca.getIdBalanca()+"<br>");
        out.println("Numero de Serie: "+balanca.getNumSerie()+"<br>");
        out.println("Modelo: "+balanca.getModelo()+"<br>");
        out.println("Fabricante: "+balanca.getFabricante()+"<br>");
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
