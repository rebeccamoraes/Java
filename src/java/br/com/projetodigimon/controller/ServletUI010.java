package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Relatorio;
import br.com.projetodigimon.model.RodoviaPesquisarBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Higor
 * @review and correction Alan Lones
 */
@WebServlet(name = "ServletUI010", urlPatterns = {"/ServletUI010"})
public class ServletUI010 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Relatorio rel = new Relatorio();

        String nome = request.getParameter("nome");
        String assunto = request.getParameter("assunto");
        String texto = request.getParameter("texto");

        rel.setNome(nome);
        rel.setAssunto(assunto);
        rel.setTexto(texto);

        out.println("<html><body>");
        out.println("Nome: " + rel.getNome() + "<br>");
        out.println("Assunto: " + rel.getAssunto() + "<br>");
        out.println("Texto: " + rel.getTexto() + "<br>");
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
