package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRPractice2 {

	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		//객체
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs= null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			
			System.out.print("입력:");
			 int keyword = scanner.nextInt();
			 int keyword2 = scanner.nextInt();
			String sql = "SELECT first_name, last_name, salary " +
						"FROM employees WHERE salary BETWEEN " + keyword + " AND " + keyword2;
			
						
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("검색결과:");
			
			while(rs.next()) {
				System.out.printf("%s %s %d%n", 
						rs.getString(1),
						rs.getString(2),
						rs.getInt(3)); 
			}

	}catch (ClassNotFoundException e) {
		System.out.println("[실패]");
	}catch(SQLException e) {
		System.out.println("SQLERROR");
	}finally {
		try {
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			
		}
	}
scanner.close();
}
}
	
	
	
	
	
	
	
	