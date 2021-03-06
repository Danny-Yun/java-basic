
public class DoWhile01 {
	public static void main(String[] args) {
		/*
		 * do~while문은 while문과 기본적으로 같습니다.
		 * 단, 첫 번째 바퀴만큼은 조건 비교없이 바로 실행하고
		 * 두 번째 바퀴 부터는 각 바퀴마다 비교를 통해 추가 실행여부를 결정합니다.
		 */
		
		int i = 1;
		
		do { // do 구문이 먼저 써진다
			i += 2; // i = i + 2
			System.out.println("i는 5보다 작다??");
		} while (i < 5);   // while문과 달리 마지막에 세미콜론이 붙음
	}

}
