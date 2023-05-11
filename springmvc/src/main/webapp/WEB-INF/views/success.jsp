<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
	<h3>${Header }</h3>
	<p>${description }</p>

	<hr>

	<h1>Welcome ${user.userName }</h1>

	<h1>Your Email is ${user.email }</h1>

	<p>Your password is ${user.password }. Try to secure it....</p>



</body>
</html>