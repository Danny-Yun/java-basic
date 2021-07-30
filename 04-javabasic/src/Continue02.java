
import java.util.Scanner;

public class Continue02 { 
	public static void main(String[] args) {
		/*
		 * 1부터 n까지 총합을 구하되 홀수끼리만 더한 총합을 구하는 구문을 작성해주세요.
		 * continue문을 반드시 사용하는 로직으로 작성해주세요
		 * n은 스캐너로 입력받습니다.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.print("목표 숫자를 입력해주세요 : ");
		int num = scan.nextInt();
		int sum = 0;
		
		System.out.println();
				
		for ( int i = 1; i <= num; i++) {
			
			if ( i % 2 == 1) {
				sum += i;
				System.out.printf("현재 1부터 %d까지 더했습니다.\n",i );
			    System.out.printf("총합은 %d입니다.\n", sum);
			} else {
				continue;
			}
			System.out.println();
		}
	
	
	}

}
