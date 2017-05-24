<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Available services</title>
</head>
<body>
	<p>
		<a href="/viewModule/companies/registrationNewCompany">Create own company</a>
	</p>
		<p>
		<a href="/viewModule/companies/all">Show all available companies</a>
	</p>
	<h1>
		<center>What do you wish?</center>
	</h1>
	<table>
		<tr>
			<td><a href="/viewModule/companies/hotels"><img class="imgForButtons"
					src="<c:url value="/resources/images/hotel.jpg"/>" style="width: 408px; height: 245px;">
				</a>
			</td>
			<td><a href="/viewModule/companies/markets"><img class="imgForButtons"
					src="<c:url value="/resources/images/supermarket.jpg"/>" style="width: 398px; height: 236px;">
				</a>
			</td>
			<td> <a href = "/viewModule/companies/restaurants"><img class="imgForButtons"
			 		src="<c:url value="/resources/images/restaurant.jpg"/>"	style="width: 408px; height: 235px;">
			 	</a>
			 </td>
		</tr>
		<tr>
		<tr>
			<td><p>HOTELS</p></td>
			<td><p>MARKETS</p></td>
			<td><p>RESTAURANTS</p></td>
		</tr>
		<tr>
			<td><a href = "/viewModule/companies/tennis"><img class="imgForButtons" 
			src="<c:url value="/resources/images/tennis.jpg"/>"
				style="width: 412px; height: 276px;"></a></td>
			<td><a href = "/viewModule/companies/cafes"><img class="imgForButtons" 
			src="<c:url value="/resources/images/cafe.jpg"/>"
				style="width: 412px; height: 276px;"></a></td>
			<td><a href = "/viewModule/companies/cinemas"><img class="imgForButtons" 
			src="<c:url value="/resources/images/cinema.jpg"/>"
				style="width: 411px; height: 274px;"></a></td>
		</tr>
		<tr>
			<td><p>TENNIS</p></td>
			<td><p>CAFE</p></td>
			<td><p>CINEMA</p></td>
		</tr>
	</table>
</body>
</html>