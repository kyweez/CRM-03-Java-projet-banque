/**
 * 
 */
package com.crm.utils;

/**
 * @author Aurel
 *
 */
public class Menu {
	// ################################# CONSTANTS #################################
	// ################################# ATTRIBUTS #################################

	private Delimiter delimiter;
	private String programName;
	private int choiceNumber;
	private int choiceMade;

	// ################################ CONSTRUCTOR ################################
	
	/**
	 * Basic constructor
	 */
	public Menu() {
		super();
	}

	/**
	 * Constructor which will set the delimiter and the program name directly. 
	 * @param delimiter
	 * @param programName
	 */
	public Menu(Delimiter delimiter, String programName) {
		this.delimiter.name = delimiter.name;
		this.programName = programName;
	}

	// ############################## GETTER & SETTER ##############################
	
	/**
	 * @return the delimiter
	 */
	public Delimiter getDelimiter() {
		return delimiter;
	}

	/**
	 * @param delimiter the delimiter to set
	 */
	public void setDelimiter(Delimiter delimiter) {
		this.delimiter = delimiter;
	}

	/**
	 * @return the programName
	 */
	public String getProgramName() {
		return programName;
	}

	/**
	 * @param programName the programName to set
	 */
	public void setProgramName(String programName) {
		this.programName = programName;
	}

	/**
	 * @return the choiceNumber
	 */
	public int getChoiceNumber() {
		return choiceNumber;
	}

	/**
	 * @param choiceNumber the choiceNumber to set
	 */
	public void setChoiceNumber(int choiceNumber) {
		this.choiceNumber = choiceNumber;
	}
	
	// ################################## METHODS ##################################
	
	public void beginProgram() {
		
	}
	
}
