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
		 public double Celcius = 33.0;
		 public double CtoF(double Celcius){
			 return Celcius * 1.8 + 32;
		 }
	%>
	<%
		out.println("<h2><b>현재 홍대입구의 온도</b></h2><br>");
		out.println("<li>섭씨 온도 : <b>" + Celcius +"</b></li><br>");
		out.println("<li>화씨 온도 : <b>" + CtoF(Celcius) + "</b></li>");
	%>
</body>
</html>