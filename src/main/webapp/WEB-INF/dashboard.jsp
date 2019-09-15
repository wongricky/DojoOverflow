<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Questions</title>
</head>
<body>
	<div id = "wrapper">
		<div id = "top">
			<h1>Questions</h1>
			<h4><a href = "/questions/new">Add a new question</a></h4>
		</div>
		<table>
		    <thead>
		        <tr>
		            <th>Questions</th>
		            <th>Tags</th>
		        </tr>
		    </thead>
		    <tbody>
		        <c:forEach items = "${questions}" var = "q">
		        <tr>
		        	<td><a href = "/questions/${q.id}">${q.question}</a></td>
		            <td><c:forEach items = "${q.tags}" var = "t">
		            	${t.subject},
		             </c:forEach>
		             </td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
	</div>
</body>
</html>