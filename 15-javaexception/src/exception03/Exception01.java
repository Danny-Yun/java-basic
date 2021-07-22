package exception03;

public class Exception01 {
	
	public static void main(String[] args) {
		
	// 다중 catch는 블록 내부에서 여러 유형의 예외가 발생할 수 있을 때 각각 예외 유형을 다르게 처리할 때 사용한다.
	// 이때 catch 구문을 여러 번 사용할 수 있다.
	int[] number = {1, 2, 3, 4, 5, 0};
	
	try {
		for(int i = 0; i < 6; i++) {
			System.out.println(number[i]);
		}
		System.out.println(number[4] / number[5]);
    } catch(ArrayIndexOutOfBoundsException a) {
    	System.out.println("범위를 벗어난 인덱스 번호를 입력하였습니다.");
    } catch(ArithmeticException ae) {
    	System.out.println("0으로 나눌 수 없습니다.");
    } catch(Exception e) {
    	System.out.println("이외의 예외가 발생하였습니다.");
    }

	
	
	
	}
}
