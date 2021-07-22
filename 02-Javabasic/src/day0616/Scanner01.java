package day0616;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		/* 
		 * 코드 실행 중 사용자의 입력을 받는 경우 스캐너 기능을 사용한다.
		 * Scanner 부분에 마우스를 갖다대고 import를 해주면 된다.
		 */
        
		// 스캐너 객체 생성
		Scanner sc =  new Scanner (System.in);
		
		// 정수 한 글자를 입력받음
		int a = sc.nextInt();
		
		// 입력 받은 정수를 출력
		System.out.println(a);
		
		// 메모리 절약을 위해 다 쓴 scan 변수는 닫습니다.
		sc.close();
		
		/*
		 * 입력 받을 데이터 타입에 따른 메서드 호출.

          ex) scan.next(), scan.nextLine(), scan.nextInt(), scan.nextDouble() 등

          - next(): 공백을 포함하지 않는 문자열을 입력 받을 때
          - nextLine(): 공백을 포함한 문자열을 입력 받을 때
          - nextInt(): 정수를 입력 받을 때
          - nextDouble(): 실수를 입력 받을 때

                    스캐너 객체 종료.

         ex) scan.close();
		 */
	}
}
