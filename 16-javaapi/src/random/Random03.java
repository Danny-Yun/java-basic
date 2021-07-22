package random;

import java.util.Random;

public class Random03 {
	
	public static void main(String[] args) {
		// Random 클래스의 nextInt()는 나올 숫자 범위를 지정할 수 있다.
		// 바로 정수로 나오기 때문에 코드가 좀 더 간결하다.
		Random r = new Random();
		
		// 범위 입력을 안 하는 경우 그냥 정수 아무거나 나옴
		int result = r.nextInt();
		System.out.println(result);
		
		// 따라서 정수 숫자 하나를 파라미터로 넣어줘야 0 <= 결과값 < n이 나온다.
		int result2 = r.nextInt(5);    // 5입력 시 0 ~ 4
		System.out.println(result2);
	}

}
