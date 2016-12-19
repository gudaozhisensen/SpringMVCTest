<%-- 
    Document   : employees
    Created on : 2016-12-18, 21:56:56
    Author     : FEng
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:if test="${empty requestScope.employees}">
            没有员工信息
        </c:if>

        <c:if test="${!empty requestScope.employees}">
            <table border="1">
                <td>ID</td>
                <td>EmployeeName</td>
                <td>Email</td>
                <td>Gender</td>
                <td>DepartmentID</td>
                <td>DepartmentName</td>
                <td>edit</td>
                <td>delete</td>
                <c:forEach  items="${requestScope.employees}" var="empl">
                    <tr>
                        <td>${empl.id}</td>
                        <td>${empl.employeeName}</td>
                        <td>${empl.email}</td>
                        <td>${empl.gender}</td>
                        <td>${empl.department.id}</td>
                        <td>${empl.department.departmentName}</td>
                        <td><a href="employee_edit/${empl.id}">edit</a></td>
                        <td><a href="employee_delete">delete</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>            
    </body>
</html>
