package interface01;

public class Motorbike implements Vehicle {
	
	private int speed;
	private int fuel;
	private String owner;
	
	public Motorbike (String owner) {
		this.speed = 0;
		this.fuel = MAX_GAS;  
		this.owner = owner;
	}

	@Override
	public void accel() { 
		if (speed + 15 >= 180 ) {
			speed = 180;
		} else {
		speed += 15;
		}
		fuel -= 1;
	}
	
	@Override
	public void breakSpeed() {
		if (speed - 30 <= 0) {
			speed = 0;
		} else {
			speed -= 30;
		}
	}
	
	@Override
	public void reFuel() {
		if (fuel + 50 >= MAX_GAS) {
			fuel = MAX_GAS;
		} else {
			fuel += 50;
		}
	}
	
	@Override
	public void showStatus() {
		System.out.println("<현재 오토바이 상태>");
		System.out.println("차주 : " + owner);
		System.out.println("현재 속도 : " + speed);
		System.out.println("연료량 : " + fuel);
		System.out.println();
	}

}
