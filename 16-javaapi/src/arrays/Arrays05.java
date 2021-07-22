package arrays;

import java.util.Arrays;

public class Arrays05 {
	
	public static void main(String[] args) {
		// sort는 단순히 숫자에만 작동하지 않는다. 문자에도 제한적으로 작동한다. 
		// ASCII코드 규칙에 따라 작동한다. 
		String[] arr = { "apple", "Apple", "Banana", "giraffe", "Zet"};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
