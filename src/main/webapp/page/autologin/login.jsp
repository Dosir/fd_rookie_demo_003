<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>用户登录</h1><hr>
<form action="login.do" method="POST">
    用户名<input type="text" name="name" />
    密码<input type="password" name="password" />
    <input type="checkbox" name="autologin" value="true"/>30天内自动登陆
    <input type="submit" value="登录"/>
</form>
</body>
</html>
