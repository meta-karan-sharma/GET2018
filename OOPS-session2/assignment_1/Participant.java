package assignment_1;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * this class represents the participants with their answers
 * @author Karan Sharma 
 *
 */
public class Participant 
{
	HashMap <Question, String> answerList = new LinkedHashMap <> ();
	
	/**
	 * method that adds question and answer to the hashmap
	 * @param question
	 * @param answer
	 */
	public void setParticipantAnswer (Question question, String answer) 
	{
		this.answerList.put (question, answer);
	}

	/**
	 * method to get answer list
	 * @return answerList
	 */
	public HashMap <Question, String> getAnswerList () 
	{
		return this.answerList;
	}
}
