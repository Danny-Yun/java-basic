package day0616;


import java.util.Scanner;

public class SwitchCase02 { 
	public static void main(String[] args) {
		
		// Math.random();을 이용해 난수를 하나 발급받을 수 있다. 난수의 범위는 0 초과 1 미만임.
		double num = Math.random();    
		
		// 뒤에 숫자를 곱하면 원하는 범위의 정수를 얻을 수 있다.
		int intNum = (int)(Math.random() * 10);    
		System.out.println(intNum);
		
		
		// Switch~Case문을 이용해서 식당 이름을 출력하는 프로그램을 만들어보세요. (최소 6개)	
		switch (intNum) {
		case 1:
			System.out.println("북창동순두부");
			break;
		case 2:
			System.out.println("싸다김밥");
			break;
		case 3:
			System.out.println("아우네돼지불백");
			break;
		case 4:
			System.out.println("SUBWAY");
			break;
		case 5:
			System.out.println("홍콩반점");
			break;
		default:
			System.out.println("홍대IN파스타");
			break;
		}
	}
}
