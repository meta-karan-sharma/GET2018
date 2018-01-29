
/**
 * The program returns an array of string in a shape of a reverse triangle with numbers decreasing with increasing rows 
 * as shown in the pattern as follows :-
 * 12345
 *  1234
 *   123
 *    12
 *     1
 * Modular approach is used in this code.
 *
 * @version 1.0 24th January 2018
 * @author Karan Sharma
 */
package assignment_2;

public class NumberTriangle 
{
	/**
	 * This method takes in input the row which is to be calculated and returns the number of spaces
	 * in the corresponding row.
	 * 
	 * @param row
	 * @param n
	 * @return
	 */
	String spaces(int row , int n)
	{
		String space = ""; // blank string initiated
		  
		int numSpaces = row - 1; // calculating number of spaces in a row  
		for(int iterator = 0; iterator < numSpaces; iterator++)
			space = space + " "; // number of spaces are concatenated to the blank string one by one.
		return space;
	}
	
	/**
	 * This method calculates the numbers in the passed row and returns the corresponding string
	 * 
	 * @param row
	 * @param n
	 * @return
	 */
	String numbers(int row ,int n)
	{
		String number = ""; // Blank String is initialized.
		int numDigits = n - row + 1; // number of digits corresponding to the row
		for(int num = 1 ; num <= numDigits; num++)
			number = number + num; //concatenating numbers to the blank string
		return number;
	}
	
	/**
	 * The method concatenates the result from above two functions and returns the string array that has the desired output
	 * 
	 * @param n
	 * @return
	 */
	String[] triangle(int n)
	{
		String resultTriangle[]=new String[n];
		for (int rowCount = 1; rowCount <= n; rowCount++) //each row is passed and the result is concatenated 
			resultTriangle[rowCount-1] = spaces(rowCount , n) + numbers(rowCount , n); 
		return resultTriangle;
	} 
}
