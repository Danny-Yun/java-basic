package arrays;

import java.util.Arrays;

public class Arrays06 {
	
	public static void main(String[] args) {
		// 한글은 유니코드 체계를 따라서 값이 배정되어 있다. 
		// 유니코드는 아스크코드의 범위(대략 세 자리 수)를 넘어서는 범위의 문자를 표현하기 위해 나온 체계이다.
		String[] arr = {"채종훈", "김자바", "박스프링", "제이에스피", "스프링부트", "이클립스",
				        "java", "python", "jsp", "Spring"};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
    }       
}    
