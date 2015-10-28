/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Balanca;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Brito
 * @review and correction Alan Lones
 * 
 */
@WebServlet(name = "ServletUI018", urlPatterns = {"/ServletUI018"})
public class ServletUI018 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Balanca balanca = new Balanca();
        
        String numSerie = request.getParameter("numSerie");
        String fabricante = request.getParameter("fabricante");
        String modelo = request.getParameter("modelo");
        String idposto = request.getParameter("idposto");

        balanca.setNumSerie(numSerie);
        balanca.setFabricante(fabricante);
        balanca.setModelo(modelo);

        out.println("<html><body>");
        out.println("Numero de Serie: "+balanca.getNumSerie()+"<br>");
        out.println("Fabricante: "+balanca.getFabricante()+"<br>");
        out.println("Modelo: "+balanca.getModelo()+"<br>");
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
