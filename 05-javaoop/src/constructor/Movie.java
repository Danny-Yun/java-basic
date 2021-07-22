package constructor;

public class Movie {

	public int num; 
	public String name;
	public String genre;
	public int time;
	public String actor;
	public String ost;
	
	public void getInfo () {
		
		System.out.printf("<나의 인생영화%d>\n", num);
		System.out.println("이름 : " + name);
		System.out.println("장르 : " + genre);
		System.out.println("러닝타임(분) : " + time);
		System.out.println("배우 : " + actor);
		System.out.println("OST : " + ost);
		
	}
	
	
	
	public Movie (int num, String n, String g, int t, String a, String o) {
		
		num = num;
		name = n;
		genre = g;
		time = t;
		actor = a;
		ost = o;
		
	}
	
	
}
