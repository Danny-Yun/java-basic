<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>객체에 파라미터 전달 예제</title>
</head>
<body>
	<!-- form 내부에 input 4개를 만듬
		 input 태그의 type 속성은 하나는 text 하나는 password
		 name 속성은 하나는 apple, 하나는 banana
		  제출(submit)버튼, 리셋(reset)버튼도 각각 하나씩
	 -->
	 <!-- form 태그의 action은 데이터가 전달될 목적지이다. 현재, req_param_getpost로 날릴 예정이다. -->
	 <form action="req_param_getpost.jsp"> <!-- method를 작성하지 않으면 자동으로 get -->
	 	<input type="text" name="apple"><br>
	 	<input type="text" name="butterfly"><br>
	 	<input type="password" name="banana"><br>
	 	<input type="submit">
	 	<input type="reset">
	 </form>
</body>
</html>