<%-- 
    Document   : getbarang
    Created on : Apr 16, 2020, 11:35:23 PM
    Author     : ASUS
--%>
<%@page import="java.sql.*" %>
<%@page import="control.koneksi"%>
<%@page import="model.pembelian"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
pembelian pembelian = new pembelian();
koneksi kon = new koneksi();
ResultSet rs = null;
String bel_id = request.getParameter("bel_id").toString();
String data = null;
Statement st;
rs = kon.stmt.executeQuery("SELECT * from detail_beli where no_beli='" + bel_id + "' ");
while (rs.next()) {
    data = ":" + rs.getString(4) + ":" + bel_id;
}
out.println(data);
%>