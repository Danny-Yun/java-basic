<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<%!
		 public boolean trueOrFalse(int n1, int n2) {
			if (n1 >= n2) {
				return true;
			} else {
				return false;
			}
		}
	%>
	<%
		out.print("스크립트릿으로 출력된 값 : <b>" + trueOrFalse(11, 2) + "</b><br>");
	%>
	표현식으로 출력된 값 : <b><%= trueOrFalse(11, 2) %></b><br>
</body>
</html>