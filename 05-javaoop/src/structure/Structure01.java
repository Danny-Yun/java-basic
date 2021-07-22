package structure;

public class Structure01 {
	
	public static void main(String[] args) {
		// Scanner와 마찬가지로 사용자가 커스텀으로 디자인한 자료형은 
		// 아래와 같이 new 자료형(); 문법으로 생성한다.
		Person a = new Person();       // 기존의 없는 새로 만든 자료형
		
		// a라는 구조체에 이름, 나이, 폰번호를 입력한다.
		a.name = "채종훈";
		a.age = 20;
		a.pNum = "010-1234-5678";
		a.address = "서울";
		
		// 입력된 자료를 하나하나 출력
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.pNum);
		System.out.println(a.address);
		
		System.out.println();
		
		// 또 다른 사람을 하나 만들어봅니다.
		Person b = new Person();
		b.name = "윤지우";
		b.age = 21;
		b.pNum = "010-7316-3811";
		b.address = "경기 화성시 동탄대로";
		
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.pNum);
		System.out.println(b.address);
		
		
	}

}
