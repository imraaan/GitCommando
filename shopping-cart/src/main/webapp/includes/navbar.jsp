<style>
.navbar{
background: rgba( 255, 255, 255, 0.1 );
box-shadow: 0 8px 32px 0 rgba( 31, 38, 135, 0.10 );
backdrop-filter: blur( 19.5px );
-webkit-backdrop-filter: blur( 19.5px );
border-radius: 10px;
border: 1px solid rgba( 255, 255, 255, 0.18 );
}
</style>
<nav class="navbar navbar-expand-lg m-3">
	<div class="container">
		<a class="navbar-brand text-white font-weight-bold" href="home.jsp">Naya Bazaar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
	
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ml-auto text-white">
<!-- 				<li class="nav-item"><a class="nav-link text-white" href="home.jsp">Home</a></li>
 -->				<li class="nav-item"><a class="nav-link text-white" href="index.jsp">Products</a></li>
				<li class="nav-item"><a class="nav-link text-white" href="cart.jsp">Cart <span class="badge badge-danger">${cart_list.size()}</span> </a></li>
				
				<li class="nav-item"><a class="nav-link text-white" href="orders.jsp">Orders</a></li>
				<li class="nav-item"><a class="nav-link text-white" href="log-out">Logout</a></li>
				
				<li class="nav-item"><a class="nav-link text-white" href="login.jsp">Login</a></li>
				
			</ul>
		</div>
	</div>
</nav>
