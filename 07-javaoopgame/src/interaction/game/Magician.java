package interaction.game;

public class Magician {
	
	private int hp = 150;
	private int att = 200;
	private int def = 50;
	private int mana = 150;
	private int level= 10;
	private int exp = 0;
	
//	<------------------------------------------------->
	
	public int getMagicianHp() {
		return hp;
	}
	public void setMagicianHp(int hp) {
		this.hp = hp;
	}	
	public int getMagicianAtt() {
		return att;
	}
	public int getMagicianDef() {
		return def;
	}
	
//	<------------------------------------------------->
	
	public void showInfo() {
		System.out.println("<마술사의 현재 상태>");
		System.out.println();
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
//	<------------------------------------------------->
	
	public void huntVampire (Vampire v) {
		
		if (v.getVampireHp() <= 0) {
			System.out.println("이미 죽은 뱀파이어는 공격할 수 없습니다.");
			System.out.println();
			System.out.println("--------------------------------");
	    	System.out.println();
			return;
		}
		if (this.hp <= 0) {
			System.out.println("당신의 캐릭터는 교전할 수 없는 상태입니다.");
			System.out.println();
			System.out.println("--------------------------------");
	    	System.out.println();
			return;
		}
			
		System.out.println("- 마술사가 뱀파이어 사냥을 시작합니다.");
		System.out.println();

		v.setVampireHp(v.getVampireHp() - (this.att - v.getVampireDef()) );
		System.out.println("- 마술사가 공격에 성공하였습니다.");
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		
		

		if (v.getVampireHp() > 0)  {
			
			System.out.println("- 뱀파이어를 물리치지 못하였습니다.");
			System.out.println();
			this.hp -= (v.getVampireAtt() - this.def) ;

			if (this.hp <= 0) {
				System.out.println("당신의 캐릭터가 사망하였습니다.");
				System.out.println();
			}
			System.out.println("- 뱀파이어와의 교전 종료.");
			System.out.println();
			
		} else {
			System.out.println("- 마술사가 뱀파이어를 물리쳤습니다!");
			this.mana += 10;
			this.exp += 20;
			System.out.println("- 경험치를 20 획득했습니다.");
			System.out.println("- 마나를 10 획득했습니다.");
			System.out.println();
			System.out.println("- 뱀파이어와의 교전 종료.");
			System.out.println();
		}
		System.out.println("--------------------------------");
    	System.out.println();
		
	}
		
		public void huntWerewolf (Werewolf w) {
			
			if (w.getWerewolfHp() <= 0) {
				System.out.println("이미 죽은 늑대인간은 공격할 수 없습니다.");
				System.out.println();
				System.out.println("--------------------------------");
		    	System.out.println();
				return;
			}
			if (this.hp <= 0) {
				System.out.println("당신의 캐릭터는 교전할 수 없는 상태입니다.");
				System.out.println();
				System.out.println("--------------------------------");
		    	System.out.println();
				return;
			}
			
			System.out.println("- 마술사가 늑대인간 사냥을 시작합니다.");
			System.out.println();
			
			w.setWerewolfHp(w.getWerewolfHp() - (this.att - w.getWerewolfDef()) );
			System.out.println("- 마술사가 공격에 성공하였습니다.");
			System.out.println();
			System.out.println("--------------------------------");
			System.out.println();
			
			
			if (w.getWerewolfHp() > 0)  {
				
				System.out.println("- 늑대인간을 물리치지 못하였습니다.");
				System.out.println();
				this.hp -= (w.getWerewolfAtt() - this.def) ;

				if (this.hp <= 0) {
					System.out.println("당신의 캐릭터가 사망하였습니다.");
					System.out.println();
				}
				System.out.println("- 늑대인간과의 교전 종료.");
				System.out.println();
				
			} else {
				System.out.println("- 마술사가 늑대인간을 물리쳤습니다!");
				this.mana += 10;
				this.exp += 20;
				System.out.println("- 경험치를 20 획득했습니다.");
				System.out.println("- 마나를 10 획득했습니다.");
				System.out.println();
				System.out.println("- 늑대인간과의 교전 종료.");
				System.out.println();
			}
			System.out.println("--------------------------------");
	    	System.out.println();
			
		}
			
			public void huntOak (Oak o) {
				
				if (o.getOakHp() <= 0) {
					System.out.println("이미 죽은 오크는 공격할 수 없습니다.");
					System.out.println();
					System.out.println("--------------------------------");
			    	System.out.println();
					return;
				}
				if (this.hp <= 0) {
					System.out.println("당신의 캐릭터는 교전할 수 없는 상태입니다.");
					System.out.println();
					System.out.println("--------------------------------");
			    	System.out.println();
					return;
				}
				
				System.out.println("- 마술사가 오크 사냥을 시작합니다.");
				System.out.println();
				
				o.setOakHp(o.getOakHp() - (this.att - o.getOakDef()) );
				System.out.println("- 마술사가 공격에 성공하였습니다.");
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println();
				
				
				
				if (o.getOakHp() > 0)  {
					
					System.out.println("- 오크를 물리치지 못하였습니다.");
					System.out.println();
					this.hp -= (o.getOakAtt() - this.def) ;
					
					if (this.hp <= 0) {
						System.out.println("당신의 캐릭터가 사망하였습니다.");
						System.out.println();
					}
					System.out.println("- 오크와의 교전 종료.");
					System.out.println();
					
				} else {
					System.out.println("- 마술사가 오크를 물리쳤습니다!");
					this.mana += 10;
					this.exp += 20;
					System.out.println("- 경험치를 20 획득했습니다.");
					System.out.println("- 마나를 10 획득했습니다.");
					System.out.println();
					System.out.println("- 오크와의 교전 종료.");
					System.out.println();
				}
				System.out.println("--------------------------------");
		    	System.out.println();
			
			}
			
}
