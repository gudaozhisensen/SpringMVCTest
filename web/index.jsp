<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Web MVC</title>
    </head>

    <body>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
        <form name="loginForm" action="${pageContext.request.contextPath}/ModelServlet" method="post">
            <input type="hidden" name="actionType" value="login"/>
            username:<input name="username" type="text" value="admin"/>
            password:<input name="password" type="password" value="admin"/>
            <input type="submit" value="login"/>
        </form>
        <a href="helloworld">hello world</a>
        <a href="helloanderson">anderson</a>
    </body>
</html>