<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 폼에서 던진 데이터를 받기 위해서는 request.getParameter("name값")을 활용한다. 
	// name="apple"에서 던져진 데이터를 받기 위해서는
	String id = request.getParameter("apple");
	// name="banana"에서 던져진 데이터를 받기 위해서는 
	String pw = request.getParameter("banana");
	
	String nickName = request.getParameter("butterfly");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	아이디 : <b><%= id %></b><br>
	비밀번호 : <b><%= pw %></b><br>
	별명 : <b><%= nickName %></b><br>
</body>
</html>