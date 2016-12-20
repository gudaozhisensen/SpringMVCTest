<%-- 
    Document   : Employee_edit
    Created on : 2016-12-19, 14:29:58
    Author     : anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>

    </style>
    <body>
        <form:form method="POST" modelAttribute="employees" action="employee_update">
            ID:<form:hidden readonly="true"  path="employee_id" />
            <br>
            EmployeeName:<form:input path="employeeName"/>
            <br>
            Email:<form:input path="email"/>
            <br>
            Gender:<form:radiobuttons path="gender" items="${gender}"/>
            <br>
            Department:<form:select itemValue="department_id" itemLabel="departmentName" path="department.department_id" items="${departments}"   />
            <br>
            <input type="submit" value="update"/>
        </form:form>
    </body>
</html>
