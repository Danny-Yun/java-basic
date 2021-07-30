<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	Random r = new Random();
	String job;
	List<String> party = new ArrayList<>();
%>
<% 	
 	int drawNum = r.nextInt(5) + 1;
	switch(drawNum) {
	case 1 :
		job = "전사";
		break;
	case 2 :
		job = "도적";
		break;
	case 3 :
		job = "사냥꾼";
		break;
	case 4 :
		job = "마법사";
		break;
	case 5 :
		job = "사제";
		break;
	}
	party.add(job);
	
	int cnt = 0;
	for(String samePlayer : party) {
   	 	if(job.equals(samePlayer)) {
			cnt += 1;
		}
	}
%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직업 부여</title>
</head>
<body>
	<h2>당신의 역할</h2>
	<p>
		당신에게 부여된 역할은 [<b><%= job %></b>]입니다.<br>
		현재 파티에 당신과 같은 역할을 가진 플레이어는 당신을 포함해 <%= cnt %>명입니다.
	<p>
		현재 파티 구성원<br>
		<%= party.toString() %>(<%= party.size() %>명 참가중)
	</p>
</body>
</html>
