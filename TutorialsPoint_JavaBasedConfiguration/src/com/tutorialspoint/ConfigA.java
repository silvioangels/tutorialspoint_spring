package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

	@Bean
	public A a() {
		System.out.println("Inside A Configuration");
		return new A();
	}

}
