package polymorphism;

public class RecursiveMain {
	
	public static void recur() {
		System.out.println("재귀호출입니다..");
		recur();
	}
	
	public static void main(String[] args) {
		recur();
	}
	

}
