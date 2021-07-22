package casting;

public class Lion extends Animal {

	public Lion(String name, int age) {
		super(name, age);
	}
	
	public void roaring () {
		System.out.println("사자가 포효합니다.");
	}
	
	public void breeding () {
		System.out.println("사자가 교미를 시작합니다.");
	}

}
