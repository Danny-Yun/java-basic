package day0623.method;

public class MethodBonus02 {
	
	// void가 아닌 리턴 자료형을 가지는 메서드도 return구문 실행시 종료된다.
	public static int getInt() {
		System.out.println("인트 발송 전");
		if (3 > 5) {
			return 1;
		}
		System.out.println("인트 발송 후");
		return 0;
	}
	
	
	public static void main(String[] args) {
		// 리턴된 숫자를 출력하는 첫 번째 방법
		int result = getInt();
		System.out.println(result);
		
		// 리턴된 숫자를 출력하는 두 번째 방법
		System.out.println(getInt());
	}

}
