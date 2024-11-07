package com.nt.test;

import com.nt.factory.PersonFactory;
import com.nt.comp.Person;

public class SoftwareCompany {

		public static void main(String[]args) {
			//Software company needs employee
			Person per = PersonFactory.getPerson("emp");
			per.work();
		}
}
