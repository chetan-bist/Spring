package com.nt.test;


import com.nt.factory.PersonFactory;
import com.nt.comp.Person;

public class College {

	public static void main(String[]args) {
		//College needs Student
		Person per = PersonFactory.getPerson("stud");
		per.work();
	}
	
}
