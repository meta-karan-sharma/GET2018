package assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * this class represents the questions that have been fetched from input file
 * @author Karan Sharma
 *
 */
public class Question 
{
	private String question;
	private String type;
	private Type questionType;
	private Result result;
	private String questionOptions;
	
	/**
	 *This method implements the compareTo method of Comparable interface
	 *@param ques
	 *@return 
	 */
	@Override
	public int compareTo(Question ques)
	{
		return this.question.compareTo(ques.question);
	}
	/**
	 * method to tokenize the question line
	 * @param line
	 */
	public void tokenize(String line)
	{
		Scanner input = new Scanner (line).useDelimiter (",");
		input.next ();
		this.type = input.next ();
		this.question = input.next ();
		this.questionOptions = null;
			
		if ( input.hasNext ()) 
		{
			this.questionOptions = input.next ();
		}

		if (this.type.equalsIgnoreCase ("single")) 
		{
			List <String> tempList = getOptionList (questionOptions);		//creating temporary list for options
			Single options = new Single (tempList);						//creating single type object
			this.questionType = options;
			this.result = new Result();
			this.result.initialize(tempList);
			
		} 
		else if (this.type.equalsIgnoreCase ("multi")) 
		{
			List <String> list = getOptionList (questionOptions);		//creating temporary list for options
			Multi options = new Multi (list);						//creating multiple type object
			this.questionType = options;
		}
	}
	
	/**
	 * method to get the list of options
	 * it separate the options using /
	 * 
	 * @param questionOptions
	 * @return list
	 */
	private List<String> getOptionList (String questionOptions)
	{
		Scanner scannerOption = new Scanner (questionOptions). useDelimiter ("/");
		List <String> optionList = new ArrayList <> ();
		
		// tokenize option list
		while (scannerOption.hasNext ()) 
		{
			optionList.add (scannerOption.next ());
		}
		return optionList;
	}

	/**
	 *method to get the result list 
	 * @return result
	 */
	public Result getResultObject () 
	{
		return this.result;
	}
	
	/**
	 * method to get the type of the question
	 * @return type
	 */
	public String getType() 
	{
		return this.type;
	}

	/**
	 * returns the object of type class
	 * @return questionType
	 */
	public Type getQuestionType () 
	{
		return this.questionType;
	}

	/**
	 * method to get the question string
	 * @return question
	 */
	public String getQuestion () 
	{
		return this.question;
	}

	/**
	 * method to get options of question
	 * @return questionOptions
	 */
	public String getQuestionOptions () 
	{
		return this.questionOptions;
	}
}
