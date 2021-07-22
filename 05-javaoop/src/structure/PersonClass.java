package structure;

public class PersonClass {

	/*
	 * 사람 정보를 Person처럼 정의해주세요.
	 * 여러분들이 추가하고 싶은 특성을 하나 더해주세요.
	 */
	
	public String name;
	public int age;
	public String birth;
	public boolean glasses;
	public String position;
	
	/* 
	 * 추가로 아까의 조회 메서드를 내부에 생성해주세요.
	 * 클래스 내부에 생성할 때는 static이 필요 없습니다.
	 */
	
	public void getInfo(PersonClass person1) {
		System.out.println("이름 : " + person1.name);
		System.out.println("성별 : " + person1.age);
		System.out.println("출생 : " + person1.birth);
		System.out.println("안경여부 : " + person1.glasses);
		System.out.println("포지션 : " + person1.position);
	}
	
	
}
