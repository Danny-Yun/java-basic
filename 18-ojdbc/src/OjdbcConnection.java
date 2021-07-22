import java.sql.*;



public class OjdbcConnection {
		
	public static void main(String[] args) {
			// MYSQL과 마찬가지로 Oracle SQL 역시 .jar 파일을 제공한다. 
			// 먼저, jar파일을 import 해야 연결이 된다.
			// .jar 파일의 위치 = sqldeveloper폴더 -> jbdc폴더 -> lib폴더 -> ojdbc8.jar
			// 프로젝트에 임포트하면 Oracle SQL과 연동 가능
			
			// 프로젝트 우클릭 -> Properties -> Java Build Path -> 상단 library 탭 선택 -> 우측 Add Library 선택
			// 하단의 User Library -> 우측 User Libraries... 선택 -> 이름을 OJDBC Connection으로 설정한 후
			// Add External Library -> odbc8.jar 추가. 
		
			Connection con = null;
			
			try {
				// Oracle SQL과 연동할 것임을 나타냄
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				// 접속 URL도 Oracle SQL에 맞춰서 적는다. 
				String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
				
				con = DriverManager.getConnection(url, "mytest", "mytest");
				
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


