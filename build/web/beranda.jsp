<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql"uri="http://java.sun.com/jsp/jstl/sql"%>
<sql:setDataSource var="dataSource"
                   driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/pembelian_atk"
                   user="root"password=""/>

<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Aplikasi Pembelian</title>
    <link href="config/design.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="config/setting.js"></script>
    <link href="config/cssTable.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <!--
    This is a free CSS template provided by templatemo.com
    -->
    <div id="container_wrapper">
        <div class="spacer"></div>
        <div id="container">
            <div id="top">  
                <a href="beranda.jsp?halaman=dataPeg">Change Password</a> || 
                <a href="beranda.jsp?halaman=logout">Logout</a>
            </div>
            <div id="header">
                <div id="inner_header">
                    <div id="site_title">Aplikasi Pembelian</div>
                    <div id="site_slogan">
                        <marquee behavior="alternate">Program Studi Sistem Informasi Akuntansi</marquee>
                    </div>
                </div>
            </div>
            
               
            <div id="left_column">
                <div class="text_area" align="justify">
                    
                    <c:choose>
                        <c:when test="${param.halaman=='home'}">
                            <%@include file="home.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='tampilbrg'}">
                            <%@include file="barang.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='tampilsup'}">
                            <%@include file="supplier.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='tampiluse'}">
                            <%@include file="user.jsp" %>
                        </c:when>
                          <c:when test="${param.halaman=='tampilaku'}">
                            <%@include file="akun.jsp" %>
                        </c:when>
                         <c:when test="${param.halaman=='pesan'}">
                            <%@include file="pemesanan.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='beli'}">
                            <%@include file="pembelian.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='jurnal'}">
                            <%@include file="jurnal.jsp" %>
                        </c:when>
                        <c:when test="${param.halaman=='retur'}">
                            <%@include file="retur.jsp" %>
                        </c:when>
                        <c:otherwise>
                            <%@include file="home.jsp" %>
                        </c:otherwise>
                    </c:choose>
                </div>
                </div>
            
            <div id="right_column">

                <ul class="menu">
                <li><a href="beranda.jsp">Home</a></li>
                <li><a href="beranda.jsp?halaman=tampilbrg&aksi=SIMPAN">Data Barang</a></li>
                <li><a href="beranda.jsp?halaman=tampilsup&aksi=SIMPAN">Data Supplier</a></li>
                <li><a href="beranda.jsp?halaman=tampiluse&aksi=SIMPAN">Data User</a></li>
                <li><a href="beranda.jsp?halaman=tampilaku&aksi=SIMPAN">Data Akun</a></li>
                <li><a href="beranda.jsp?halaman=pesan">Pemesanan</a></li>
                <li><a href="beranda.jsp?halaman=beli">Pembelian</a></li>
                <li><a href="beranda.jsp?halaman=retur">Retur Pembelian</a></li>
                <li><a href="beranda.jsp?halaman=jurnal">Jurnal Umum</a></li>
               </ul>

                <div class="box" align="justify">
                    <div class="subtitle">Date and Time</div>
                    <marquee direction="left"> <%=new java.util.Date()%>
                    </marquee>
                    <br/>
                </div>
                <div class="box" align="justify">
                    <div class="subtitle">About this website</div>
                    <marquee behavior="scroll" direction="up" scrollamount="5">
                        SISTEM INFORMASI AKUNTANSI UNIVERSITAS BSI APLIKASI PEMBELIAN
                    </marquee>
                </div>
                <div class="box">
                    <div class="subtitle">About this website</div>
                    <marquee direction="down" height="200" behavior="alternate">
                        <marquee marquee behavior="alternate">
                            SISTEM INFORMASI AKUNTANSI<br>UNIVERSITAS BSI<br>APLIKASI PEMBELIAN
                        </marquee>
                    </marquee>
                </div>
            </div>

            <div id="footer">
                Copyright © 2020 PRODI SISTEM INFORMASI AKUNTANSI UBSI 
            </div>

        </div>
        <div class="spacer"></div>
    </div> 
</body>
</html>