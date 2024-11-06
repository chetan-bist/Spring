package com.nt.beans;

public class Person1 {

	//spring bean properties
			private int pid;
			private String pname;
			private String paddr;
			private float income;
			
			
			public Person1(int pid, String pname, String paddr, float income) {
				System.out.println("Person1::4-param/arg constructor");
				this.pid = pid;
				this.pname = pname;
				this.paddr = paddr;
				this.income = income;
			}


			//string method (alt+shift+s,s) shortcut key
			@Override
			public String toString() {
				return "Person [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + ", income=" + income + "]";
			}
}
