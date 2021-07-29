<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% for(int i = 1; i <= 3; i++) { %>
	<h2>이클립스와 톰캣으로 HTML 렌더링하기</h2>
	<p>안녕하세요. 오늘 2021년 7월 29일 목요일 </br>
	    개발환경 설정 후 HTML 실행 테스트 
	  <% out.println("<h2>123</h2>"); %> 
  	</p> 
  	<% } %>
  	
</body>
</html>