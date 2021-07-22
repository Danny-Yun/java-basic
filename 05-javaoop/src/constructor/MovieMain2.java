package constructor;

public class MovieMain2 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Movie movie1 = new Movie(++num, "스타 이즈 본", "드라마", 135, 
				"레이디 가가, 브래들리 쿠퍼", "Shallow, Always remember us this way, I'll never love again" );
	
		Movie movie2 = new Movie(++num, "라라랜드", "드라마, 뮤지컬", 127, 
				"라이언 고슬링, 엠마 스톤", "City of stars, A lovely night, Another day of sun"  );
		
		Movie movie3 = new Movie(++num, "어바웃 타임", "멜로/로맨스", 123, 
				"도널 글리슨, 레이첼 맥아담스", "How long will i love you, Mid air, Into my arms"  );
		
		Movie movie4 = new Movie(++num, "미드나잇 선", "멜로/로맨스", 92, 
				"벨라 손, 패트릭 슈왈제네거", "Walk with me, Reaching, Burn so bright"  );

		Movie movie5 = new Movie(++num, "비긴 어게인", "드라마", 104, 
				"마크 러팔로, 키이라 나이틀리", "Lost stars, A step you can't take back, Tell me if you wanna go home"  );
	
		Movie movie6 = new Movie(++num, "싱 스트리트", "드라마", 106, 
				"페리다 월시-필로, 루시 보인턴", "Drive it like you stole it , Up, Riddle of the model" );
		
		Movie movie7 = new Movie(++num, "원스", "드라마", 86, 
				"글렌 헨사드, 마르게타 이글로바", "Falling slowly, Say it to me Know , Lies" );
		
		
		
		movie1.getInfo();
		System.out.println();
		
		movie2.getInfo();
		System.out.println();
		
		movie3.getInfo();
		System.out.println();
		
		movie4.getInfo();
		System.out.println();
		
		movie5.getInfo();
		System.out.println();
		
		movie6.getInfo();
		System.out.println();
		
		movie7.getInfo();
		System.out.println();
	}
	
}
