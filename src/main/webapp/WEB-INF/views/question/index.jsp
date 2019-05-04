<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Quiz</h3>
	<form method="post" action="${pageContent.request.contextPath }/question/submit">
	
		<ol type="1">
			<c:forEach var="question" items="${questions }">
				<li>
				${question.content }
				<input type="hidden" name="questionsID" value="${question.id }">
				<ol type="a">
					<c:forEach var="answer" items="${question.answers }">
						<li>
							<input type="radio" name="question_${question.id }" value="${answer.id }">
							${anser.content }
						</li>
					</c:forEach>
				</ol>
				</li>
			</c:forEach>
		</ol>
		<br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>