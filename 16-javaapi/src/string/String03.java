package string;

import java.util.Scanner;

public class String03 {
	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장 내에서 찾고 싶은 단어를 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스번호와, 몇 개가 검출되었는지 출력해주는 코드를 작성해보세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문장을 입력하세요 : ");
		String all = scan.nextLine();
		
		System.out.print("문장 내에서 카운트할 단어를 입력하세요 : ");
		String voca = scan.nextLine();
		
		// 갯수 카운팅
		int count = 0;
		
		// 반복문 추가 실행 여부
		boolean bool = true;
		
		// 마지막으로 발견된 지점
		int fidx = -1;
		
		while (bool) {
		    int get = all.indexOf(voca, fidx + 1);
		    if (get == -1) {
		    	bool = false;
		    } else {
		    	fidx = get;
		    	count++;
		    	System.out.printf("%d번에서 %d번째 %s이(가) 검출되었습니다. \n", get, count, voca);
		    }
		}
		
		System.out.println(voca + "의 총 출현 횟수는 " + count + "회 입니다.");
		
		
		
	}

}
