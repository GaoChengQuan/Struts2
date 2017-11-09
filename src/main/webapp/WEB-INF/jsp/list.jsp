<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<td>列号</td>
			<td>id</td>
			<td>名字</td>
			<td>年龄</td>
			<td>生日</td>
		</thead>
		<c:forEach items="${list}" var="student" varStatus="status">
			<tr>
				<td>${status.index}</td>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.age}</td>
				<td>${student.birthday}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>