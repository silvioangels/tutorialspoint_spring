package com.tutorialspoint.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		HelloWorld objA = ctx.getBean(HelloWorld.class);
		
		objA.setMessage("I'm object A");
		objA.getMessage();

		HelloWorld objB = ctx.getBean(HelloWorld.class);
		objB.getMessage();
	}

}
