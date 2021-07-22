package structure;

public class FootballTeams {

	public static void main(String[] args) {

		
		FootballClub Chelsea = new FootballClub();
		Chelsea.name = "첼시 FC";
		Chelsea.birth = 1905;
		Chelsea.located = "런던";
		Chelsea.leagueTitle = 6;
		Chelsea.uclTitle = 2;
		Chelsea.manager = "토마스 투헬";
		Chelsea.starPlayer = "카이 하베르츠, 메이슨 마운트";
		
		Chelsea.getInfo(Chelsea);
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		FootballClub Tottenham = new FootballClub();
		Tottenham.name = "토트넘 핫스퍼 FC";
		Tottenham.birth = 1882;
		Tottenham.located = "런던";
		Tottenham.leagueTitle = 2;
		Tottenham.uclTitle = 0;
		Tottenham.manager = "?";
		Tottenham.starPlayer = "해리 케인, 손흥민";
		
		Tottenham.getInfo(Tottenham);
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		
		FootballClub ManUtd = new FootballClub();
		ManUtd.name = "맨체스터 유나이티드";
		ManUtd.birth = 1878;
		ManUtd.located = "맨체스터";
		ManUtd.leagueTitle = 20;
		ManUtd.uclTitle = 3;
		ManUtd.manager = "올레 군나르 솔샤르";
		ManUtd.starPlayer = "브루노 페르난데스, 마커스 래쉬포드";
		
		ManUtd.getInfo(ManUtd);
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
//		
//		FootballClub Tottenham = new FootballClub();
//		Tottenham.name = "토트넘 핫스퍼 FC";
//		Tottenham.birth = 1882;
//		Tottenham.located = "런던";
//		Tottenham.leagueTitle = 2;
//		Tottenham.uclTitle = 0;
//		Tottenham.manager = "?";
//		Tottenham.starPlayer = "해리 케인, 손흥민";
//		
//		getInfo(Tottenham);
//		
//		System.out.println();
//		System.out.println("--------------------------");
//		System.out.println();
//		
//		
//		FootballClub Tottenham = new FootballClub();
//		Tottenham.name = "토트넘 핫스퍼 FC";
//		Tottenham.birth = 1882;
//		Tottenham.located = "런던";
//		Tottenham.leagueTitle = 2;
//		Tottenham.uclTitle = 0;
//		Tottenham.manager = "?";
//		Tottenham.starPlayer = "해리 케인, 손흥민";
//		
//		getInfo(Tottenham);
//		
//		System.out.println();
//		System.out.println("--------------------------");
//		System.out.println();
//		
//		
//		FootballClub Tottenham = new FootballClub();
//		Tottenham.name = "토트넘 핫스퍼 FC";
//		Tottenham.birth = 1882;
//		Tottenham.located = "런던";
//		Tottenham.leagueTitle = 2;
//		Tottenham.uclTitle = 0;
//		Tottenham.manager = "?";
//		Tottenham.starPlayer = "해리 케인, 손흥민";
//		
//		getInfo(Tottenham);
//		
//		System.out.println();
//		System.out.println("--------------------------");
//		System.out.println();
//		
		
		
		
		
		
		
		
	}
}
