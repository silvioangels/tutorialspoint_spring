package com.tutorialspoint.annotationbasedconfiguration.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		TextEditorSetter te = (TextEditorSetter) context.getBean("textEditorSetter");

		te.spellCheck();
		
		TextEditorAutoWiredProperties teawp = (TextEditorAutoWiredProperties) context.getBean("textEditorAutoWiredProperties");

		teawp.spellCheck();
		
		TextEditorConstructor tec = (TextEditorConstructor) context.getBean("textEditorConstructor");

		tec.spellCheck();
		
		
		
	}

}
