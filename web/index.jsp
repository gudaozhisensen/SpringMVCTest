<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Web MVC</title>
    </head>

    <body>
        <form name="loginForm" action="logincontroller" method="post">
            username:<input name="username" type="text" value="admin"/>
            password:<input name="password" type="password" value="admin"/>
            <input type="submit" value="post_login"/>
        </form>

        <form name="loginForm" action="logincontroller/admin/admin" method="get">
            username:<input name="username" type="text" value="admin"/>
            password:<input name="password" type="password" value="admin"/>
            <input type="submit" value="get_login"/>
        </form>

        <form action="logincontroller/admin" method="post">
            <input type="hidden" name="_method" value="DELETE"/>
            <input type="submit" value="post_DELETE"/>
        </form>

        <form  action="logincontroller/admin" method="POST">
            <input type="hidden" name="_method" value="PUT"/>
            <input type="submit" value="post_PUT"/>
        </form>

        <a href="helloworld">hello world</a>
        <br>
        <a href="springmvctest/testRequestParam?username=anderson&age=20">springmvctest</a>
        <br>
        <a href="helloanderson">anderson</a>
        <br>
        <a href="logincontroller">logincontroller</a>
        <br>
        <a href="othercontroller">othercontroller</a><br>
        <a href="cookiecontroller/testCookieValue">testCookieValue</a><br>
        <a href="requestheadercontroller/testRequestHeader">testRequestHeader</a><br>
        <a href="springmvctest/testModelAndView">testModelAndView</a><br>
        <a href="emps">show all emps</a><br>
        <h3>国际化：</h3>
        <a href="i18n?locale=en_US">英文</a>
        <a href="i18n?locale=zh_CN">中文</a>
        <br>
        <a href="upload">上传</a>
    </body>
</html>
