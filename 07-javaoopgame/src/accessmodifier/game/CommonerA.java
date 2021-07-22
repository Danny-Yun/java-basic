package accessmodifier.game;

public class CommonerA {
	  
	    private int level;
	    private int hp;
	    private int mana;
	    private int exp;
	    
	    public int getHp() {
	    	return this.hp;
	    }
	    public int getMana() {
	    	return this.mana;
	    }
	    public int getExp() {
	    	return this.exp;
	    }
	    public int getLevel() {
	    	return this.level;
	    }
	    
	    public void setLevel(int level) {
			this.level = level;
		}
		public void setHp(int hp) {
			this.hp = hp;
		}
		public void setMana(int mana) {
			this.mana = mana;
		}
		public void setExp(int exp) {
			this.exp = exp;
		}
		
		// 직업 고유의 능력치 설정
	    public CommonerA(int level, int hp, int mana, int exp){
	    	this.level = level;
	    	this.hp = hp;
	    	this.mana = mana;
	    	this.exp = exp;
	    }
	    
	    public CommonerA () {
	    	level = 1;
	    	hp    = 20;
	    	mana  = 0;
	    	exp   = 0;
	    }
	    
	    public void getInfo() {
	    	System.out.println("평민의 현재 상태 :");
			System.out.println();
	    	System.out.println("레벨 : " + level);
	    	System.out.println("체력 : " + hp);
	    	System.out.println("마나 보유량 : " + mana);
	    	System.out.println("경험치 : " + exp);
	    	System.out.println();
	    	System.out.println("-------------------------");
	    }
		
	    // 평민의 사냥
		public void hunt () {
			System.out.println("평민이 사냥을 시작합니다.");
			System.out.println();
			hp -= 2;
			exp += 10;
			System.out.println("레벨 : " + level);
			System.out.println("체력 : " + hp);
			System.out.println("마나 보유량 : " + mana);
			System.out.println("경험치 : " + exp);
			System.out.println();
			System.out.println("-------------------------");
		}

}
