<%--
  Created by IntelliJ IDEA.
  User: irfasheikh
  Date: 6/1/21
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Ads</title>
</head>
<body>
<h1> Here's What We Got!</h1>

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <p> Description: ${ad.description}</p>
    </div>
</c:forEach>



</body>
</html>
