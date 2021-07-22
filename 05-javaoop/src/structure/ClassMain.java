package structure;

public class ClassMain {
	
	public static void main(String[] args) {
		// person 2명을 만들어보겠습니다
		PersonClass person1 = new PersonClass();
		PersonClass person2 = new PersonClass();
		
		// person 2명 정보를 직접 기입해주세요.
		person1.name = "김덕배";
		person1.age = 30;
		person1.birth = "91.06.28";
		person1.glasses = false;
		person1.position = "MF";

		person2.name = "소윤주";
		person2.age = 25;
		person2.birth = "96.05.23";
		person2.glasses = false;
		person2.position = "DF";
		
		person1.getInfo(person1);
		System.out.println();
		person2.getInfo(person2);

		
		
	}

}
