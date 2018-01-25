
/**
 * The program returns the type of array passed, 0 for unsorted, 1 for sorted and ascending, 2 for sorted and descending.
 * equal is assumed to be ascending
 *
 * @version 1.0 23rd January 2018
 * @author Karan Sharma
 */
package assignment_4;

public class SortedOrNot 
{
	public int sortedOrNot (int array [])
	{
		int positionCounter = 0;
		int type;
		if(array [positionCounter] <= array [positionCounter + 1])
		{
			type = 1;// initially assumed to be sorted and ascending as second element was larger than the first
			for (positionCounter = 1; positionCounter < array.length - 1; positionCounter++)
			{
				if(array [positionCounter] > array [positionCounter + 1])
					type = 0;//declared unsorted as initially the array was ascending but started descending in the middle
			}
			return type;
		}
		else 
		{
			type = 2;// initially assumed to be sorted and descending as second element was smaller than the first
			for (positionCounter = 1; positionCounter < array.length - 1; positionCounter++)
			{
				if (array [positionCounter] <= array [positionCounter + 1])
					type = 0;//declared unsorted as initially the array was descending but started ascending in the middle
			}
			return type;
		}
	}
}
