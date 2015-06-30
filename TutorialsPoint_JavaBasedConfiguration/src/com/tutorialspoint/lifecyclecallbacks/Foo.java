package com.tutorialspoint.lifecyclecallbacks;

public class Foo {

	public void init() {
		System.out.println("Inside init method");
	}

	public void cleanup() {
		System.out.println("Inside cleanup method");
	}
	
	public void printFoo(){
		System.out.println("printing Foo");
	}

}
