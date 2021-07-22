package interaction.game;

public class Vampire extends Monster{

	public Vampire() {
		super(1000, 150, 50);
	}

	public void showInfo() {
		System.out.println("<뱀파이어의 현재 상태>");
		System.out.println();
		super.showInfo();
	}
}
