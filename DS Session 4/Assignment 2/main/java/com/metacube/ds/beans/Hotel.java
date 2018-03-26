package main.java.com.metacube.ds.beans;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to build a hotel and keep a track of rooms
 * 
 * @author Karan
 *
 */
public class Hotel {
	private Map<Integer, String> listOfRooms;
	
	/**
	 * Constructor
	 * 
	 * @param numOfRooms
	 */
	public Hotel(int numOfRooms){
		listOfRooms = new HashMap<>(numOfRooms);
	}
	
	/**
	 * Allots the room to the desirable person on first come first serve,
	 * but the number alloted is based on a hash function that uses age to determine 
	 * the room number
	 * 
	 * @param person
	 */
	public void allotRooms(Person person) {
		int age = person.getAge();
		int roomNum = nextAvailableRoom(age % 7);
		listOfRooms.put(roomNum, person.getName());
	}
	
	/**
	 * if the room number is not available directly using the hash function
	 * next room available is returned
	 * 
	 * @param roomNum
	 * @return
	 */
	private int nextAvailableRoom(int roomNum) {
		if(listOfRooms.containsKey(roomNum)) {
			roomNum++;
			roomNum %= 7;
			roomNum = nextAvailableRoom(roomNum);
		}
		return roomNum;
	}
	
	/**
	 * returns the list of rooms with the name of the person alloted to
	 * @return
	 */
	public Map<Integer, String> display() {
		return listOfRooms;
	}
}
