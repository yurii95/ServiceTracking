<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration for company</title>
</head>
<body>
	<h1>New company</h1>
			<form method="post" action="/viewModule/registerNewCompany">
			<div class="mainForOwnerRegistration">
				<p>Company information</p>
				<input type="text" name="companyName" placeholder="Company name">
				<input type="text" name="description" placeholder="Description"><br>
				<select name="type">
					<option selected>Type</option>
					<option value="hotel">Hotel</option>
					<option value="cafe">Cafe</option>
					<option value="tennis">Tennis</option>
					<option value="supermarket">Supermarket</option>
					<option value="restaurant">Restaurant</option>
					<option value="cinema">Cinema</option>
				</select><br></div>
	<input type="submit" value="Registration" name="registrationButton">
<c:out value="${empty error ? ' ' : error}" />
			</form>

</body>
</html>