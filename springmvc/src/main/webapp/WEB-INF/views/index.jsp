<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is home Page</h1>
	<p>Called by home controller</p>

	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	List<String> friends = (List<String>) request.getAttribute("friends");
	%>
	<h1>
		Name is
		<%=name%>
	</h1>

	<h1>
		Id is
		<%=id%></h1>

	<h1>
		<%
		for (String s : friends) {
			out.print(s);
		}
		%>
	</h1>


</body>
</html>