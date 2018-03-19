package com.metacube.ds.queue;
/**
 * This class represents college.
 * @author Karan
 *
 */
public class College {
	private int id;
	private String name;
	private int avlSeats;
	
	College(int id,String name, int seats) {
		this.id = id;
		this.name = name;
		this.avlSeats = seats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getAvlSeats() {
		return avlSeats;
	}

	public void updateAvlSeats() {
		this.avlSeats--;
	}
	
	public boolean isAvailable() {
		return (this.avlSeats > 0) ? true : false;
	}
}
