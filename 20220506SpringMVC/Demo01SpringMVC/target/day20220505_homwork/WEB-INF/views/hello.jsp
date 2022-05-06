<%--
  Created by IntelliJ IDEA.
  User: Brian
  Date: 2022/5/6
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello World</h1>
<form action="testpojo" method="post">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    <input type="submit" value="提交"/>
</form>

<h2>使用数组或者集合接收参数</h2>
<form action="testArray" method="post">
    用户爱好：
    <input type="checkbox" name="hobby" value="java"/>java
    <input type="checkbox" name="hobby" value="c++"/>c++
    <input type="checkbox" name="hobby" value="python"/>python<br/>
    <input type="submit" value="提交"/>
</form>

<h3>使用Map类型接收数据</h3>
<form action="testMap" method="post">
    用户名：<input type="text" name="username"/><br/>
    密码：<input type="password" name="password"/><br/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
