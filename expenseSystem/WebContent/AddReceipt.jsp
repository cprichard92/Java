<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Receipt</title>
</head>
<body>
<%@ include file="header.jsp" %>
<form action="AddReceipt.do" method="post">
	<table class="table table-striped table-hover table-responsive table-bordered">
	<tr><td>Receipt Number</td> <td><input type="text" name="submissionId"/></td></tr><br/>
	<tr><td>Amount</td><td> <input type="number" min="1" name="amount" /><br/></td>
	<tr><td>Description of Purchase</td><td> <input type="text" name="description"/><br/></td>
	<tr><td>Submitter</td>
	<td><select name="submitterId">
	 	<option value="1">Michael Jordan</option>
	 	<option value="33">Scottie Pippen</option>
	 	<option value="91">Dennis Rodman</option>
	 	<option value="25">Steve Kerr</option>
	 	<option value="7">Tony Kukoc</option>
	 </select></td></tr>
	
	<tr><td>Type of Purchase</td>
	<td> <select name="type">
	 	<option value="Lodging">Lodging</option>
	 	<option value="Travel">Travel</option>
	 	<option value="Food">Food</option>
	 	<option value="Other">Other</option>
	 </select></td></tr>
	<input type="submit"/>
	</table>
</form>
</body>
</html>