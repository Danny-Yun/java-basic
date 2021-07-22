package interface01;

public class Main {
	
	public static void main(String[] args) {
		
	// 자동차 생성 및 사용 - 생성시 Car타입 하나와 Vehicle 타입 하나 이렇게 2종류
	Vehicle v1 = new Car("윤지우");
	Vehicle v2 = new Truck("육준서");
	Vehicle v3 = new Motorbike("김미도");

	v1.accel();
	v1.accel();
	v1.accel();
	v1.showStatus();

	v1.accel();
	v1.accel();
	v1.accel();
	v1.accel();
	v1.showStatus();
	
	v1.breakSpeed();
	v1.breakSpeed();
	v1.breakSpeed();
	v1.showStatus();
	
	
	v2.accel();
	v2.accel();
	v2.accel();
	v2.showStatus();

	v2.accel();
	v2.accel();
	v2.accel();
	v2.accel();
	v2.showStatus();
	
	v2.breakSpeed();
	v2.breakSpeed();
	v2.breakSpeed();
	v2.showStatus();

	
	v3.accel();
	v3.accel();
	v3.accel();
	v3.showStatus();
	
	v3.accel();
	v3.accel();
	v3.accel();
	v3.accel();
	v3.showStatus();
	
	v3.breakSpeed();
	v3.breakSpeed();
	v3.breakSpeed();
	v3.showStatus();
	}
}
