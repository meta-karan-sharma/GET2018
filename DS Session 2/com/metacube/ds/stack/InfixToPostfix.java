package com.metacube.ds.stack;

import com.metacube.utils.*;
import com.metacube.exception.*;

/**
 * Converts infix operation to postfix operation
 * 
 * @author Karan Sharma
 *
 */
public class InfixToPostfix {
	private Stack<Character> stack;
	private String inExpression;
	private String postExpression;
	private Precedence precedence;
	private char[] finalExpression;
	private char[] expression;
	private boolean isOperand;
	private boolean isOperator;
	private int infixIterator, postfixIterator;
	private int size;
	
	/**
	 * constructor to initialize stack and precedence hashmap
	 */
	public InfixToPostfix(){
		stack = new Stack<Character>();
		precedence = new Precedence();
	}
	
	/**
	 * 
	 * @param expression (infix)
	 * @return postfix expression as a string
	 * @throws IllegalExpressionException 
	 */
	public String getPostfix(String expression) throws IllegalExpressionException{
		this.inExpression = expression;
		this.size = expression.length();
		isOperand = false;
		isOperator = true;
		this.convert();
		this.postExpression = toString(finalExpression);
		return postExpression;
	}
	
	/**
	 * overriding toString method to convert postfix character array to string
	 * @param expression
	 * @return
	 */
	public String toString(char[] expression){
		String finalExp = "";
		for(int i = 0; i < this.size; i++){
			finalExp += expression[i];
		}
		return finalExp;
	}
	
	/**
	 * converts infix expression to postfix expression using character arrays
	 * @throws IllegalExpressionException 
	 */
	private void convert() throws IllegalExpressionException{
		infixIterator = 0; postfixIterator = 0;
		expression = inExpression.toCharArray();
		finalExpression = new char[expression.length];
		
		while(infixIterator < expression.length){	
			
			if ( expression[infixIterator] == ' ' ){  			//ignoring spaces in the expression
				infixIterator++;
				this.size--;
				continue;
			}
			else if( Character.isLetterOrDigit(expression[infixIterator]) ){			//Operand is to be added to the string directly
				
				if(isOperand){	// two operands cannot be together
					throw new IllegalExpressionException(); 
				}
				
				isOperand = true;
				isOperator = false;
				
				finalExpression[ postfixIterator++ ] = expression[ infixIterator++ ];
			}
			/*
			 * string within braces is sorted first, therefore opening bracket has lowest priority so nothing pops it out
			 * of the stack, other than the closing bracket, but it is also forced push to let the closing bracket know
			 * when to stop popping
			 */
			 
			else if(expression[infixIterator] == '('){			
				
				if( infixIterator == expression.length - 1){			//open bracket at the end of string

					throw new IllegalExpressionException();
				}
				if(isOperand){		// an operator is required before the opening bracket
					throw new IllegalExpressionException();
				}
				
				infixIterator++;
				stack.push('(');
				this.size--;
			}
			else if(expression[infixIterator] == ')'){
				
				if(isOperator){			// an operand is required before the closing bracket
					throw new IllegalExpressionException();
				}
				
				infixIterator++;
				
				while( stack.peek() != '('){			//pops everything in between opening and closing bracket (if it remains)
					
					finalExpression[postfixIterator++] = stack.pop();
				}
				stack.pop(); //pop out the opening bracket
				this.size--;
			}
			else{		// operators are the only things that remain
				
				if( infixIterator == expression.length - 1){		// an operator can't be present at the end of string

					throw new IllegalExpressionException();	
				}
				if( isOperator ){		// two operators can't come together
					throw new IllegalExpressionException();
				}
				
				
				
				
				if( stack.peek() == null ){ 		//empty stack
					
					stack.push(expression[ infixIterator++ ]);
					isOperator = true;
					isOperand = false;
				}
				else{
					
					if( precedence.getPrecedence(stack.peek()) >= precedence.getPrecedence( expression [infixIterator] ) ){
						
						finalExpression[ postfixIterator++ ] = stack.pop();
						
					}
					else{
						
						stack.push(expression[ infixIterator++ ]);
						isOperator = true;
						isOperand = false;
					}
				}
			}
		}
		while( stack.peek() != null ){
			if(stack.peek() == '('){

				throw new IllegalExpressionException();
			}
			finalExpression[postfixIterator++] = stack.pop();
		}
	}
}
