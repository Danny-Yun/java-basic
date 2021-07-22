import java.sql.*;
import java.util.Scanner;


public class JdbcSelect02 {
	
	public static void main(String[] args) {
		// 1. 커넥터 연결 / employees DB로 
		// 2. 조회구문 - SELECT emp_no, first_name FROM employees limit 10;
		// 3. 위 조회구문으로 조회한 결과물을 While문을 활용 / 사번 : emp_no, 성 : first_name 으로 
		//    10줄을 출력
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇 명을 조회합니까?");
		int limitNum = scan.nextInt();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/employees";
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			String sql = "SELECT emp_no, first_name, hire_date FROM employees limit " + limitNum;
			rs = stmt.executeQuery(sql);
		
			while(rs.next()) {
				int empNo = rs.getInt(1);
				String fName = rs.getString(2);
				Date hDate = rs.getDate(3);
				System.out.println("사번 : " + empNo + ", "
						+ "성 : " + fName + ", " + "입사 날짜 : " + hDate);
			}
			
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
