package polymorphism;

public class Main {
	public static void main(String[] args) {
		
		Person a1 = new Army();
		Person s1 = new Student();
		Person d1 = new Developer();
		
		a1.showPerson();
		s1.showPerson();
		d1.showPerson();
	}
}
