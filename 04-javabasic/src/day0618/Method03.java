package day0618;

public class Method03 {
	
	public static void plus(int a, int b) {
		/*
		 * 내부 실행문에서 두 개 이상의 변수를 요구한다면
		 * 두 개 이상의 매개변수를 선언할 수 있습니다.
		 * 이 경우 상대적인 위치에 맞춰서 전달됩니다.
		 */
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
        plus(3, 5);   // 메서드 끼리는 동등한 관계이기 때문에 밑에 있어도 대입이 가능하다.
        
        
	
	}

}
