package com.nt.beans;

public class B {
	private A a;
	
	public B() {
		System.out.println("A.0-param constructor");
	}

	//setter method
	public void setA(A a) {
		System.out.println("A.setA()");
		this.a = a;
	}


	@Override
	public String toString() {
		return "FormB";
	}
	
}
