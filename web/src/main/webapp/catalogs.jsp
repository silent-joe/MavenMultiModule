<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>webalbum</title>
</head>
<body>
	
	<h1>Catalogs</h1>

	<table>
		<tr>
			<td>id catalog</td>
			<td>name catalog</td>
		</tr>
		<c:forEach items="${catalogs}" var="catalog">
			<tr>
				<td>${catalog.id}</td>
				<td><a href="${ctx}/albums/${catalog.id}">${catalog.name}</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>