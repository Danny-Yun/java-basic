package random;

import java.util.Random;
import java.util.Scanner;

public class Random02 {
	
	public static void main(String[] args) {
		// Random 객체를 생성한 다음 nextBoolean() 기능을 이용하여 동전던지기 카운팅 프로그램을 만들어주세요.
		// n회 던졌을 때 true = 앞면 몇 회, false = 뒷면 몇 회  인지 콘솔에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력받습니다. 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("실행 시킬 횟수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println();
	    
		Random r = new Random();
		int front = 0;
		int back = 0;
		
		for(int i = 0; i < num; i++) {
			boolean result = r.nextBoolean();
			if (result == true) {
				front += 1;
			} else {
				back += 1;
			}
		}
		
		System.out.println(num + "번 던진 결과값 >>> ");
		System.out.println("앞면 : " + front);
		System.out.println("뒷면 : " + back);
	}
}
