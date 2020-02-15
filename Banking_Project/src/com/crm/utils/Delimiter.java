package com.crm.utils;

public enum Delimiter {
	SHARP	("#"), 
	PLUS	("+"), 
	EQUAL	("="), 
	SLASH	("/"), 
	DOT		("."), 
	AROBASE	("@");

	public String name;

	// Constructeur
	Delimiter(String name) {
		this.name = name;
	}
	
	public String toString() {
		return (name);
	}
}
