<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<%@ include file="bootstrap.jsp"%>
</head>
<body class="bg-light">

	<div class="container p-4">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Authentification</p>
						<form action="home" method="post">
							<div class="mb-3">
								<label class="form-label">Email</label> <input
									type="text" name="email" class="form-control">
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label> <input type="password"
									name="password" class="form-control">
							</div>
							<button type="submit" class="btn btn-primary col-md-12">Se connecter</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>