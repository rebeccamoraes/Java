package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Relatorio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rodrigo
 * @review and correction Alan Lones
 */
@WebServlet(name = "ServletUI011", urlPatterns = {"/ServletUI011"})
public class ServletUI011 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Relatorio relatorio = new Relatorio();
        
        //String idRelatorio = request.getParameter("idRelatorio");
        String nome = request.getParameter("nome");
        String assunto = request.getParameter("assunto");
        String texto = request.getParameter("tinfo");
        
        //relatorio.setIdRelatorio(Long.parseLong(idRelatorio));
        relatorio.setNome(nome);
        relatorio.setAssunto(assunto);
        relatorio.setTexto(texto);
        
        out.println("<html><body>");
        out.println("Nome: "+relatorio.getNome()+"<br>");
        out.println("Assunto: "+relatorio.getAssunto()+"<br>");
        out.println("Texto: "+relatorio.getTexto()+"<br>");
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
