package day0617;

public class While01 {
	public static void main(String[] args) {
		/*
		 * While 문은 타겟이 되는 실행문을 반복해서 실행하는 구문이다.
		 * While 문은 실행 여부를 조건식 비교를 통해 결정한다.
		 * 한 번 실행하기로 결정되면 모든 타겟 실행문을 실행한다.
		 * 실행이 끝나면 다시  while구문으로 복귀
		 * 추가 비교를 통해 실행/탈출 여부가 결정된다.
		 */
		
		int i = 0;
		while (i < 2) {
			i += 1;  // i = i + 1
			System.out.println(i + "번째 실행");
		}
	}
}
