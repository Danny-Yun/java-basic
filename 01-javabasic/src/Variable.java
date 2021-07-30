

public class Variable {

	public static void main(String[] args) {
	    /*
	     *  변수는 기본적으로 
	     *  자료형 변수명; (선언)
	     *  변수명 = 값; (초기화)
	     *  방식과
	     *  자료형 변수명 = 값; (선언 및 초기화)
	     *  두가지 방식으로 값을 대입할 수 있따.
	     */
		
		int a;    // 나는 a박스에 정수를 넣을 예정이다 (아직 안 넣음)
		a = 5;    // 위의 a박스에 5를 집어넣겠다.
		
		int b, c;
		b = 10;
		c = 15;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		a = 20;    // a변수 값 20으로 교체 (기존의 5는 삭제)
		System.out.println(a); 

	}

}
