package structure;

public class structure02 {
	
	// Person 내부의 정보를 쉽게 조회하기 위한 메서드 제작
	public static void getInfo (Person p) {
		
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
		
	}
	
	public static void getCatInfo (Cat c) {
		
		System.out.println("고양이 이름 : " + c.name);
	    System.out.println("고양이 나이 : " + c.age);
	    System.out.println("고양이 품종 : " + c.species);
		
	}
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요 (a, b)
		
		Person a = new Person();
		a.name = "윤지우";
		a.age = 20;
		a.pNum = "010-7316-3811";
		a.address = "동탄";
		
		getInfo(a);
		
		System.out.println("-------------------");
		
		Person b = new Person();
		b.name = "손흥민";
		b.age = 29;
		b.pNum = "010-7777-7777";
		b.address = "런던";
		
		getInfo(b);
		
		
		System.out.println("-------------------");
		
		Cat d = new Cat ();
		d.name = "나비";
		d.age = 2;
		d.species = "먼치킨";
		
		getCatInfo(d);
	    
	    System.out.println("--------------------");
	    
	    Cat e = new Cat ();
	    e.name = "벨라";
		e.age = 5;
		e.species = "브리티쉬 숏헤어";
		
		getCatInfo(e);
		
		
		
		
		
				
		
	}

}
