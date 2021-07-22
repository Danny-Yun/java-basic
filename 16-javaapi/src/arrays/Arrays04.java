package arrays;

import java.util.Arrays;

public class Arrays04 {
	
	public static void main(String[] args) {
		// Arrays.sort(배열); 은 배열 내부 순서를 조정한다. 
		// 작은 숫자일수록 0번 인덱스에 가깝게 배치한하고, 큰 숫자일수록 마지막 인덱스에 가깝게 배치한다. 
		int[] arr = {21, 60, 32, 44, 1, 59, 99, 89, 36};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
