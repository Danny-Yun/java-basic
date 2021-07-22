package collection;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Lotto03 {
	
	public static void main(String[] args) {
		// 로또 복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨 번호 6개를 뽑습니다.
		// 2. 추첨 번호 6개를 뽑습니다.
		// 3. 당첨 번호와 추첨 번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 돈을 1000원 더하고, 다시 추첨 번호 6개를 뽑고 이어서 비교해서 일치여부 검사.

		Random r1 = new Random();
		Random r2 = new Random();
		
		List<Integer> lotto = new ArrayList<>();
		List<Integer> myList = new ArrayList<>();
		
		int winNum = 0;
		int drawNum = 0;
		long money = 0;
		
		while (lotto.size() < 6) {
			winNum = r1.nextInt(45) + 1;
			if(!lotto.contains(winNum)) {
				lotto.add(winNum);
			}
		}
		
		while (!lotto.equals(myList)) {
			money += 1000;
			myList.clear();

			while (myList.size() < 6) {
			drawNum = r2.nextInt(45) + 1;
			    if(!myList.contains(drawNum)) {
				myList.add(drawNum);
			    }
		    }
			
		    Collections.sort(lotto);
		    System.out.println("로또 당첨 번호 : " + lotto);

		    Collections.sort(myList);
		    System.out.println("내 번호 : " + myList);
	    }
		System.out.println("총 로또 복권을 " + money + "원어치를 사고서야 1등에 당첨되었습니다.");
	}
}
