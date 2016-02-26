<%--
  Created by IntelliJ IDEA.
  User: russ
  Date: 2/25/16
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form action="/form" method="post">
        <input type="text" name="name" value="${form.name}"><br/>
        <input type="text" name="username" value="${form.username}"><br/>
        <input type="text" name="email" value="${form.email}"><br/>
        <input type="text" name="phone" value="${form.phone}"><br/>
        <input type="submit">
    </form>
</body>
</html>
