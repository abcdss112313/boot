<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>

<h1>------------------city edit------------------</h1>
<form action="/city/update" method="post">
    name:<input name="name" value="${city.name}" type="text"/>
    state:<input name="state" value="${city.state}" type="text"/>
    country:<input name="country" value="${city.country}" type="text"/>
    map:<input name="map" value="${city.map}" type="text"/>
    <input type="hidden" name="id" value="${city.id}"/>
    <input type="submit"/>

</form>
</body>

</html>
