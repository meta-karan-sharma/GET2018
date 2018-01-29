
/**
 * Finding the largest digit in an integer number.
 * 
 * @version 1 29th January 2018
 * @author Karan Sharma
 */
package assignment_1_a;

public class LargestDigit 
{
	int largest = 0;
	/**
	 * Takes in an integer number n, and returns the largest digit that resides in it.
	 * 
	 * @param n
	 * @return
	 */
	int largestDigit (int n)
	{
		if (n <= 0) // base condition, number is over.
			return largest;
		if (n % 10 > largest) // if a digit is greater than the largest yet, replace the largest.
			largest = n % 10;
		return largestDigit (n / 10); //recursive calling until the base condition is met
	}
}
