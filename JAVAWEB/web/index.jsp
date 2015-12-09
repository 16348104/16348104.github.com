<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>index</title>
  </head>
  <body>
 <h1>index</h1>
 welcome :${sessionScope.username}
 <a href="user?action=logout">LOG OUT</a>
  </body>

</html>
