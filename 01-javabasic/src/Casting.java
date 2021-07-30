
public class Casting {
	public static void main(String[] args) {
		/* 
		 * 서로 다른 자료형 간에는 원래 연산이 불가능하다.
		 * 그렇지만 편의상 컴퓨터가 자동으로 자료형을 보정해주는 경우가 있는데 이를 자료형 변환이라 한다.
		 * 
		 * 자동 형 변환인 promotion과 강제 형 변환인 casting이 있다.
		 * 
		 * 자동 형 변환은 작은 범위를 큰 범위에 맞출 때 발생하고,
		 * 강제 형 변환은 큰 데이터를 작은 범위에 맞출 때 사용한다.
		 */
		
	     int a = 5;
	     double b = 7.12;
	     System.out.println(a + b);     // (자동) int -> double
	     System.out.println(a + (int)b);     // (강제) double -> int
	     
	     byte c = (byte) 897987990L;
	     System.out.println(c);
		
		
		/* 
	      
	     * 형 변환(type casting)
	     
	     - 데이터의 크기

         # byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)


         - float은 4바이트인데 long보다 큰 타입인 이유는 표현할 수 있는 값의 경우의 수가 float이 더 크기 때문입니다.


         - 크기가 작은 데이터 타입을 크기가 큰 데이터 타입으로 변환할 때는 캐스트 연산자를 사용하지 않아도 컴파일러에 의해 자동으로 형 변환이 일어납니다.(자동 형 변환: Promotion)

         - 크기가 큰 데이터 타입을 크기가 작은 데이터 타입으로 변환할 때는 반드시 캐스트 연산자를 사용하여 변환할 데이터 타입을 명시해야 합니다.(강제 형 변환: Type Casting). 그렇지 않으면 컴파일시 오류가 발생합니다.

         - 서로 다른 타입의 데이터의 연산을 진행할 경우 두 데이터 중 큰 데이터 타입을 가진 쪽에 맞추어 자동 형 변환된 후 연산을 진행합니다.

         - int형보다 작은 데이터타입의 연산을 진행할 경우 자동으로 int형으로 형 변환이 이루어집니다.
         
	     */
	}

}
