package accessmodifier;

public class Warrior { 
	
	/* 
	 * hp, atk, level, exp 속성 추가
	 * 사용자가 main에서 임의로 수치를 고치는 것을 막기 위해
	 * public 대신 private으로 수정
	 */
	private int hp;
	private int atk;
	private int level;
	private int exp;
	private String id;
	
	/*
	 * 메서드는 아무리 사용해도 개발자의 의도대로만 사용되도록
	 * 제한하기 수월하기 때문에 일반적으로 public으로 설정한다.
	 */
	
	public Warrior(String id) {
		// 체력과 공격력은 생성시 20, 3으로
		this.hp = 20;
		this.atk = 3;
		// 레벨과 경험치는 생성시 1, 0으로
		this.level = 1;
		this.exp = 0;
		// id는 사용자가 입력한 대로
		this.id = id;
	}
	
	public void hunt() {
		System.out.printf("전사%s가 사냥을 시작합니다.\n", id);
		System.out.println();
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과 체력은 " + hp + "가 되었고");
		System.out.println("누적 경험치는 " + exp + "가 되었습니다.");
		System.out.println();
	}
	

}
