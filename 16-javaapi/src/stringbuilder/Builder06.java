package stringbuilder;

public class Builder06 {
	
	public static void main(String[] args) {
		
		/* 
		 * setCharAt()은 문자열에서 입력한 인덱스번호의 문자를 다른 문자로 교체해준다.
		 * insert()는 뒤로 밀어낸 공간을 확보했지만 setCharAt()은 그냥 그 위치의 문자를 덮어씌워버린다.
		 * setCharAt()도 역시 한 번에 한 글자에 대해서만 교체가 가능하다.
		 */
		StringBuilder str = new StringBuilder("abcdefg");
		
		// setCharAt()으로 변경하는 단일 문자는 홀따옴표 '로 여닫는 부분을 작성해야 한다. 
		str.setCharAt(5, 'z');
		System.out.println(str);
	}
}
