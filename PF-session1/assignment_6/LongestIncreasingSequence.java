
/**
 * The program is made to create an array and initialize it with FCFS based scheduling times.
 *
 * @version 1.0 23rd January 2018
 * @author Karan Sharma
 */
package assignment_6;

import java.util.Arrays;

public class LongestIncreasingSequence 
{
	int [] longestSequence (int input [])
	{
		int counter = 1, pos, count = 0, position = 0;//counter is initialized to 1 as a sequence always begins with 2 elements
		int size = input.length; 
		for (int loopCounter=0; loopCounter < size; loopCounter++)
		{
			pos = loopCounter;// pos is initialized to loop counter every time a new sequence is initiated
			if (loopCounter == size - 1)
				break;// breaking the loop at the last element because 1 digit can not form a sequence
			while (input [loopCounter] < input [loopCounter + 1])
			{
				counter++;// increases for every increasing iteration 
				loopCounter++;
				if (loopCounter == size - 1)
					break;//breaking at the last element
			}
			if (counter > count)
			{
				position = pos;// if a longer sequence is obtained allocate new values to the final position and final count
				count = counter;
			}
			counter = 1;//again initialized at 1
		}
		return Arrays.copyOfRange (input, position, position + count);
	}
}
