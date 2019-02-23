<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<jsp:include page="header.jsp"/>

<html>
<head>
    <title>Employees</title>
</head>
<body>
<h1>Employees page!</h1>

<div class="emp-table">
    <table>
        <div><thead>
        <th>id</th>
        <th>Name</th>
        <th>Department</th>
        </thead></div>
        <tbody>
        <c:forEach items="${employeeService.findAll()}" var="employee">
            <tr>
                <td>${employee.getId()}</td>
                <td>${employee.getName()}</td>
                <td>${employee.getDepartment().getDepartmentName()}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>

</html>