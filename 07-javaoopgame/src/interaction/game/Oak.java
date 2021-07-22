package interaction.game;

public class Oak extends Monster {
	
	public Oak() {
		super(50, 50, 150);
	}

	public void showInfo() {
		System.out.println("<오크의 현재 상태>");
		System.out.println();
		super.showInfo();
	}
}
