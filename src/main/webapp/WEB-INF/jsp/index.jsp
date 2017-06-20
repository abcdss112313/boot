<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">

<body>
<c:url value="/resources/text.txt" var="url"/>
<spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl"/>
Spring URL: ${springUrl} at ${time}
<br>
JSTL URL: ${url}
<br>
Message: ${message}

<h1><a href="city/all"> city list </a></h1>

<form name=loginForm action="handlelogin.jsp" method=post>
    <table align="center">
        <tr>
            <td>ACCOUNT:</td>
            <td><input type=text name=username/></td>
        </tr>
        <tr>
            <td>PASSWORD:</td>
            <td><input type=password name=pwd/></td>
        <tr/>
        <tr>
            <td colspan="2" ,align="center">
                <input type="submit" value="submit"/>
                <input type="reset" value="reset"/>
            </td>
        </tr>
    </table>

</form>

</body>

</html>
