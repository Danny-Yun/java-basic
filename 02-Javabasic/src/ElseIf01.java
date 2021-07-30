
import java.util.Scanner;

public class ElseIf01 {
	public static void main(String[] args) {
		/* 
		 * else if는 if로 달린 조건 이외에 추가조건을 달때 쓴다.
		 * if문 다음에 작성하고, else문 전에 작성한다.
		 * 
		 * else if문은 else와 달리 조건식을 기입해야 한다.
		 * else if문은 몇 개라도 작성할 수 있다.
		 * 
		 * 다중 분기 조건문 if ~ else if ~ else

           - 여러 조건들을 설정할 때 사용하는 조건문입니다.
           - if ~ else if 구문은 위에서부터 차례대로 조건을 검색하면서 내려오므로 조건식 설정에 주의를 해야 합니다.
		 */
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if (num > 0) {
			 System.out.println("양수입니다.");
		 } else if (num == 0) {
			 System.out.println("0입니다.");
		 } else {
			 System.out.println("음수입니다.");
		 }
			 
	}
}
