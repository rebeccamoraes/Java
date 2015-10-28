package br.com.projetodigimon.controller;

import br.com.projetodigimon.model.Pesagem;
import br.com.projetodigimon.model.PostoPesagem;
import br.com.projetodigimon.model.Veiculo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lucas
 * @review and correction Alan Lones
 */
@WebServlet(name = "ServletUI027", urlPatterns = {"/ServletUI027"})
public class ServletUI027 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
   
        Pesagem pesagem = new Pesagem ();
        Veiculo v = new Veiculo();
        pesagem.setVeiculo(v);
        PostoPesagem p = new PostoPesagem();
        pesagem.setPostoPesagem(p);
               
        
        String datahora = request.getParameter("datahora");
        pesagem.setDataHora(datahora);
        
        String pbt =request.getParameter("pbt");
        pesagem.setPbt(Float.parseFloat(pbt));
        
        String pesoeixo = request.getParameter("pesoeixo");
        pesagem.setPesoEixo(Float.parseFloat(pesoeixo));
        
        String idposto = request.getParameter("idposto");
        pesagem.getPostoPesagem().setIdPosto(Long.parseLong(idposto));
        
        String idveiculo = request.getParameter("idveiculo");
        pesagem.getVeiculo().setIdVeiculo(Long.parseLong(idveiculo));
        
        char transbordo =  request.getParameter("transbordo").charAt(0);
        pesagem.setTransbordo(transbordo);
        
        char remanejamento = request.getParameter("remanejamento").charAt(0);
        pesagem.setRemanejamento(remanejamento);
        
        
        out.println("<html><body>");
        out.println("Data: "+pesagem.getDataHora()+"<br>");
        out.println("PBT: "+pesagem.getPbt()+"<br>");
        out.println("Peso por Eixo: "+pesagem.getPesoEixo()+"<br>");
        out.println("ID do Posto: "+pesagem.getPostoPesagem().getIdPosto()+"<br>");
        out.println("ID do Veiculo: "+pesagem.getVeiculo().getIdVeiculo()+"<br>");
        out.println("Houve Transbordo ?: "+pesagem.getTransbordo()+"<br>");
        out.println("Houve Remanejamento ?: "+pesagem.getRemanejamento()+"<br>");
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
