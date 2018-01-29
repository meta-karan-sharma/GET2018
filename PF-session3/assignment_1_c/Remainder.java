
/**
 * Finding remainder without the use of modulus function.
 * 
 * @version 1 29th January 2018
 * @author Karan Sharma
 */
package assignment_1_c;

public class Remainder 
{
	
	/**
	 * Takes as input x and y, gives remainder when x is divided by y
	 * @param x
	 * @param y
	 * @return
	 */
	int findRemainder(int x, int y)
	{
		if( x >= 0 && y > 0)
		{
			if(x >= y) // subtract y from x until x < y
				return findRemainder(x - y, y);
			else // whatever remains must be the remainder
				return x;
		}
		else
			return x;
	}
}