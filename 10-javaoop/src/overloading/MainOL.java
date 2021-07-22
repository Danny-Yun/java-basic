package overloading;

public class MainOL {
	
	/* 오버로딩은 과적재 라는 뜻으로 같은 이름의 메서드를 한 공간에 여럿 정의하는 것을 의미한다.
	 * 자바는 메서드를 구분할 때 이름으로도 구분하지만 파라미터의 갯수, 자료형으로도 구분한다.
	 * 오버 로딩은 메서드 이름은 같지만 파라미터의 종류가 달라도 자바에서 호출구분이 되는 것을 감안해 허용되는 문법이다.
	 */
	
	public static void over (int a) {
		System.out.println("출력 1 : " + a);
	}

	public static void over (int a, int b) {
		System.out.println("출력 2 : " + a + "," + b);
	}
	
	public static void over (String a) {
		System.out.println("출력 3 : " + a);
	}
	
	public static void main(String[] args) {
		over(5);
		over("123");
		over(4, 5);
		
		
	}
	// static 같은 클래스내에 메인 메서드가 있을 때 만
	
}
