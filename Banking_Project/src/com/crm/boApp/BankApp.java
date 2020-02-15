/**
 * 
 */
package com.crm.boApp;

import com.crm.utils.Delimiter;
import com.crm.utils.Message;

/**
 * @author Aurel
 *
 */
public class BankApp {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		Message print = new Message(Delimiter.EQUAL);
		String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		System.out.println(print.delimiterString(str.length()));
		System.out.println(str);
		System.out.println(print.delimiterString(str.length(), 1));


	}

}
