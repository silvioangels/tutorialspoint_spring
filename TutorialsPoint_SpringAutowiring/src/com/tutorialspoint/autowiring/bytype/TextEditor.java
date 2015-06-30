package com.tutorialspoint.autowiring.bytype;

public class TextEditor {

	private SpellChecker spellChecker;
	private String name;

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside SpellChecker setter AutoWiring By Type.");
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
