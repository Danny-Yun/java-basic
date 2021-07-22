package day0616;

public class Q1 {
	public static void main(String[] args) {
		/*
		 * 다음 로직대로 전위, 후위 수식을 이용해 코드를 작성하고,
		 * 전위, 후위 수식 코드는 Unary01.java에서 그랬듯
		 * 두 단계로 주석으로 풀어서 설명도 하세요. 
		 */
		
		// 1. a에 15를 선언 및 초기화
		// 2. a를 후위 수식 감소시키면서 콘솔에 찍는다
		int a = 15;
		System.out.println(a--);
		
		// 3. a를 콘솔에 짝는다.
		// 4. a를 전위 수식 감소시키면서 콘솔에 찍는다.
		System.out.println(a);
		System.out.println(--a);
	
		// 5. a를 콘솔에 찍는다.
		System.out.println(a);

		}
}
