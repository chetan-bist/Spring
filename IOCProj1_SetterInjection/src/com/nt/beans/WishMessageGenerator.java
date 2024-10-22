package com.nt.beans;

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

	//alt+shift+s,r --> select setters :: to get setter method
	public void setDate(Date date) {
		this.date = date;
	}

	//b.method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()...");
		//get current hour of the day
		int hour = date.getHours();
		if(hour<12)
			return "GM::"+user;
		else if(hour<16)
			return "GA::"+user;
		else if(hour<20)
			return "GE::"+user;
		else
			return "GN::"+user;
	}
}
