<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity4">

<head>
    <title>Services Tracking</title>
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"--%>
    <%--integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" rel="stylesheet">
    <link href="/styles/login.css" rel="stylesheet">

</head>
<body>
<div class="container">
    Logged in user: <span sec:authentication="name"></span> |
    Roles: <span sec:authentication="principal.authorities"></span>
    <header>
        <h1>Welcome to the service Tracking</h1>
    </header>
    <section>
        <div id="container_demo">


            <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
            <a class="hiddenanchor" id="toregister"></a>
            <a class="hiddenanchor" id="tologin"></a>
            <div id="wrapper">
                <div id="login" class="animate form">
                    <form action="/login" autocomplete="on" method="post">
                        <h1>Log in</h1>

                        <c:if test="${param.error}">
                            <div class="alert alert-danger">
                                Bad credentials, please try again
                            </div>
                        </c:if>
                        <c:if test="${status == 'OK'}">
                            <div class="alert alert-success">
                                    Congratulations, you joined us!!!
                            </div>
                        </c:if>
                        <p>
                            <label for="username" class="uname"> Your email or username </label>
                            <input id="username" name="username" required="required" type="text"
                                   placeholder="myusername or mymail@gmail.com"/>
                        </p>
                        <p>
                            <label for="password" class="youpasswd"> Your password </label>
                            <input id="password" name="password" required="required" type="password"
                                   placeholder="eg. X8df!90EO"/>
                        </p>
                        <p class="keeplogin">
                            <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping"/>
                            <label for="loginkeeping">Keep me logged in</label>
                        </p>
                        <p class="login button">
                            <input type="submit" value="Submit">
                        </p>
                        <p class="change_link">
                            Not a member yet ?
                            <a href="#toregister" class="to_register">Join us</a>

                        </p>
                    </form>
                </div>

                <div id="register" class="animate form">
                    <form action="/registration" autocomplete="on" method="post">
                        <h1> Sign up </h1>
                        <c:if test="${status != null}">
                            <div class="alert alert-danger">
                                ${status}
                            </div>
                        </c:if>
                        <p>
                            <label for="usernameSignUp" class="uname">Your username</label>
                            <input id="usernameSignUp" name="usernameSignUp" required="required" type="text"
                                   placeholder="mysuperusername690"/>
                        </p>
                        <p>
                            <label for="firstNameSignUp" class="youmail"> Your Name</label>
                            <input id="firstNameSignUp" name="firstNameSignUp" required="required" type="text"
                                   placeholder="use only latin symbols"/>
                        </p>
                        <p>
                            <label for="lastNameSignUp" class="youmail"> Your Last Name</label>
                            <input id="lastNameSignUp" name="lastNameSignUp" required="required" type="text"
                                   placeholder="use only latin symbols"/>
                        </p>
                        <p>
                            <label for="birthdaySignUp" class="youmail"> Your birthday</label>
                            <input id="birthdaySignUp" name="birthdaySignUp" required="required" type="date"/>
                        </p>
                        <p>
                            <label for="emailSignUp" class="youmail"> Your email</label>
                            <input id="emailSignUp" name="emailSignUp" required="required" type="email"/>
                        </p>
                        <p>
                            <label for="passwordSignUp" class="youpasswd">Your password </label>
                            <input id="passwordSignUp" name="passwordSignUp" required="required" type="password"
                                   placeholder="eg. X8df!90EO"/>
                        </p>
                        <p>
                            <label for="passwordSignUpConfirm" class="youpasswd">Please confirm your password </label>
                            <input id="passwordSignUpConfirm" name="passwordSignUpConfirm" required="required"
                                   type="password" placeholder="eg. X8df!90EO"/>
                        </p>
                        <p class="signin button">
                            <input type="submit" value="Sign up"/>
                        </p>
                        <p class="change_link">
                            Already a member ?
                            <a href="#tologin" class="to_register"> Go and log in </a>
                        </p>
                    </form>
                </div>

            </div>
        </div>
    </section>
</div>

</body>
</html>
