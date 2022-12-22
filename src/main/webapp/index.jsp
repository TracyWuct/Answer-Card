<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Spring Boot项目测试JSP页面</title>
</head>
<body>
<h1>HELLO WORLD!</h1>
<h1>${data}</h1>
<h1>${answer}</h1>
<c:forEach items="${answers}" var="ans">
    <h2>${ans}</h2>
</c:forEach>

<select class="ui-select" name="select" id="select">
    <option selected="" value="1">微信号</option>
    <option value="2">QQ号</option>
    <option value="3">Email</option>
</select>
<form id="form1" action="提交的地址">
    <div class="radio">
        <input name="CheckGroup1" type="radio" id="5" value="">
        <input type="radio" value="A" name="toselect"/>A
        <input type="radio" value="B" name="toselect"/>B
        <input type="radio" value="C" name="toselect"/>C
        <input type="radio" value="D" name="toselect"/>D
    </div>
</form>
<input type="button" value="提交" onclick="document.getElementById('form1').submit();">

</body>
</html>