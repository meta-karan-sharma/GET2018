package assignment_1;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * This class is responsible to calculate the percent of how many times 
 * a particular option is selected by the participants
 * @author Karan Sharma
 */
public class Calculation 
{
	
	/**
	 * This function takes the question as input and calculates the percentage 
	 * of it's options and saves it 
	 * @param question
	 * @param totalParticipant
	 */
	public void calculate (Question question, int totalParticipant) 
	{
		HashMap <String, Integer> result = question. getResultObject (). getResult ();		//To contain the options of the question
		
		/*calculating relative percentage for every options of question as per the participant answers*/
		for (Entry <String, Integer> mapItem: result. entrySet ())
		{
			question. getResultObject (). setResult (mapItem.getKey (). toString (), Integer. toString ( ( ( (int) mapItem. getValue () * 100 ) / totalParticipant )) + "%");
		}
	}
}
