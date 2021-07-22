package day0617;

public class For05 {
	public static void main(String[] args) {
		/*
		 * 2~9단까지 구구단을 출력하는 코드를 작성해주세요.
		 * 중첩 반복문을 써 주시면 됩니다.
		 */
		
		for (int i = 2; i < 10; i++) {
			System.out.println();
			System.out.println();

			System.out.printf("----- %d단 구구단입니다 ----\n\n", i );
			for (int j = 1; j < 10; j++) {
				
				System.out.printf("%d * %d = %d\t\n", i, j, i * j);
			
			}
			
		}


	
	
	}
}
