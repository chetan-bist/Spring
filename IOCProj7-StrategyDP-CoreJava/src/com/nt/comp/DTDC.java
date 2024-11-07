package com.nt.comp;

public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		
		return "Delivering "+oid+ " order id orderproduct using DTDC";
	}

}
