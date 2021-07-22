package constructor;

import structure.PersonClass;

public class CarMain {
	
	public static void main(String[] args) {
		Car car1 = new Car(100, 0, "윤지우");
		
		// 자동차 정보 조회
		car1.getInfo();
		car1.accelSpeed();
		car1.accelSpeed();
		car1.breakSpeed();
		
		
		/* 
		 * 같은 패키니 내부에 중복된 이름이 없는 외부클래스라고 해도 
		 * 호출 시에는 반드시 패키지명을 입력해줘야 호출된다.
		 * structure.PersonClass p1 = new structure.PersonClass();
		 */
		
		/* 
		 * 두 번째 방법은 아예 문서 상단에 import구문을 이용해 현재 패키지의 PersonClass는
		 * structure의 클래스임을 명시하는 방법이 있다.
		 * 
		 * 명시 방법은 클랴스 명을 적고 ctrl + space를 이용해서 자동입력 하거나,
		 * 그냥 직접 import를 적어주는 방법이 있다.
		 */
		
		PersonClass p2 = new PersonClass();
	
	}

}

