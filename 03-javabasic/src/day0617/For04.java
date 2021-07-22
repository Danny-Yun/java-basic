package day0617;

public class For04 {
	public static void main(String[] args) {
		/*
		 * 중첩 반복문은 반복문을 반복시키는 구문이다.
		 * 실행 횟수는 바깥쪽 반복문 횟수 * 안쪽 반복문 횟수이다.
		 * 실질적으로 쓸 일이 가장 많은 구문이므로 반드시 확실하게 익히고 넘어가야 한다.
		 */
		
		for (int i = 0; i < 3; i++) {    // 바깥쪽 반복문 열기
			
			for (int j = 0; j < 3; j++) {    //안쪽 반복문 열기
				System.out.print(i * j + "  ");
			}    // 안쪽 반복문 닫기  
			
			System.out.print("\t");
		}    // 바깥쪽 반복문 닫기  
	
//     i가 0일 때 (0 * 0) (0 * 1) (0 * 2)   => 0, 0, 0
//     i가 1일 때 (1 * 0) (1 * 1) (1 * 2)   => 0, 1, 2
//     i가 2일 때 (2 * 0) (2 * 1) (2 * 2)   => 0, 2, 4

	
	
	}
}
