package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Camera;
import br.com.projetodigimon.model.Rodovia;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/**
 *
 * @author EliasL
 * @review and correction Alan Lones
 */
@WebServlet(name = "ServletUI034", urlPatterns = {"/ServletUI034"})
public class ServletUI034 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
        
       Camera cam = new Camera();
       Rodovia rodovia = new Rodovia();
        
       String Fabricante = request.getParameter("fabricante");
       String Modelo = request.getParameter("modelo");
       String Rodovia = request.getParameter("rodovia");
       
       cam.setFabricante(Fabricante);
       cam.setModelo(Modelo);
       cam.setRodovia(rodovia);
       cam.getRodovia().setNome(Rodovia);
       
       
        out.println("<html><body>");
        out.println("Fabricante: "+cam.getFabricante()+"<br>");
        out.println("Modelo: "+cam.getModelo()+"<br>");
        out.println("Rodovia: "+cam.getRodovia().getNome()+"<br>");
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
