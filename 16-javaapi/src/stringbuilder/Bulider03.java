package stringbuilder;

public class Bulider03 {
	
	public static void main(String[] args) {
		// Delete는 말 그대로 문자열의 일부, 혹은 전체를 삭제한다. 
		// Delete(시작 인덱스, 끝 인덱스)를 입력하면
		// 시작 지점부터 끝 지점 사이를 삭제해준다. 
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
        a.delete(2, 10);
		System.out.println(a);
	}

}
