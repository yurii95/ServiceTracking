
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration new user</title>
</head>
<body>
	<h1>New user</h1>
	<div class="containerForRegistration">
		<div class="mainForRegistration">

			<form method="post" action="/viewModule/registerNewUser">
				<input type="text" name="login" placeholder="Login">
				<input type="password" name="password" placeholder="Password"><br>
				<p class="registration">Confirm password</p>
				<input type="password" name="checkingPassword" placeholder="Repeate password"><br>
				<input type="text" name="firstName" placeholder="firstName">
				<input type="text" name="lastName" placeholder="lastName">
				<input type="text" name="email" placeholder="Email"><br>
				<input type="text" name="birthday" placeholder="birthday">

				<input type="submit" value="Registration" name="registrationButton">
			</form>
		<c:out value="${empty error ? ' ' : error}" />
		</div>
	</div>
</body>
</html>