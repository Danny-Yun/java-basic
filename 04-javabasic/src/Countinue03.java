
public class Countinue03 {
	public static void main(String[] args) {
	
		/*
		 * 다음은 학생들의 과목별 성적입니다.
		 * math = 96, 23, 52, 82, 72, 31, 58
		 * eng  = 62, 42, 68, 31, 80, 77, 45
		 * com  = 10, 28, 39, 74, 65, 90, 98
		 * 각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요.
		 * 합격점수는 60점 이상입니다.
		 */
		
		int [] math = { 96, 23, 52, 82, 72, 31, 58 };
		int [] eng  = { 62, 42, 68, 31, 80, 77, 45 };
		int [] com  = { 10, 28, 39, 74, 65, 90, 98 };
		
		int sum = 0;       // 합격자 점수 총합
		int count = 0;     // 합격자 수
		
		for (int m : math) {
			
			if (m > 59) { 
				sum += m;
				count ++;
			} else {
				continue;
			}
			
		}
		System.out.println( "수학 평균 : " + sum / count);
		
		sum = 0;
		count = 0;
        for (int e : eng) {
			
			if (e > 59) { 
				sum += e;
				count ++;
			} else {
				continue;
			}
			
		}
		System.out.println( "영어 평균 : " + sum / count);
		
		sum = 0;
		count = 0;
		for (int c : com) {
			
			if (c > 59) { 
				sum += c;
				count ++;
			} else {
				continue;
			}
			
		}
		System.out.println( "컴퓨터 평균 : " + sum / count);
		

		
		
		
	}
}
