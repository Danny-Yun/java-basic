package accessmodifier.game;

public class VampireA extends CommonerA{
	
	public VampireA () {
		super(30, 150, 50, 0);
	}
	
	public void getInfo() {
    	System.out.println("뱀파이어의 현재 상태 :");
    	System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
	public void hunt () {
		System.out.printf("뱀파이어가 사냥을 시작합니다.\n");
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
	
	public void hyperSpeed () {
		System.out.printf("뱀파이어가 하이퍼스피드를 사용합니다.\n");
		setMana(getMana() - 5);
		setExp(getExp() + 30);
		setHp(getHp() - 10);
		System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
	public void hideOut () {
		System.out.printf("뱀파이어가 은신을 사용합니다.\n");
		setMana(getMana() - 20);
		setExp(getExp() + 30);
		setHp(getHp() - 10);
		System.out.println();
		System.out.println("레벨 : " + getLevel());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 보유량 : " + getMana());
		System.out.println("경험치 : " + getExp());
		System.out.println();
		System.out.println("-------------------------");
	}
	
}
