<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box
}

/* Full-width input fields */
input[type=text], input[type=password], input[type=number] {
	width: 100%;
	padding: 15px;
	margin: 5px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

.btn {
	width: 25;
	padding: 12px;
	border: none;
	border-radius: 4px;
	margin: 5px 0;
	opacity: 0.85;
	display: inline-block;
	font-size: 17px;
	line-height: 20px;
	text-decoration: none; /* remove underline from anchors */
}

hr {
	border: 1px solid #f1f1f1;
	margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
	background-color: #4CAF50;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

button:hover {
	opacity: 1;
}

/* Extra styles for the cancel button */
.cancelbtn {
	padding: 14px 20px;
	background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
	float: left;
	width: 50%;
}

/* Add padding to container elements */
.container {
	padding: 16px;
}

/* Clear floats */
.clearfix::after {
	content: "";
	clear: both;
	display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
	.cancelbtn, .signupbtn {
		width: 100%;
	}
}

.google {
	background-color: #dd4b39;
	color: white;
}
</style>
<body>
	<form action="RegistrationServlet" method="post"
		style="border: 1px solid #ccc">
		<div class="container">
			<h1>
				Sign Up
				Manually&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;or
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<a href="#" class="google btn"><i class="fa fa-google fa-fw">
				</i> Sign up using Google+ </a>
		</div>
		</h1>
		<div class="col">
			<p>Please fill in this form to create an account.</p>
			<hr>
			<label for="Uno"><b>User Number <i
					class="fa fa-user icon"></i></b></label> <input type="text"
				placeholder="Enter User Name" name="uno"><br> <label
				for="name"><b>Name <i class="fa fa-user icon"></i></b></label> <input
				type="text" placeholder="Enter Name" name="name" required><br>

			<label for="email"><b>Email <i
					class="fa fa-envelope icon"></i></b></label> <input type="text"
				placeholder="Enter Email" name="email" required><br> <label
				for="pass"><b>Password <i class="fa fa-key icon"></i>
			</b></label> <input type="password" placeholder="Enter Password" name="pass"
				required><br> <label for="balance"><b>Balance
					<i class="fa fa-key icon"></i>
			</b></label> <input type="number" placeholder="Enter Balance" name="balance"
				required><br> <label> <input type="checkbox"
				checked="checked" name="remember" style="margin-bottom: 15px">
				Remember me
			</label>

			<p>
				<input type="checkbox" checked="checked">By creating an
				account you agree to our <a href="#" style="color: dodgerblue">Terms
					& Conditions</a>.
			</p>

			<div class="clearfix">
				<button type="button" class="cancelbtn">Cancel</button>
				<button type="submit" class="signupbtn" value="RegistrationBank">RegistrationB</button>
			</div>
		</div>
	</form>
</body>
</html>