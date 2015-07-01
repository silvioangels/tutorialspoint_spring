package com.tutorialspoint.xmlschemabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansStudentAdvice.xml");

		Student student = (Student) context.getBean("student");

		student.getName();
		student.getAge();

		context = new ClassPathXmlApplicationContext("Beans.xml");

		student = (Student) context.getBean("student");

		student.getName();
		student.getAge();

		student.printThrowException();

	}

}
