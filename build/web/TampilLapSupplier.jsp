<%-- 
    Document   : TampilLapSupplier
    Created on : Jun 17, 2020, 7:35:09 PM
    Author     : ASUS
--%>

<%@page import="control.koneksi"%>
<%@page import="java.io.*, java.util.*, java.sql.*"%>
<%@page import="net.sf.jasperreports.engine.*" %>
<%@page import="net.sf.jasperreports.view.JasperViewer.*"%>
<%@page import="javax.servlet.ServletResponse" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laporan Supplier</title>
    </head>
    <body>
        <%
            koneksi kon = new koneksi();
            File reportFile = new File(application.getRealPath("laporan/laporan_supplier.jasper"));
            Map param = new HashMap();
            byte[] bytes = JasperRunManager.runReportToPdf(reportFile.getPath(), param, kon.stmt.getConnection());
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            
            ServletOutputStream outStream = response.getOutputStream();
            outStream.write(bytes, 0, bytes.length);
            outStream.flush();
            outStream.close();
        %>
    </body>
</html>
