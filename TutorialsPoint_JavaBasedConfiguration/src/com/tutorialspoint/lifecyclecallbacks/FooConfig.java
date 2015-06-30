package com.tutorialspoint.lifecyclecallbacks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfig {

	@Bean(initMethod = "init", destroyMethod = "cleanup")
	public Foo foo() {
		return new Foo();
	}

}
