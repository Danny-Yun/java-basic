package day0617;

import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		/*
		 * Hello Java를 입력한 횟수만큼 출력하는 구문을 작성해보세요.
		 * 입력은 Scanner로 받습니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반복 횟수를 입력하세요 : ");
		int loop = scan.nextInt();
		
		for (int i = 1; i <= loop; i++) {
			System.out.println("Hello Java! " + i);
		}

	}
}
