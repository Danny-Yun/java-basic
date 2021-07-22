import java.sql.*;

public class JbdcConnection {
	
	public static void main(String[] args) {
		// Java와 DB를 연동하기 위해서 JDBC라는 API가 필요하다.
		// MySQL은 그 중에서도 Connector J 라는 라이브러리를 이용한다. 
		// Connector J는 mysql 공식홈페이지에서 다운 받아 설치할 수 있다.
		// 아니면 jar파일만 구해서 바로 적용할 수도 있다. 
		
		/* 공식 홈페이지 루트
		 * 1. mysql 홈페이지 접속
		 * 2. download탭에서 하단의 mysql community(GPL) 선택
		 * 3. OS에 맞는 버전 선택 (mysql installer 선택)
		 * 4. 상단의 2메가바이트짜리 업데이트 파일 다운 후 실행
		 * 5. connector j 설치
		 * 6. program files(x86) -> mysql -> connector j폴더 내부의 .jar 파일 확인
		 */
		
		/*  jar파일을 어떤 경로로든 구했으면, 사용할 프로젝트에 jar파일을 추가해야 한다. 
		 *  프로젝트별로 계속 추가해야 하니 방법을 잘 기억해두자.
		 *  1. 프로젝트 우클릭 -> properties ->  좌측 탭의 java build path
		 *  2. 상단 탭의 libraries 선택 후 Add library 선택
		 *  3. user library 선택후 우측 user libraries
		 *  4. 우측 new 버튼 누르고 이름 임의로 입력(현재 JDBC connection)
		 *  5. Add External Jar 선택 후 connector j 폴더로 이동
		 *  6. jar파일 선택 후 apply and close 선택
		 */
		
		// DB 연동 코드 작성
		// 위쪽의 모든 작업이 끝났다면 본격적으로 코드를 작성
		// 기본적으로 import java.sql.*; 을 1번 라인에 입력하고 시작
		
		// 연결은 Connection 자료형으로 진행함
		Connection con = null;
		
		// DB연결에 관련된 로직은 무조건 try ~ catch구문을 활용하도록 강요받음
		try {
			// MySQL DB와 연동할 것임을 나타냄
			Class.forName("com.mysql.jdbc.Driver");
			
			// 접속url은 jbdc:mysql://localhost/db명 
			String url = "jdbc:mysql://localhost/sqldb";
			
			// 접속 주소, 계정, 비밀번호를 이용해 접속 요청을 넣는다. 
			con = DriverManager.getConnection(url, "root", "mysql");
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
