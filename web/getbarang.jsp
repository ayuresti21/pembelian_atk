<%-- 
    Document   : getbarang
    Created on : Apr 16, 2020, 11:35:23 PM
    Author     : ASUS
--%>
<%@page import="java.sql.*" %>
<%@page import="control.koneksi"%>
<%@page import="model.barang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
barang barang = new barang();
koneksi kon = new koneksi();
ResultSet rs = null;
String emp_id = request.getParameter("emp_id").toString();
String data = null;
Statement st;
rs = kon.stmt.executeQuery("SELECT * from barang where kd_brg='" + emp_id + "' ");
while (rs.next()) {
    data = ":" + rs.getString(3) + ":" + emp_id;
}
out.println(data);
%>