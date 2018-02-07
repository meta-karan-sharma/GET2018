package assignment_1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestWorkflow 
{
	
	Workflow workflow = new Workflow ("MetaCube hiring process");

	@Before
	public void beginWorkflow ()
	{
		
		State startState = new State ("start");
		workflow.addState (startState);
		State hrReviewstate = new State ("hr Review");
		workflow.addState (hrReviewstate);
		State l1_Interview_State = new State ("l1 Interview");
		workflow.addState (l1_Interview_State);
		State l2_Interview_State = new State ("l2 Interview");
		workflow.addState (l2_Interview_State);
		State management_Interview_State = new State ("management Interview");
		workflow.addState (management_Interview_State);
		State offer_state = new State ("offer");
		workflow.addState (offer_state);
		workflow.setStartState ();
	}
	
	@Test
	public void test_selected_success () 
	{
		Event event1 = new Event ("hr process");
		
		workflow.transition_step (event1);
		Event event2 = new Event ("hr ok");
		workflow.transition_step (event2);
		Event event3 = new Event ("l1 ok");
		workflow.transition_step (event3);
		Event event4 = new Event ("l2 ok");
		workflow.transition_step (event4);
		Event event5 = new Event ("management ok");
		workflow.transition_step (event5);
		List <Transition> actual_object = workflow.getTransition_list ();
		List <String> actual = new ArrayList <String> () ;
		actual.add ("Selected");
		for(Transition se : actual_object) 
		{
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List <String> expected = new ArrayList <String> ();
		 expected.addAll (Arrays.asList ("Selected","starthr Reviewhr process" ,"hr Reviewl1 Interviewhr ok" ,
				 "l1 Interviewl2 Interviewl1 ok" , "l2 Interviewmanagement Interviewl2 ok" , 
				 "management Interviewoffermanagement ok"));
		assertEquals (expected,actual);
		
		
	}

	
	@Test
	public void test_reject_success() {
		Event event1 = new Event("hr process");
		workflow.transition_step(event1);
		Event event2 = new Event("hr ok");
		workflow.transition_step(event2);
		Event event3 = new Event("l1 ok");
		workflow.transition_step(event3);
		Event event4 = new Event("l2 reject");
		workflow.transition_step(event4);
		
		List<Transition> actual_object = workflow.getTransition_list();
		List<String> actual = new ArrayList<String>() ;
		actual.add("rejected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList("rejected","starthr Reviewhr process" ,"hr Reviewl1 Interviewhr ok" ,
				 "l1 Interviewl2 Interviewl1 ok" , "l2 Interviewl2 Interviewl2 reject"));
		assertEquals(expected,actual);
		
		
	}
	
	@Test
	public void test_reject_failure() {
		Event event1 = new Event("hr process");
		workflow.transition_step(event1);
		Event event2 = new Event("hr ok");
		workflow.transition_step(event2);
		Event event3 = new Event("l1 ok");
		workflow.transition_step(event3);
		Event event4 = new Event("l2 reject");
		workflow.transition_step(event4);
		
		List<Transition> actual_object = workflow.getTransition_list();
		List<String> actual = new ArrayList<String>() ;
		actual.add("rejected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList());
		assertNotEquals(expected,actual);
		
		
	}
	@Test(expected=NullPointerException.class)
	public void test_exception ()
	{
		Event event1 = new Event (null);
		workflow.transition_step (event1);
		Event event2 = new Event ("hr ok");
		workflow.transition_step (event2);
		Event event3 = new Event ("l1 ok");
		workflow.transition_step (event3);
		Event event4 = new Event ("l2 reject");
		workflow.transition_step (event4);
		
		List <Transition> actual_object = workflow.getTransition_list ();
		List <String> actual = new ArrayList <String> () ;
		actual.add ("rejected");
		for (Transition transitionIterator : actual_object) 
		{
			actual.add(transitionIterator.initialState.stateName + transitionIterator.finalState.stateName + transitionIterator.event.eventName);
		}
		List <String> expected = new ArrayList <String> ();
		 expected.addAll (Arrays.asList ());
		assertNotEquals (expected,actual);	
	}
}
