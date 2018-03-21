package com.metacube.ds.queue;
import java.util.Arrays;
/**
 * This class is to implement basic queue operations.
 * @author Karan 
 */
public class Queue<T> {
	private T[] queueArray;
	
	@SuppressWarnings("unchecked")
	Queue () {								/*Constructor to initiate the array*/
		queueArray = (T[]) new Object[0];
	}
	
	public T getQueueElement(int index) {	/*To get the element from the queue*/
		return queueArray[index];
	}
	
	public T[] getQueueArray() {			/*To get the queue*/
		return queueArray;
	}

	public int length() {					/*To get the length of queue*/
		return queueArray.length;
	}
	
	/*This function inserts element into the queue*/
	public void enQueue(T item) {
		T[] tempArray = (T[]) new Object[queueArray.length + 1];
		tempArray = Arrays.copyOf(queueArray,queueArray.length +1);
		tempArray[queueArray.length] = item;
		queueArray = tempArray;
	}
	
	/*This function deletes element from the queue*/
	public T deQueue () {
		if(queueArray.length <= 0) {
			return null;
		}
		T deletedElement = queueArray[0];
		T[] tempArray = (T[]) new Object[queueArray.length -1 ];
		tempArray = Arrays.copyOfRange(queueArray,1,queueArray.length);
		queueArray = tempArray;
		return deletedElement;
	}
	
	/*This function empties the queue*/
	public void makeempty() {
		queueArray = (T[]) new Object[0];
	}
	
	/*This function returns the least recently inserted item*/
	public T getFront () {
		if(queueArray.length <= 0) {
			return null;
		}
		return queueArray[0];
	}
}
