package com.nt.beans;

public class Person {

	//spring bean properties
		private int pid;
		private String pname;
		private String paddr;
		private float income;
		
		//setter getter
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getPaddr() {
			return paddr;
		}
		public void setPaddr(String paddr) {
			this.paddr = paddr;
		}
		public float getIncome() {
			return income;
		}
		public void setIncome(float income) {
			this.income = income;
		}
		//string method (alt+shift+s,s) shortcut key
		@Override
		public String toString() {
			return "Person [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + ", income=" + income + "]";
		}
}
