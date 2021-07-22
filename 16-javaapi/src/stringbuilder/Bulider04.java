package stringbuilder;

public class Bulider04 {
	
	public static void main(String[] args) {
		// String 관련에서 CharAt은 기본적으로 한 글자를 의미한다.
		// 그래서 deleteCharAt은 문자열 내부에서 지정된 인덱스번호에 해당하는 딱 한 글자만 삭제하는 로직을 의미한다. 
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.deleteCharAt(0);
		System.out.println(a);
	}
}
