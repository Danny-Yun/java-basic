package string;

import java.util.Scanner;

public class String05 {
	
	public static void main(String[] args) {
		// .length()와 chatAt()을 활용해 입력된 전체 문자열을 한 글자씩을 한 줄씩 출력하는 로직을 작성
		// 문자열은 Scanner로 입력 받음
		
		Scanner scan = new Scanner (System.in);
		System.out.print("문장을 입력하세욧 : ");
		String all = scan.nextLine();
	
		
		for (int i = 0; i < all.length(); i++) {
			char get = all.charAt(i);
			System.out.println(get);
		}
		
	}

}
