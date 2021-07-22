package math;

public class Math06 {
	
	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다. 
		// Math.random()을 이용해 1/3확률로 가위, 바위, 보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 >가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서 조건식 ||을 사용합니다.
		
		int i = (int)(Math.random() * 3) + 1;
		int com = (int)(Math.random() * 3) + 1;
		
		final int ROCK = 1;
		final int SCISSORS = 2;
		final int PAPER = 3;
		
		// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
		String[] items = {"바위", "가위", "보"};
		
		if ((i == ROCK && com == SCISSORS) || (i == SCISSORS && com == PAPER) || (i == PAPER && com == ROCK))
		{ System.out.println("내가 이겼습니다."); }
	
		if (( com == ROCK && i == SCISSORS) || (com == SCISSORS && i == PAPER) || (com == PAPER && i == ROCK))
		{ System.out.println("컴퓨터가 이겼습니다."); }
		
		if (i == com)
		{ System.out.println("비겼습니다."); }
		
		System.out.println("내가 낸 것 : " + items[i]);
		System.out.println("컴퓨터가 낸 것 : " + items[com]);
		
	}
}
