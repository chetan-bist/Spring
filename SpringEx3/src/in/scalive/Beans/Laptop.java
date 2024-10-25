package in.scalive.Beans;

public class Laptop {

	private String brand;

	//create constructor
	public Laptop() {
		System.out.println("Laptop bean created....");
	}

	//create setter and getter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("Laptop.setBrand()");
	}
	
	
}
