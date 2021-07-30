
import java.util.Scanner;

public class DoWhile02 {
	public static void main(String[] args) {
		/* 
		 * 여러분들이 배달 어플을 만들었습니다. 이 어플은 주문금액을 입력받습니다.
		 * 주문금액이 15000 미만이면 프로그램이 멈춤니다.
		 * 주문금액은 Scanner를 이용해 order변수에 직접 입력받습니다.
		 * 단, do while로 작성해 첫 주문은 주문 금액이 15000미만이어도 
		 * "배달을 완료했습니다."라고 출력한 뒤 다시 주문금액을 입력받는 로직을 바복문 내부에 작성해주세요.
		 */


		Scanner scan = new Scanner (System.in);
		System.out.print("배달 금액을 입력해주세요 : ");
		int order = scan.nextInt();      // 입력 1  변수 선언은 한 번만
		
		do {

			System.out.printf("주문금액은 %d원입니다.\n", order);
			System.out.println("배달을 완료했습니다.");
			System.out.println();
			
			System.out.print("다음 배달 금액을 입력하세요 : ");
			order = scan.nextInt();     // 입력 2  
			
		} while (order >= 15000);      // while문과 달리 마지막에 세미콜론이 붙음
		
		System.out.println("금액이 모자라 배달 서비스가 종료됩니다.");
		
		
//		Scanner scan = new Scanner (System.in);
//		System.out.print("배달 금액을 입력해주세요 : ");
//        int order = scan.nextInt();
//        		
//        System.out.printf("주문금액은 %d원입니다.\n", order);
//		System.out.println("배달을 완료했습니다.");
//        		
//        while (true) { 
//        	
//        	System.out.print("다음 배달 금액을 입력하세요 : ");
//			order = scan.nextInt();
//            
//			if (order >= 15000) {
//				System.out.printf("주문금액은 %d원입니다.\n", order);
//				System.out.println("배달을 완료했습니다.");
//				
//			} else { 
//				System.out.println("금액이 모자라 배달 서비스가 종료됩니다.");
//				break;
//			}
//        }
		
		
	}
}
