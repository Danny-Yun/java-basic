package day0617;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		/*
		 * 스캐너를 이용해서  String num 변수에 "문자열 형채인 숫자"를 입력받게 해주세요.
		 * 이 문자 자료 num을 int loop 변수에 정수로 변환해 저장하세요.
		 * loop 변수에 입력된 정수 횟수만큼 "반복문을 실행합니다 (횟수)"라는 문장이 콘솔에 출력되도록
		 * while문을 작성해주세요
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("숫자를 입력하세요 : ");
		String num = scan.nextLine();
		
		int loop = Integer.parseInt(num); 	// Integer.parseInt(문자열)을 입력 시 정수로 교환해줌
		int i = 0;
		
		while (i < loop) {
			i += 1;   // i = i + 1  (= i++;)
			System.out.printf("반복문을 실행합니다. %d \n", i);
//			i += 1;   // for랑 같은 위치, 숫자의 결과가 달라짐 
		}
		
	}

}
