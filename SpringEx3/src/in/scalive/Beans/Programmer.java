package in.scalive.Beans;

public class Programmer {

	private String name;
	private Laptop lp;

	//create constructor
	public Programmer() {
		System.out.println("Programmer bean created....");
	}

	//create setter and getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Programmer.setName(-)");
	}

	//create laptop setter and getter
	public Laptop getLp() {
		return lp;
	}

	public void setLp(Laptop lp) {
		this.lp = lp;
		System.out.println("Programmer bean laptop.setLp()");
	}
	
	
	
}
