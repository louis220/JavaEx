package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAOimpl implements AuthorDAO {
	private static String dbur1 = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuser = "bituser";
	private static String dbpass = "bituser";
	private Connection getConnection()  throws SQLException {
		Connection conn = null;
		try {
			//데이터베이스 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dbur1, dbuser, dbpass);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
		}
		return conn;
	}
	@Override
	public List<AuthorVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<AuthorVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			stmt =  conn.createStatement();
			String sql = "SELECT author_id, author_name, author_desc FROM author";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Long authorId = rs.getLong(1);
				String authorName = rs.getString("author_name");
				String authorDesc = rs.getString(3);
				
				AuthorVO vo = new AuthorVO(authorId,
											authorName,
											authorDesc);
				list.add(vo);
			}
		} catch(SQLException e) {
			System.out.println(" SQL Error!");
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e) {}
		}
		// SQL database logic
		return list;
	}
	@Override
	public AuthorVO get(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AuthorVO author = null;
		
		try {
			conn = getConnection();
			String sql = "SELECT author_id, author_name, author_desc "
					+ "FROM author WHERE author_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				// 다음에 리코드가 있다면,,
				author = new AuthorVO(rs.getLong(1),
									rs.getString(2),
									rs.getString(3));
			}
		}catch(SQLException e) {
			System.out.println("SQL ERROR!");
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch(Exception e) {}
		}
		return author;
	}
	@Override
	public boolean insert(AuthorVO authorVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			String sql =  "INSERT INTO author VALUES(seq_author_pk.NEXTVAL,?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorVO.getAuthorName());
			pstmt.setString(2, authorVO.getAuthorDesc());
			
			//insert, update, delete는 executeupdate
			// -> 영향을 받은 레코드의 갯수를 변환
			insertedCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		return 1 == insertedCount;
	}
	
	
	
	@Override
	public boolean update(AuthorVO authorVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "UPDATE author SET author_name=? , author_desc=? WHERE author_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorVO.getAuthorName());
			pstmt.setString(2, authorVO.getAuthorDesc());
			pstmt.setLong(3, authorVO.getAuthorId());
			
			updatedCount = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			}catch(Exception e) {}
		}
	
		return 1 == updatedCount;
	}
	@Override
	public boolean delete(Long id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM author WHERE author_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			deletedCount = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return deletedCount !=0;
	}

}









