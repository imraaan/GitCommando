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
	
<form class="container p-3 mt-5 w-25" action="Validate">
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
	
	<!--
<section class="vh-100">
  <div class="container">
    <div class="row">
      <div class="col-sm-6 text-black">

        <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

          <form style="width: 23rem;">

            <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Log in</h3>

            <div class="form-outline mb-4">
              <input type="email" id="form2Example18" class="form-control form-control-lg" />
              <label class="form-label" for="form2Example18">Email address</label>
            </div>

            <div class="form-outline mb-4">
              <input type="password" id="form2Example28" class="form-control form-control-lg" />
              <label class="form-label" for="form2Example28">Password</label>
            </div>

            <div class="pt-1 mb-4">
              <button class="btn btn-info btn-lg btn-block" type="button">Login</button>
            </div>
          </form>

        </div>

      </div>
      <div class="col-sm-6 px-0 d-none d-sm-block">
        <img src="https://images.unsplash.com/photo-1671135786894-d51666d1f8b5?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=385&q=80"
          alt="Login image" class="w-100 vh-100" style="object-fit: cover; object-position: left;">
      </div>
    </div>
  </div>
</section>
	-->
</body>
</html>