/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import entity.DaftarGaji;
import entity.DaftarPengguna;
import entity.Gaji;
import entity.Pengguna;
import entity.exceptions.NonexistentEntityException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Meylindra
 */
@WebServlet(name = "ProsesHapusGaji", urlPatterns = {"/ProsesHapusGaji"})
public class ProsesHapusGaji extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NonexistentEntityException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            
            HttpSession session = request.getSession();
            Pengguna pengguna = (Pengguna) session.getAttribute("loged");
            Long idPengguna = pengguna.getId();
        
            DaftarPengguna dafPengguna = new DaftarPengguna();
            Pengguna pengguna2 = dafPengguna.findPengguna(idPengguna);
        
            request.setAttribute("pengguna", pengguna2);
        
            DaftarGaji daftar = new DaftarGaji();
            Long idGaj = Long.parseLong(request.getParameter("idGaj"));
            Gaji gaji = daftar.getGaji(session);
        
            daftar.deleteGaji(session);
            request.setAttribute("sukses","Hapus data berhasil");
            response.sendRedirect("listkeluarga");
                
        /*try {
                    
          
             
        } finally {            
            out.close();
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ProsesHapusKeluarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ProsesHapusKeluarga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
