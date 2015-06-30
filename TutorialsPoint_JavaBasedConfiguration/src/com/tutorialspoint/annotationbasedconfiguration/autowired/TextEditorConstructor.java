package com.tutorialspoint.annotationbasedconfiguration.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditorConstructor {

	private SpellChecker spellChecker;

	@Autowired
	   public TextEditorConstructor(SpellChecker spellChecker){
	      System.out.println("Inside TextEditorConstructor constructor." );
	      this.spellChecker = spellChecker;
	   }

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
