package inheritance;

public class Main01 {
	
	public static void main(String[] args) {
		// Student가 Person을 상속했기 때문에 
		// Student는 Person의 자원을 사용할 수 있다. 
		Student st1 = new Student( /*"윤지우", 21, "컴퓨터공학"*/ );
		st1.name = "윤지우";
		st1.age = 21;
		st1.major = "컴퓨터공학";
		
		st1.getPersonInfo();
		st1.getStudentInfo();
		
	}

}
