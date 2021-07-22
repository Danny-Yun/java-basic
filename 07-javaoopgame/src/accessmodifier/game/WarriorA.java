package accessmodifier.game;

public class WarriorA extends CommonerA {
	
	
	public WarriorA() {
		super(10, 80, 20, 0);
	}
	
	public void getInfo() {
    	System.out.println("전사의 현재 상태 :");
    	System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}

	public void hunt () {
		System.out.printf("전사가 사냥을 시작합니다.\n");
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
	
	public void doubleAtt () {
		System.out.printf("전사가 더블어택을 사용합니다.\n");
		setMana(getMana() - 10);    // mana = mana - 10
		setExp(getExp() + 20);
		System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
	public void upShield () {
		System.out.printf("전사가 방패들기를 사용합니다.\n");
		setMana(getMana() - 10);    
		setExp(getExp() + 5);
		setHp(getHp() + 30);
		System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}

}
