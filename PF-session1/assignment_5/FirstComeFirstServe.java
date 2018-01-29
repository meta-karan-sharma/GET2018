/**
 * The program is made to create an array and initialize it with FCFS based scheduling times.
 *
 * @version 1.0 23rd January 2018
 * @author Karan Sharma
 */
package assignment_5;

public class FirstComeFirstServe {

	public int[][] FCFS (int arrival_time [], int job_size[])
	{
		int length = arrival_time.length;//defining number of rows using length of job queue
		int loopCounter;
		int outputArr [][] = new int [length][5];// col 1= Job No., col 2= Arrival time, col 3= waiting time, col 4= start time, col 5= finish time
		for(loopCounter = 0; loopCounter < length; loopCounter++)//initializing first two columns
		{
			outputArr [loopCounter][0] = loopCounter + 1;
			outputArr [loopCounter][1] = arrival_time[loopCounter];
		}
		outputArr [0][2] = 0;//waiting period of the first program would be 0 
		outputArr [0][3] = arrival_time [0];//starts when arrives
		outputArr [0][4] = job_size [0] + outputArr [0][3] - 1;//finish time is start time + arrival time for first job -1(end of last second and beginning of first) 
		for(loopCounter = 1; loopCounter < length; loopCounter++)
		{
			if(outputArr [loopCounter-1][4] >= outputArr [loopCounter][1])//if the next job arrives before the completion of first
			{
				outputArr [loopCounter][3] = outputArr [loopCounter-1][4] + 1;//start time
				outputArr [loopCounter][2] = outputArr [loopCounter][3] - outputArr[loopCounter][1];//waiting time
				outputArr [loopCounter][4] = outputArr [loopCounter][3] + job_size[loopCounter] - 1;//finishing time
			}
			else//if the cpu is stable
			{
				outputArr [loopCounter][2] = 0;//waiting time
				outputArr [loopCounter][3] = arrival_time[loopCounter];//start time
				outputArr [loopCounter][4] = outputArr[loopCounter][3] + job_size[loopCounter] - 1;//finishing time
			}
		}
		return outputArr;
	}
}