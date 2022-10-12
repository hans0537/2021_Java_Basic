package student_practice;

public class StudentVO {
	private String id;
	private String name;
	private int num;
	
	public StudentVO(String id, String name, int num) {
		this.id = id;
		this.name = name;
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public void print() {
		System.out.println("ID: " + id + "/ name: " + name + "/ num: " + num);
	}
}
