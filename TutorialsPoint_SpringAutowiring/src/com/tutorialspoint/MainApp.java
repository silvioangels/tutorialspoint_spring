package com.tutorialspoint;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

		jc.getAddressList();
		jc.getAddressSet();
		jc.getAddressMap();
		jc.getAddressProp();
		
		JavaCollectionReference jcr = (JavaCollectionReference) context.getBean("javaCollectionReference");

		jcr.getAddressList();
		jcr.getAddressSet();
		Map collectionMap = jcr.getAddressMap();
		
		Address address1 = (Address)collectionMap.get("two");
		
		System.out.println("Email: "+address1.getEmail());
		System.out.println("Second Email: "+address1.getSecondEmail());

	}

}
