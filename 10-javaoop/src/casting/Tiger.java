package casting;

public class Tiger extends Animal
{

	public Tiger(String name, int age) {
		super(name, age);
	}
	
	// 의 행동에 해당하는 메서드를 추가하세요.
	public void hunting () {
		System.out.println("호랑이가 사냥을 시작합니다.");
	}
	
    // breeding은 오버라이딩 해주세요.
	public void breeding () {
		System.out.println("호랑이가 교미를 시작합니다.");
	}


}
