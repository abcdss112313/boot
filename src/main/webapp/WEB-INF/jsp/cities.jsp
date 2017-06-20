<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>

<h1>------------------ city list ------------------</h1>
<p><a href="/city-add"> add city </a></p>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>country</th>
        <th>state</th>
        <th>map</th>
        <th>opt</th>
    </tr>
    <c:forEach items="${cities}" var="city">
        <tr>
            <td>${city.id}</td>
            <td>${city.name}</td>
            <td>${city.country}</td>
            <td>${city.state}</td>
            <td>${city.map}</td>
            <td>
                <a href="del?id=${city.id}">del</a>
                <a href="4edit/${city.id}">edit</a>

            </td>
        </tr>

    </c:forEach>


</table>


</body>

</html>
