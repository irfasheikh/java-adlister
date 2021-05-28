<%@page contentType="text/html;charset=UTF-8" language="java"%>

<%
    if(request.getMethod().equalsIgnoreCase("POST")) {// if this is = post, then we are going to set those parameters to this

        String username=   request.getParameter("username");
        String password=   request.getParameter("password");
        if(username.equals("admin") & password.equals("password")){
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Page</title>


</head>
<body>
<style>
<%@ include file="partials/styling.css"%>
</style>
<%@ include file="partials/navbar.jsp"%>

<h1>Login Page</h1>
<h2> Login </h2>
<form method="Post" action="/login.jsp">
    <p>
    <label for="username">Username</label> <br>
    <input type="text" id="username" name="username"/>
    </p>
    <p>
    <label for ="password">Password</label><br>
    <input type="text" id="password" name="password"/>
    </p>
    <input type="submit" value="Submit" />
</form>


<script>
<%@ include file="partials/javescript_code.js"%>
</script>
</body>
</html>