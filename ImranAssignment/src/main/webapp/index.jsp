<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login demo</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

	<style>
	* {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}
		body {
			background: #1e1e1e;
			color: #bbb;
			max-height: 100vh;
		}
		form {
			background: #262626;
			position: absolute;
			top: 10%;
			left: 40%;
			border-radius: 0.5em;
			box-shadow: -10px 8px 0px 0px #404040;
		}
		.cta-btn {
			background: indigo;
			border: 1px solid purple;
		}
		.cta-btn:hover {
			background: #3F3B6C;
		}
	</style>
</head>
<body>
	<script>
	</script>                    
<form action="Validate">
    <label for="username">Username :</label>
    <input type="text" class="form-control" id="username" name="username" required>
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    <br>
    <label for="password">Password :</label>
    <input type="password" class="form-control" id="password" name="password">
    <small id="emailHelp" class="form-text text-muted">should contain 3 - 20 characters, numbers and special characters</small>
    <br>
    <input class="cta-btn btn btn-primary w-100" type="submit" value="Click here to proceed !">
	</form>
</body>
</html>
	