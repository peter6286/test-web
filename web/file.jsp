<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
​
<form action="<%=request.getContextPath()%>/fileUpload" method="post" enctype="multipart/form-data">
    用户名:<input type="text" name="username"/>
    头像:<input type="file" name="img">
    <input type="submit" value="提交">
</form>
</body>
</html>