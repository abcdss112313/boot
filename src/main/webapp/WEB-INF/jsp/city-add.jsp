<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<body>

<h1>------------------city add ------------------</h1>
<form action="/city/save" method="post">
    id:<input name="id" value="" type="text"/>
    name:<input name="name" value="" type="text"/>
    state:<input name="state" value="" type="text"/>
    country:<input name="country" value="" type="text"/>
    map:<input name="map" value="" type="text"/>
    <input type="submit"/>

</form>
</body>

</html>
