package assignment_1;

import java.util.ArrayList;
import java.util.List;

/**
 * class representing the type of the question 
 * @author Karan Sharma
 *
 */
public class Type 
{
	private List <String> optionList = new ArrayList <> ();
	
	/**
	 * Constructor
	 * @param options
	 */
	public Type (List <String> options)
	{
		this.optionList = options;
	}

	/**
	 * method to get option list
	 * @return optionList
	 */
	public List <String> getOptions() 
	{
		return this.optionList;
	}
}
