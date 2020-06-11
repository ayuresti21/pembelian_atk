package control;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user;

public class UserServlet extends pesan {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        String aksi = request.getParameter("aksi");
        String iduser=request.getParameter("id");
        String nmuser=request.getParameter("nama");
        String hakakses=request.getParameter("hak");
        String pass=request.getParameter("pass");
        user var = new user(iduser,nmuser,hakakses,pass);
        String URL = "beranda.jsp?halaman=tampiluse&aksi=SIMPAN";
        if(aksi.equals("SIMPAN")) {
           out.print(super.proses(var.toInsert(), URL, "SIMPAN"));
        } else if (aksi.equals("GANTI")){
           out.print(super.proses(var.toUpdate(), URL, "GANTI"));
        } else if (aksi.equals("HAPUS")){
          out.print(super.proses(var.toDelete(), URL, "HAPUS"));
        }
    } catch (ClassNotFoundException ex) {
    Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
    Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
} finally {
    out.close();    
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
