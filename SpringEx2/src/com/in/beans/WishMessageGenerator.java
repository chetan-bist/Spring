package com.in.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	//create constructor
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor....");
	}

	//create setter and getter
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	// create business method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()...");
		//get current hour of the day
		int hour = date.getHours();//24 hours format
		if(hour < 12)
			return "GM::"+user;
		else if(hour < 16 )
			return "GA::"+user;
		else if(hour < 20 )
			return "GE::"+user;
		else 
			return "GN::"+user;
			
	}//end business method
	
}// end main method
