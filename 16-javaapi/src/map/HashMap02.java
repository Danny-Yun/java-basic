package map;

import java.util.HashMap;
import java.util.Map;

public class HashMap02 {
	
	public static void main(String[] args) {
		// 식당 메뉴판을 만들어보세요. 
		// key는 음식 이름, value는 가격(정수)로 저장해주세요
		// 메뉴는 5개 이상 집어 넣고, 메뉴 3개를 조회해서 화면에 출력해주세요.
		
		Map<String, Integer> menu = new HashMap<>();
		menu.put("함박 스테이크", 9000);
		menu.put("김치찌개", 6500);
		menu.put("돈까스 김밥", 4500);
		menu.put("해물볶음밥", 7000);
		menu.put("떡라면", 5000);
		
		System.out.println(menu.get("함박 스테이크"));
		System.out.println(menu.get("김치찌개"));
		System.out.println(menu.get("떡라면"));
	}
}
