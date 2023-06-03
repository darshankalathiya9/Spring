<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
	<table class="table table-dark table-striped container">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Address</th>
				<th scope="col">Contact</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
				<th scope="col">Edit</th>
				<th scope="col">Delete</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="u">
				<tr>
					<th scope="row">${u.id }</th>
					<td>${u.name }</td>
					<td>${u.address }</td>
					<td>${u.contact }</td>
					<td>${u.email }</td>
					<td>${u.password }</td>
					<td><a href="update/${u.id }">Edit</a></td>
					<td><a href="delete/${u.id }">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<br><br>
	<h1 class="text-center"><a href="register">Add User</a></h1>
</body>
</html>