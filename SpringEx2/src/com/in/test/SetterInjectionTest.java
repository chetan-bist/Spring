package com.in.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.in.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//Locate and hold spring bean cfg file
		FileSystemResource res = new FileSystemResource("src/com/in/resources/applicationcontext.xml");
		//create IOC(Inversion of control) container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		//get TargetBean class object
		Object obj = factory.getBean("wmg");
		//type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		// invoke the business method
		String result = generator.generateWishMessage("chetan");
		System.out.println("Result::"+result);
	}
}
