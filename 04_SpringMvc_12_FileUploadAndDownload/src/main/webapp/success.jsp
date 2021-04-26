<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传成功页面</title>
</head>
<body>
<img src="${imgPath}">

<form method="post" action="/test/download?filename=${imgPath}">
    <input type="submit" value="文件下载">
</form>
</body>
</html>
