package day0615;

public class DataDouble {
    public static void main(String[] args) {
		/* 실수 표현을 할 때는 float, double 자료형을 쓴다.
		 * 기본적으로 실수 숫자만 작성하면 double이다.
		 * 만약 float으로 실수 숫자를 표현한다면 숫자 가장 오른쪽에 f라고 적어준다. 
		 * 실수형은 디폴트형이 double이므로 float형을 지정하려면 숫자 뒤에 "F"를 붙여준다.
		 * float은 4바이트, double은 8바이트이다.
		 */
    	
    	float a = 1.1f;   // f를 빼면 오류가 뜸
    	double b = 1.1;
    	
    	System.out.println(a);
    	System.out.println(b);
    	
    	
    	/*
    	 * 실수형 표현은 소수점 표현방식인 10진수형 표현방식과, 지수 형식으로 나타내는 과학기술용 표기법이 사용됨.
    	 */
	}
}
