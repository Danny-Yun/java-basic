package buyandsell;

public class MainBS02 {
	
	public static void main(String[] args) {
		
		MangoSeller m1 = new MangoSeller(100);
		AppleSeller a1 = new AppleSeller(100);
		
		Buyer buyer = new Buyer(100000);
		
		buyer.buyApple(a1, 10);
		buyer.buyMango(m1, 25);
		buyer.showBuyer();
		
		a1.showAppleSeller();
		m1.showMangoSeller();
		
		
	
		
	}

}
