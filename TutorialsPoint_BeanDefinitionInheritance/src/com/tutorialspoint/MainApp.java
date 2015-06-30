package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		inheritanceSpringExample();
		abstractInheritanceSpringExample();

	}
	
	private static void inheritanceSpringExample(){
		System.out.println("########################################");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

		objA.getMessage1();
		objA.getMessage2();

		HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		
	}
	
	private static void abstractInheritanceSpringExample(){
		System.out.println("########################################");
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansAbstract.xml");

		HelloIndia obj = (HelloIndia) context.getBean("helloIndia");
		obj.getMessage1();
		obj.getMessage2();
		obj.getMessage3();
		
	}

}
