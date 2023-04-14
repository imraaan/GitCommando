<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.imran.model.*" %>
<%
	User auth= (User)request.getSession().getAttribute("auth");
	if(auth!=null){
		request.setAttribute("auth", auth);
	}
%>
<!DOCTYPE html>
<html>
<head>
<%@include file="includes/head.jsp"%>   
<title>Login Page</title>
<style>
	body {
		background: url('./product-images/gradiant.jpg');
		background-repeat: no-repeat;
		background-size: cover;
	}
</style>
</head>
<body>
<%@include file="includes/navbar.jsp"%> 

<div class="container mt-5" >
		<div class="card w-50 mx-auto my-5 bg-dark">
			<div class="card-header text-center text-primary h4">User Login</div>
			<div class="card-body">
				<form action="user-login" method="post">
					<div class="form-group text-white">
						<label>Email: </label> 
						<input type="email" name="login-email" class="form-control" placeholder="Enter email">
					</div>
					<div class="form-group text-white">
						<label>Password:</label> 
						<input type="password" name="login-password" class="form-control" placeholder="Password">
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Login</button>
					</div>
				</form>
			</div>
		</div>
	</div>

<%@include file="includes/footer.jsp"%>  
</body>
</html>