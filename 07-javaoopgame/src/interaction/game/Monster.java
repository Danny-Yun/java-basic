package interaction.game;

public class Monster {
	
	private int hp;
	private int att;
	private int def;
	
	public Monster (int hp, int att, int def) {
		this.hp = hp;
		this.att = att;
		this.def = def;
	}
	
	int getHp() {
		return this.hp;
	}
	public void setHp() {
		this.hp = hp;
	}
	public int getAtt() {
		return this.att;
	}
	public int getDef() {
		return this.def;
	}
	
//	<------------------------------------------------->
	
	public void showInfo() {
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.att);
		System.out.println("방어력 : " + this.def);
		System.out.println();
		System.out.println("--------------------------------");
    	System.out.println();
	}

	
	
}
