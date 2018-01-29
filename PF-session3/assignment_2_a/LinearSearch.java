
/**
 * Linear Search using recursive calling.
 * 
 * @version 1 29th January 2018
 * @author Karan Sharma
 */
package assignment_2_a;

public class LinearSearch 
{ 
	/**
	 * takes in the array, the element, and the next position to be searched at.
	 * returns the position of the element, else 0 if not found
	 * 
	 * @param arr
	 * @param x
	 * @param position
	 * @return
	 */
	int linearSearch (int arr [], int x, int position)
	{
		if (position == arr.length)
			return 0; // base condition #1, the array is finished and the number is not found.
		if (arr [position] == x)
			return position; // base condition #2, position of the element is found.
		return linearSearch (arr, x, position + 1); // search at the next index.
	}
}
