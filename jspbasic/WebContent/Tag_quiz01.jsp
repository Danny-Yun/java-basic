<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	// Declaration
	// jsp 파일에서 사용할 멤버변수, 메서드 선언할 때 사용
	int total = 0;

	int randomNumber() {
		// 정수 1~10까지의 난수 발생
		int rn = (int)(Math.random() * 10) + 1;
		return rn;
	}
	String randomColor() {
		/*
			실수 0.0이상 1.0미만의 난수를 발생시켜 난수값이 0.66이상이면 빨강, 0.33이상이면 노랑, 그 외에는 파랑을 리턴하는 메서드 선언
		*/
		double d = Math.random();
		if (d >= 0.66) {
			return "빨강";
		} else if (d >= 0.33) {
			return "노랑";
		} else {
			return "파랑";
		}
	} 
%>
<%
	// Scriptlet
	// 지역 변수 및 메서드 내부의 코드를 작성하는 태그
	// 페이지 요청이 발생할 때마다 실행할 로직을 작성
	String str = "web";
	int each = 0;
	total++;
	each++;
	
	int rn = randomNumber();
	String rc = randomColor();
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag_Quiz01</title>
</head>
<body>
<h2><%= str %>프로그래밍</h2>

	<!-- p태그는 문단을 나눌 때 사용하는 태그이다. -->
	<p> 
		페이지 누적 요청 수 : <%= total %>,
		페이지 개별 요청 수 : <%= each %><br>
	</p>
	<p>
		<h3>오늘의 행운의 숫자와 행운의 색깔</h3>
		행운의 숫자 : <b><%= randomNumber() %></b> <br>
		행운의 색깔 : <i><%= rc %></i>
	</p>
</body>
</html>