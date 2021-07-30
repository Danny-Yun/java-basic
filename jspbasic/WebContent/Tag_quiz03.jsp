<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Random r = new Random();
	List<Integer> lotto = new ArrayList<>();
	int winNum = 0;
	
	while(lotto.size() < 6) {
		winNum = r.nextInt(45) + 1;
		if(!lotto.contains(winNum)) {
			lotto.add(winNum);
		}
	}
	Collections.sort(lotto);
	Thread.sleep(2000);
	out.flush();
%> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또 추첨</title>
</head>
<body>
		<h2>로또번호 추첨 결과</h2>
		<p>이번 주 로또는 이거다!</p>
		<%= lotto %>
</body>
</html>