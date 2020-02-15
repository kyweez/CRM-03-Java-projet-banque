/**
 * 
 */
package com.crm.utils;

/**
 * @author Aurel
 *
 */
public class Message {
	// ################################# CONSTANTS #################################
	// ################################# ATTRIBUTS #################################

	private Delimiter delimiter;
	private int stringLenght;

	// ################################ CONSTRUCTOR ################################

	/**
	 * Basic constructor
	 */
	public Message() {
		super();
	}

	/**
	 * Constructor which will set the delimiter directly.
	 * 
	 * @param delimiter
	 */
	public Message(Delimiter delimiter) {
		this.delimiter = delimiter;
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
	 * @return the stringLenght
	 */
	public int getStringLenght() {
		return stringLenght;
	}

	/**
	 * @param stringLenght the stringLenght to set
	 */
	public void setStringLenght(int stringLenght) {
		this.stringLenght = stringLenght;
	}

	// ################################## METHODS ##################################

	public String delimiterString(int strLen) {
		String str = "";
		int i = strLen;
		while (i-- != 0)
			str = str.concat(delimiter.name);
		return (str);
	}

	public String delimiterString(int strLen, int addChars) {
		String strInit = delimiterString(strLen);
		String strFinal = strInit.concat(delimiterString(addChars));
		return (strFinal);
	}

	public String delimterCenterString(String origin, int addChars) {
		StringBuffer buff;
		String modifiedString;
		buff = new StringBuffer(origin);
		modifiedString = buff.toString();
		if (addChars <= 2)
			modifiedString = addSpace(modifiedString, addChars);
		else {
			
		}
		return (modifiedString);
	}

	/**
	 * Methods which add "spaceNumbers/2" spaces on each side of a string This
	 * method returns the new string. If "spaceNumbers" is odd, it add the last
	 * space on the left side.
	 * 
	 * @param str
	 * @param spaceNumber
	 * @return changedString
	 */
	public String addSpace(String str, int spaceNumber) {
		StringBuffer changedString = new StringBuffer(str);
		int i = 0;
		while (i < spaceNumber) {
			if (i % 2 == 0)
				changedString.insert(0, ' ');
			else
				changedString.append(' ');
			i++;
		}
		return (changedString.toString());
	}

}
