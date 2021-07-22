package day0616;

import java.util.Scanner;

public class Scanner03 {
	public static void main(String[] args) {
		/* 
		 * 환율 계산기를 만들어보겠습니다.
		 * 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요.
		 * 
		 * 스캐너를 이용해서 won이라는 변수에 원화 금액을 입력해주세요.
		 * 원화와 환율을 이용해서 원화 xxxxx원을 환전시 xxxx(화폐) 입니다. 로 결과물을 출력
		 */
		
	     Scanner sc = new Scanner (System.in);
	     
	     System.out.println("<유로 환율계산기>");
	     System.out.println("유로의 환율은 현재 1유로 당 1,355.21원 입니다.");
	     System.out.print("원화를 입력해주세요 : ");
	  
	     int won = sc.nextInt();
	     double rate = 1355.21;
	     
	     int euro = (int)Math.round(won / rate);      // math.round = 반올림해주는 역할, (int) = 형변환,  double(실수) → int(정수) = (int) double
//planB  double euro = (won / rate);     
	     
	     
	     System.out.printf("원화 %d원을 유로로 환전 시 약 %deuro입니다.", won, euro);   // printf(); 포메팅
//planB	 System.out.printf("원화 %d원을 유로로 환전 시 약 %.0feuro입니다.", won, euro);   
	}

}
