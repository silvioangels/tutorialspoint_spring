package com.tutorialspoint.annotationbasedconfiguration.jsr250;

import javax.annotation.Resource;

import com.tutorialspoint.annotationbasedconfiguration.autowired.SpellChecker;

public class TextEditor {

	private SpellChecker spellChecker;

	@Resource(name = "spellChecker")
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside SpellChecker setter JSR-250.");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
