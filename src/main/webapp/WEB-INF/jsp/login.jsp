<!DOCTYPE html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>jsp userlogin 'login.jsp' starting page</title>
    <style type="text/css">
        .cathead{background-image:url("images/head.jpg");boder_bottom:#ffffff solid;border-left:#ffffff solid;background-color:#dfdfdf;height:"35px";}
        .cattilte{letter-spacing:2px;color:#01336b;font-size:14px;font-weight:bold}
        .forumline{border-bottom:#006699 2px solid;border-left:#006699 2px solid;border-top:#006699 2px solid;border-right:#006699 2px solid}
        .mainoption{font-family:verdana,arial,helvetica,scan-serif;background:url("images/head.jpg") #fafafa repeat-x center top;color:000000;font-size:14px;cursor:pointer}
        .bodycolor{filter:progid:DXImageTransform.Microsoft.gradient(startColorStr='#84BEF7', endColorStr='#FFFFFF', gradientType='0') ;
            border:solid 1px #D5E6EE;
            margin-top:0px;
            width:98%;
            text-align:center;}
    </style>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>

<body class="bodycolor">
<%--<center>--%>
    <%--<h1 style="color:red">登录</h1>--%>
    <%--<form id="indexform" name="indexForm" action="/logincheck" method="post">--%>
        <%--<table border="0">--%>
            <%--<tr>--%>
                <%--<td>账号：</td>--%>
                <%--<td><input type="text" name="account"></td>--%>
            <%--</tr>--%>
            <%--<tr>--%>
                <%--<td>密码：</td>--%>
                <%--<td><input type="password" name="passwd">--%>
                <%--</td>--%>
            <%--</tr>--%>
        <%--</table>--%>
        <%--<br>--%>
        <%--<input type="submit" value="登录" style="color:#BC8F8F">--%>
    <%--</form>--%>
    <%--<form action="zhuce.jsp">--%>
        <%--<input type="submit" value="注册" style="color:#BC8F8F">--%>
    <%--</form>--%>

<%--</center>--%>

<form name="login" accept-charset="UTF-8" action="/logincheck" method="post">
    <br><br>

    <table class="forumline" align="center" cellspacing="1" cellpadding="3" width="60%" border="0" style="" heigh="50%">
        <tr>
            <td class="cathead" height="28" align="center"><span class="cattitle">Login</span></td>
        </tr><br>

        <tr>
            <td class="row1" valign="middle" align="center" height="28">
							<span align="center">
								username: <input class="post" size="10" name="account" type="text"/>
						</span>
            </td>
        </tr>
        <tr>
            <td class="row1" valign="middle" align="center" height="28">
							<span>
								password: <input class="post" type="password" size="10" name="passwd" />
							</span>
            </td>
        </tr>
        <tr>
            <td class="row1" valign="middle" align="center" height="28">
							<span>

								<input class="mainoption" type="submit" value="login" name="login" />
							</span>
            </td>
        </tr>
    </table>
</form>
</body>

</html>
