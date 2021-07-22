package day0615;

public class DataString {
	public static void main(String[] args) {
		/*
		 * 문자 자료형은 크게 2가지로, 단일문자인 char('문자'), 문자배열인 String("문자열")이 존재한다.
		 * 보통 String을 훨씬 많이 쓴다.
		 */
		
	    char c = 'a';
	    String s = "문자열입니다.";
	    
	    System.out.println(c);
	    System.out.println(s);
	    
	    /*
	     * - char형은 0~ 2^16의 범위 내에서 부호가 없는 16비트(2byte) 숫자를 사용하여 유니코드 문자를 표현한다.
	     * - String은 기본 데이터형이 아니다. 문자열을 좀 더 쉽게 다루기 위해 만들어 놓은 클래스임.
	     */
	}
}
