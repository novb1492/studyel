<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- 페이지 안에서 JSTL태그를 사용하려면 디렉티브를 통해 taglib선언을 해야 합니다. --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${param.score>=90 }">학점a</c:when>
	<c:when test="${param.score>=80 }">학점b</c:when>
	<c:when test="${param.score>=70 }">학점c</c:when>
	<c:when test="${param.score>=60 }">학점d</c:when>
	<c:otherwise>학점f</c:otherwise>
</c:choose>
</body>
</html>