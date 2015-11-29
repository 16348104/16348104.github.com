<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/11/29
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>get</title>
</head>
<body>
<%
  String name;
  name = request.getParameter("name1");
  String password = request.getParameter("pass");
//  String email = request.getParameterValues("email");
  out.println(name+password);

  out.println();
%>
</body>
</html>
<%!

%>