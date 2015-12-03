<%--
  Created by IntelliJ IDEA.
  User: xdx
  Date: 2015/12/1
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tomcat</title>
  </head>
  <body>
 <h1>index</h1>
  session id:<%=session.getId()%><br>
 welcome <%= session.getAttribute("username")
  %>
 <a href="">log out</a>
  </body>
</html>
