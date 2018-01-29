
/**
 * Finding GCD of the two numbers.
 * 
 * @version 1 29th January 2018
 * @author Karan Sharma
 */
package assignment_1_b;

public class GCD 
{
	/**
	 * takes in input two numbers and calculates their GCD using recursive calling.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	int gcd (int x, int y)
	{
		if (y != 0)
			return gcd (y, x % y); // until one number perfectly divides the other
		else
			return x; // base condition, the number found is the highest that can divide both initial numbers
	}
}
