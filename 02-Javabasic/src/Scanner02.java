
import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		
		// Scanner 생성을 직접 해보세요.
		Scanner sc = new Scanner (System.in);
		
		// 문자열을 입력받는 경우
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		// 실수를 입력받는 경우
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + " " + height);
		
//	    sc.close();
		   
		 
		
		
	}
}
