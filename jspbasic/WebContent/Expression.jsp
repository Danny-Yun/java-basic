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
		public String name = "유나비";
		public int age = 22;
		
		// 원의 넓이를 구하는 메서드 areaCircle
		double areaCircle(double r) {
			return r * r * Math.PI;	
		}
	%>
	<%
		out.println("이름 : " + name + "<br>");
		out.println("나이 : " + age + "<br>");
	%>	
	이름 : <%= name %><br>
	나이 : <%= age %><br>
	반지름이 5인 원의 넓이 : <%= areaCircle(5) %>cm^2
	
</body>
</html>