package string;

public class String10 {
	
	public static void main(String[] args) {
		// String.valueOf()는 괄호 사이의 자료를 문자열로 바꿔준다.
		String a = String.valueOf(1000);
		System.out.println(a);
		System.out.println(a + 1);

		String b = String.valueOf(2231.58924);
		System.out.println(b);
		System.out.println(b + 1);
		
		// String.valueOf()를 쓰지 않고도 
		// + "" 만으로 문자열화를 시킬 수 있다. 
		// 자바는 문자열 + 다른 자료형을 할 경우 다른 자료들도 전부 문자열화 시켜준다. 
		String c = 1000 + "";
		System.out.println(c);
		System.out.println(c + 1);
		
		// boolean 자료형에 대해서 원하는 방식으로 문자열화해서 콘솔을 찍어보세요.
		String d = true + "";
		System.out.println(d);
		System.out.println(d + 1);
		
		String e = String.valueOf(false);
		System.out.println(e);
		System.out.println(e + 1);
	}
}
