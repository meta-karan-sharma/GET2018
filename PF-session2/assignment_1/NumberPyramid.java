
/**
 * The program returns an array of string in a shape of diamond with numbers increasing till the middle then 
 * decreasing as shown in the pattern as follows :-
 *     1
 *    121
 *   12321
 *  1234321
 * 123454321
 *  1234321
 *   12321
 *    121
 *     1   
 * Modular approach is used in this code.
 *
 * @version 1.0 24th January 2018
 * @author Karan Sharma
 */
package assignment_1;

public class NumberPyramid 
{
	
	/**
	 * This method takes in input the row which is to be calculated and returns the number of spaces
	 * in the corresponding row.
	 * 
	 * @param row
	 * @param n
	 * @return
	 */
	String spaces (int row , int n)
	{
		int numSpaces;
		String space = ""; // Blank String initialized.
		if(row < n) // before reaching the mid point
		{
			numSpaces = n - row; // number of spaces in a row 
			for(int iterator = 0; iterator < numSpaces; iterator++)
				space = space + " "; // number of spaces are concatenated to the blank string one by one.
		}
		else // after the mid point
		{
            numSpaces = row - n;  
            for(int iterator = 0; iterator < numSpaces; iterator++)
				space = space + " ";
		}
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
		int decrementor=1;
		int numDigits;
		String number = ""; // Blank String is initialized.
		if (row < n) // Before the mid point.
		{
		    numDigits = 2 * row -1; // number of digits are counted ex. for 3rd row 12321  
		    							 // (2 * 3 -1) = 6 - 1 = 5.
		    for(int num = 1; num <= numDigits; num++)
		    {
		    	if (num <= numDigits / 2 +1) // till we reach the middle of the string 
		    		number = number + num;    // (where the numbers stop increasing).
		    	else
		    	{
		    		number = number + (num - decrementor - 1); // numbers are henceforth decreasing
		    		decrementor=decrementor+2;  // therefore decrementor is used which is incremented twice 
		    									// for every increment in iterator.
		        }
		    }
		} 
		else // after the mid point
		{
			numDigits = 2 * ((n - row) + n) -1; // the number of digits start decreasing so we adopt a new formula
			decrementor = 1;
			for(int num = 1; num <= numDigits; num++)
			{
			 	if (num <= numDigits / 2 +1)
			   		number = number + num;
			   	else
			   	{
			   		number = number + (num - decrementor - 1);
			    	decrementor=decrementor+2;
			    }
			}
		}
		return number;
	}
	   
	/**
	 * The method concatenates the result from above two functions and returns the string array that has the desired output
	 * 
	 * @param n
	 * @return
	 */
	String[] pyramid(int n)
	{
		int size = (2 * n) - 1; // number of rows
		String resultPyramid[]=new String[size]; 
		for (int rowCount = 1; rowCount <= size; rowCount++) //each row is passed and the result is concatenated 
			resultPyramid[rowCount-1] = spaces(rowCount , n) + numbers(rowCount , n);
		return resultPyramid;
	} 
	   
}
