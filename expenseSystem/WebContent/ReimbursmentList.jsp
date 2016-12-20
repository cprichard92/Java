<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Expense System Portal</title>
</head>
<body >
<%@ include file="header.jsp" %>
<!--  JSTL: JSP Standard Tag Library....scripting elements without Java-->
<form action="decision.do" method="get">
<table class="table table-hover table-bordered">
	<th>Submission Number</th>
	<th>Amount</th>
	<th>Submission Date</th>
	<th>Description</th>
	<th>Submitter</th>
	<th>Status</th>
	<th>Type</th>
  <c:forEach var="temp" items="${ReimbursmentList}">
	<tr>
		<td>${temp.submissionId}</td>
		<td>${temp.amount}</td>
		<td>${temp.submittedTime}</td>
		<td>${temp.description}</td>
		<td>${temp.user}</td>
		<td>${temp.status}</td>
		<td>${temp.type}</td>
		<td><input type ="submit" name="decision" value="approve" class="btn btn-success"/></td>
		<td><input type="submit" name="decision" value="decline"class="btn btn-danger"/></td>
	</tr>
</c:forEach>
</table>
</form>
</body>
</html>