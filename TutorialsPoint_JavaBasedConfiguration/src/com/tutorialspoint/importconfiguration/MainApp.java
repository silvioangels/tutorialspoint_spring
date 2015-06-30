package com.tutorialspoint.importconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
		// now both beans A and B will be available...
		A a = ctx.getBean(A.class);
		B b = ctx.getBean(B.class);
		
		a.printA();
		b.printB();
	}

}
