package structure;

public class FootballClub {
	
	
	public String name;
	public int birth;
	public String located;
	public int leagueTitle;
	public int uclTitle;
	public String manager;
	public String starPlayer;
	
	
public void getInfo(FootballClub fc) {
		
		System.out.println("팀 : " + fc.name);
		System.out.println("출범 : " + fc.birth);
		System.out.println("연고지 : " + fc.located);
		System.out.println("리그 우승 : " + fc.leagueTitle);
		System.out.println("챔스 우승 : " + fc.uclTitle);
		System.out.println("감독 : " + fc.manager);
		System.out.println("핵심 선수 : " + fc.starPlayer);
		
	}

	

}
