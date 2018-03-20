package com.metacube.ds.queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class simulates the counselling process.
 * @author Karan
 *
 */
public class Counselling {
	public List<String> startCounselling(Queue<Candidate> candidateQueue, List<College> collegeQueue, int[] input) {
		Arrays.sort(candidateQueue.getQueueArray());    //Sorting candidates according to their marks
		int inputCounter = 0;
		int ch;
		int totalStudents = candidateQueue.length();
		List<Candidate> candidateList = new ArrayList<Candidate>();
		for(int i = 0; i < totalStudents;i++) {
			Candidate c = candidateQueue.deQueue();
			candidateList.add(c);
			System.out.println("Call for Student:"+ c.getName() +" Remaining Students = "+candidateQueue.length());
			boolean flag = false;
			int j;
			
			//Printing the list of colleges.
			for( j = 0; j<collegeQueue.size(); j++) {
				if(collegeQueue.get(j).isAvailable()) {
					flag = true;
					System.out.println("Id:"+(j+1)+"College name:"+collegeQueue.get(j).getName()+"  "+"Available seats:"+collegeQueue.get(j).getAvlSeats());
				}
			}
			if(!flag) {
				ch = input[inputCounter++]-1;   	//Choice entered by the candidate.
				//For invalid choice.
				if(((ch > j)&&(ch <= 0)) || (collegeQueue.get(ch).getAvlSeats()<=0)) {
					throw new IllegalArgumentException("Wrong Choice");
				}
				c.setCollegeName(collegeQueue.get(ch).getName());
				collegeQueue.get(ch).updateAvlSeats();
			}
		}
		List<String> result = new ArrayList<>();   		//Final college list for candidates.
		for(Candidate c : candidateList) {
			result.add("Name: "+c.getName()+" "+"College Allotted: "+c.getCollegeName());
		}
		return result;
	}

}
