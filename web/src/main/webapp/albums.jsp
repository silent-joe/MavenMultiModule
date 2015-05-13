<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>webalbum</title>
</head>
<body>
	
	<h1>Albums</h1>

	<table>
		<tr>
			<td>id album</td>
			<td>id catalog</td>
			<td>name album</td>
		</tr>
		<c:forEach items="${albums}" var="album">
			<tr>
				<td>${album.id}</td>
				<td>${album.idCatalog}</td>
				<td><a href="${ctx}/fotos/${album.id}">${album.name}</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<p><a href=${ctx}/catalogs>return</a></p>

</body>
</html>