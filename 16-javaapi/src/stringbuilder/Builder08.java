package stringbuilder;

public class Builder08 { 
	
	public static void main(String[] args) {
		// reverse()는 문자열을 인덱스 순으로 따졌을 때 역순으로 나열해준다.	
		StringBuilder str = new StringBuilder("가나다라마");
		str.reverse();
		System.out.println(str);
	}

}
