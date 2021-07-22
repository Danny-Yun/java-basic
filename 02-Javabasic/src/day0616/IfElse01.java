package day0616;

import java.util.Random;

public class IfElse01 {
	public static void main(String[] args) {
		/* 
		 * if~else 구문은 참일 때 실행할 구문과 거짓일 때 실행할 구문을 함께 작성한다.
		 * if~else 구문은 한 구문으로 간주되어 연산 횟수를 절약한다.
		 * else문은 if문 없이 단독으로 쓰일 수 없다.
		 * else문은 조건식을 작성할 필요가 없다.
		 *
		 */
		
		Random r = new Random();
		int answer = r.nextInt(2) + 15; 
		System.out.println(answer);
		
		if (answer == 15) {
			System.out.println("15입니다.");
		} else {
			System.out.println("15가 아닙니다.");
		}
	}
}
