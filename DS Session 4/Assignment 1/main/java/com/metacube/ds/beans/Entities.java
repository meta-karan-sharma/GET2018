package main.java.com.metacube.ds.beans;

import main.java.com.metacube.ds.service.Printer;

/**
 * Base class for all the types of entities
 * 
 * @author Karan
 *
 */
public class Entities implements Comparable<Entities>{

	private int priority;
	private String dataToPrint;
	
	/**
	 * constructor 
	 * 
	 * @param priority
	 * @param data
	 */
	public Entities(int priority, String data) {
		this.priority = priority;
		this.dataToPrint = data;
	}
	
	/**
	 * Sends the Person details to the printer
	 */
	public void sendToPrinter() {
		Printer.getInstance().addToPrint(this);
	}

	/**
	 * Implementing compareTo method to compare the objects based on the priority
	 * 
	 * @param entity
	 */
	@Override
	public int compareTo(Entities entity) {
		return this.priority > entity.priority ? 1 : -1;
	}

	/**
	 * Overriding the default toString method based on our requirements
	 */
	@Override
	public String toString() {
		return this.dataToPrint;
	}
	
}
