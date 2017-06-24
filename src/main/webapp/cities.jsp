<!DOCTYPE html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<body>

<h1>------------------ test list ------------------</h1>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>country</th>
    </tr>
    <a href="/callmail/approve">send email</a>


    <form class="login-form" accept-charset="UTF-8" action="/logincheck" method="post">
        <input type="text" placeholder="mail" id="user_name" name="account"/>
        <input type="text" placeholder="content" id="password" name="passwd"/>
        <button type="submit" id="login">登　录3</button>
        <p class="message">还没有账户? <a href="#">立刻创建</a></p>
    </form>

    <c:forEach items="${list}" var="city">
        <tr>
            <td>${city.applyid}</td>
            <td>${city.applydate}</td>
            <td>${city.userid}</td>

            <td>
                <a href="del?id=${city.applyid}">del</a>
                <a href="4edit/${city.applyid}">edit</a>

            </td>
        </tr>

    </c:forEach>


</table>


</body>

</html>
