<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value="/resources/css/company_style.css" />" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty companiesList}">
	<center>
		<table>
			<tr>
				<td>Company name</td>
				<td>description</td>
				<td>type</td>
				<td>Locations</td>
			</tr>
			<c:forEach var="listValue" items="${companiesList}">
				<tr>
					<td>${listValue.name}</td>
					<td>${listValue.getDescription()}</td>
					<td>${listValue.type}</td>
					<td>
						<c:forEach var="location" items="${listValue.locations}">
						<ul>
						<li>${location.address}, ${location.description} </li>
						</ul>
						</c:forEach>
					</td>
				</tr>
			</c:forEach>
		</table>
</center>
	</c:if>
</body>
</html>