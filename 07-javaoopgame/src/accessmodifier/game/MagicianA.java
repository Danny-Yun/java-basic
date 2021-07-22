package accessmodifier.game;

public class MagicianA extends CommonerA {
	
	public MagicianA() {
		super(10, 40, 60, 0);
	}
	
	public void getInfo() {
    	System.out.println("마법사의 현재 상태 :");
    	System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
	
	public void hunt () {
		System.out.printf("마법사가 사냥을 시작합니다.\n");
		setHp(getHp() - 2);
		setExp(getExp() + 10);
		System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
	public void fireBall () {
		System.out.printf("마법사가 파이어볼을 사용합니다.\n");
		setMana(getMana() - 10);
		setExp(getExp() + 20);
		System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
	public void magicRecovery () {
		System.out.printf("마법사가 회복마법을 사용합니다.\n");
		setMana(getMana() - 15);
		setExp(getExp() + 10);
		setHp(getHp() + 25);
		System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
}
