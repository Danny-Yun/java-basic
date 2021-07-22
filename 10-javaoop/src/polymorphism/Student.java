package polymorphism;

public class Student extends Person{

	private int grade;
	
	public Student() {
		// 부모쪽 생성자에게 넘겨주기 위해 생성자 내부에서 super()를 사용한다.
		// 자식쪽 생성자에서 super(전달자료1, 전달자료2...);를 사용하면 부모 생성자에게 전달된다.
		super("윤도담", 22);
		this.grade = 3;
	}
	
	// 부모 쪽의 showPerson()을 오버라이딩해서 자식 쪽에 재정의
	// 재정의된 메서드는 부모 타입으로도 자식 쪽에서 호출가능하다.
	public void showPerson() {
		super.showPerson();
		System.out.println("학년 : " + grade);
		System.out.println();
		System.out.println("------------------");
		System.out.println();

	}
	
}
