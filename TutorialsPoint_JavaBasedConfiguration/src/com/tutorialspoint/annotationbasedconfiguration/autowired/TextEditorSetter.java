package com.tutorialspoint.annotationbasedconfiguration.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditorSetter {

	private SpellChecker spellChecker;

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside TextEditorSetter on SpellChecker setter Autowired.");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
