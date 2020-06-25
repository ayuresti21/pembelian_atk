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
    <title>Pembelian ATK Kura Tulis</title>
    <link href="config/design.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="config/setting.js"></script>
    <script type="text/javascript" src="config/cssjs.js"></script>
    <link href="config/cssTable.css" rel="stylesheet" type="text/css" />

</head>
<body>
    <div class="header">
        <h1>Pembelian ATK</h1>
        <marquee behavior="alternate">Program Studi Sistem Informasi Akuntansi</marquee>
    </div>

    <div class="topnav" id="myTopnav">
        <a href="beranda.jsp">Home</a>
        <a href="contact.jsp">Contact</a>
        <a href="home.jsp">About</a>
        <div class="dropdown">
            <button class="dropbtn">Settings
                <i class="fa fa-caret-down"></i>
            </button>
            <div class="dropdown-content">
                <a href="beranda.jsp?halaman=dataPeg">Change Password</a>
                <a href="index.jsp?halaman=logout">Logout</a>
            </div>
        </div> 
        <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="myFunction()">&#9776;</a>
    </div>


    <div id="mySidenav" class="sidenav">
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
        <a href="beranda.jsp?halaman=tampilbrg&aksi=SIMPAN">Data Barang</a>
        <a href="beranda.jsp?halaman=tampilsup&aksi=SIMPAN">Data Supplier</a>
        <a href="beranda.jsp?halaman=tampiluse&aksi=SIMPAN">Data User</a>
        <a href="beranda.jsp?halaman=pesan">Pemesanan</a>
        <a href="beranda.jsp?halaman=beli">Pembelian</a>
        <a href="beranda.jsp?halaman=retur">Retur Pembelian</a>
        <a href="beranda.jsp?hal=cetaklapbarang">Laporan Barang</a>
        <a href="beranda.jsp?hal=cetaklapsupplier">Laporan Supplier</a>
        <a href="beranda.jsp?hal=cetaklappemesanan">Laporan Pemesanan</a>
        <a href="beranda.jsp?hal=cetaklappembelian">Laporan Pembelian</a>
        <a href="beranda.jsp?hal=cetaklapretur">Laporan Retur</a>
    </div>
    <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Menu</span>

    <div class="text">
        <c:choose>
            <c:when test="${param.halaman=='tampilbrg'}">
                <%@include file="barang.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='tampilsup'}">
                <%@include file="supplier.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='tampiluse'}">
                <%@include file="user.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='pesan'}">
                <%@include file="pemesanan.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='beli'}">
                <%@include file="pembelian.jsp" %>
            </c:when>
            <c:when test="${param.halaman=='retur'}">
                <%@include file="retur.jsp" %>
            </c:when>
            <c:when test="${param.hal=='cetaklapbarang'}">
                <%@include file="CetakLaporanBarang.jsp" %>
            </c:when>
            <c:when test="${param.hal=='cetaklapsupplier'}">
                <%@include file="CetakLaporanSupplier.jsp" %>
            </c:when>
            <c:when test="${param.hal=='cetaklappemesanan'}">
                <%@include file="CetakLaporanPemesanan.jsp" %>
            </c:when>
            <c:when test="${param.hal=='cetaklappembelian'}">
                <%@include file="CetakLaporanPembelian.jsp" %>
            </c:when>
            <c:when test="${param.hal=='cetaklapretur'}">
                <%@include file="CetakLaporanRetur.jsp" %>
            </c:when>
            <c:otherwise>
                <%@include file="home.jsp" %>
            </c:otherwise>
        </c:choose>
    </div>

    <div class="box">
        <div class="subtitle">About this website</div>
        <marquee behavior="scroll"  scrollamount="10">
            SISTEM INFORMASI AKUNTANSI UNIVERSITAS BSI APLIKASI PEMBELIAN
        </marquee>
    </div>
    <div class="box">
        <div class="subtitle">Date and Time</div>
        <marquee direction="left"> <%=new java.util.Date()%>
        </marquee>
        <br />
    </div>

    <div class="footer">
        <div id="right">
            Dimas Hogie Sei Naga © Copyright 2020 All Right Reserved  </div>
        <a href="beranda.jsp?">Home |</a>  
        <a href="home.jsp?">About |</a>   
        <a href="#">FAQ |</a>   
        <a href="#">Contact</a>   
    </div>
</body>
</html>