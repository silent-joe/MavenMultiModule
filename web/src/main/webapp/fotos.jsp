<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>webalbum</title>
</head>
<body>
	
	<h1>Fotos</h1>
	
	<table>
		<tr>
			<td>id foto</td>
			<td>id album</td>
			<td>name foto</td>
		</tr>
		<c:forEach items="${fotos}" var="foto">
			<tr>
				<td>${foto.id}</td>
				<td>${foto.idAlbum}</td>
				<td>${foto.name}</td>
			</tr>
			<tr>
				<td><a href=${ctx}/albums/${foto.idAlbum}>return</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>