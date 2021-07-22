package buyandsell;

public class Buyer {
	/* 구매자
	 * 구매자는 돈, 망고갯수를 <멤버변수>로 가진다.
	 * 은닉 구현을 위해서 private으로 처리
	 */
	private int money;
	private int mango;
	private int apple;
	
	
	/* <생성자>는 (int money)를 받아서 돈을 초기화한다.
	 * 망고는 자동으로 0을 대입한다.
	 */
	public Buyer (int money) {
		this.money = money;
		this.mango = 0;
		this.apple = 0;
	}
	
	/* buyMango는 망고를 산다. 
	 * (int mango)로 망고 갯수를 입력 받으면, 망고 * 1000만큼의 돈을 차감하고 망고 변수에 그만큼 갯수를 늘려준다.
	 * 심화 -> 구매자가 가게를 고르지 가게에서 손님을 고르지 않기에 Seller변수를 buyer가 고를 수 있도록 파라미터를 설정한다.
	 */
	
	public void buyMango(MangoSeller seller, int mango) {
		
		//  총 망고 가격보다 돈이 적은 경우
		if (mango * 1000 > money) {
            System.out.println("- 돈이 모자라 망고를 구매할 수 없습니다."); 
            System.out.println();
			return;	   // if~else문 대신 사용
		}
		
		// 구매할 망고 개수보다 판매자의 재고가 적은 경우
		if (seller.getMango() < mango) {
			System.out.println("망고 재고가 부족합니다.");
			return;
		}
		
		// 셀러쪽에서 망고를 파는 코드를 망고를 사는 코드에 넣어서, 동시에 사고 팔도록 처리해야 상호작용이 이뤄진다.
		seller.sellMango(mango);    

		this.money -= mango * 1000;
		this.mango += mango;
		System.out.printf("- 망고 %d개가 정상적으로 구매되었습니다.\n", mango);
		System.out.println();
	}
	
	public void buyApple (AppleSeller seller, int apple) {
		
		if (apple * 3000 > money) {
			System.out.println("- 돈이 모자라 사과를 구매할 수 없습니다."); 
            System.out.println();
			return;	
		}
		
		if (seller.getApple() < apple) {
			System.out.println("사과의 재고가 부족합니다.");
			return;
		}
		
		seller.sellApple(apple);    

		this.money -= apple * 3000;
		this.apple += apple;
		System.out.printf("- 사과 %d개가 정상적으로 구매되었습니다.\n", apple);
		System.out.println();
	}
	
	/* showBuyer는 구매자의 상태를 보여준다.
	 *  money, mango 수치가 각각 몇인지 콘솔에 찍어준다.
	 */
	public void showBuyer() {
		System.out.println("<구매자 상태>");
		System.out.println();
		System.out.println("가지고 있는 돈 : " + money);
		System.out.println("구매한 망고 : " + mango);
		System.out.println("구매한 사과 : " + apple);
		System.out.println();
	}
	
}
