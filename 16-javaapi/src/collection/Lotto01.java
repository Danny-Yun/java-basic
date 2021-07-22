package collection;

import java.util.ArrayList;	
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto01 {
	
	public static void main(String[] args) {
		// 로또복권 추첨기를 만들어보겠습니다. 로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 출력하도록 만들어주세요. ArrayList의 정렬은 .sort() 대신 Collections.sort(리스트); 를 이용해 정렬합니다.
		
		Random r = new Random();    // 랜덤박스 생성
	    List<Integer> lotto = new ArrayList<>();    // 로또 추첨 리스트 생성
		
		int winNum = 0;    // winNum => 당첨 번호
		 	
		while(lotto.size() < 6) {     // 로또 리스트에 당첨 번호가 6개가 될 때까지 반복
			winNum = r.nextInt(45) + 1;    // 로또 당첨 번호 추첨
		    if(!lotto.contains(winNum)) {     // 이미 당첨된 번호와 중복되지 않는 경우에만 리스트에 추가 
		    	lotto.add(winNum);
		    }
		}
		
		Collections.sort(lotto);     // 리스트에 있는 당첨 번호들을 작은 숫자부터 정렬
		System.out.println("추첨된 번호 : " + lotto);
		
// 첫번째 싸이클은 이미 true인 상태이므로 먼저 한 번 실행, 2등 당첨 번호가 이미 당첨된 번호랑 겹칠 경우에만 반복 실행, 이미 당첨된 번호와 겹치지 않으면 false상태가 되어 반복문 빠져나감
		while (lotto.contains(winNum)) {    
			winNum = r.nextInt(45) + 1;     // 2등 당첨 번호 추첨
		}
		
		System.out.println("2등 당첨 번호 : " + winNum);    // 이미 당첨된 번호와 겹치지 않은 2등 당첨 번호를 출력
	}
}
