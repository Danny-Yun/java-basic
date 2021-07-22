package casting;

public class MainInstanceOf {
	public static void main(String[] args) {
		Animal l1 = new Lion("심바", 3);
		// 현재 Animal 타입인 c1 l1의 근본 자료형이 Lion인지 검사
	    System.out.println(l1 instanceof Lion);
		// 현재 Animal 타입인 c1 l1의 근본 자료형이 Tiger인지 검사
		System.out.println(l1 instanceof Tiger);
		// 현재 Animal 타입인 c1 l1의 근본 자료형이 Animal인지 검사
		System.out.println(l1 instanceof Animal);
	}

}
