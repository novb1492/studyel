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
	<c:when test="${param.name=='김철수' }">
	김철순
	</c:when>
	<c:when test="${param.age>19 }">
	성인
	</c:when>
	<c:otherwise>
	김철수x민자
	</c:otherwise>
</c:choose>


<%--<%String name=request.getParameter("name");
int age=Integer.parseInt(request.getParameter("age"));

if(name.equals("홍길동"))
{

<p>홍길동</p>
<%}
else if(age>=19)
{
%>
<p>성인</p>
<%}
else
{%>
김철수도 아니고 민자이다	
<%}
%>--%>

</body>
</html>