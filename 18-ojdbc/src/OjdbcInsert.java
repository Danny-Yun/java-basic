import java.sql.*;
import java.util.Scanner;

public class OjdbcInsert {
	
	public static void main(String[] args) {
		// 커넥션 생성
		Connection con = null;
		// Statement를 대신할 수 있는 PreparedStatement 선언
		PreparedStatement pstmt = null;
		// 기존 Statement는 SQL구문과 자바 구문의 경계가 불분명했다. 그래서 두 구문이 섞여서 지저분했었다.
		// PreparedStatement는 SQL구문만 먼저 작성해두고, 필요한 부분에만 자바 변수를 대입하는 식으로 작성한다.
		// 그리하여 가독성, 작성 용이성이 훨씬 나아졌고 사실상 표준처럼 사용되고 있다. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("num컬럼에 들어갈 정수를 입력하세요");
		int numValue = scan.nextInt();
		System.out.println("str컬럼에 들어갈 문자열을 입력하세요");
		String strValue = scan.next();
		
		try {
			// Oracle SQL과 연동할 것임을 나타냄.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속 URL도 Oracle SQL에 맞춰서 적음
	    	String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	    	con = DriverManager.getConnection(url, "mytest", "mytest");
	    	
	    	// 1. PreparedStatement 구문은 쿼리문을 먼저 만들고 시작한다
	    	// 기존의 자바 변수가 들어갈 자리에 ?로 대신해서 작성 / 자료형 막론하고 문자열에도 '를 붙이지 않고 ?로만 처리하면 된다.
	    	String sql ="INSERT INTO ojdbctest(num, str) VALUES " 
	    				+ "(?, ?)";
	    			
			// 2. 만든 쿼리문의 ? 자리에 적용할 자바 변수를 집어넣는다
	    	// pstmt변수를 생성해 놓은 다음, set자료형(?순서, 집어넣을 변수)를 이용해 ?를 모두 채운다. 
	    	// 아래 코드는 첫 번째 ?에는 1을, 두 번째 ?에는 "test"를 대신 넣겠다는 의미
	    	pstmt = con.prepareStatement(sql);
	    	pstmt.setInt(1, numValue);
	    	pstmt.setString(2, strValue);
	    	
	    	// 3. 입력이 모두 끝난 쿼리문을 실행한다
	    	pstmt.executeUpdate();
	    	
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
