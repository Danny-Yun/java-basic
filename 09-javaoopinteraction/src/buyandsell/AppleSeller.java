package buyandsell;

public class AppleSeller {
	
	private int sales;
	private int apple;
	
	public AppleSeller (int apple) {
		this.apple = apple;
		this.sales = 0;
	}
	
	public void sellApple(int apple) {
		if (this.apple < apple) {
			System.out.println("- 현재 재고가 없어 구매하실 수 없습니다.");
			System.out.println();
			return; 
		}
		
		this.sales += apple * 3000;
		this.apple -= apple;
		
	}
	
	public void showAppleSeller() {
		System.out.println("<사과 판매자 상태>");
		System.out.println();
		System.out.println("매출 : " + sales);
		System.out.println("사과 재고 : " + apple);
		System.out.println();
	}
	
	public int getApple() {
		return apple;
	}

}
