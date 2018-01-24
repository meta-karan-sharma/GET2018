
/**
 * The program converts binary numbers to octal using modular approach.
 *
 * @version 1.0 23rd January 2018
 * @author Karan Sharma
 */
package assignment_1;


public class BinaryToOctal 
{
	
	/**
	 * converts binary numbers to decimal in groups of three that make 1 octal digit
	 * 
	 * @param bin
	 * @return
	 */
	int toDec (int bin)
	{
		int dec = 0, exponent = 0;
		{
			dec=(int) (Math.pow (2, exponent) * (bin % 10) + dec);
			bin = bin / 10;
			exponent++;
		}
		return dec;
	}
	
	/**
	 * converts binary to octal using the toDec function to break down the approach in two parts
	 * 
	 * @param n
	 * @return
	 */
	int convertBinaryToOctal(int n)
	{
		int oct = 0, exponent = 0;
		while (n != 0)
		{
			oct = (int) (Math.pow (10, exponent) * (toDec (n % 1000)) + oct);
			n = n / 1000;
			exponent++;
		}
		return oct;
	}
}

