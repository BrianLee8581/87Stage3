<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<h1>测试文件上传</h1>
    <a href="${pageContext.request.contextPath}/testFileUpload">测试上传文件</a>
<hr>
<h1>测试多文件上传</h1>
<a href="${pageContext.request.contextPath}/testFileUpload2">打开上传页面</a>

<hr>
<h1>测试@RequestBody的使用</h1>
<form action="${pageContext.request.contextPath}/testRequestBody" method="post">
    <p>登录名称：<input type="text" name="username"/> </p>
    <p>登录密码：<input type="password" name="password"/> </p>
    <p><input type="submit" value="登录" /> </p>
</form>

<hr>
<h1>测试@ResponseBody的使用</h1>
<a href="${pageContext.request.contextPath}/testResponseBody">测试ResponseBody使用</a>

<hr>
<h1>测试@ResponseBody的使用</h1>
<a href="${pageContext.request.contextPath}/testResponseBody2">测试ResponseBody使用</a>
</body>
</html>
