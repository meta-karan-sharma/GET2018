package com.metacube.utils;

/**
 * Node class to implement stack as a linked list
 * @author Karan Sharma
 *
 */
public class Node<T>{
	private Node<T> nextLink;
	private T data;	
	
	/**
	 * Constructor to initialize the node with provided data provided
	 * @param data
	 */
	public Node(T data) {
		this.nextLink = null;
		this.data = data;
	}
	
	/* Getters and setters for data variables */
	public Node<T> getNextLink() {
		return this.nextLink;
	}

	public void setNextLink(Node<T> link) {
		this.nextLink = link;
	}
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
