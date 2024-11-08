package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.Flipkart;

public class StrategyDPTest {

	public static void  main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Target class object
		Flipkart fpkt = factory.getBean("fpkt",Flipkart.class);
		String result = fpkt.shopping(new String[] {"Mangoes","tamarind","sugar canes"}, new float[] {400.0f,600.0f,300.0f});
		System.out.println(result);
	}
	
}
