<%-- 
    Document   : index
    Created on : May 3, 2020, 5:04:41 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Login</title>
        <link rel="stylesheet" type="text/css" href="config/login.css"/>
    </head>
    <body>
        <h2 align="center">Login Form Kura Tulis</h2>
<form action="Login?proses=login" method="post">
  <div class="imgcontainer">
    <img src="images/photo.jpg" alt="Avatar" class="avatar">
  </div>
  <div class="container">
    <label for="username"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="username" required>

    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
        
    <button type="submit" value="Login">Login</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>
  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn" value="reset">Cancel</button>
  </div>
</form>

    </body>
</html>
