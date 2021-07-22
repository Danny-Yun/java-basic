package math;

public class Math01 {
	
	public static void main(String[] args) {
		
	// Math는 자바에서 이미 기본으로 제공하는 기능이라 import없이 사용가능하다.
	
	// abs() -> 절대값을 구함 	
	int a = -1024;
	System.out.println(Math.abs(a));

	// ceil() -> 올림값을 구함 	
	double b = 3.14;
	System.out.println(Math.ceil(b));
	
	// floor() -> 내림값을 구함 	
	double c = 19.9;
	System.out.println(Math.floor(c));

	}
}
