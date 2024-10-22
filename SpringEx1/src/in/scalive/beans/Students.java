package in.scalive.beans;

public class Students {
	private int rollno;
	private String name;
	
	//create non-param constructor
	public Students() {
		System.out.println("Student bean created.....");
	}
	
	//create setter and getter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("Setter called for rollno....");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Setter called for name");
	}
	
	
	
	
	
}
