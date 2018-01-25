/**
 * The program returns the modified input array with the modification being removal of duplicate elements.
 *
 * @version 1.0 23rd January 2018
 * @author Karan Sharma
 */

package assignment_2;

import java.util.Arrays;

public class RemovingDuplicate 
{
	/**
	 * The method checks for duplicate values while comparing the currElement parameter with the array elements before it and returning true for no duplicates found.
	 * 
	 * @param input
	 * @param currElement
	 * @return
	 */
	boolean checkDuplicate (int input[], int currElement)
	{
		boolean flag = true;//initialized to true as an element is unique until found duplicate
		for (int compElement=0; compElement<currElement; compElement++)//checked till the current element only, not after that
		{
			if (input [compElement] == input [currElement])//duplicate found
			{
				flag = false;
			}
		}
		return flag;
	}
	public int[] removeDuplicate (int input[])
	{
		int positionCounter = 0;
		int size = input.length;//initial size of the array to be returned as no duplicate found yet
		while (positionCounter < size)//till end of array
		{
			if (checkDuplicate (input, positionCounter))
				positionCounter++;//if not a duplicate element, move to the next element
			else
			{
				for (int iterator = positionCounter; iterator < size - 1; iterator++)//deleting current element
					input [iterator] = input [iterator + 1];
				size--;//reducing the size of the array by 1 to be returned as a duplicate element has been found
			}
		}
		return Arrays.copyOfRange (input, 0, size);
	}

}
