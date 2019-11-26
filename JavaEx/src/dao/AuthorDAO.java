package dao;

import java.util.List;

public interface AuthorDAO {
	// author 테이블로부터 전체 레코드를 불러오는 메서드
	public List<AuthorVO> getList();
	public AuthorVO get(Long id); //pk 이동, 레코드 불러오기
	public boolean insert(AuthorVO authorVO);
	public boolean update(AuthorVO authorVO);
	public boolean delete(Long id); //pk 이동 레코드 삭제
}
