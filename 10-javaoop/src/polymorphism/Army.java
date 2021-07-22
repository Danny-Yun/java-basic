package polymorphism;

public class Army extends Person {

	private String rank;
	
	public Army () {
		super("윤지우", 21);
		this.rank = "대위";
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("계급 : " + rank);
		System.out.println();
		System.out.println("------------------");
		System.out.println();
	}
}
