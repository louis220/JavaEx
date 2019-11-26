package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			
			System.out.print("검색어를 입력해 주세요");
			String keyword = scanner.next();
			// 정적 SQL이 아니라 파라미터를 외부에서 입력하는 경우
			// PreparedStatement를 사용하자
			// 효율성, 보안적 측면에서 유리
			
			String sql = "SELECT first_name, last_name, email, phone_number, hire_date " +
						"FROM employees WHERE lower(first_name) LIKE ? " +
						"OR lower(last_name) LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
			pstmt.setString(2, "%" +keyword.toLowerCase() + "%");
			
			rs = pstmt.executeQuery();
			
			System.out.println("[검색결과]");
			
			while (rs.next()) {
				System.out.printf("%s, %s: %s, %s, %s%n", 
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5));
						
			}
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드 에러!");
		} catch (SQLException e) {
			System.out.println("SQLError!");
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch( Exception e) {
				
			}
			scanner.close();
			
		}
		

	}

}










