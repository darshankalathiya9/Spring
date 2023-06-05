<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>Home Page</title>
</head>
<body>
	<div class="container">
		<div class="card mx-auto mt-5 bg-secondary" style="width: 50%;">
			<div class="card-body py-5">
				<h3 class="text-center text-white"
					style="text-transform: uppercase;">My Search</h3>
				<form action="search" class="mt-5">
					<div class="form-group">
						<input type="text" name="querybox"
							placeholder="Enter Your Keyword" class="form-control">
					</div>
					<div class="container text-center mt-3">
						<button class="btn btn-outline-light">Search</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>