package interaction.game;

public class Gladiator extends UserPick {
	
	public Gladiator() {
		super(300, 200, 100, 50, 10, 0);
	}
	
	public void showInfo() {
		System.out.println("<글레디에이터의 현재 상태>");
		System.out.println();
		super.showInfo();
	}
	
//	<------------------------------------------------->
//	몬스터 종류별 사냥
	
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
			
		System.out.println("- 글레디에이터가 뱀파이어 사냥을 시작합니다.");
		System.out.println();

		v.setVampireHp(v.getVampireHp() - (this.att - v.getVampireDef()) );
		System.out.println("- 글레디에이터가 공격에 성공하였습니다.");
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
			System.out.println("- 글레디에이터가 뱀파이어를 물리쳤습니다!");
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
			
			System.out.println("- 글레디에이터가 늑대인간 사냥을 시작합니다.");
			System.out.println();
			
			
			w.setWerewolfHp(w.getWerewolfHp() - (this.att - w.getWerewolfDef()) );
			System.out.println("- 글레디에이터가 공격에 성공하였습니다.");
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
				System.out.println("- 글레디에이터가 늑대인간을 물리쳤습니다!");
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
				
				System.out.println("- 글레디에이터가 오크 사냥을 시작합니다.");
				System.out.println();
				
				o.setOakHp(o.getOakHp() - (this.att - o.getOakDef()) );
				System.out.println("- 글레디에이터가 공격에 성공하였습니다.");
				System.out.println();
				System.out.println("--------------------------------");
				System.out.println();
				
				
				if (o.getOakHp() > 0)  {
					
					System.out.println("- 오크를 물리치지 못하였습니다.");
					System.out.println();
					this.hp -= (o.getOakAtt() - this.def);
					
					if (this.hp <= 0) {
						System.out.println("당신의 캐릭터가 사망하였습니다.");
						System.out.println();
					}
					
					System.out.println("- 오크와의 교전 종료.");
					System.out.println();
					
				} else {
					System.out.println("- 글레디에이터가 오크를 물리쳤습니다!");
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
