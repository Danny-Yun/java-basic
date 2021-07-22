import java.sql.*;
import java.util.Scanner;

public class JdbcInsert {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		// ResultSet은 SELECT구문에 대한 결과만 처리함. 이외 구문에는 불필요 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("num컬럼에 들어갈 정수를 입력하세요");
		int numValue = scan.nextInt();
		System.out.println("str컬럼에 들어갈 문자열을 입력하세요");
		String strValue = scan.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sqldb";
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			String sql = "INSERT INTO JDBCInsert (num, str) " + 
						"VALUES (" + numValue + ", '" + strValue +"'3)";
			
			System.out.println(sql);
			// SELECT 문은 executeQuery(sql구문); 형식으로 호출하지만
			// 이외 구문은 executeUpdate(sql구문); 으로 호출한다. 
			stmt.executeUpdate(sql);
			
			
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
