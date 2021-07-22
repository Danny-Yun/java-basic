package interaction.game;

public class UserPick {

	private int hp;
	private int att;
	private int def;
	private int mana;
	private int level;
	private int exp;
	
	public UserPick (int hp, int att, int def, int mana, int level, int exp) {
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.mana = mana;
		this.level = level;
		this.exp = exp;
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}	
	public int getAtt() {
		return att;
	}
	public int getDef() {
		return def;
	}
	
//	<------------------------------------------------->
	
	public void showInfo() {
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.att);
		System.out.println("방어력 : " + this.def);
    	System.out.println("마나 보유량 : " + this.mana);
    	System.out.println("레벨 : " + this.level);
    	System.out.println("경험치 : " + this.exp);
    	System.out.println();
    	System.out.println("--------------------------------");
    	System.out.println();
    	
	}
	
}
