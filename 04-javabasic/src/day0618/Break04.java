package day0618;

import java.util.Scanner;

public class Break04 {
	public static void main(String[] args) {
		/*
		 * Scanner로 정수를 입력 받으세요.
		 * 1~n까지 차곡차곡 순서대로 더해나갔을 때
		 * 1부터 몇 까지 더해야 입력된 정수를 초과하는지 계산해주는 프로그램을 작성해주세요.
		 */
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		int num = scan.nextInt();
		int sum = 0;
		
		int i = 1;
	    
		
		while (true) {
	    	
	    	sum += i;
	    	System.out.printf("1부터 %d까지의 총합은 : %d입니다. \n", i, sum);
	    	
	    	if (sum >= num) {
	    		System.out.println("목표값 : " + num);
	    		System.out.println("총 합 : " + sum );
	    	    System.out.println("몇 까지 더했나? : " + i);
	    	    break;
	    	}
	    	i++;
	    }
			
	    scan.close();
		
	}

}
