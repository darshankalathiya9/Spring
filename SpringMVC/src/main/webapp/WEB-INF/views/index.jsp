<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
</head>
<body>
	<h2><a href="register">Register....</a></h2>
	<h2><a href="about">About.....</a></h2>
	<h2><a href="contact">Contact.....</a></h2>
	<h2><a href="home">Home.....</a></h2>
	
	<%-- <% String name = (String) request.getAttribute("name"); %>
	<h2><%=name %></h2> --%>
	
	 <h2>${name }</h2> 
	
	<%-- <% List<String> list = (List<String>) request.getAttribute("list"); %>
	<% out.print(list); %> --%>
	
	<h2>${list }</h2>
	<c:forEach items="${list }" var="fr">
		<h1>${fr }</h1>
	</c:forEach>
	
</body>
</html>