package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
	
	public static void main(String[] args) {
		// 직접 String 자료를 가변적으로 받을 수 있는  ArrayList를 만들고
		// 안쪽에 자료로 "사과", "딸기", "바나나", "블루베리", "파인애플"을 넣어주세요.
		
        List<String> list01 = new ArrayList<>();
		
		list01.add("사과");
		list01.add("딸기");
		list01.add("바나나");
		list01.add("블루베리");
		list01.add("파인애플");
		System.out.println(list01);
		
		// .contains("자료")는 리스트 내에 찾는 자료가 있으면 true 없다면 false를 출력해준다.
		System.out.println(list01.contains("사과"));
		System.out.println(list01.contains("복숭아"));
		
		// .get(번호)는 주어진 인덱스에 저장되어 있는 자료를 조회해준다.
		System.out.println(list01.get(1));
	    // 없는 인덱스번호를 입력하면 예외가 발생해 전체 코드가 종료된다.
	//  System.out.println(list02.get(10));
		
		 List<String> list02 = new ArrayList<>();    // 빈 리스트 생성, 초기화
		
		 // .isEmpty()는 비어있는지 여부를 체크한다. 
		 System.out.println(list01.isEmpty());
		 System.out.println(list02.isEmpty());
		 
		 // .size()는 내부 요소의 개수를 확인한다.
		 System.out.println(list01.size());
		 System.out.println(list02.size());
	}
}
