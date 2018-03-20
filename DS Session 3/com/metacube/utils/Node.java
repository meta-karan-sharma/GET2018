package com.metacube.utils;


/**
 * Node class for tree
 * @author Karan
 *
 */
public class Node<T> {
	
	public T data;
	public Node<T> left;
	public Node<T> right;
	public Node(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	public Node() {
		this.data = null;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * recursive method to add node
	 * @param item
	 */
	public void addItem(T item){
		if(compare(item)<0){
			if(this.left !=null) {
				this.left.addItem(item);
			} else {
				this.left = new Node<T>(item);
			}
		} else {
			if(this.right !=null) {
				this.right.addItem(item);
			} else {
				this.right = new Node<T>(item);
			}
		}
	}
	
	/**
	 * adds the item to tree in reverse order 
	 * (Mirror check only)
	 * 
	 * @param item
	 */
	public void addItemReverse(T item) {
		if(compare(item) > 0) {
			if(this.left !=null) {
				this.left.addItemReverse(item);
			} else {
				this.left = new Node<>(item);
			}
		} else {
			if(this.right !=null) {
				this.right.addItemReverse(item);
			} else {
				this.right = new Node<>(item);
			}
		}
	}
	
	/**
	 * Compare method checks if the parent class has implemented comparable interface or not, 
	 * if it has, it calls the method, else casts to string and compares
	 * @param item
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int compare(T item){
		if(item instanceof Comparable){
			return ((Comparable) item).compareTo(this.data);
		}
		else{
			return item.toString().compareTo(this.data.toString());
		}
	}
}


