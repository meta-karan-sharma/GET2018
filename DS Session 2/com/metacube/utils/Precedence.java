package com.metacube.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines the precedence of basic binary operators for use in infix to postfix conversion
 * @author Karan Sharma
 *
 */
public class Precedence {

	Map<Character, Integer> operatorPrecedence;
	/**
	 * Constructor to initialize the hashmap for operator precedence values for the calling stack
	 */
	public Precedence(){
		
		 operatorPrecedence = new HashMap<>();

		 operatorPrecedence.put('(', -1);
		 operatorPrecedence.put('+', 0);
		 operatorPrecedence.put('-', 0);
		 operatorPrecedence.put('*', 1);
		 operatorPrecedence.put('/', 1);
		 operatorPrecedence.put('%', 1);
		 operatorPrecedence.put('^', 2);
	}
	
	/**
	 * 
	 * @param operator
	 * @return the precedence value for the calling operator
	 */
	public int getPrecedence(char operator){
		return operatorPrecedence.get(operator);
	}
	
}
