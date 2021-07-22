package map;

import java.util.Map;
import java.util.HashMap;

public class HashMap01 {
	
	public static void main(String[] args) {
		// Map자료형의 대표 자료형은 HashMap이다.
		// put(K key, V value);
		Map<String, String> map = new HashMap<>();
		map.put("윤지우", "Java");
		map.put("김한솔", "TypeScript");
		map.put("이기고", "Go");
		System.out.println(map);
		
		// 자료 조회시에는 .get(키값)으로 조회한다.
		// map은 키로 벨류를 조회하는 건 가능하지만, 역으로는 불가능하다.
		// 없는 키값으로 조회하면 null이 나온다.
		// 인덱스 번호도 존재하지 않는다.
		System.out.println(map.get("윤지우"));
		System.out.println(map.get(0));
		
		// 기본적으로 map자료형은 조회도 key중심으로 이뤄진다. 
		// .containsKey()는 해당 키값이 자료 내에 존재하는지 확인한다.
		System.out.println(map.containsKey("김한솔"));
		System.out.println(map.containsKey("이한솔"));
		System.out.println(map.containsKey("TypeScript"));
		
		// remove는 key를 이용해서 key=value 전체를 삭제한다.
		map.remove("김한솔");
		System.out.println(map);
		
		// .size()는 크기를 알려준다. 
		// 정수로 몇 개의 key=value 쌍이 저장되어있는지 확인할 수 있다.
		System.out.println(map.size());
	}

}
