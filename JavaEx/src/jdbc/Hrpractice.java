package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Hrpractice {

	public static void main(String[] args) {
		String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
			
			String sql = " SELECT emp.first_name, emp.last_name, mng.first_name, mng.last_name " +
						"FROM employees emp, employees mng " +
						"WHERE emp.manager_id = mng.employee_id";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.printf("%s %s, %s %s%n", 
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4));
			}

	}catch(ClassNotFoundException e) {
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

}
}
