<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2015/12/1
  Time: 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sign up</title>
</head>

<body>
<form action="get.jsp" method="post">
    <p>请输入用户名： <input type="text" name="name1" placeholder="请输入您的用户名" required="required"/><br/>

    <p>请输入密码： <input type="password" name="pass" placeholder="密码长度至少为8位" required="required"/><br/>

    <p>请输入E-mail：<input type="email" name="email" required="required"/>
    <br><input type="submit" value="提交"/>
</form>
</body>
</html>
