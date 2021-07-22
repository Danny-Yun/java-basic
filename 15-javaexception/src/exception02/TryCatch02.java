package exception02;

public class TryCatch02 {
	
	public static void main(String[] args) {
		
	// exception01 패키지 내부의 여러 예외 유형 중 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
	// 발생할 예외에 대한 처리는 try ~ catch블록을 활용합니다.
	
	int[] score = {3, 5, 11, 13, 23, 27, 32, 37};
	
	
	try {
		for (int a : score) {
			System.out.println(score[10]);
		}
		System.out.println("선호하는 등번호입니다.");
	} catch(Exception e) {
		System.out.println("선호하는 등번호가 없습니다.");
	} finally {
		System.out.println("집계가 끝났습니다.");
	}

	}
}
