<%@page import="java.sql.ResultSet"%>
<%@page import="control.koneksi"%>
<%@page import="model.barang,model.supplier,model.retur"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% java.util.Date waktu = new java.util.Date();
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
%>
<html>
    <head>
    <tittle>Transaksi Retur</tittle>
    </head>
    <body>
        <sql:query var="ttl" dataSource="${dataSource}">
            SELECT SUM(quantity) AS ttl_D,
            SUM(subtotal) AS ttl_K FROM sementara_retur
        </sql:query>
                    <h2>Transaksi Retur</h2>
                    <table border="0">
                    <form action="ServletRetur" method="post" onsubmit="return validasi_inputRetur(this)">
                    <pre>
<tr>
<td>No Retur</td>  <td><%
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
            %>
    </td>
</tr>
        <tr>
            <td>Tanggal Retur</td>  <td><input type="text" name="tanggal" value=<%= tgl%> ></td>
        </tr>
        <tr><td>Supplier</td>  <td><select name="supplier">
        <% 
            rs = kon.stmt.executeQuery("SELECT * from supplier ");
            while (rs.next()) {
                supplier.setKodesupp(rs.getString("kd_supp"));
                supplier.setNamasupp(rs.getString("nm_supp"));
        %>
        <option value="<%=supplier.getKodesupp()%>"><%=supplier.getNamasupp()%></option>
        <%  } %>
    </select></td>
        </tr>
        <tr>
            <td>Barang</td>  <td><select name="kode" onchange="showEmp(this.value);">
                        <option value="-1">Select</option>
                        <%
                            rs =  kon.stmt.executeQuery("SELECT * from barang ");
                            while (rs.next()) {
                                barang.setKodebarang(rs.getString("kd_brg"));
                                barang.setNamabarang(rs.getString("nm_brg"));
                        %>
                        <option value="<%=barang.getKodebarang()%>"><%=barang.getKodebarang()%>||
                        <%=barang.getNamabarang()%></option>
                        <% } %>
                </select></td>
        </tr>
        <tr>
            <td><input type="hidden" name="emp_id" id="emp_id" value=""></td>
        </tr>
        <tr>
            <td>Harga Barang</td>    <td><input type="text" name="harga" id="ename" value=""
                                   readonly="readonly" onkeyup="sumvalidasi_inputRetur();"></td>
        </tr>
        <tr>
            <td>Jumlah Pesan</td>    <td><input type="text" name="jml" id="jml" onkeyup="sumvalidasi_inputRetur();"></td>
        </tr>
        <tr>
            <td>Subtotal</td>  <td><input type="text" name="sub" id="subtotal" readonly="readonly"></td>
        </tr>
        <tr><td><input type="submit" value="TAMBAH" name="aksi1"></td></tr>          
        
            <table width="535" border="0" align="center">
                <tr align="center">
                    <td colspan="5"><h3>Data Barang Untuk Diretur</h3></td>
                </tr>
                <tr>
                    <th>Nomor Transaksi</th>
                    <th>Kode Barang</th>
                    <th>Quantity</th>
                    <th>Subtotal</th>
                    <th>AKSI</th>
                </tr>
                <%
                    rs = kon.stmt.executeQuery("SELECT * from sementara_retur");
                    while (rs.next()) {
                        out.println("<tr class=isi>"
                        + "<td>" + rs.getString(1) + "</td>"
                        + "<td>" + rs.getString(2) + "</td>"
                        + "<td>" + rs.getString(3) + "</td>"
                        + "<td>" + rs.getString(4) + "</td>"
                        + "<td><a href=ServletRetur?aksi2=HAPUS&kode=" + rs.getString(2) + ">Hapus</a></td>"
                        + "</tr>");
                        }
                  %>
                  
            </table>
                  <%kon.close();%>
     <input type="submit" value="SIMPAN" name="aksi3"> <input type="reset" value="CANCEL">
                    </pre>
                </form>
    </body>
</html>


