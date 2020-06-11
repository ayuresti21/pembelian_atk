package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import model.akun;
import model.pembelian;
import model.jurnal;
import control.koneksi;
import java.sql.ResultSet;
import java.util.Date;

public final class jurnal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
 java.util.Date waktu = new java.util.Date();
    int tanggal = waktu.getDate();
    int tahun = waktu.getYear() + 1900;
    int bulan = waktu.getMonth() + 1;
    String tgljurnal = tahun + "-" + bulan + "-" + tanggal;
    pembelian pembelian = new pembelian();
    akun akun = new akun();
    jurnal jurnal = new jurnal();
    koneksi kon = new koneksi();
    ResultSet rs = null;
    ResultSet qryakun = null;
    ResultSet qryjurnal = null;
    ResultSet qrypembelian = null;

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <tittle>Transaksi Jurnal Umum</tittle>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <sql:query var=\"ttl\" dataSource=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            SELECT SUM(debet) AS ttl_D,\n");
      out.write("            SUM(kredit) AS ttl_K FROM sementara_jurnal\n");
      out.write("        </sql:query>\n");
      out.write("<h2>Transaksi Retur</h2>\n");
      out.write("<table border=\"0\">\n");
      out.write("<form action=\"ServletJurnal\" method=\"post\" onsubmit=\"return validasi_inputJurnal(this)\">\n");
      out.write("<pre>\n");
      out.write("<tr>\n");
      out.write("<td>No Jurnal</td>  \n");
      out.write("<td>: ");

