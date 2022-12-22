<%--
  Created by IntelliJ IDEA.
  User: wuchuntao
  Date: 2022/12/22
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<center>
    <h1>${title}</h1>
</center>
<center>
    <form id="form1" action="submit">
        <input type="text" placeholder="姓名" name="name" required="true"/>
        <c:forEach items="${answers}" var="ans">
            <h2>${ans}</h2>
            <div class="radio">
                <input type="radio" value="A" name= ${ans}/>A
                <input type="radio" value="B" name= ${ans}/>B
                <input type="radio" value="C" name= ${ans}/>C
                <input type="radio" value="D" name= ${ans}/>D
            </div>
        </c:forEach>
    </form>
    <input type="button" value="提交" onclick="document.getElementById('form1').submit();">
</center>
</body>
</html>
