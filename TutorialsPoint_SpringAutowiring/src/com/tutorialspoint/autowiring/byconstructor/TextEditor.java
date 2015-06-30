package com.tutorialspoint.autowiring.byconstructor;

import com.tutorialspoint.autowiring.bytype.SpellChecker;

public class TextEditor {

	private SpellChecker spellChecker;
	private String name;

	public TextEditor(SpellChecker spellChecker, String name) {
		System.out.println("Inside TextEditor constructor AutoWiring By Constructor.");
		this.spellChecker = spellChecker;
		this.name = name;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
