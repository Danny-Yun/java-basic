package final02;

public class Final02Main {
	public static void main(String[] args) {
		
		// 일반 숫자를 이용한 출력요소 
		System.out.println("전사의 체력 : " + 50);
		System.out.println(50);
		System.out.println("몬스터의 경험치 : " + 20);
		System.out.println(20);
		
		// 자주 사용하게될 수치는 아래와 같이 상수처리를 해서 코드에 대입해준다.
		// 이러면 변수명만으로도 어떤 의미를 가진 수치인지 바로 유추가 가능해 코드의 가독성이 높아진다.
		final int WARRIOR_HP = 50;
		final int MONSTER_EXP = 50;
		
	}
}
