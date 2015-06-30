package com.tutorialspoint.annotationbasedconfiguration.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditorAutoWiredProperties {

	@Autowired
	private SpellChecker spellChecker;

	public TextEditorAutoWiredProperties() {
	      System.out.println("Inside TextEditorAutoWiredProperties constructor." );
	   }

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
