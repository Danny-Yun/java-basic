package day0618;

public class Continue01 { public static void main(String[] args) {
	/*
	 * continue문은 스킵기능을 생각하면 된다.
	 * 돌던 바퀴를 즉시 종료하고, 다음 바퀴를 이어서 실행한다.
	 * 전체 반복문을 종료시키는 break와 헷갈리지 않도록 주의 
	 */
	
	 for (int i = 1; i < 10; i++) {
		 if(i == 6 || i == 8) {
			 System.out.println("출력되지 않는 숫자입니다.");
			 continue;
		 }
		 System.out.println("이번 숫자는 " + i + "입니다.");
	 }
}

}
