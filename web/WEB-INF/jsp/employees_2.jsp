<%-- 
    Document   : employees_
    Created on : 2016-12-19, 10:58:32
    Author     : anderson
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <c:if test="${empty requestScope.employees}">
        没有员工信息
    </c:if>
    employees:${employees}
    <body>
        <table border="1">
            <td>ID</td>
            <td>EmployeeName</td>
            <td>Email</td>
            <td>Gender</td>
            <td>DepartmentID</td>
            <td>DepartmentName</td>
            <c:set target="${employees}" property="id" value="empl">
                <c:out value="${empl}"></c:out>
            </c:set>
        </table>


    </body>
</html>
