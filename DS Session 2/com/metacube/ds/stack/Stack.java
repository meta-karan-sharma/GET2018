package com.metacube.ds.stack;

import com.metacube.utils.*;

/**
 * Implements all stack functions :- Push, Pop, Peek
 * 
 * @author Karan Sharma
 *
 */
public class Stack<T> {
	private Node<T> top;
	private int size;
	
	/**
	 * Initializes the stack with no elements
	 */
	public Stack(){
		this.top = null;
		this.size = 0;
	}
	
	/**
	 * pushes data into stack at the top
	 * 
	 * @param data
	 */
	public void push(T data){
		Node<T> newNode = new Node<T>(data);
		newNode.setNextLink(top);
		top = newNode;
		size++;
	}
	
	/**
	 * pops the data from the stack from the top
	 * 
	 * @return
	 */
	public T pop(){
		if(this.size==0){
			System.out.println("Underflow");
			return null;
		}
		T data = top.getData();
		top = top.getNextLink();
		this.size--;
		return data;
	}
	
	/**
	 * 
	 * @return last element of the stack
	 */
	public T peek(){
		if(this.size==0){
			return null;
		}
		return top.getData();
	}
	
	@Override
	public String toString(){
		String str ="";
		Node<T> ptr = this.top;
		while(ptr != null){
			str += ptr.getData();
			ptr = ptr.getNextLink();
		}
		return str;
	}
}
