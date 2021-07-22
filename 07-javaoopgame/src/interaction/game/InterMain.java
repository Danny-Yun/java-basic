package interaction.game;

public class InterMain {
	
	public static void main(String[] args) {
		
		Gladiator g = new Gladiator();
		Hunter h = new Hunter();
		Magician m = new Magician();
		
		Vampire v1 = new Vampire();
		Vampire v2 = new Vampire();
		Werewolf w1 = new Werewolf();
		Oak o1 = new Oak();
		
		h.showInfo();
		v1.showInfo();
		h.huntVampire(v1);

		h.showInfo();
		v1.showInfo();
		h.huntVampire(v1);
		
		h.showInfo();
		v1.showInfo();
		h.huntVampire(v1);
		
		g.showInfo();
		w1.showInfo();
		g.huntWerewolf(w1);
		g.showInfo();
		w1.showInfo();
		g.huntWerewolf(w1);
		
		
	
		
		
		
		
	}

}
