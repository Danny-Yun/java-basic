package interface01;

public class Car implements Vehicle {
	/* 
	 * 인터페이스를 구현(상속이 아님!)하기 위해서는 implements(extends가 아님) 키워드를 사용한다.
	 * 인터페이스 내부의 추상 메서드는 무조건 구현해줘야 한다. 
	 */
	
	// 자동차라면 가져야 하는 변수 설정 (현재 속도, 연료량, 차주)
	private int speed;
	private int fuel;
	private String owner;
	
	// 생성자를 만듬. 차주만 입력받도록
	// 나머지 요소는 현재 속도 0, 연료량 100을 자동 대입
	public Car (String owner) {
		this.speed = 0;
		this.fuel = MAX_GAS;  
		this.owner = owner;
	}

	@Override
	public void accel() { 
		// 한 번 가속시 속도가 10씩 늘어나도록 - 연료는 한 번 가속에 1씩 소비한다. - 단 속도는 200을 초과할 수 없다.
		if (speed + 10 >= 200 ) {
			speed = 200;
		} else {
		speed += 10;
		}
		fuel -= 1;
	}
	
	@Override
	public void breakSpeed() {
		// 한 번 감속시 속도가 10씩 줄어들도록 - 속도는 0미만이 될 수 없다.
		if (speed - 10 <= 0) {
			speed = 0;
		} else {
			speed -= 10;
		}
	}
	
	@Override
	public void reFuel() {
		// 연료를 다시 채울 경우 30씩 채워준다. - 연료 최대값은 상수 MAX_GAS를 이용해서 측정
		if (fuel + 30 >= MAX_GAS) {
			fuel = MAX_GAS;
		} else {
			fuel += 30;
		}
	}
	
	@Override
	public void showStatus() {
		System.out.println("<현재 자동차 상태>");
		System.out.println("차주 : " + owner);
		System.out.println("현재 속도 : " + speed);
		System.out.println("연료량 : " + fuel);
		System.out.println();
	}

}
