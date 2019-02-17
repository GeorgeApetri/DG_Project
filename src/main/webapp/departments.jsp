<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 2/17/2019
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<html>
<head>
    <title>departments</title>
</head>
<body>
<h1>Java Departments</h1>

<c:forEach items="${departmentService.getAll()}" var="department">
    <span><c:out value="${department.getManagerName()}"/></span>
</c:forEach>
<%--<c:forEach items="${userService.findById(1)}" var="user">--%>
<%--<span><c:out value="${department.getUsername()}"/></span>--%>
<%--</c:forEach>--%>

</body>
</html>
