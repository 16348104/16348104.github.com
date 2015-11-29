<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/11/29
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <title></title>
</head>
<body>
<form action="get.jsp" method="post">
  username: <input name="name"><br/>
  password: <input type="password" name="pass"><br/>
  hometown: <select name="hometown" multiple="multiple">
  <option value="Beijing">Beijing</option>
  <option value="Shanghai">Shanghai</option>
  <option value="Shenzhen">Shenzhen</option>
</select><br/>
  <input type="submit" value="SIGN UP"/>
</form>
</body>
</html>