package casting;

public class Main {
	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있다.
		Animal l1 = new Lion("심바", 7);
		Animal t1 = new Tiger("타이그리스", 5);
		Animal a1 = new Animal("동물", 3);
		
		l1.breeding(); 
		t1.breeding(); 
		a1.breeding();
		
		// 자식 타입을 베이스로 만든 부모타입 변수는 자식타입으로 강제로 바꿀 수 있다.
		Lion lion = (Lion)l1;
		// 원타입으로 돌려놓으면 원타입만의 메서드도 호출이 가능하다.
		lion.roaring();
		
		Tiger tiger = (Tiger)t1;
		tiger.hunting();
		
		//근본이 Animal인 경우는 다른 타입으로 변형이 불가능
		Lion lion2 = (Lion)a1;
		lion2.roaring();
	}

}
