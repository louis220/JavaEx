package inheritancePractice;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p = new Person("정우성", 45 );
		p.showInfo();
		
		Person s2 = new Student("이정재" , 20 , "서울고등학교");
		s2.showInfo();
		
		
	}

}
