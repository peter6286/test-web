<%--
  Created by IntelliJ IDEA.
  User: peter.mac
  Date: 2022/5/3
  Time: 下午10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>admin</title>
</head>
<body>
<div>利物浦牛逼</div>
<div>
    <%
        out.println("Ip address is " + request.getRequestURL());
    %>
</div>
<form action="/peteruser/login" method="post">
    <div>用户名:<input type="text" name="username"/></div>
    <div>密码：<input type="password" name="pwd"/></div>
    <div><input type="submit" value="login"></div>
</form>

</body>
</html>
