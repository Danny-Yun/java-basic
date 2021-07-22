package buyandsell;

public class MangoSeller {
	/* 판매자
	 * 돈, 망고를 가진다.
	 */
	private int sales;
	private int mango;
	
	/* 생성자에서 망고갯수를 입력받을 수 있다.
	 * 돈은 0으로.
	 */
	public MangoSeller (int mango) {
		this.mango = mango;
		this.sales = 0;
	}
	
	/* 판매시 망고갯수를 입력할 수 있고, 망고갯수 * 1000만큼의 돈이 올라가고
	 * 망고는 판 갯수만큼 차감된다. 망고는 0미만으로 줄어들 수 없다.
	 */
	public void sellMango(int mango) {
		if (this.mango < mango) {
			System.out.println("- 현재 재고가 없어 구매하실 수 없습니다.");
			System.out.println();
			return; 
		}
		
		this.sales += mango * 1000;
		this.mango -= mango;
		
	}
	
	// 망고 갯수를 buyer에서 확인할 수 있도록 getMango() 게터를 생성해줌 
	public int getMango() {
		return mango;
	}
	
	
	// showSeller를 이용해 현재 남은 망고와 돈을 볼 수 있다.
	public void showMangoSeller() {
		System.out.println("<망고 판매자 상태>");
		System.out.println();
		System.out.println("매출 : " + sales);
		System.out.println("망고 재고 : " + mango);
		System.out.println();
	}
	

}
