package interface01;

public class Truck implements Vehicle {
	
		private int speed;
		private int fuel;
		private String owner;
		
		public Truck (String owner) {
			this.speed = 0;
			this.fuel = MAX_GAS;  
			this.owner = owner;
		}

		@Override
		public void accel() { 
			if (speed + 5 >= 130 ) {
				speed = 100;
			} else {
			speed += 5;
			}
			fuel -= 2;
		}
		
		@Override
		public void breakSpeed() {
			if (speed - 10 <= 0) {
				speed = 0;
			} else {
				speed -= 10;
			}
		}
		
		@Override
		public void reFuel() {
			if (fuel + 15 >= MAX_GAS) {
				fuel = MAX_GAS;
			} else {
				fuel += 15;
			}
		}
		
		@Override
		public void showStatus() {
			System.out.println("<현재 트럭 상태>");
			System.out.println("차주 : " + owner);
			System.out.println("현재 속도 : " + speed);
			System.out.println("연료량 : " + fuel);
			System.out.println();
		}

}
