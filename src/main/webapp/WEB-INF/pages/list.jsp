
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach var="item" items="${list}">
        ${item.name}<br>
        ${item.money}<br>




    </c:forEach>



</body>
</html>
