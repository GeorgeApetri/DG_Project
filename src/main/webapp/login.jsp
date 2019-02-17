<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Login Page</title>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
</head>

<body class="login-body">
<div class="login-page">
    <div class="form">
        <form action="login" method="post" class="login-form">

            <input type="text" name="un" placeholder="username"><br>

            <input type="password" name="pw" placeholder="password"/>

            <input type="submit" value="submit">
        </form>
    </div>
</div>

</body>
</html>