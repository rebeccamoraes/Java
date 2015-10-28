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

/**
 *
 * @author Rodrigo
 * @review and correction Alan Lones
 */
@WebServlet(name = "ServletUI028", urlPatterns = {"/ServletUI028"})
public class ServletUI028 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
         Camera c = new Camera();
         
            //c.setIdCamera(Long.parseLong(request.getParameter("idCamera")));
            c.setNumSerie(request.getParameter("numserie"));
            c.setFabricante(request.getParameter("fabricante"));
            c.setModelo(request.getParameter("modelo"));
            c.setLatitude(Float.parseFloat(request.getParameter("latitude")));
            c.setLongitude(Float.parseFloat(request.getParameter("longitude")));
            c.setKm(Integer.parseInt(request.getParameter("km")));
            
            out.println("ID Camera: "+ c.getIdCamera() +"<br>");
            out.println("Número de Serie: "+ c.getNumSerie() +"<br>");
            out.println("Fabricante: "+ c.getFabricante() +"<br>");
            out.println("Modelo: "+ c.getModelo() +"<br>");
            out.println("Latitude: "+ c.getLatitude() +"<br>");
            out.println("Longitude: "+ c.getLongitude() +"<br>");
            out.println("Extensão: "+ c.getKm() +" KM<br>");
        
        
        
        
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
