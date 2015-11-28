<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/11/28
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%!
    String getDate() {
        return new java.util.Date().toString();
    }

    int count = 10;
%>
<html>
<head>
    <title>一个典型的jsp</title>
</head>
<body>
<%@include file="header.jsp" %>
<div style="text-align: center;">
    <table align="center">
        <tr style="background: #777;" >
            <td>
                ----------------
            </td>
        </tr>
        <%
            String color1 = "#99ccff";
            String color2 = "#88cc33";
            for (int i = 1; i <= count; i++) {
                String color;
                if (i % 2 == 0) {
                    color = color1;
                } else {
                    color = color2;
                }
                out.println("<tr style=\"background:" + color + ";\"><td>----------------</td></tr>");
            }


        %>
    </table>
    <hr/>
    当前时间是：
    <%--下面是是使用表达式的例子--%>
    <%=getDate()%>
</div>
</body>
</html>
