package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("my first springboot project");
		//we have two interfaces to use all the loaded beans
		//1. bean factory 2. application context (it has alot more features as it extends bean factory) 
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); 
		Staff doc = context.getBean(Doctor.class);
		doc.assist();
		//nurse
		Staff zainab = (Nurse)context.getBean("nurse");
		zainab.assist();
		
	}
}
