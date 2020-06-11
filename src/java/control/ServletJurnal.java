package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.jurnal;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServletJurnal extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        jurnal jurnal = new jurnal();
        Connection koneksi = null;
        PreparedStatement pstmt = null;
        int result = 0;
        String aksi = request.getParameter("aksi");
        String URL = "jdbc:mysql://localhost:3306/pembelian_atk";
        String USERNAME = "root";
        String PASSWORD = "";
        Class.forName("com.mysql.jdbc.Driver");
        koneksi = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String[] pilih = request.getParameterValues("pilih[]");
        String[] noakun = request.getParameterValues("no_akun");
        String[] debet = request.getParameterValues("debet");
        String[] kredit = request.getParameterValues("kredit");
        String balance = request.getParameter("balance");
        
        jurnal.setNojurnal(request.getParameter("no_jurnal"));
        jurnal.setTgljurnal(request.getParameter("tanggal"));
        jurnal.setNobeli(request.getParameter("nobeli"));
        jurnal.setKeterangan(request.getParameter("keterangan"));
        if (balance.equals("0")) {
            pstmt = koneksi.prepareStatement("INSERT INTO jurnal values(?, ?, ?, ?, ?)");
            pstmt.setString(1, jurnal.getNojurnal());
            pstmt.setString(2, jurnal.getTgljurnal());
            pstmt.setString(3, jurnal.getNobeli());
            pstmt.setString(4, jurnal.getKeterangan());
            pstmt.setString(5, jurnal.getSub());
            pstmt.executeUpdate();
            out.println(pilih.length);
            for (int j = 0; j < pilih.length; j++) {
                pstmt = koneksi.prepareStatement("INSERT INTO detail_jurnal "
                + "values('" + jurnal.getNojurnal()+"','"+noakun[j]+"','"+debet[j]+"','"+kredit[j]+"')");
                pstmt.executeUpdate();
            }
            out.println("<script>alert('Data berhasil Disimpan....!!!)</script>"
            + "<meta http-equiv='refresh' content'1;beranda.jsp?halaman=jurnal'/>");
            }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletJurnal.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServletJurnal.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
