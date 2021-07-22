package superclass;

public class Airplane {
	
	// 비행기는 속도를 가진다.
	public int speed;

	// 생성자는 속도를 입력한 값으로 맞춰준다.
	public Airplane(int s) {
		speed = s;
	}
	
	/*
	 * fly() 메서드를 수행하면 속도가 500씩 붙는다.
	 * 단, 일반 비행기는 속도가 900이상이 될 수 없음
	 * 속도를 조건식으로 체크
	 */
	
	public void fly () {
		

		    if (speed + 500 >= 900) {
		    	speed = 900;
		    } else {
		    	speed += 500;
		    }
		    	
		System.out.println("시속 " + speed + "km/h로 비행중.");
	}	
	
	/* 
	 * breakspeed() 메서드를 수행하면 속도가 100씩 감속한다.
     * 단, 브레이크 연산은 속도 최저선이 0임
     */
		
	public void breakSpeed () {
			
			    speed -= 100;
			    if (speed < 0) {
			    	speed = 0;
			    }
			    
	    System.out.println("감속 결과 시속 " + speed + "km/h 입니다.");
	}
		
		
	
}
