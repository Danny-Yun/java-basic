package random;

import java.util.Random;

public class Random01 {
	
	public static void main(String[] args) {
		// Random 클래스는 Math.round()보다 좀 더 간단하게 다양한 종류의 난수값을 얻을 수 있도록 도와준다.
		// java.util을 통해 import 할 수 있다. 
		Random r = new Random();
		
		boolean result = r.nextBoolean();
		
		System.out.println(result);
	}
}
