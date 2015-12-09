<%@ page import="com.sun.javafx.scene.layout.region.BackgroundImage" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2015/12/2
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Get</title>
</head>
<body>
<%

    String name = request.getParameter("username");
    String password = request.getParameter("pass");
    String email = request.getParameter("email");
    out.println(name);
    out.println(password);
    out.println(email);
%>
</body>
</html>
