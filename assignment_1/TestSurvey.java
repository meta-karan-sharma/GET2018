package assignment_1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestSurvey 
{
	/*creating all necessary instances*/
	private static List <Participant> participantList ;
	private static IOFile read ;
	private static List <Question> questionList ;
	private static Participant participant1 ;
	private static Participant participant2 ;
	private static Participant participant3 ;
	
	@BeforeClass
	/**
	 * Function that performs all operations before the participants answers the question
	 * operations include -
	 * reading the question and storing it
	 * creation of participants
	 */
	 public static void doBefore () 
	{
		participantList = new ArrayList <> ();
		read = new IOFile ("C://Users/admin/workspace/OOPS-session2/src/assignment_1/input.txt");
		try 
		{
			read.readQuestion ();
		} 
		catch (IOException exception) 
		{
			exception.printStackTrace();
		}
		questionList = read.getQuestionList();
		participant1 = new Participant ();
		participant2 = new Participant ();
		participant3 = new Participant ();
		participantList.add (participant1);
		participantList.add (participant2);
		participantList.add (participant3);
	}
	
	@Test
	/**
	 * This function simulates the test given by the participants
	 * it also calculates the result and compares it with the expected result
	 */
	public void test() 
	{
		String[] arr1 = new String[] {"1","communication","feedback"};						//Answers by 1st participant
		String[] arr2 = new String[] {"2","communication/Delivery Process","feedback correct"};	//Answers by 2nd participant		
		String[] arr3 = new String[] {"2","communication/Delivery Process","feedback given"};	//Answers by 3rd participant
		int questionNumber = 0;
		for (Question question : questionList){
			participant1.setParticipantAnswer(question, arr1[questionNumber]);
			participant2.setParticipantAnswer(question, arr2[questionNumber]);
			participant3.setParticipantAnswer(question, arr3[questionNumber++]);
		}
		Calculation calc = new Calculation();
		//Calculation of the percentage for every option selected
		//this loop is for the number of total participants
		for (Participant participantObject : participantList)
		{
			//loop to iterate through all questions for a particular participant
			for (Map.Entry mapItem : participantObject.getAnswerList ().entrySet ())
			{
				Question question = (Question) mapItem.getKey ();
				if(question.getType ().equalsIgnoreCase ("single"))
				{
					List <String> list = question.getQuestionType ().getOptions();
					for (String options : list)
					{
						if (options.equalsIgnoreCase ( (String)mapItem.getValue ()))
						{
							question.getResultObject ().setResult (options);
						}
					}
					calc.calculate (question, participantList.size());
				}
			}
		}
		HashMap<Integer,LinkedHashMap<String,String>> actual = new LinkedHashMap<Integer, LinkedHashMap<String,String>>();
		/*Storing expected result*/
		HashMap<Integer,LinkedHashMap<String,String>> expected = new LinkedHashMap<Integer, LinkedHashMap<String,String>>();
		HashMap< String, String> question = new LinkedHashMap< String, String>();
		question.put("1","33%");
		question.put("2","66%");
		question.put("3","0%");
		question.put("4","0%");
		question.put("5","0%");
		expected.put(1,(LinkedHashMap<String, String>)question.clone());
		
		boolean result= false;
		questionNumber=1;
		for(Question q : questionList){
			if(q.getType().equalsIgnoreCase("single")){
				actual.put(questionNumber++, (LinkedHashMap<String, String>) (q.getResultObject().getResultPercentage()));
			}
		}
		try {
			read.writeAnswer(participantList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Checks if the final answer is true*/
		assertTrue(expected.equals(actual));
	}
	
	@Test
	/**
	 * This function compares the output files with the expected results
	 */
	public void test1() {
		List<String> expected = new ArrayList<String>();
		List<String> actual = new ArrayList<String>();
		expected.addAll(Arrays.asList("Participant 1, 1, communication, feedback","Participant 2, 2, communication/Delivery Process, feedback correct","Participant 3, 2, communication/Delivery Process, feedback given"));
		File file = new File("C:\\Users\\admin\\workspace\\OOPS-session2\\src\\assignment_1\\participant-Result.txt");
		Scanner scanner;
		try {
			scanner = new Scanner (file);
			while (scanner. hasNext ()) 
			{
				actual.add(scanner.nextLine());
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expected,actual);
	}
	
	
	@Test
	/**
	 * This function simulates the test given by the participants
	 * it also calculates the result and compares it with the expected result
	 */
	public void test2() {
		SortQuestion s = new SortQuestion();
		questionList = s.sortQuestion(questionList);
		List <String> actual = new ArrayList<String>();
		List <String> expected = new ArrayList<String>();
		for(Question q : questionList){
			actual.add(q.getType() + ", " + q.getQuestion() + ", " +q.getQuestionOptions());
		}
		expected.addAll(Arrays.asList("multi, Areas of improvement, Service Quality/Communication/Delivery Process",
									  "single, overall rating, 1/2/3/4/5","text, Trainne Feedback, null"));
		assertEquals(expected,actual);
	}

}