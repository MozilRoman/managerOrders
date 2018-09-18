<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RecoverPassword</title>
<link rel="stylesheet" href="resources/css/orders.css" type="text/css"/>
</head>
<body>

<div class="topnav">
  <div class="topnav-right">    
    <a href="${pageContext.request.contextPath}/login">Log in</a>
  </div>
</div>

<form action="${pageContext.request.contextPath}/recoverpassword" method="post">
     <div class="container">
    <h1>Recover Password</h1>
    <p>Please fill in this form to create new password.</p>
    <hr>

    <label for="email"><b>Login</b></label>
    <input type="email" placeholder="Enter Login " name="login" required>

    <!-- <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="password_repeat" required>  -->
     
    <button type="submit" class="registerbtn">Submit</button>    
    </div>
</form>
<hr>

<div class="navbar">
  <p>@Created by Roman Mozil</p>
</div>

</body>
</html>
