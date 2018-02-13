package assignment_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * This class has two functions ,one is to read the questions from the input file
 * and the second is to write the expected result in the output file.
 * @author Karan Sharma
 *
 */
public class IOFile 
{
	private String path ;
	private List <Question> questionList = new ArrayList <> ();
	
	/**
	 * constructor
	 * @param path
	 */
	public IOFile (String path)
	{
		this.path = path;
	}
	
	/**
	 * this method reads the questions from the input file and adds the question 
	 * object in the question list
	 */
	public void readQuestion () throws IOException
	{
		try {
			File file = new File(this.path);
			Scanner scanner = new Scanner (file);
			
			/*fetching and creating object for each line of file*/
			while (scanner. hasNext ()) 
			{
				Question questionObject =  new Question ();
				questionObject. tokenize (scanner. nextLine ());
				this.questionList.add (questionObject);
			}
		} 
		catch (FileNotFoundException exceptionObject) 
		{
			exceptionObject. printStackTrace ();
		}
	}

	/**
	 * method to get the question list
	 * @return questionList
	 */
	public List <Question> getQuestionList() 
	{
		return this.questionList;
	}
	
	/**
	 * this method writes the final result in the output file
	 * @param participantList
	 */
	public void writeAnswer (List <Participant> participantList) throws FileNotFoundException, UnsupportedEncodingException 
	{
		PrintWriter writer = new PrintWriter ("C://Users/admin/workspace/OOPS-session2/src/assignment_1/participant-Result.txt", "UTF-8");
		int count = 1;										//participant count
		
		/*write each participant answers in a file*/
		for(Participant participantListItem : participantList)
		{
			writer.print("Participant " + count++);
			
			for(Entry <Question, String> mapItem : participantListItem.answerList.entrySet ())
			{
				writer.print(", " + mapItem.getValue ());
			}
			writer.println();
		}
		writer.close();
	}
}