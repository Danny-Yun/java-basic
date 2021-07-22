package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
	
	public static void main(String[] args) {
		// LinkedList는 자료의 변경이 빈번할 때 사용하면 성능 향상이 있다.
		// 일반적인 상황에서는 ArrayList를 더 많이 쓰고, 삭제와 삽입이 빈번한 상황에서는 LinkedList가 유용하다. 
		// 양 리스트 간 사용 방법에는 큰 차이가 없음.
		List<String> list1 = new LinkedList<>();
		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스프링부트");
		System.out.println(list1);
		
		// .remove()는 두  유형이 있다. 
		// .remove(번호)를 넣을 경우 주어진 번호에 있는 자료가 삭제된다.
		// .remove("자료")를 입력하면 번호와 상관없이 자료가 삭제된다.
		list1.remove(0);
		System.out.println(list1);
		list1.remove("스프링");
		System.out.println(list1);
		
		// 리스트를 전체적으로 비우고 싶을 때는 .clear()를 사용한다. 
		list1.clear();
		System.out.println(list1);
		
		// 4개 자료 아무거나 추가하기
		list1.add("육회비빔밥");
		list1.add("샌드위치");
		list1.add("삼겹살");
		list1.add("김치찌개");
		
		// 자료 정렬은 Collections.sort(정렬대상)이다.
		Collections.sort(list1);
		System.out.println(list1);
	}

}
