<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>

	<h1>This is help Page</h1>
	<p>You will get help here</p>

	<%-- <%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("Id");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%> --%>

	<h1>
		Name is
		<%-- <%=name%> --%>
		${name }
	</h1>
	<h1>
		Id id
		<%-- <%=id%> --%>
		${Id}
	</h1>

	<h1>
		Date and Time is
		<%-- <%=time%> --%>
		${time}
	</h1>

	<hr>

	



</body>
</html>