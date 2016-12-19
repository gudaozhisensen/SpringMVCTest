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
    <body>
        employees:${employees}
        <c:forEach  items="${requestScope.employees}" var="empl">
                    <tr>
                        <td>${empl.id}</td>
                    </tr>
                </c:forEach>
    </body>
</html>
