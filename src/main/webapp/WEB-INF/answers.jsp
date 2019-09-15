<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Question Profile</title>
</head>
<body>
	<div id = "wrapper">
		<h1>${question.getQuestion()}</h1>
		<h3>Tags: </h3><c:forEach items = "${question.getTags()}" var = "t">
		     ${t.getSubject()},
		</c:forEach>
		<div id = "main">
			<div id = "answers">
				<table>
				    <thead>
				        <tr>
				            <th>Answers</th>
				        </tr>
				    </thead>
				    <tbody>
				    <c:forEach items = "${question.getAnswers()}" var = "a">
				    	<tr>
				        	<td>${a.answer}</td>
				        </tr>
				    </c:forEach>
				    </tbody>
				</table>
			</div>
			<div id = "submitanswer">
				<h4>Add your answer:</h4>
				<c:out value = "${answer}"/><br>
				<form action = "/questions/${question.getId()}/answer" method = "post">
					<p>
						<textarea name = "answer" cols = "50" rows = "4"></textarea>
					</p>
					<input type = "submit" value = "Answer!"/>
				</form>
			</div>
		</div>
	</div>
</body>
</html>