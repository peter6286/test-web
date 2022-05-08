<%--
  Created by IntelliJ IDEA.
  User: peter.mac
  Date: 2022/5/5
  Time: 上午12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/mocklogin" method="post">

    name：<input type="text" name = "name"/>
    <br/>
    password <input type="password" name="pwd"/>

    <input type="submit" value="login">

    message ${wrong}


</form>
</body>
</html>
