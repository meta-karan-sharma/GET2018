package assignment_1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * to store the calculated result for each question 
 * @author Karan Sharma
 *
 */
public class Result 
{
	private HashMap <String, Integer> result = new LinkedHashMap <> ();			//store count for every option as per the participant answer
	private HashMap <String, String> resultPercentage = new LinkedHashMap <> ();	//store percentage for every option as per the participant answer
	
	/**
	 * method to set the values in result hashmap
	 * @param option
	 */
	public void setResult (String option) 
	{
		int count = this.result.get (option);
		this.result.put (option, ++count);
	}
	
	/**
	 * method to initialize the result hasmap
	 * @param optionList
	 */
	public void initialize (List<String> optionList)
	{
		
		for(String s : optionList)
		{
			this.result.put (s, 0);
		}
	}

	/**
	 * method to fetch the result hash map
	 * @return result - the hashmap result
	 */
	public HashMap <String, Integer> getResult () 
	{
		return this.result;
	}

	/**
	 * method to set the final result hashmap
	 * @param option
	 * @param percent
	 */
	public void setResult (String option, String percent) 
	{
		this.resultPercentage.put (option, percent);
	}

	/**
	 * method to fetch the result hash map
	 * @return resultPercentage
	 */
	public HashMap <String, String> getResultPercentage () 
	{
		return this.resultPercentage;
	}
}
