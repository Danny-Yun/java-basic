import java.sql.*;

public class OjdbcSelect {

	public static void main(String[] args) {
		// Oracle SQL과 연동해서 Employees 테이블의 모든 인원에 대한 정보를 출력
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	    try {
	    	Class.forName("oracle.jdbc.driver.OracleDriver");
	    	String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	    	con = DriverManager.getConnection(url, "hr", "hr");
	    
	    	stmt = con.createStatement();
	    	String sql = "SELECT employee_id, first_name, hire_date, job_id, salary FROM employees";
	    	rs = stmt.executeQuery(sql);
	    	
	    	while(rs.next()) {
	    		int empId = rs.getInt(1);
	    		String fName = rs.getString(2);
	    		Date hDate = rs.getDate(3);
	    		String jobId = rs.getString(4);
	    		int salary = rs.getInt(5);
	    	
	    		System.out.println("아이디 : " + empId + ", 성 : " + fName + ", 입사날짜 : " 
	    				+ hDate + ", 직무명 : " + jobId + ", 연봉 : " + salary);
	    	}
	    	
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch(SQLException e) {
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
