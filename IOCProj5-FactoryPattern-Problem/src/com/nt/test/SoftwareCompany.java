package com.nt.test;

import com.nt.comp.Employee;
import com.nt.comp.Food;

public class SoftwareCompany {

		public static void main(String[]args) {
			//Software company needs employee
			//create Dependent class obj
			Food food =  new Food();
			//create target class obj
			Employee emp = new Employee (food);
			emp.work();
		}
}
