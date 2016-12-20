<%-- 
    Document   : upload
    Created on : 2016-12-20, 16:22:12
    Author     : anderson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="./js/jquery-3.1.1.min.js"></script>
        <script>
            $(function () {//这里需要加入jackson jar包才能正常使用
                $("#testJson").click(function () {
                    var url = this.href;
                    var args = {};
                    $.post(url, args, function (data) {
                        for (var i = 0; i < data.length; i++) {
                            var employee_id = data[i].employee_id;
                            var employeeName = data[i].employeeName;
                            console.log(employee_id + ": " + employeeName);
                        }
                    })
                    return false;
                })
            })
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="emps">show all emps</a><br>
        <a href="testJson" id="testJson">testJson</a>
        <form action="fileUpload" method="POST"  enctype="multipart/form-data" >
            <input type="file" />
            <input type="text"/>
            <input type="submit"/>
        </form>
    </body>
</html>
