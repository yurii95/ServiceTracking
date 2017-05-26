<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="/styles/user_page.css" rel="stylesheet">
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/tab_animation.js"></script>
    <%--<script type="text/javascript" src="../resources/js/tab_animation.js"></script>--%>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Available services</title>
</head>
<body>
<!-- Fixed navbar -->
<nav id="header" class="navbar navbar-fixed-top">
    <div id="header-container" class="container navbar-container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <div class="col-xs-12 col-md-12 col-sm-12">
                <div class="row">
                    <div class="col-xs-9 col-md-9 col-lg-9">
                        <ul class="nav navbar-nav">
                            <a id="brand" class="navbar-brand" href="#">Project name</a>
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="#about">About</a></li>
                            <li><a href="#contact">Contact</a></li>
                        </ul>
                    </div>
                    <div class="col-xs-3 col-md-3 col-lg-3">
                        <br>
                        <security:authorize access="isAuthenticated()">
                        <div class="my">Current user: <security:authentication property="principal.username"/>
                            </security:authorize>
                            &nbsp&nbsp|&nbsp&nbsp<a class="my" href="<c:url value="/logout"/>">Logout</a></div>
                    </div>
                </div>
            </div>
        </div><!-- /.nav-collapse -->
    </div><!-- /.container -->
</nav><!-- /.navbar -->

<div class="container">

    <%--<div class="row row-offcanvas row-offcanvas-right">--%>

    <div class="col-xs-12 col-md-12 col-sm-12">
        <div class="row">
            <div class="col-xs-6 col-md-6 col-lg-4">
                <div class="thumbnail">
                    <a href="/images/.jpg" target="_blank">
                        <img src="<c:url value="${pageContext.request.contextPath}/images/hotel.jpg"/>" alt="Nature"
                             style="width:100%">
                        <div class="caption">
                            <p>Hotels: from simple and cheap hostels to 5 stars luxurious hotels</p>
                        </div>
                    </a>
                </div>
            </div><!--/.col-xs-6.col-lg-4-->

            <div class="col-xs-6 col-md-6 col-lg-4">
                <div class="thumbnail">
                    <a href="#" target="_blank">
                        <img src="<c:url value="${pageContext.request.contextPath}/images/cinema.jpg"/>"
                             alt="Nature" style="width:100%">
                        <div class="caption">
                            <p>Cinemas: Click and choose the nearest cinema for you </p>
                        </div>
                    </a>
                </div>
            </div>
            <div class="clearfix visible-xs"></div>
            <div class="clearfix visible-md"></div>
            <div class="col-xs-6 col-md-6 col-lg-4">
                <div class="thumbnail">
                    <a href="#" target="_blank">
                        <img src="<c:url value="${pageContext.request.contextPath}/images/supermarket.jpg"/>"
                             alt="Nature"
                             style="width:100%">
                        <div class="caption">
                            <p>Supermarkets: choose which you like </p>
                        </div>
                    </a>
                </div>
            </div>
            <div class="clearfix visible-lg"></div>
            <%--</div>--%>

            <%--<div class="row">--%>
            <div class="col-xs-6 col-md-6 col-lg-4">
                <div class="thumbnail">
                    <a href="#" target="_blank">
                        <img src="<c:url value="${pageContext.request.contextPath}/images/restaurant.jpg"/>"
                             alt="Nature" style="width:100%">
                        <div class="caption">
                            <p>Restaurants: good service and food for you</p>
                        </div>
                    </a>
                </div>
            </div><!--/.col-xs-6.col-lg-4-->
            <div class="clearfix visible-xs"></div>
            <div class="clearfix visible-md"></div>
            <div class="col-xs-6 col-md-6 col-lg-4">
                <div class="thumbnail">
                    <a href="#" target="_blank">
                        <img src="<c:url value="${pageContext.request.contextPath}/images/tennis.jpg"/>"
                             alt="Nature"
                             style="width:100%">
                        <div class="caption">
                            <p>Click and choose the nearest cinema for you and your friends</p>
                        </div>
                    </a>
                </div>
            </div><!--/.col-xs-6.col-lg-4-->
            <div class="col-xs-6 col-md-6 col-lg-4">
                <div class="thumbnail">
                    <a href="#" target="_blank">
                        <img src="<c:url value="${pageContext.request.contextPath}/images/taxi.jpg"/>"
                             alt="Nature"
                             style="width:100%">
                        <div class="caption">
                            <p>Click and choose the nearest cinema for you and your friends</p>
                        </div>
                    </a>
                </div>
                <!--/row-->
                <%--</div><!--/.col-xs-12.col-sm-9-->--%>

            </div><!--/row-->

        </div>

    </div>
</div>
sdfdsf<br>
dsf<br>
dsf<br>
dsf<br>
ds<br>
f<br>
ds<br>
f<br>
<br><br>
dsf<br>

dsfdsf
</body>
</html>

<%--<hr>--%>

<%--<footer>--%>
<%--<p>© Company 2014</p>--%>
<%--</footer>--%>
<!--/.container-->
<%--<p>--%>
<%--<a href="/viewModule/companies/registrationNewCompany">Create own company</a>--%>
<%--</p>--%>
<%--<p>--%>
<%--<a href="/viewModule/companies/all">Show all available companies</a>--%>
<%--</p>--%>
<%--<h1>--%>
<%--<center>What do you wish?</center>--%>
<%--<security:authorize access="isAuthenticated()">--%>
<%--authenticated as <security:authentication property="principal.username" />--%>
<%--</security:authorize>--%>
<%--</h1>--%>
<%--<table>--%>
<%--<tr>--%>
<%--<td><a href="/viewModule/companies/hotels"><img class="imgForButtons"--%>
<%--src="<c:url value="/resources/images/hotel.jpg"/>" style="width: 408px; height: 245px;">--%>
<%--</a>--%>
<%--</td>--%>
<%--<td><a href="/viewModule/companies/markets"><img class="imgForButtons"--%>
<%--src="<c:url value="/resources/images/supermarket.jpg"/>" style="width: 398px; height: 236px;">--%>
<%--</a>--%>
<%--</td>--%>
<%--<td> <a href = "/viewModule/companies/restaurants"><img class="imgForButtons"--%>
<%--src="<c:url value="/resources/images/restaurant.jpg"/>"	style="width: 408px; height: 235px;">--%>
<%--</a>--%>
<%--</td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<tr>--%>
<%--<td><p>HOTELS</p></td>--%>
<%--<td><p>MARKETS</p></td>--%>
<%--<td><p>RESTAURANTS</p></td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td><a href = "/viewModule/companies/tennis"><img class="imgForButtons" --%>
<%--src="<c:url value="/resources/images/tennis.jpg"/>"--%>
<%--style="width: 412px; height: 276px;"></a></td>--%>
<%--<td><a href = "/viewModule/companies/cafes"><img class="imgForButtons" --%>
<%--src="<c:url value="/resources/images/cafe.jpg"/>"--%>
<%--style="width: 412px; height: 276px;"></a></td>--%>
<%--<td><a href = "/viewModule/companies/cinemas"><img class="imgForButtons" --%>
<%--src="<c:url value="/resources/images/cinema.jpg"/>"--%>
<%--style="width: 411px; height: 274px;"></a></td>--%>
<%--</tr>--%>
<%--<tr>--%>
<%--<td><p>TENNIS</p></td>--%>
<%--<td><p>CAFE</p></td>--%>
<%--<td><p>CINEMA</p></td>--%>
<%--</tr>--%>
<%--</table>--%>
<%--</body>--%>
<%--</html>--%>