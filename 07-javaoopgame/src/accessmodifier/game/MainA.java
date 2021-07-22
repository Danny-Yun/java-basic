package accessmodifier.game;

public class MainA {
	
	
	public static void main(String[] args) {

		CommonerA c1 = new CommonerA();
		c1.getInfo();
		c1.hunt();

		
		WarriorA w1 = new WarriorA ();
		w1.getInfo();
		w1.hunt();
		w1.doubleAtt();
		w1.upShield();
		
	
		
		MagicianA m1 = new MagicianA ();
		m1.getInfo();
		m1.hunt();
		m1.fireBall();
		m1.magicRecovery();
		
		
		ArcherA a1 = new ArcherA ();
		a1.getInfo();
		a1.hunt();
		a1.multiShot();
		a1.poisonedArrow();
		
		VampireA v1 = new VampireA ();
		v1.getInfo();
		v1.hunt();
		v1.hyperSpeed();
		v1.hideOut();
		
		
	}

}
