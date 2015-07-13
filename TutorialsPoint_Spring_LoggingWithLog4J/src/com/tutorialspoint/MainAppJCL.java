package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.logging. Log;
import org.apache.commons.logging. LogFactory;
/**
 * Jakarta Commons Logging
 * @author silvio.angelo
 */
public class MainAppJCL {
	
	   static Log log = LogFactory.getLog(MainAppJCL.class.getName());

	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      log.info("Going to create HelloWord Obj");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

	      obj.getMessage();

	      log.info("Exiting the program");
	   }

}
