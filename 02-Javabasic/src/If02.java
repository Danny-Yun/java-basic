
import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		/*
		 * 주어진 변수 a에 스캐너로 정수 값을 입력받게 만들어주세요.
		 * 입력 받은 정수가 0이상이면 "0보다 크거나 같습니다."를 콘솔에
		 * 그렇지 않다면 "0보다 작습니다"를 콘솔에 출력하는 코드를 
		 * if문 2개를 이용해 구현해주세요.
		 */
		
		Scanner sc = new Scanner (System.in);
		System.out.print("수를 입력하세요 : ");
		int i = sc.nextInt();
		
		if (i >= 0) {
			System.out.println("0보다 크거나 같습니다.");
		}
		if (i < 0) {
			System.out.println("0보다 작습니다.");
		}

	}
}
