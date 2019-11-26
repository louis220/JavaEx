package inheritancePractice;

public class Student extends Person{
	
	protected String schoolName;
	
	public Student (String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schooolName) {
		this.schoolName = schoolName;
	}
	@Override
	public void showInfo() {
		System.out.printf("%s, %d, %s",
				name, age, schoolName);
	}
}
