
/**
 * implementing Quicksort algorithm
 *
 * @version 1 29th January 2018
 * @author Karan Sharma
 */
package assignment_3;

public class QuickSort 
{
	
	/**
	 * This method returns the index where the pivot must be in a sorted array.
	 * 
	 * @param arr
	 * @param first
	 * @param last
	 * @return
	 */
	int partition(int arr[], int first, int last)
	{
		int pivot = arr [last]; 
		int counter = (first - 1);
		// traversing the array looking for elements smaller than pivot.
		for (int iterator = first; iterator < last; iterator++) 
		{
			//If such element is found
			if (arr [iterator] <= pivot)
			{
				counter++;
				int temp = arr [counter]; // swap and increase the counter
				arr [counter] = arr [iterator];
				arr [iterator] = temp;
			}
		}
	 
		// moving pivot onto its final position
		arr [last] = arr [counter + 1];
		arr [counter + 1] = pivot;
		
		return counter + 1;
	}
	
	/**
	 * this method is a recursive method. It sorts the array that has been partitioned
	 * into two halves by the partition method.
	 * 
	 * @param arr
	 * @param first
	 * @param last
	 * @return
	 */
	int[] sort1 (int arr [], int first, int last)
	{
		if (first < last)
		{
			int index = partition (arr, first, last);          //index is partitioning index, arr[index] is 
			// now at right place 
			arr = sort1 (arr, first, index - 1);                        // Recursively sort elements before                              
			arr = sort1 (arr, index + 1, last);                         // partition and after partition
		}
		return arr;
	}
}

