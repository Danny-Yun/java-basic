package day0618;

public class Method05 {
	
	public static void plus2(int c, int num) {
		System.out.println(c + num);
	}
	
	public static void main(String[] args) {
		/*
		 * 중괄호 여닫는 부분 내부를 "지역"이라고 한다.
		 * 중괄호가 닫히면 해당 "지역"과 지역 내 자료들은 모두 소멸된다.
		 */
		
		plus2(10, 20);
		System.out.println(c);
		System.out.println(num);
		
	}

}
