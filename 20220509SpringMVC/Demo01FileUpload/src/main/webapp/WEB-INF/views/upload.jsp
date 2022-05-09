<%--
  Created by IntelliJ IDEA.
  User: Brian
  Date: 2022/5/9
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>文件上传的页面</h1>
<form action="${pageContext.request.contextPath}/upload2" method="post" enctype="multipart/form-data">
    <p>
        <label for="username">上传人:</label>
        <input type="text" name="username" id="username" />
    </p>
    <p>
        <label for="uploadFile">请选择文件:</label>
        <input type="file" name="uploadFile" id="uploadFile" />
    </p>

    <p>
        <label></label>
        <input type="submit" value="上传" />
    </p>
</form>
</body>
</html>
