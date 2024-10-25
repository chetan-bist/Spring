package in.scalive.App;

import java.io.Closeable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.Beans.Laptop;
import in.scalive.Beans.Programmer;

public class UseProgrammer {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/Cfg/applicationContext.xml");
		Programmer pl = container.getBean(Programmer.class);
		/* Laptop lp = container.getBean(Laptop.class); */
		System.out.println("=======================");
		//get programmer name
		System.out.println("Programmer's name::"+pl.getName());
		//get Laptop name
		System.out.println("Laptop's brand name::"+pl.getLp().getBrand());
		
	}
}
