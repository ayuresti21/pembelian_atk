<%@page import="java.sql.*"%>
<%@page import="model.akun,model.pembelian,model.jurnal"%>
<%@page import="control.koneksi" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% java.util.Date waktu = new java.util.Date();
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
%>
<html>
    <head>
    <title>Transaksi Jurnal Umum</title>
    </head>
    <body>
        <sql:query var="ttl" dataSource="${dataSource}">
            SELECT SUM(debet) AS ttl_D,
            SUM(kredit) AS ttl_K FROM sementara_jurnal
        </sql:query>
<h1>Transaksi Retur</h1>
<table border="0">
<form action="ServletJurnal" method="post" onsubmit="return validasi_inputJurnal(this)">
<pre>
<tr>
<td>No Jurnal</td>  
<td>: <%
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
%>
</pre></td>
</tr>
<tr>
<td>Tanggal Jurnal</td>  
<td>: <input type="text" name="tanggal" value =<%= tgljurnal%> readonly="readonly"></td>
</tr>
<tr>
<td>No Bukti Transaksi</td>
<td>: <select name="nobeli" onchange="showPesan(this.value);">
                            <option value="-1">Pilih Nomor Pembelian</option>
                            <%
                            qrypembelian = kon.stmt.executeQuery("SELECT no_beli FROM pembelian where not exists"
                            + "(select * from jurnal where jurnal.no_beli=pembelian.no_beli)");
                            while (qrypembelian.next()) {
                                pembelian.setNobeli(qrypembelian.getString("no_beli"));
                            %>
                            <option value="<%=pembelian.getNobeli()%>"><%=pembelian.getNobeli()%></option>
                            <% } %>
                    </select>
                    </td>
                    </tr>
            <input type="hidden" name="emp_id" id="emp_id" value="${param.cari}">
</tr>
<tr>
<td>Keterangan</td>
<td>: <textarea name="keterangan"></textarea></td>
</tr>
<tr>
<td>Nominal</td>   <td>: <input type="text" name="sub" id="subtotal" value=""
                        readonly="readonly" onkeyup="showPesan();"></td>
                    </tr>
<tr>
<table width="100" border="1" cellpadding="0" cellspacing="0">
<tr class="head">
<td> </td><td>Kode dan Nama Akun</td><td>Debet</td><td>Kredit</td>
</tr>

<tr class="isi">
<td align="center"><input type="checkbox" name="pilih()" value="${param.pilih}"></td>
<td><select name="no_akunkredit" id="akunkredit">
<option>Kode Akun   | Nama Akun</option>
<%
rs =  kon.stmt.executeQuery("SELECT * from akun ");
while (rs.next()) {
akun.setNoakun(rs.getString("no_akun"));
akun.setNamaakun(rs.getString("nm_akun"));
%>
<option value="<%=akun.getNoakun()%>"><%=akun.getNoakun()%>
|| <%=akun.getNamaakun()%></option>
<% } %>
</select>
</td>
<td><input name="debet" id="debet1" type="text" onchange="Hitung()" value="0"></td>
<td><input name="kredit" id="kredit1" type="text" onchange="Hitung()" value="0"></td>
</tr>

<tr class="isi">                         
<td align="center"><input type="checkbox" name="pilih()" value="${param.pilih}"></td>
<td><select name="no_akunkredit" id="akunkredit">
<option>Kode Akun   | Nama Akun</option>
<%
rs =  kon.stmt.executeQuery("SELECT * from akun ");
while (rs.next()) {
akun.setNoakun(rs.getString("no_akun"));
akun.setNamaakun(rs.getString("nm_akun"));
%>
<option value="<%=akun.getNoakun()%>"><%=akun.getNoakun()%>
|| <%=akun.getNamaakun()%></option>
<% } %>
</select>
</td>
<td><input name="debet" id="debet2" type="text" onchange="Hitung()" value="0"></td>
<td><input name="kredit" id="kredit2" type="text" onchange="Hitung()" value="0"></td>
</tr>

<tr class="isi">
<td align="center"><input type="checkbox" name="pilih()" value="${param.pilih}"></td>
<td><select name="no_akunkredit" id="akunkredit">
<option>Kode Akun   | Nama Akun</option>
<%
rs =  kon.stmt.executeQuery("SELECT * from akun ");
while (rs.next()) {
akun.setNoakun(rs.getString("no_akun"));
akun.setNamaakun(rs.getString("nm_akun"));
%>
<option value="<%=akun.getNoakun()%>"><%=akun.getNoakun()%>
|| <%=akun.getNamaakun()%></option>
<% } %>
</select>
</td>
<td><input name="debet" id="debet3" type="text" onchange="Hitung()" value="0"></td>
<td><input name="kredit" id="kredit3" type="text" onchange="Hitung()" value="0"></td>
</tr>

<tr class="isi">
<td align="center"><input type="checkbox" name="pilih()" value="${param.pilih}"></td>
<td><select name="no_akunkredit" id="akunkredit">
<option>Kode Akun   | Nama Akun</option>
<%
rs =  kon.stmt.executeQuery("SELECT * from akun ");
while (rs.next()) {
akun.setNoakun(rs.getString("no_akun"));
akun.setNamaakun(rs.getString("nm_akun"));
%>
<option value="<%=akun.getNoakun()%>"><%=akun.getNoakun()%>
|| <%=akun.getNamaakun()%></option>
<% } %>
</select>
</td>
<td><input name="debet" id="debet4" type="text" onchange="Hitung()" value="0"></td>
<td><input name="kredit" id="kredit4" type="text" onchange="Hitung()" value="0"></td>
</tr>  

<tr class="head">
<td colspan="2" align="center">Total</td>
<td>
<input type="text" id="ttldebet" onchange="Hitung()" readonly="readonly"></td>
<td><input type="text" id="ttlkredit" onchange="Hitung()" readonly="readonly"></td>
<tr class="head">
<td colspan="2" align="center">Balance</td>
<td>&nbsp;</td>
<td><input type="text" name="balance" id="balance" readonly="readonly"></td>
</tr>
<tr class="isi">
<td colspan="4" align="center">
<input type="submit" value="simpan" class="button"/>
</td>
</tr>
</table>
</form>
</body>
</html>