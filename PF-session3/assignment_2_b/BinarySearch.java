
/**
 * Binary Search using recursive calling.
 * 
 * @version 1 29th January 2018
 * @author Karan Sharma
 */
package assignment_2_b;

public class BinarySearch 
{
	int mid;
	
	/**
	 * takes in array, the element to search and the part of array to search in, using first and last indices.
	 * returns position of the element, else -1 if not found.
	 * 
	 * @param arr
	 * @param x
	 * @param first
	 * @param last
	 * @return
	 */
	int binarySearch (int []arr, int x, int first, int last)
	{
		if ( (first < last) && (last <= arr.length)) // the search remains within bounds
		{
			mid = (first + last - 1)/2; // middle element
			if (arr [mid] == x)
				return mid+1; // returns position if element found
			else if (arr [mid] > x) // if the element is smaller then the middle element
				return binarySearch (arr, x, first, mid); // part of array before it is called
			else if (arr [mid] < x) // if the element is greater then the middle element
				return binarySearch (arr, x, mid+1, last);	// part of array after it is called
		}
		return -1; // element not found or the search went out of bounds.
	}
}
