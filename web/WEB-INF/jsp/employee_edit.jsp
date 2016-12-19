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
        <form:form modelAttribute="employees" action="employee_save">
            ID:<form:input readonly="true"  path="id" />
            <br>
            EmployeeName:<form:input path="employeeName"/>
            <br>
            Email:<form:input path="email"/>
            <br>
            Gender:<form:radiobuttons path="gender" items="${gender}"/>
            <br>
            DepartmentID:<form:input path="department.id"/>
            <br>
            DepartmentName:<form:select itemValue="department.id"  itemLabel="${department.departmentName}"  path="department.id" items="${departments}"   />
            <br>
            <input type="submit" value="save"/>
        </form:form>
    </body>
</html>
