
/**
 * The program returns the merged and sorted input arrays which were also sorted.
 *
 * @version 1.0 23rd January 2018
 * @author Karan Sharma
 */
package assignment_3;

public class JoinArrays {
	public int[] join (int a[], int asize, int b[], int bsize, int c[])
	{
		int positionCounter1 = 0 , positionCounter2 = 0, positionCounter3 = 0;
		 while (positionCounter1 < asize && positionCounter2 < bsize)//until one of the arrays run out of elements
		    {
		        if (a [positionCounter1] < b [positionCounter2])//which ever element is smaller is inserted first in to the output array
		            c [positionCounter3++] = a [positionCounter1++];//also the counter is increased for the array selected
		        else
		            c [positionCounter3++] = b [positionCounter2++];
		    }   
		    while (positionCounter1 < asize)
		        c [positionCounter3++] = a [positionCounter1++];//if the elements remain in array 1, they are inserted one by one in order
		 
		    while (positionCounter2 < bsize)
		        c [positionCounter3++] = b [positionCounter2++];//if the elements remain in array 2, they are inserted one by one in order
		return c;
	}

}