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
<h1>1~100합</h1><hr/>
	<c:set var="sum" value="0"/> <!-- 와 이건좀 어렵다..?괜히 더 헷갈리네 int sum=0인데 -->
	
	<c:forEach var="n" begin="1" end="100" step="1"> <!-- 급 자바스크립트 var등장 -->
	<c:set var="sum" value="${sum+n }"/><!-- 이게되네... 자바 진짜 신기하다 -->
	</c:forEach>
합${sum}

<h1>구구단4단</h1>
<c:forEach var="ii" begin="1" end="9">
	<c:forEach var="i" begin="1" end="9">
	 ${ii}*${i}=${ii*i}<br>
	</c:forEach>
	다음단<br>
</c:forEach> <!-- 이중 포문도 똑같이  -->

<%--<%
int sum=0;
for(int i=1;i<=100;i++)
{
	sum+=i;
}
out.println("1~100까지 합"+sum);
--%>


<c:set var="arr" value="<%=new int []{1,3,5,7,9} %>"/> <!-- 개인적으로 잘 안쓰긴하는데 알아둬야겠다 20210506 -->

<c:forEach var="i" items="${arr }">
	${i}<br>
</c:forEach>

<%--<%
int []arr=new int[]{1,3,5,7,9};
for(int i : arr)
{
	out.print(i);
}
--%>
</body>
</html>