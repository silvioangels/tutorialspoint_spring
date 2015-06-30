package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		//without namespace
		Person person = (Person) context.getBean("john-classic");
		System.out.println("Person Name: "+ person.getName());
		System.out.println("Person spouse Name: "+ person.getSpouse().getName());
		
		//with namespace
		person = (Person) context.getBean("john-classic-namespace");
		System.out.println("Person Name: "+ person.getName());
		System.out.println("Person spouse Name: "+ person.getSpouse().getName());
	}

}
