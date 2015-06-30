package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		initDestroyBeanConfig();
		initDestroyDefaultAllBean();

	}
	
	private static void initDestroyBeanConfig(){
		System.out.println("###########################################################");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
		
	}
	
	private static void initDestroyDefaultAllBean(){
		System.out.println("###########################################################");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansDefault.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		context.registerShutdownHook();
		
	}

}
