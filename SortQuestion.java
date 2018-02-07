package assignment_1;

import java.util.ArrayList;
import java.util.List;

/**
 * this class sorts the questions in the question list using selection sort algorithm
 * @author Karan Sharma
 *
 */
public class SortQuestion 
{
		
	/**
	 * method sorts the question list
	 * @param questionList
	 * @return list
	 */
	public List <Question> sortQuestion (List<Question> questionList)
	{
		List <Question> sortedQuestionList = new ArrayList <> ();
			
		/*Sort the question using selection sort concept*/
		for(int questionNumber = 0; questionNumber < questionList.size () - 1; questionNumber++)
		{
			String tempQuestion = questionList.get (questionNumber).getQuestion ();		//stores the question string
			Question tempQuestionObject = questionList.get (questionNumber);			//stores the object of question
				
			/*finds the smallest element*/
			for(int compareQuestionNumber = questionNumber + 1; compareQuestionNumber < questionList.size (); compareQuestionNumber++)
			{
				
				if(questionList.get (compareQuestionNumber).getQuestion ().compareTo (tempQuestion) < 0)
				{
					tempQuestion = questionList.get (compareQuestionNumber).getQuestion ();
					tempQuestionObject = questionList.get (compareQuestionNumber);
				}
			}
			sortedQuestionList.add (tempQuestionObject);				//add smallest element in the list
			questionList.remove (tempQuestionObject);
		}
		sortedQuestionList.addAll (questionList);				//add remaining element to the list
		return sortedQuestionList;
	}
}

