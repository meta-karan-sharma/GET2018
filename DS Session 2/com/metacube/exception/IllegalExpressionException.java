package com.metacube.exception;

public class IllegalExpressionException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message(){
		return "Illegal infix Expression entered";
	}

}
