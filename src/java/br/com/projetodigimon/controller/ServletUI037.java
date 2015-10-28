package br.com.projetodigimon.controller;

/**
 * @author ---
 * @review and correction Alan Lones
 * 
 */

import br.com.projetodigimon.model.Rodovia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ServletUI037", urlPatterns = {"/ServletUI037"})
public class ServletUI037 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Rodovia rodovia = new Rodovia();
        
        String nome = request.getParameter("nome");
        String ufInicial = request.getParameter("ufInicial");
        String ufFinal = request.getParameter("ufFinal");
        
        rodovia.setNome(nome);
        rodovia.setUfInicial(ufInicial);
        rodovia.setUfFinal(ufFinal);
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("Nome: "+rodovia.getNome()+"<br>");
        out.println("Estado Inicial: "+rodovia.getUfInicial()+"<br>");
        out.println("Estado Final: "+rodovia.getUfFinal()+"<br>");
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
