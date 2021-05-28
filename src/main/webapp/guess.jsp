<%--
  Created by IntelliJ IDEA.
  User: irfasheikh
  Date: 5/28/21
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Your Number</title>
</head>
<body>

<h1> How well can you guess?! </h1>


<form action= "/game" method= "POST" >
    <h2> Put in your best guess between 1 & 3!</h2>
<%--        <input type="radio" id = "1" name="number" value="1">--%>
<%--        <label for = "1">1</label>--%>
<%--            <br>--%>
<%--    <input type="radio" id = "2" name="number" value="2">--%>
<%--    <label for = "2">2</label>--%>
<%--        <br>--%>
<%--    <input type="radio" id = "3" name="number" value="3">--%>
<%--    <label for = "3">3</label>--%>
<%--        <br>--%>

    <label for="guess">Guess it up</label><input id="guess" name="guess" type="number" min="1" max="3">

    <input type="submit" value="Submit">

</form>
</body>
</html>
