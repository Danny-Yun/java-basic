
import java.util.Scanner;

public class For06 {
	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < num; j++) {
			System.out.print("* ");
		    }

			System.out.println();
		}
			
			
		
		
		
		
	}
}
