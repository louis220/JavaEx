package dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bookshop {
	public static void printAuthors() {
		System.out.println("[저자 목록]");
		AuthorDAO dao = new AuthorDAOimpl();
		List<AuthorVO> authors = dao.getList();
		
		Iterator<AuthorVO> iter = authors.iterator();
		while(iter.hasNext()) {
			AuthorVO author = iter.next();
			System.out.println(author);
		}
		System.out.println(authors.size() + "명의 저자가 있습니다.");
		
	}
	
	
	public static void showAuthor(Long id) {
		//PK가 1인 작가 출력
		AuthorDAO dao = new AuthorDAOimpl();
		AuthorVO author = dao.get(id);
		
		if(author != null) {
			System.out.println("Author:" + author);
		} else {
			System.out.println("저자를 찾지 못함");
		}
	}
	public static void insertAuthor() {
		// scanner에서 이름과 설명을 입력, author 테이블에 insert
		Scanner scanner = new Scanner(System.in);
		System.out.print("저자이름:");
		String name = scanner.next();
		System.out.print("설명:");
		String desc = scanner.next();
		
		//DAO insert 메서드에 전달한 authorVO 생성
		AuthorVO author = new AuthorVO(null, name, desc);
		
		//dao 열어서 메서드 실행
		AuthorDAO dao = new AuthorDAOimpl();
		boolean isSuccess = dao.insert(author);
		
		System.out.println("입력 성공?" + isSuccess);
		
		printAuthors();
		
	}
	public static void deleteAuthor() {
		printAuthors();
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 저자의 id:");
		int id = scanner.nextInt();
		
		AuthorDAO dao = new AuthorDAOimpl();
		boolean isSuccess = dao.delete(Long.valueOf(id));
		
		System.out.println("삭제성공?:" + isSuccess);
		
		printAuthors();
		scanner.close();
		
		
		
	}
	
	public static void updateAuthor() {
		printAuthors();
		System.out.println("수정할 저자?");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.println("이름:");
		String name = scanner.next();
		System.out.println("설명:");
		String desc = scanner.next();
		
		AuthorVO author = new AuthorVO(Long.valueOf(id),
										name,
										desc);
		AuthorDAO dao = new AuthorDAOimpl();
		boolean isSuccess = dao.update(author);
		
		System.out.println("수정 성공?:" + isSuccess);
		
		printAuthors();
		scanner.close();
		
	}
	
	
	
	public static void main(String[] args) {

//		printAuthors();
		showAuthor(2L);
//		insertAuthor();
//		deleteAuthor();
//		updateAuthor();
	}

}
