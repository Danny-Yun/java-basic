
import java.util.Scanner;

public class ScoreChecker {
	public static void main(String[] args) {
		/*
		 * 성적 판독기를 만들어보겠습니다.
		 * if ~ else if ~ else구문을 사용해 만들어주세요.
		 * 성적 기준은 95점 이상 A+, 90이상 A-, 85이상 B+, 80이상B-, 75이상 C+, 70이상 C-, 65이상 D+, 60이상 D-, 60미만 F로
		 * 프린트 구문으로 콘솔에 출력해주세요. 그리고 스캐너로 int score 변수에 성적을 입력받습니다.
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("성적을 알려드립니다!");
		System.out.print("당신의 점수을 입력하세요 : ");
	    int score = sc.nextInt();
	    
	    if (score >= 95) {
	    	System.out.println("당신의 성적은 A+입니다.");      // 순서가 뒤바뀌면 위에부터 적용되어 잘못 출력됨.
	    } else if (score >= 90) {
	    	System.out.println("당신의 성적은 A-입니다.");
	    } else if (score >= 85) {
	    	System.out.println("당신의 성적은 B+입니다.");
	    } else if (score >= 80) {
	    	System.out.println("당신의 성적은 b-입니다.");
	    } else if (score >= 75) {
	    	System.out.println("당신의 성적은 C+입니다.");
	    } else if (score >= 70) {
	    	System.out.println("당신의 성적은 C-입니다.");
	    } else if (score >= 65) {
	    	System.out.println("당신의 성적은 D+입니다.");
	    } else if (score >= 60) {
	    	System.out.println("당신의 성적은 D-입니다.");
	    } else {
	    	System.out.println("당신의 성적은 F입니다.");
	    } 
	    
	    
	}
}
