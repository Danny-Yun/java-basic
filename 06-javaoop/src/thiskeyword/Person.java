package thiskeyword;

public class Person {
	// 사람의 정보를 여기에 기입한다.
    public String name;
    public int age;
    public int asset;
    public String job;
    
    // 생성자를 활용
    public Person (String name, int age, int asset, String job) {
    	this.name = name;
    	this.age = age;
    	this.asset = asset;
    	this.job = job;
    }
    
    // getInfo()를 이용해 조회
    public void getInfo() {
    	System.out.println("이름 : " + name);
    	System.out.println("나이 : " + age);
    	System.out.println("자산 (만) : " + asset);
    	System.out.println("직업 : " + job);
    }

}
