package interaction.game;

public class Werewolf extends Monster{
	
	public Werewolf() {
		super(100, 50, 100);
	}
	
	public void showInfo() {
		System.out.println("<늑대인간의 현재 상태>");
		System.out.println();
    	super.showInfo();
	}
}
