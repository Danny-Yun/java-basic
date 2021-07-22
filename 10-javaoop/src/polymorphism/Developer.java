package polymorphism;

public class Developer extends Person {
	
	public int year;
	public String position;
	public String mainStack;
	
	public Developer () {
		super("대니", 27);
		this.year = 5;
		this.position = "backend";
		this.mainStack = "Java, Go";
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("연차 : " + year);
		System.out.println("포지션 : " + position);
		System.out.println("주 기술 스택 : " + mainStack);
		System.out.println();
		System.out.println("------------------------");
		System.out.println();
	}
	

}
