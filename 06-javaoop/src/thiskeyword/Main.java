package thiskeyword;

public class Main {
	public static void main(String[] args) {
		/*
		 * this가 적용된 Person 생성하기
		 * 생성시 ctrl + space를 누르면 입력한 요소가 출력됨
		 */
		
		Person p1 = new Person ("윤지우", 21, 300, "소프트웨어 엔지니어");
		p1.getInfo();
		System.out.println("----------------");
		
		// Person 객체를 하나 더 임의로 생성
		Person p2 = new Person ("정유미", 21, 100, "교수");
		p2.getInfo();
		
	}

}
