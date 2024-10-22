package in.scalive.app;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import in.scalive.beans.*;
public class UseStudents {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("/in/scalive/resources/applicationcontext.xml");
		BeanFactory container = new XmlBeanFactory(res);
		Students s = (Students)container.getBean("stObj");
		System.out.println("Name:"+s.getName());
		System.out.println("Roll no:"+s.getRollno());
	}
}
