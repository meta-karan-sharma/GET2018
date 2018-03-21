package com.metacube.ds.stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.metacube.exception.IllegalExpressionException;

public class InfixToPostfixTest {

	String infixExpression1,infixExpression2;
	String postfixExpression1,postfixExpression2;
	InfixToPostfix infixToPostfixObject;
	
	@Before
	public void setUp() {
		infixToPostfixObject = new InfixToPostfix();
		infixExpression1 = "((a + b) - c) * d";
		postfixExpression1 = "ab+c-d*";
	}

	@Test
	public void testGetPostfix() throws IllegalExpressionException {
		assertEquals(postfixExpression1, infixToPostfixObject.getPostfix(infixExpression1) );
	}
	@Before
	public void setUpException() {
		infixToPostfixObject = new InfixToPostfix();
		infixExpression2 = "a + b - c * d +";
		postfixExpression2 = "ab+cd*-+";
	}

	@Test(expected = IllegalExpressionException.class)
	public void testGetPostfixException() throws IllegalExpressionException {
		assertEquals(postfixExpression2, infixToPostfixObject.getPostfix(infixExpression2) );
	}

}
