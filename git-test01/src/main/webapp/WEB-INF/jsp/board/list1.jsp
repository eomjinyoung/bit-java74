<%@page contentType="text/html; charset=UTF-8" %>
<%@page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>
	<meta charset="EUC-KR">
	
</head>

<body>
<h1>게시판</h1>

<c:forEach items="${list}" var="b">
${b.no}, ${b.title}, ${b.views}<br>
</c:forEach>

</body>

</html>