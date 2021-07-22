package buyandsell;

public class MainBS {
	
	public static void main(String[] args) {
		// 상인 2명 만들기
		
		MangoSeller s1 = new MangoSeller(10);
		MangoSeller s2 = new MangoSeller(20);
		// 구매자 1명 만들기
		Buyer b1 = new Buyer(5000);
		
		// 1번 상인 정보 확인 
		s1.showMangoSeller();
		
		// 2번 상인 정보 확인
		s2.showMangoSeller();
		
		// 1번 상인에게 구매자가 망고 구매
		b1.buyMango(s1, 5);
		
		// 구매자 정보 확인
		b1.showBuyer();
		
		// 1번 상인 정보 확인
		s1.showMangoSeller();
		
		// 2번 상인 정보 확인
		s2.showMangoSeller();
	}

}
