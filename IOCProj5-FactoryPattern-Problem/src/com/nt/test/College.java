package com.nt.test;

import com.nt.comp.Student;
import com.nt.comp.Food;

public class College {

	public static void main(String[]args) {
		//College needs Student
		//create Dependent class obj
		Food food =  new Food();
		//create target class obj
		Student st = new Student(food);
		st.work();
	}
	
}
