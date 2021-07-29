<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag_Quiz02</title>
</head>
<body>
<%!
	int total;
%>
<%
	total++;
	out.print("페이지 누적 요청 수: " + total + "<br>");
	out.print("매 <b>10</b>번째 방문자에게는 기프티콘을 드립니다.<br>");
	
	if (total % 10 == 0) {
		out.print("당첨되셨습니다!");
	}
	out.print("<hr>");
	
	
	Random r = new Random();
	int num = r.nextInt(8) + 2;
	
	out.print("<h2>랜덤 구구단 (" + num + ")단</h2>");
	out.print("<p>이번에 나온 구구단은 " + num + "단입니다.</p>");
	
	for(int i = 1; i <= 9; i++) {
		out.print(num + "*" + i + "=" + num * i);
		out.print("<br>");
	}
%>
</body>
</html>