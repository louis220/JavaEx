package project;

public class Phone {
	private String name;
	private String hp;
	private String tel;
	
	
	
	@Override
	public String toString() 
	{ 
		return   name + "," + hp + "," + tel ;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}