try {
Class.forName("com.mysql.jdbc.Driver");
ResultSet nojurnal = null;
nojurnal = kon.stmt.executeQuery("select max(right(no_jurnal,6)) as no FROM jurnal");
while (nojurnal.next()) {
if (nojurnal.first() == false) {
out.println("<input type='text' class='form-control' id='nojur' readonly='readonly' value='JU000001' name='no_jurnal'>");
} else {
        nojurnal.last();
        int autonoju = nojurnal.getInt(1) + 1;
        String nomorju = String.valueOf(autonoju);
        int noLong = nomorju.length();
        for (int a = 1; a < 7 - noLong; a++) {
        nomorju = "0" + nomorju;
}
String nomerju = "JU" + nomorju;
out.println("<input type='text' class='form-control' id='nojur' readonly='readonly' value='" + nomerju + "' name='no_jurnal'>");
}
}
} catch (Exception e) {
out.println(e);
}

      out.write("\n");
      out.write("</pre></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Tanggal Jurnal</td>  \n");
      out.write("<td>: <input type=\"text\" name=\"tanggal\" value =");
      out.print( tgljurnal);
      out.write(" readonly=\"readonly\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>No Bukti Transaksi</td>\n");
      out.write("<td>: <select name=\"nobeli\" onchange=\"showBeli(this.value);\">\n");
      out.write("                            <option value=\"-1\">Pilih Nomor Pembelian</option>\n");
      out.write("                            ");

                            qrypembelian = kon.stmt.executeQuery("SELECT no_beli FROM pembelian where not exists"
                            + "(select * from jurnal where jurnal.no_beli=pembelian.no_beli)");
                            while (qrypembelian.next()) {
                                pembelian.setNobeli(qrypembelian.getString("no_beli"));
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(pembelian.getNobeli());
      out.write('"');
      out.write('>');
      out.print(pembelian.getNobeli());
      out.write("</option>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("            <input type=\"hidden\" name=\"nobeli\" id=\"nobeli\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Keterangan</td>\n");
      out.write("<td>: <textarea name=\"keterangan\"></textarea></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Nominal</td>   <td>: <input type=\"text\" name=\"nominal\" id=\"nominal\" value=\"\"\n");
      out.write("                        readonly=\"readonly\" onkeyup=\"sumBeli();\"></td>\n");
      out.write("                    </tr>\n");
      out.write("<br><br>\n");
      out.write("<tr>\n");
      out.write("<table width=\"100\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("<tr class=\"head\">\n");
      out.write("<td> </td><td>Kode dan Nama Akun</td><td>Debet</td><td>Kredit</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class=\"isi\">\n");
      out.write("<td align=\"center\"><input type=\"checkbox\" name=\"pilih()\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pilih}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("<td><select name=\"no_akunkredit\" id=\"akunkredit\">\n");
      out.write("<option>Kode Akun   | Nama Akun</option>\n");

rs =  kon.stmt.executeQuery("SELECT * from akun ");
while (rs.next()) {
akun.setNoakun(rs.getString("no_akun"));
akun.setNamaakun(rs.getString("nm_akun"));

      out.write("\n");
      out.write("<option value=\"");
      out.print(akun.getNoakun());
      out.write('"');
      out.write('>');
      out.print(akun.getNoakun());
      out.write("\n");
      out.write("|| ");
      out.print(akun.getNamaakun());
      out.write("</option>\n");
 } 
      out.write("\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("<td><input name=\"debet\" id=\"debet1\" type=\"text\" onchange=\"Hitung()\" value=\"0\"></td>\n");
      out.write("<td><input name=\"kredit\" id=\"kredit1\" type=\"text\" onchange=\"Hitung()\" value=\"0\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class=\"isi\">                         \n");
      out.write("<td align=\"center\"><input type=\"checkbox\" name=\"pilih()\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pilih}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("<td><select name=\"no_akunkredit\" id=\"akunkredit\">\n");
      out.write("<option>Kode Akun   | Nama Akun</option>\n");

rs =  kon.stmt.executeQuery("SELECT * from akun ");
while (rs.next()) {
akun.setNoakun(rs.getString("no_akun"));
akun.setNamaakun(rs.getString("nm_akun"));

      out.write("\n");
      out.write("<option value=\"");
      out.print(akun.getNoakun());
      out.write('"');
      out.write('>');
      out.print(akun.getNoakun());
      out.write("\n");
      out.write("|| ");
      out.print(akun.getNamaakun());
      out.write("</option>\n");
 } 
      out.write("\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("<td><input name=\"debet\" id=\"debet2\" type=\"text\" onchange=\"Hitung()\" value=\"0\"></td>\n");
      out.write("<td><input name=\"kredit\" id=\"kredit2\" type=\"text\" onchange=\"Hitung()\" value=\"0\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class=\"isi\">\n");
      out.write("<td align=\"center\"><input type=\"checkbox\" name=\"pilih()\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pilih}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("<td><select name=\"no_akunkredit\" id=\"akunkredit\">\n");
      out.write("<option>Kode Akun   | Nama Akun</option>\n");

rs =  kon.stmt.executeQuery("SELECT * from akun ");
while (rs.next()) {
akun.setNoakun(rs.getString("no_akun"));
akun.setNamaakun(rs.getString("nm_akun"));

      out.write("\n");
      out.write("<option value=\"");
      out.print(akun.getNoakun());
      out.write('"');
      out.write('>');
      out.print(akun.getNoakun());
      out.write("\n");
      out.write("|| ");
      out.print(akun.getNamaakun());
      out.write("</option>\n");
 } 
      out.write("\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("<td><input name=\"debet\" id=\"debet3\" type=\"text\" onchange=\"Hitung()\" value=\"0\"></td>\n");
      out.write("<td><input name=\"kredit\" id=\"kredit3\" type=\"text\" onchange=\"Hitung()\" value=\"0\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr class=\"isi\">\n");
      out.write("<td align=\"center\"><input type=\"checkbox\" name=\"pilih()\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pilih}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></td>\n");
      out.write("<td><select name=\"no_akunkredit\" id=\"akunkredit\">\n");
      out.write("<option>Kode Akun   | Nama Akun</option>\n");

rs =  kon.stmt.executeQuery("SELECT * from akun ");
while (rs.next()) {
akun.setNoakun(rs.getString("no_akun"));
akun.setNamaakun(rs.getString("nm_akun"));

      out.write("\n");
      out.write("<option value=\"");
      out.print(akun.getNoakun());
      out.write('"');
      out.write('>');
      out.print(akun.getNoakun());
      out.write("\n");
      out.write("|| ");
      out.print(akun.getNamaakun());
      out.write("</option>\n");
 } 
      out.write("\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("<td><input name=\"debet\" id=\"debet4\" type=\"text\" onchange=\"Hitung()\" value=\"0\"></td>\n");
      out.write("<td><input name=\"kredit\" id=\"kredit4\" type=\"text\" onchange=\"Hitung()\" value=\"0\"></td>\n");
      out.write("</tr>  \n");
      out.write("\n");
      out.write("<tr class=\"head\">\n");
      out.write("<td colspan=\"2\" align=\"center\">Total</td>\n");
      out.write("<td>\n");
      out.write("<input type=\"text\" id=\"ttldebet\" onchange=\"Hitung()\" readonly=\"readonly\"></td>\n");
      out.write("<td><input type=\"text\" id=\"ttlkredit\" onchange=\"Hitung()\" readonly=\"readonly\"></td>\n");
      out.write("<tr class=\"head\">\n");
      out.write("<td colspan=\"2\" align=\"center\">Balance</td>\n");
      out.write("<td>&nbsp;</td>\n");
      out.write("<td><input type=\"text\" name=\"balance\" id=\"balance\" readonly=\"readonly\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr class=\"isi\">\n");
      out.write("<td colspan=\"4\" align=\"center\">\n");
      out.write("<input type=\"submit\" value=\"simpan\" class=\"button\"/>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
