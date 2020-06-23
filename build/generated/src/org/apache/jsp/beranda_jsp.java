package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import control.koneksi;
import java.sql.*;
import java.sql.ResultSet;
import control.koneksi;
import model.barang;
import model.supplier;
import model.pemesanan;
import java.util.Date;
import java.sql.*;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import model.pemesanan;
import java.util.Date;
import java.sql.*;
import control.koneksi;
import java.sql.ResultSet;
import control.koneksi;
import model.barang;
import model.supplier;
import model.retur;
import java.util.Date;

public final class beranda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(13);
    _jspx_dependants.add("/barang.jsp");
    _jspx_dependants.add("/supplier.jsp");
    _jspx_dependants.add("/user.jsp");
    _jspx_dependants.add("/pemesanan.jsp");
    _jspx_dependants.add("/config/autokode.jsp");
    _jspx_dependants.add("/pembelian.jsp");
    _jspx_dependants.add("/retur.jsp");
    _jspx_dependants.add("/CetakLaporanBarang.jsp");
    _jspx_dependants.add("/CetakLaporanSupplier.jsp");
    _jspx_dependants.add("/CetakLaporanPemesanan.jsp");
    _jspx_dependants.add("/CetakLaporanPembelian.jsp");
    _jspx_dependants.add("/CetakLaporanRetur.jsp");
    _jspx_dependants.add("/home.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
    _jspx_tagPool_c_when_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("    <title>Pembelian ATK Kura Tulis</title>\r\n");
      out.write("    <link href=\"config/design.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"config/setting.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"config/cssjs.js\"></script>\r\n");
      out.write("    <link href=\"config/cssTable.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\">\r\n");
      out.write("        <h1>Pembelian ATK</h1>\r\n");
      out.write("        <marquee behavior=\"alternate\">Program Studi Sistem Informasi Akuntansi</marquee>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"topnav\" id=\"myTopnav\">\r\n");
      out.write("        <a href=\"beranda.jsp\">Home</a>\r\n");
      out.write("        <a href=\"contact.jsp\">Contact</a>\r\n");
      out.write("        <a href=\"home.jsp\">About</a>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">Settings\r\n");
      out.write("                <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"beranda.jsp?halaman=dataPeg\">Change Password</a>\r\n");
      out.write("                <a href=\"index.jsp?halaman=logout\">Logout</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div> \r\n");
      out.write("        <a href=\"javascript:void(0);\" style=\"font-size:15px;\" class=\"icon\" onclick=\"myFunction()\">&#9776;</a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div id=\"mySidenav\" class=\"sidenav\">\r\n");
      out.write("        <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n");
      out.write("        <a href=\"beranda.jsp?halaman=tampilbrg&aksi=SIMPAN\">Data Barang</a>\r\n");
      out.write("        <a href=\"beranda.jsp?halaman=tampilsup&aksi=SIMPAN\">Data Supplier</a>\r\n");
      out.write("        <a href=\"beranda.jsp?halaman=tampiluse&aksi=SIMPAN\">Data User</a>\r\n");
      out.write("        <a href=\"beranda.jsp?halaman=pesan\">Pemesanan</a>\r\n");
      out.write("        <a href=\"beranda.jsp?halaman=beli\">Pembelian</a>\r\n");
      out.write("        <a href=\"beranda.jsp?halaman=retur\">Retur Pembelian</a>\r\n");
      out.write("        <a href=\"beranda.jsp?hal=cetaklapbarang\">Laporan Barang</a>\r\n");
      out.write("        <a href=\"beranda.jsp?hal=cetaklapsupplier\">Laporan Supplier</a>\r\n");
      out.write("        <a href=\"beranda.jsp?hal=cetaklappemesanan\">Laporan Pemesanan</a>\r\n");
      out.write("        <a href=\"beranda.jsp?hal=cetaklappembelian\">Laporan Pembelian</a>\r\n");
      out.write("        <a href=\"beranda.jsp?hal=cetaklapretur\">Laporan Retur</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <span style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776; Menu</span>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"text\">\r\n");
      out.write("        ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_0.setParent(null);
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_3.setPageContext(_jspx_page_context);
          _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='pesan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
          if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                ");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write('\n');
              out.write('\n');

    try {
        koneksi kon = new koneksi();
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet nopesan = null;
        nopesan = kon.stmt.executeQuery("select max(right(no_pesan,6)) as no FROM pemesanan");
        while (nopesan.next()) {
            if (nopesan.first() == false) {
                out.println("<input type='hidden' class='form-control' name='no_pesan' value='PS000001' id='nopes'/>");
            } else {
                nopesan.last();
                int autonops = nopesan.getInt(1) + 1;
                String nomorps = String.valueOf(autonops);
                int noLong = nomorps.length();
                
                for (int a = 1; a < 7 - noLong; a++) {
                    nomorps = "0" + nomorps;
                }
                String nomerps = "PS" + nomorps;
                out.println("<input type='hidden' class='form-control' name='no_pesan' id='nopes' value='" + nomerps + "'/>");
            }
        }
    } catch (Exception e) {
        out.println(e);
    }

              out.write("   ");
              out.write("\r\n");
              out.write("\r\n");
 java.util.Date waktu = new java.util.Date();
int tanggal = waktu.getDate();
int tahun = waktu.getYear() + 1900;
int bulan = waktu.getMonth() + 1;
String tgl = tahun + "-" + bulan + "-" + tanggal;
pemesanan pemesanan = new pemesanan();
barang barang = new barang();
supplier supplier = new supplier();
koneksi kon = new koneksi();
ResultSet rs = null;
ResultSet qrybarang = null;
ResultSet qrypemesanan = null;

              out.write("\r\n");
              out.write("<html>\r\n");
              out.write("    <head>\r\n");
              out.write("  <h1 align=\"center\">Transaksi Pemesanan Barang</h1></br>\r\n");
              out.write("    </head>\r\n");
              out.write("    <body>\r\n");
              out.write("        ");
              if (_jspx_meth_sql_query_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("            <table border=\"0\">\r\n");
              out.write("                <form action=\"ServletPemesanan\" method=\"post\">\r\n");
              out.write("                    <h2>Data Barang</h2>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                        <td>No Pesan</td>     <td>: <input type=\"text\" name=\"no_pesan\" id=\"nopesan\" value=\"\"\r\n");
              out.write("                        readonly=\"readonly\"/>\r\n");
              out.write("                        <input type=\"button\" onclick=\"pesan();\" value=\"Add No Pesan\" class=\"button\"></td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                        <td>Tanggal Pesan</td>  <td>: <input type=\"text\" name=\"tanggal\" value =");
              out.print( tgl);
              out.write(" readonly=\"readonly\"></td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                        <td>Barang</td>         <td>: <select name=\"kode\" onchange=\"showEmp(this.value);\">\r\n");
              out.write("                                <option value=\"-1\">Pilih Barang</option>\r\n");
              out.write("                                ");

                                rs = kon.stmt.executeQuery("SELECT * from barang");
                                while (rs.next()) {
                                    barang.setKodebarang(rs.getString("kd_brg"));
                                    barang.setNamabarang(rs.getString("nm_brg"));
                                
              out.write("\r\n");
              out.write("                                <option value=\"");
              out.print(barang.getKodebarang());
              out.write('"');
              out.write('>');
              out.print(barang.getKodebarang());
              out.write("\r\n");
              out.write("                                    || ");
              out.print(barang.getNamabarang());
              out.write("</option>\r\n");
              out.write("                                ");
 } 
              out.write("\r\n");
              out.write("                            </select></td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <input type=\"hidden\" name=\"emp_id\" id=\"emp_id\" value=\"\">\r\n");
              out.write("                    <tr>\r\n");
              out.write("                        <td>Harga Barang</td>   <td>: <input type=\"text\" name=\"harga\" id=\"ename\" value=\"\"\r\n");
              out.write("                        readonly=\"readonly\" onkeyup=\"sumPesan();\"></td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                        <td>Jumlah Pesan</td>   <td>: <input type=\"text\" name=\"jml\" id=\"jml\" onkeyup=\"sumPesan();\"></td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                        <td>Subtotal</td>       <td>: <input type=\"text\" name=\"sub\" id=\"subtotal\"  \r\n");
              out.write("                        readonly=\"readonly\"></td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("                    <tr>\r\n");
              out.write("                        <td><input type=\"submit\" value=\"TAMBAH\" name=\"aksi1\"></td>\r\n");
              out.write("                    </tr>\r\n");
              out.write("            </table>\r\n");
              out.write("            <h2>Data Supplier</h2>\r\n");
              out.write("            Supplier    <select name=\"supplier\">\r\n");
              out.write("                <option value=\"-1\">Pilih Supplier</option>\r\n");
              out.write("                ");

                rs = kon.stmt.executeQuery("SELECT * from supplier ");
                while (rs.next()) {
                    supplier.setKodesupp(rs.getString("kd_supp"));
                    supplier.setNamasupp(rs.getString("nm_supp"));
                
              out.write("\r\n");
              out.write("                <option value=\"");
              out.print(supplier.getKodesupp());
              out.write('"');
              out.write('>');
              out.print(supplier.getNamasupp());
              out.write("</option>\r\n");
              out.write("                ");
 } 
              out.write("\r\n");
              out.write("            </select><br><br>\r\n");
              out.write("            \r\n");
              out.write("            <table width=\"535\" border=\"1\" align=\"center\">\r\n");
              out.write("                <tr align=\"center\">\r\n");
              out.write("                    <td colspan=\"5\"><h3>Data Barang Untuk Dipesan</h3></td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <th>Kode Barang</th>\r\n");
              out.write("                    <th>Quantity</th>\r\n");
              out.write("                    <th>Subtotal</th>\r\n");
              out.write("                    <th>AKSI</th>\r\n");
              out.write("                </tr>\r\n");
              out.write("                ");

                    rs = kon.stmt.executeQuery("SELECT * from sementara");
                    while (rs.next()) {
                        out.println("<tr class=isi>"
                        + "<td>" + rs.getString(2) + "</td>"
                        + "<td>" + rs.getString(3) + "</td>"
                        + "<td>" + rs.getString(4) + "</td>"
                        + "<td><a href=ServletPemesanan?aksi2=HAPUS&kode=" + rs.getString(2) + ">Hapus</a></td>"
                        + "</tr>");
                        }
                  
              out.write("\r\n");
              out.write("            </table>\r\n");
              out.write("                  ");
              if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                  ");
kon.close();
              out.write("\r\n");
              out.write("                          <tr><td><input type=\"submit\" value=\"PROSES\" name=\"aksi3\"> <input type=\"reset\" value=\"CANCEL\"></td></tr>\r\n");
              out.write("                      </table>\r\n");
              out.write("                </form>\r\n");
              out.write("    </body>\r\n");
              out.write("</html>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
          out.write("\r\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_4.setPageContext(_jspx_page_context);
          _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='beli'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
          if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                ");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write('\n');
              out.write('\n');

    try {
        koneksi kon = new koneksi();
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet nopesan = null;
        nopesan = kon.stmt.executeQuery("select max(right(no_pesan,6)) as no FROM pemesanan");
        while (nopesan.next()) {
            if (nopesan.first() == false) {
                out.println("<input type='hidden' class='form-control' name='no_pesan' value='PS000001' id='nopes'/>");
            } else {
                nopesan.last();
                int autonops = nopesan.getInt(1) + 1;
                String nomorps = String.valueOf(autonops);
                int noLong = nomorps.length();
                
                for (int a = 1; a < 7 - noLong; a++) {
                    nomorps = "0" + nomorps;
                }
                String nomerps = "PS" + nomorps;
                out.println("<input type='hidden' class='form-control' name='no_pesan' id='nopes' value='" + nomerps + "'/>");
            }
        }
    } catch (Exception e) {
        out.println(e);
    }

              out.write("   ");
              out.write("\r\n");
              out.write("\r\n");
              out.write("<!DOCTYPE html>\r\n");
 java.util.Date waktu = new java.util.Date();
int tanggal = waktu.getDate();
int tahun = waktu.getYear() + 1900;
int bulan = waktu.getMonth() + 1;
String tgl = tahun + "-" + bulan + "-" + tanggal;
pemesanan pemesanan = new pemesanan();
ResultSet qrypesan = null;
String no = null;
String sql = "SELECT MAX(RIGHT(no_beli,6)) FROM pembelian";
koneksi kon = new koneksi();
ResultSet rs = kon.stmt.executeQuery(sql);
if (!rs.next()) {
    no = "PB000001";
} else {
    int urutanBaru = rs.getInt(1) + 1;
    String kode = String.valueOf(urutanBaru);
    int panjangKode = kode.length();
    for (int i = panjangKode; i < 6; i++) {
        kode = "0" + kode;
    }
    no = "PB" + kode;
}
String nof = "FK" + no.substring(2);

              out.write("\r\n");
              out.write("<html>\r\n");
              out.write("    <head>\r\n");
              out.write("        <title>Transaksi Pembelian</title>\r\n");
              out.write("    </head>\r\n");
              out.write("    <body>\r\n");
              out.write("        <h1 align=\"center\">Transaksi Pembelian Barang</h1></br>\r\n");
              out.write("        <table border=\"0\">\r\n");
              out.write("            <form action=\"ServletPembelian\" method=\"post\">\r\n");
              out.write("                <h2>Data Pembelian</h2>\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td>No Pembelian</td>\r\n");
              out.write("                    <td>: <input type=\"text\" name=\"no\" value=\"");
              out.print(no);
              out.write("\" readonly/> </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td>No Faktur</td>\r\n");
              out.write("                    <td>: <input type=\"text\" name=\"nof\" value=\"");
              out.print(nof);
              out.write("\" readonly/> </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td>Tanggal beli</td>\r\n");
              out.write("                    <td>: <input type=\"text\" name=\"tgl\" value=\"");
              out.print(tgl);
              out.write("\" > </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                <tr>\r\n");
              out.write("                <td>Nomor Pesan</td>\r\n");
              out.write("                    <td>: <select name=\"nopes\" onchange=\"showPesan(this.value);\">\r\n");
              out.write("                            <option value=\"-1\">Pilih Nomor Pesan</option>\r\n");
              out.write("                            ");

                            qrypesan = kon.stmt.executeQuery("SELECT no_pesan FROM pemesanan where not exists"
                            + "(select * from pembelian where pemesanan.no_pesan=pembelian.no_pesan)");
                            while (qrypesan.next()) {
                                pemesanan.setNopesan(qrypesan.getString("no_pesan"));
                            
              out.write("\r\n");
              out.write("                            <option value=\"");
              out.print(pemesanan.getNopesan());
              out.write('"');
              out.write('>');
              out.print(pemesanan.getNopesan());
              out.write("</option>\r\n");
              out.write("                            ");
 } 
              out.write("\r\n");
              out.write("                    </select>\r\n");
              out.write("                    </td>\r\n");
              out.write("            </tr>\r\n");
              out.write("            <input type=\"hidden\" class='form-control' name=\"nopes\" id=\"pesan\" value=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
              out.write("\">\r\n");
              out.write("            <tr>\r\n");
              out.write("                <td><input type=\"submit\" name=\"aksi\" value=\"Tambah\"></td></br>\r\n");
              out.write("            </tr>\r\n");
              out.write("        </table>\r\n");
              out.write("            ");

            sql = "select * from sementara";
            rs = kon.stmt.executeQuery(sql);
            
              out.write("\r\n");
              out.write("            <br/><br/>\r\n");
              out.write("            <h3>Data Barang Untuk Dibeli</h3>\r\n");
              out.write("            <table border=\"2\">\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <th>Nomor</th>\r\n");
              out.write("                    <th>Kode Barang</th>\r\n");
              out.write("                    <th>Quantity</th>\r\n");
              out.write("                    <th>Subtotal</th>\r\n");
              out.write("                    <th>Aksi</th>\r\n");
              out.write("                </tr>\r\n");
              out.write("                ");
 if (!rs.next()) { 
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td colspan=\"5\">Data Masih Kosong</td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                ");
 } 
              out.write("\r\n");
              out.write("                ");
 rs.beforeFirst(); 
              out.write("\r\n");
              out.write("                ");
 while (rs.next()){
              out.write("\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <td>");
              out.print( rs.getString(1));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.print( rs.getString(2));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.print( rs.getString(3));
              out.write("</td>\r\n");
              out.write("                    <td>");
              out.print( rs.getString(4));
              out.write("</td>\r\n");
              out.write("                    <td>\r\n");
              out.write("                        <a href=\"ServletPembelian?aksi=Delete&kodebarang=");
              out.print( rs.getString(2));
              out.write("\">\r\n");
              out.write("                        HAPUS\r\n");
              out.write("                        </a>\r\n");
              out.write("                    </td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                ");
 } 
              out.write("\r\n");
              out.write("            </table>\r\n");
              out.write("            <table>\r\n");
              out.write("                ");
              if (_jspx_meth_sql_query_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                ");
              if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                        <tr><td><input type=\"submit\" value=\"Simpan\" name=\"aksi\"> <input type=\"reset\" value=\"cancel\"></td></tr>\r\n");
              out.write("            </table>\r\n");
              out.write("    </body>\r\n");
              out.write("</html>");
              out.write("\r\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
          out.write("\r\n");
          out.write("            ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_5.setPageContext(_jspx_page_context);
          _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
          _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='retur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
          if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("                ");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
 java.util.Date waktu = new java.util.Date();
int tanggal = waktu.getDate();
int tahun = waktu.getYear() + 1900;
int bulan = waktu.getMonth() + 1;
String tgl = tahun + "-" + bulan + "-" + tanggal;
retur retur = new retur();
barang barang = new barang();
supplier supplier = new supplier();
koneksi kon = new koneksi();
ResultSet rs = null;
ResultSet qryretur = null;
ResultSet qrybarang = null;

              out.write("\r\n");
              out.write("<html>\r\n");
              out.write("    <head>\r\n");
              out.write("    <title>Transaksi Retur</title>\r\n");
              out.write("    </head>\r\n");
              out.write("    <body>\r\n");
              out.write("        ");
              if (_jspx_meth_sql_query_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context))
                return;
              out.write("\r\n");
              out.write("                    <h1>Transaksi Retur</h1>\r\n");
              out.write("                    <table border=\"0\">\r\n");
              out.write("                    <form action=\"ServletRetur\" method=\"post\" onsubmit=\"return validasi_inputRetur(this)\">\r\n");
              out.write("                    <pre>\r\n");
              out.write("<tr>\r\n");
              out.write("<td>No Retur</td>  <td>");

        try {
        Class.forName("com.mysql.jdbc.Driver");
        ResultSet noretur = null;
        noretur = kon.stmt.executeQuery("select max(right(no_retur,6)) as no FROM retur");
        while (noretur.next()) {
        if (noretur.first() == false) {
        out.println("<input type='text' class='form-control' id='noret' readonly value='RT000001' name='no_retur'>");
        } else {
        noretur.last();
        int autonort = noretur.getInt(1) + 1;
        String nomorrt = String.valueOf(autonort);
        int noLong = nomorrt.length();
        for (int a = 1; a < 7 - noLong; a++) {
        nomorrt = "0" + nomorrt;
        }
        String nomerrt = "RT" + nomorrt;
        out.println("<input type='text' class='form-control' id='noret' readonly value='" + nomerrt + "' name='no_retur'>");
        }
                                  
            }
            } catch (Exception e) {
              out.println(e);
            }
            
              out.write("\r\n");
              out.write("    </td>\r\n");
              out.write("</tr>\r\n");
              out.write("        <tr>\r\n");
              out.write("            <td>Tanggal Retur</td>  <td><input type=\"text\" name=\"tanggal\" value=");
              out.print( tgl);
              out.write(" ></td>\r\n");
              out.write("        </tr>\r\n");
              out.write("        <tr><td>Supplier</td>  <td><select name=\"supplier\">\r\n");
              out.write("        ");
 
            rs = kon.stmt.executeQuery("SELECT * from supplier ");
            while (rs.next()) {
                supplier.setKodesupp(rs.getString("kd_supp"));
                supplier.setNamasupp(rs.getString("nm_supp"));
        
              out.write("\r\n");
              out.write("        <option value=\"");
              out.print(supplier.getKodesupp());
              out.write('"');
              out.write('>');
              out.print(supplier.getNamasupp());
              out.write("</option>\r\n");
              out.write("        ");
  } 
              out.write("\r\n");
              out.write("    </select></td>\r\n");
              out.write("        </tr>\r\n");
              out.write("        <tr>\r\n");
              out.write("            <td>Barang</td>  <td><select name=\"kode\" onchange=\"showEmp(this.value);\">\r\n");
              out.write("                        <option value=\"-1\">Select</option>\r\n");
              out.write("                        ");

                            rs =  kon.stmt.executeQuery("SELECT * from barang ");
                            while (rs.next()) {
                                barang.setKodebarang(rs.getString("kd_brg"));
                                barang.setNamabarang(rs.getString("nm_brg"));
                        
              out.write("\r\n");
              out.write("                        <option value=\"");
              out.print(barang.getKodebarang());
              out.write('"');
              out.write('>');
              out.print(barang.getKodebarang());
              out.write("||\r\n");
              out.write("                        ");
              out.print(barang.getNamabarang());
              out.write("</option>\r\n");
              out.write("                        ");
 } 
              out.write("\r\n");
              out.write("                </select></td>\r\n");
              out.write("        </tr>\r\n");
              out.write("        <tr>\r\n");
              out.write("            <td><input type=\"hidden\" name=\"emp_id\" id=\"emp_id\" value=\"\"></td>\r\n");
              out.write("        </tr>\r\n");
              out.write("        <tr>\r\n");
              out.write("            <td>Harga Barang</td>    <td><input type=\"text\" name=\"harga\" id=\"ename\" value=\"\"\r\n");
              out.write("                                   readonly=\"readonly\" onkeyup=\"sumvalidasi_inputRetur();\"></td>\r\n");
              out.write("        </tr>\r\n");
              out.write("        <tr>\r\n");
              out.write("            <td>Jumlah Pesan</td>    <td><input type=\"text\" name=\"jml\" id=\"jml\" onkeyup=\"sumvalidasi_inputRetur();\"></td>\r\n");
              out.write("        </tr>\r\n");
              out.write("        <tr>\r\n");
              out.write("            <td>Subtotal</td>  <td><input type=\"text\" name=\"sub\" id=\"subtotal\" readonly=\"readonly\"></td>\r\n");
              out.write("        </tr>\r\n");
              out.write("        <tr><td><input type=\"submit\" value=\"TAMBAH\" name=\"aksi1\"></td></tr>          \r\n");
              out.write("        \r\n");
              out.write("            <table width=\"535\" border=\"1\" align=\"center\">\r\n");
              out.write("                <tr align=\"center\">\r\n");
              out.write("                    <td colspan=\"5\"><h3>Data Barang Untuk Diretur</h3></td>\r\n");
              out.write("                </tr>\r\n");
              out.write("                <tr>\r\n");
              out.write("                    <th>Nomor Transaksi</th>\r\n");
              out.write("                    <th>Kode Barang</th>\r\n");
              out.write("                    <th>Quantity</th>\r\n");
              out.write("                    <th>Subtotal</th>\r\n");
              out.write("                    <th>AKSI</th>\r\n");
              out.write("                </tr>\r\n");
              out.write("                ");

                    rs = kon.stmt.executeQuery("SELECT * from sementara_retur");
                    while (rs.next()) {
                        out.println("<tr class=isi>"
                        + "<td>" + rs.getString(1) + "</td>"
                        + "<td>" + rs.getString(2) + "</td>"
                        + "<td>" + rs.getString(3) + "</td>"
                        + "<td>" + rs.getString(4) + "</td>"
                        + "<td><a href=ServletRetur?aksi2=HAPUS&no_retur=" + rs.getString(1) + ">Hapus</a></td>"
                        + "</tr>");
                        }
                  
              out.write("\r\n");
              out.write("            </table>\r\n");
              out.write("     ");
kon.close();
              out.write("\r\n");
              out.write("  <tr><td><input type=\"submit\" value=\"SIMPAN\" name=\"aksi3\"> <input type=\"reset\" value=\"CANCEL\"></td></tr>\r\n");
              out.write("                </form>\r\n");
              out.write("    </body>\r\n");
              out.write("</html>\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("\r\n");
              out.write("            ");
              int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
            return;
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("            ");
          if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
        return;
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"box\">\r\n");
      out.write("        <div class=\"subtitle\">About this website</div>\r\n");
      out.write("        <marquee behavior=\"scroll\"  scrollamount=\"10\">\r\n");
      out.write("            SISTEM INFORMASI AKUNTANSI UNIVERSITAS BSI APLIKASI PEMBELIAN\r\n");
      out.write("        </marquee>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"box\">\r\n");
      out.write("        <div class=\"subtitle\">Date and Time</div>\r\n");
      out.write("        <marquee direction=\"left\"> ");
      out.print(new java.util.Date());
      out.write("\r\n");
      out.write("        </marquee>\r\n");
      out.write("        <br />\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"footer\">\r\n");
      out.write("        <div id=\"right\">\r\n");
      out.write("            Dimas Hogie Sei Naga © Copyright 2020 All Right Reserved  </div>\r\n");
      out.write("        <a href=\"beranda.jsp?\">Home |</a>  \r\n");
      out.write("        <a href=\"home.jsp?\">About |</a>   \r\n");
      out.write("        <a href=\"#\">FAQ |</a>   \r\n");
      out.write("        <a href=\"#\">Contact</a>   \r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("dataSource");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/pembelian_atk");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilbrg'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<h1>Data Master Barang</h1>\r\n");
        out.write("<table border=\"0\">\r\n");
        out.write("    <form action=\"BarangServlet\" method=\"post\" onsubmit=\"return validasi_inputBarang(this)\">\r\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td>Kode Barang</td> <td>: <input type=\"text\" name=\"kode\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.kd_brg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\r\n");
        out.write("        </tr>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td>Nama Barang</td> <td>: <input type=\"text\" name=\"nama\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nm_brg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \r\n");
        out.write("        </tr>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td>Harga Barang</td> <td>: <input type=\"text\" name=\"harga\" onkeypress=\"return hanyaAngka(event)\"\r\n");
        out.write("            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.harga}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \r\n");
        out.write("        </tr>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td>Stok Barang</td> <td>: <input type=\"text\" name=\"stok\" onkeypress=\"return hanyaAngka(event)\"\r\n");
        out.write("            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.stok}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \r\n");
        out.write("        </tr>\r\n");
        out.write("        <tr>\r\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> \r\n");
        out.write("        </tr>\r\n");
        out.write("    </form>\r\n");
        out.write("</td></tr></table><br>\r\n");
        out.write("<form action=\"\" method=\"post\">\r\n");
        out.write("    Cari Data Barang : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\r\n");
        out.write("    <input type=\"submit\" value=\" Cari \" class=\"button\"/> <br>\r\n");
        out.write("</form>\r\n");
        out.write("    ");
        if (_jspx_meth_sql_query_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("    <br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
        out.write("        <tr class=\"head\">\r\n");
        out.write("            <td>Kode Barang</td><td>Nama Barang</td><td>Harga Barang</td><td>Stok Barang</td><td>Action</td>\r\n");
        out.write("        </tr>\r\n");
        out.write("        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("</table>\r\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_sql_query_0.setVar("querybarang");
    _jspx_th_sql_query_0.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("        SELECT * from barang where kd_brg like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or \r\n");
          out.write("        nm_brg like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_forEach_0.setVar("rowbrg");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${querybarang.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr class=\"isi\">\r\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                <td valign='top'><a href='BarangServlet?aksi=HAPUS&kode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus</a> |\r\n");
          out.write("                    <a href='beranda.jsp?halaman=tampilbrg&aksi=GANTI&kd_brg=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                    &nm_brg=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&harga=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&stok=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowbrg[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampilsup'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<h1>Data Master Supplier</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"SupplierServlet\" method=\"post\" onsubmit=\"return validasi_inputSupplier(this)\">\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <tr>\n");
        out.write("            <td>Kode Supplier</td> <td>: <input type=\"text\" name=\"kd_supp\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.kd_supp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Nama Supplier</td> <td>: <input type=\"text\" name=\"nm_supp\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nm_supp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Alamat Supplier</td> <td>: <input type=\"text\" name=\"alamat\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.alamat}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Telepon Supplier</td> <td>: <input type=\"text\" name=\"telp\" onkeypress=\"return hanyaAngka(event)\"\n");
        out.write("            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.telp}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td> </td>\n");
        out.write("        </tr>\n");
        out.write("    </form>\n");
        out.write("</td></tr></table><br>\n");
        out.write("<form action=\"\" method=\"post\">\n");
        out.write("    Cari Data Supplier :<input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("    <input type=\"submit\" value=\" Cari \" class=\"button\"/> <br>\n");
        out.write("</form>\n");
        out.write("    ");
        if (_jspx_meth_sql_query_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    <br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("        <tr class=\"head\">\n");
        out.write("            <td>Kode Supplier</td><td>Nama Supplier</td><td>Alamat Supplier</td><td>Telepon Supplier</td><td>Action</td>\n");
        out.write("        </tr>\n");
        out.write("        ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</table>\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_sql_query_1.setVar("querysupplier");
    _jspx_th_sql_query_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        SELECT * FROM supplier where kd_supp like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or nm_supp like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_forEach_1.setVar("rowsupp");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${querysupplier.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr class=\"isi\">\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'><a href='SupplierServlet?aksi=HAPUS&kd_supp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus</a> |\n");
          out.write("                    <a href='beranda.jsp?halaman=tampilsup&aksi=GANTI&kd_supp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    &nm_supp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&alamat=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&telp=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowsupp[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.halaman=='tampiluse'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("<!DOCTYPE html>\n");
        out.write("<h1>Data Master User</h1>\n");
        out.write("<table border=\"0\">\n");
        out.write("    <form action=\"UserServlet\" method=\"post\" onsubmit=\"return validasi_inputUser(this)\">\n");
        out.write("        <input type=\"hidden\" name=\"aksi\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.aksi}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("        <tr>\n");
        out.write("            <td>Id User</td> <td>: <input type=\"text\" name=\"id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id_user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/> </td>\n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Nama User</td> <td>: <input type=\"text\" name=\"nama\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.nm_user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Hak Akses</td> <td>: <input type=\"text\" name=\"hak\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hak_akses}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td>Password</td> <td>: <input type=\"text\" name=\"pass\" onkeypress=\"return hanyaAngka(event)\"\n");
        out.write("        value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/></td>  \n");
        out.write("        </tr>\n");
        out.write("        <tr>\n");
        out.write("            <td><input type=\"submit\" value=\"Simpan\" class=\"button\"/></td> <td> </td>\n");
        out.write("        </tr>\n");
        out.write("    </form>\n");
        out.write("</td></tr></table><br>\n");
        out.write("\n");
        out.write("<form action=\"\" method=\"post\">\n");
        out.write("    Cari Data User : <input type=\"text\" name=\"cari\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"/>\n");
        out.write("    <input type=\"submit\" value=\" Cari \" class=\"button\"/> <br>\n");
        out.write("</form>\n");
        out.write("    ");
        if (_jspx_meth_sql_query_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    <br><table border=\"1\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
        out.write("        <tr class=\"head\">\n");
        out.write("            <td>Id User</td><td>Nama User</td><td>Hak Akses</td><td>Password</td><td>Action</td>\n");
        out.write("        </tr>\n");
        out.write("        ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("</table>\n");
        out.write("\n");
        out.write("\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_sql_query_2.setVar("queryuser");
    _jspx_th_sql_query_2.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        SELECT * from user where id_user like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%' or \n");
          out.write("        nm_user like '%");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.cari}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%'\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_forEach_2.setVar("rowuser");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${queryuser.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr class=\"isi\">\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td valign='top'><a href='UserServlet?aksi=HAPUS&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Hapus</a> |\n");
          out.write("                    <a href='beranda.jsp?halaman=tampiluse&aksi=GANTI&id_user=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                    &nm_user=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&hak_akses=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[2]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&pass=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rowuser[3]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("'> Edit </a>\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_sql_query_3.setVar("ttl");
    _jspx_th_sql_query_3.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            SELECT SUM(quantity) AS ttl_D,\r\n");
          out.write("            SUM(subtotal) AS ttl_K FROM sementara\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_forEach_3.setVar("ttlDK");
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttl.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<br>\r\n");
          out.write("                      <table border=\"0\">\r\n");
          out.write("                          <tr><td>Total Jumlah Barang Dipesan</td>  <td>:\r\n");
          out.write("                                  <input type=\"text\" readonly=\"readonly\" name=\"totjum\" size=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td></tr>\r\n");
          out.write("                          <tr><td>Total Bayar</td>                  <td>:\r\n");
          out.write("                                  <input type=\"text\" readonly=\"readonly\" name=\"tobay\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td></tr>\r\n");
          out.write("                      ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_4 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_4.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_sql_query_4.setVar("ttl");
    _jspx_th_sql_query_4.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_4 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_4 = _jspx_th_sql_query_4.doStartTag();
      if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_4[0]++;
          _jspx_th_sql_query_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_4.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                SELECT SUM(quantity) AS ttl_D,\r\n");
          out.write("                SUM(subtotal) AS ttl_K FROM sementara\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_sql_query_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_4[0]--;
      }
      if (_jspx_th_sql_query_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_4.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_forEach_4.setVar("ttlDK");
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttl.rowsByIndex}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<br>\r\n");
          out.write("                    <table border=\"0\">\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>Total Jumlah Barang Dibeli</td>\r\n");
          out.write("                            <td>: <input type=\"text\" readonly=\"readonly\" name=\"total\" size=\"1\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                        <tr>\r\n");
          out.write("                            <td>Total Bayar</td>\r\n");
          out.write("                            <td>: <input type=\"text\" readonly=\"readonly\" name=\"tobay\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ttlDK[1]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></td>\r\n");
          out.write("                        </tr>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_sql_query_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_5 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_5.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_sql_query_5.setVar("ttl");
    _jspx_th_sql_query_5.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_sql_query_5 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_5 = _jspx_th_sql_query_5.doStartTag();
      if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_5[0]++;
          _jspx_th_sql_query_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_5.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("            SELECT SUM(quantity) AS ttl_D,\r\n");
          out.write("            SUM(subtotal) AS ttl_K FROM sementara_retur\r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_5[0]--;
      }
      if (_jspx_th_sql_query_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_5.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='cetaklapbarang'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>Cetak Laporan</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <h2>Cetak Laporan Barang Berdasarkan Stok tersedia</h2>\r\n");
        out.write("        <form action=\"TampilLapBarang.jsp\" method=\"get\">\r\n");
        out.write("            Stok <= <input type=\"number\" name=\"jumlah\" value=\"0\">\r\n");
        out.write("            <input type=\"submit\" name=\"submit\" value=\"Cetak Laporan\"/>\r\n");
        out.write("        </form>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='cetaklapsupplier'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>Cetak Laporan</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <h2>Cetak Laporan Supplier</h2>\r\n");
        out.write("        <form action=\"TampilLapBarang.jsp\" method=\"get\">\r\n");
        out.write("            <input type=\"submit\" name=\"submit\" value=\"Cetak Laporan\"/>\r\n");
        out.write("        </form>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='cetaklappemesanan'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>JSP Page</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <h1>Tampilkan Laporan Pemesanan</h1>\r\n");
        out.write("        <h1>Berdasarkan Bulan dan Tahun</h1>\r\n");
        out.write("        <form action=\"TampilLapPemesanan.jsp\">\r\n");
        out.write("            Masukkan Bulan :\r\n");
        out.write("            <select name=\"bulan\" id=\"bulan\">\r\n");
        out.write("                <option value=\"1\">Januari</option>\r\n");
        out.write("                <option value=\"2\">Februari</option>\r\n");
        out.write("                <option value=\"3\">Maret</option>\r\n");
        out.write("                <option value=\"4\">April</option>\r\n");
        out.write("                <option value=\"5\">Mei</option>\r\n");
        out.write("                <option value=\"6\">Juni</option>\r\n");
        out.write("                <option value=\"7\">Juli</option>\r\n");
        out.write("                <option value=\"8\">Agustus</option>\r\n");
        out.write("                <option value=\"9\">September</option>\r\n");
        out.write("                <option value=\"10\">Oktober</option>\r\n");
        out.write("                <option value=\"11\">November</option>\r\n");
        out.write("                <option value=\"12\">Desember</option>\r\n");
        out.write("            </select><br><br>\r\n");
        out.write("            Masukan Tahun :\r\n");
        out.write("            <select name=\"tahun\" id=\"tahun\">\r\n");
        out.write("                <option value=\"2019\">2019</option>\r\n");
        out.write("                <option value=\"2020\">2020</option>\r\n");
        out.write("                <option value=\"2021\">2021</option>\r\n");
        out.write("                <option value=\"2022\">2022</option>\r\n");
        out.write("                <option value=\"2023\">2023</option>\r\n");
        out.write("                <option value=\"2024\">2024</option>\r\n");
        out.write("                <option value=\"2025\">2025</option>\r\n");
        out.write("                <option value=\"2026\">2026</option>\r\n");
        out.write("                <option value=\"2027\">2027</option>\r\n");
        out.write("                <option value=\"2028\">2028</option>\r\n");
        out.write("                <option value=\"2029\">2029</option>\r\n");
        out.write("            </select><br>\r\n");
        out.write("            <br>\r\n");
        out.write("            <input type=\"submit\" value=\"TAMPIL\">\r\n");
        out.write("        </form>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='cetaklappembelian'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("    \r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <h1>Tampilkan Laporan Pembelian</h1> \r\n");
        out.write("            <h1>Berdasarkan Bulan dan Tahun</h1>\r\n");
        out.write("        <form action=\"TampilLapPembelian.jsp\">\r\n");
        out.write("            Masukkan Bulan :\r\n");
        out.write("            <select name=\"bulan\" id=\"bulan\">\r\n");
        out.write("                <option value=\"1\">Januari</option>\r\n");
        out.write("                <option value=\"2\">Februari</option>\r\n");
        out.write("                <option value=\"3\">Maret</option>\r\n");
        out.write("                <option value=\"4\">April</option>\r\n");
        out.write("                <option value=\"5\">Mei</option>\r\n");
        out.write("                <option value=\"6\">Juni</option>\r\n");
        out.write("                <option value=\"7\">Juli</option>\r\n");
        out.write("                <option value=\"8\">Agustus</option>\r\n");
        out.write("                <option value=\"9\">September</option>\r\n");
        out.write("                <option value=\"10\">Oktober</option>\r\n");
        out.write("                <option value=\"11\">November</option>\r\n");
        out.write("                <option value=\"12\">Desember</option>\r\n");
        out.write("            </select><br><br>\r\n");
        out.write("            <select name=\"tahun\" id=\"tahun\">\r\n");
        out.write("                <option value=\"2019\">2019</option>\r\n");
        out.write("                <option value=\"2020\">2020</option>\r\n");
        out.write("                <option value=\"2021\">2021</option>\r\n");
        out.write("                <option value=\"2022\">2022</option>\r\n");
        out.write("                <option value=\"2023\">2023</option>\r\n");
        out.write("                <option value=\"2024\">2024</option>\r\n");
        out.write("                <option value=\"2025\">2025</option>\r\n");
        out.write("                <option value=\"2026\">2026</option>\r\n");
        out.write("                <option value=\"2027\">2027</option>\r\n");
        out.write("                <option value=\"2028\">2028</option>\r\n");
        out.write("                <option value=\"2029\">2029</option>\r\n");
        out.write("            </select>\r\n");
        out.write("            <br><br>\r\n");
        out.write("            <input type=\"submit\" value=\"TAMPIL\">\r\n");
        out.write("        </form>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
    return false;
  }

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.hal=='cetaklapretur'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("<!DOCTYPE html>\r\n");
        out.write("<html>\r\n");
        out.write("    <head>\r\n");
        out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
        out.write("        <title>JSP Page</title>\r\n");
        out.write("    </head>\r\n");
        out.write("    <body>\r\n");
        out.write("        <h1>Tampilkan Laporan Retur</h1>\r\n");
        out.write("            <h1>Berdasarkan Bulan dan Tahun</h1>\r\n");
        out.write("        <form action=\"TampilLapRetur.jsp\">\r\n");
        out.write("            Masukkan Bulan :\r\n");
        out.write("            <select name=\"bulan\" id=\"bulan\">\r\n");
        out.write("                <option value=\"1\">Januari</option>\r\n");
        out.write("                <option value=\"2\">Februari</option>\r\n");
        out.write("                <option value=\"3\">Maret</option>\r\n");
        out.write("                <option value=\"4\">April</option>\r\n");
        out.write("                <option value=\"5\">Mei</option>\r\n");
        out.write("                <option value=\"6\">Juni</option>\r\n");
        out.write("                <option value=\"7\">Juli</option>\r\n");
        out.write("                <option value=\"8\">Agustus</option>\r\n");
        out.write("                <option value=\"9\">September</option>\r\n");
        out.write("                <option value=\"10\">Oktober</option>\r\n");
        out.write("                <option value=\"11\">November</option>\r\n");
        out.write("                <option value=\"12\">Desember</option>\r\n");
        out.write("            </select><br><br>\r\n");
        out.write("            Masukan Tahun :\r\n");
        out.write("            <select name=\"tahun\" id=\"tahun\">\r\n");
        out.write("                <option value=\"2019\">2019</option>\r\n");
        out.write("                <option value=\"2020\">2020</option>\r\n");
        out.write("                <option value=\"2021\">2021</option>\r\n");
        out.write("                <option value=\"2022\">2022</option>\r\n");
        out.write("                <option value=\"2023\">2023</option>\r\n");
        out.write("                <option value=\"2024\">2024</option>\r\n");
        out.write("                <option value=\"2025\">2025</option>\r\n");
        out.write("                <option value=\"2026\">2026</option>\r\n");
        out.write("                <option value=\"2027\">2027</option>\r\n");
        out.write("                <option value=\"2028\">2028</option>\r\n");
        out.write("                <option value=\"2029\">2029</option>\r\n");
        out.write("            </select><br>\r\n");
        out.write("            <br>\r\n");
        out.write("            <input type=\"submit\" value=\"TAMPIL\">\r\n");
        out.write("        </form>\r\n");
        out.write("    </body>\r\n");
        out.write("</html>\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                ");
        out.write("\r\n");
        out.write("    <div class=\"post_title\">\r\n");
        out.write("        <h1>HOME WEBSITE TOKO KURA TULIS</h1>\r\n");
        out.write("    </div>\r\n");
        out.write("    <div class=\"text_area\">\r\n");
        out.write("        <img src=\"images/tulis.png\" width=\"300\" height=\"200\" class=\"pic\" style=\"float:center;\"/><br>\r\n");
        out.write("        Toko Kura Tulis berkedudukan di Jalan Satu Maret Nomor.41 Jakarta Barat dan berdiri pada tanggal 23 Juni 2020<br>\r\n");
        out.write("        Toko Kura Tulis terbentuk atas lima orang yaitu Revina, Ayu, Irma, Feby dan Dimas. Karena Toko ini masih tergolong baru, jadi belum berkembang pesat<br>\r\n");
        out.write("        Toko Kura Tulis menjual berbagai macam kebutuhan alat tulis kantor seperti pena, penggaris, pensil dan lainnya<br>\r\n");
        out.write("        <h2>SELAMAT DATANG DI APLIKASI TOKO KURA TULIS!!!</h2>\r\n");
        out.write("        Anda Login sebagai admin.\r\n");
        out.write("    </div>\r\n");
        out.write("\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
