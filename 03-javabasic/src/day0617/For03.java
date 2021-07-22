package day0617;

import java.util.Scanner;

public class For03 {
	public static void main(String[] args) {
	    /*
	     *  구구단 출력기를 만들어보겠습니다.
	     *  1~9 중 하나의 숫자를 입력받습니다.
	     *  만약 1~9범위가 벗어난 숫자가 입력된다면 "범위 내의 수를 입력해주세요" 라는 안내문구를 적고 종료
	     *  맞는 숫자가 들어온다면 결과예시처럼 출력합니다.
	     *  
	     *  > 7
	     *  
	     *  7 * 1 = 7
	     *  7 * 2 = 14
	     *  7 * 3 = 21
	     *  7 * 4 = 28
	     *  7 * 5 = 35
	     *  7 * 6 = 42
	     *  7 * 7 = 49
	     *  7 * 8 = 56
	     *  7 * 9 = 63
	     */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("<구구단 출력기>");
		System.out.print("원하는 숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
	
		
		if ((0<num)&&(num<10))     {    // 1~9 사이의 값만 받으려고 할 때
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n" ,num ,i ,num * i);
		}
		
		} else {
			System.out.println("범위 내의 수를 입력해주세요. (1~9)");
			System.out.println();
			System.out.print("원하는 숫자를 입력하세요 : ");
			num = scan.nextInt();	
		}
		
	
	}
}
