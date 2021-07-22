package inheritance;

public class Main02 {
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		Salaryman sa1 = new Salaryman ();
		
		st1.name = "윤준서";
		st1.age = 19;
		st1.major = "경영";
		
		sa1.name = "윤지우";
		sa1.age = 21;
		sa1.salary = 2800;
		
		st1.getStudentInfo();
		System.out.println("-----------");
		sa1.upSalary();
		sa1.getSalaryInfo();
		
		
		
	}

}
