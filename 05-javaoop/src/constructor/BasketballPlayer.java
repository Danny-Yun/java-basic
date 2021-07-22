package constructor;

public class BasketballPlayer {

	public int height;
	public int jump;
	
	public void dunkShoot () {
		System.out.print("농구선수 생성 완료 : ");
		System.out.print("키 : " + height + ", ");
		System.out.println("점프력 : " + jump);
		
		if (height + jump >= 300) {
			System.out.println("덩크슛에 성공했습니다.");
			System.out.println();
		} else {
			System.out.println("골대에 닿지 않았습니다.");
			System.out.println();
		}
	}
	
	public BasketballPlayer (int h, int j) {
		height = h;
		jump = j;
	}
}
