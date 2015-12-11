<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>default</title>
</head>
<body>
<h1>default page</h1>

<form action="user" method="post">
    <input type="hidden" name="action" value="login">

    <p>请输入用户名： <input type="text" name="username" placeholder="请输入您的用户名" required="required"/><br/>

    <p>请输入密码： <input type="password" name="pass" placeholder="密码长度至少为8位" required="required"/><br/>

    <p>请输入E-mail：<input type="email" name="email" required="required"><br/>
        <input type="submit" value="LOGIN"/><br/>
</form>
${requestScope.message}<br/>
<a href="sign up.jsp">SIGH UP</a>
</body>
</html>
