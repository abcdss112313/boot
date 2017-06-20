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

    </tr>
    <c:forEach items="${lists}" var="role">
        <tr>
            <td>${role.role_id}</td>
            <td>${role.role_name}</td>
            <td>
                <a href="del?id=${city.id}">del</a>
                <a href="4edit/${city.id}">edit</a>

            </td>
        </tr>

    </c:forEach>


</table>


</body>

</html>
