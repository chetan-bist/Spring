package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
import com.nt.beans.Person1;

public class DependencyInjectionTest {

	public static void main(String[]args) {
		//create IOC container
		//XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Spring bean class obj
		/* Person person = (Person)factory.getBean("per"); */
		//use Spring Generic method
		Person p1 = factory.getBean("per",Person.class);
		System.out.println(p1);
		System.out.println("===========================");
		//get person1 object
		Person1 p2 =factory.getBean("per1",Person1.class);
		System.out.println(p2);
	}
}
