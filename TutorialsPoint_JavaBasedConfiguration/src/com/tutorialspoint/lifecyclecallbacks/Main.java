package com.tutorialspoint.lifecyclecallbacks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(FooConfig.class);

		Foo foo = ctx.getBean(Foo.class);
		
		foo.printFoo();
		ctx.registerShutdownHook();
	}

}
