package static02;

public class Main {
	public static void main(String[] args) {
		// Asean 조원 없이도 Asean 조별점수는 조회 가능
	//	System.out.println(Asean.score);
		System.out.println();
		
		Asean yun = new Asean(24, 23, 30);
		Asean kim = new Asean(25, 21, 30);
		Asean choi = new Asean(24, 24, 30);
		Asean jo = new Asean(23, 23, 27);
		
		yun.showAseanInfo();
		kim.showAseanInfo();
		choi.showAseanInfo();
		jo.showAseanInfo();
	}

}
