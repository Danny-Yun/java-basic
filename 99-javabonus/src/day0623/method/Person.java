package day0623.method;

public class Person {
	
	private int money;
	private int fruits;
	
	public Person(int money, int fruits) {
		this.money = money;
		this.fruits = fruits;
	}
	
	public void buyFruit() {
		this.fruits += 1;
		this.money -= 1000;
		if(money <= 0) {
			System.out.println("과일을 살 수 없습니다.");
		}
	}

	public void setMoney(int money) {
		this.money = money;
	}
	

}
