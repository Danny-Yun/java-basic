package accessmodifier.game;

public class ArcherA extends CommonerA { 
	
	public ArcherA() {
		super(10, 60, 40, 0);
	}
	
	public void getInfo() {
    	System.out.println("궁수의 현재 상태 :");
    	System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
	
	public void hunt () {
		System.out.printf("궁수가 사냥을 시작합니다.\n");
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

	public void multiShot () {
		System.out.printf("궁수가 멀티샷을 사용합니다.\n");
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
	
	public void poisonedArrow () {
		System.out.printf("궁수가 독화살을 사용합니다.\n");
		setMana(getMana() - 20);
		setExp(getExp() + 30);
		System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
}
