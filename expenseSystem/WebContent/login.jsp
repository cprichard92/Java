<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>Login</h1>
<form action="login.do" method="post">
	<div class="form-group">
	 <input type="text" placeholder="User Name" class="form-control" name="user">
	</div>
	<div class="form-group">
	 <input type="password" placeholder="Password" class="form-control" name="pass">
	</div>
	<button type="submit" class="btn btn-success">Sign in</button>
</form>
</body>
</html>