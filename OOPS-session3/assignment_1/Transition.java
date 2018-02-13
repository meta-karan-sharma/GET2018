package assignment_1;

/**
 * 
 * This class depicts the transition that occurred due to the event that occurred
 * @author Karan Sharma
 */
public class Transition 
{

	//variable storing the initial and final state of that particular transition
	State initialState, finalState;
	
	//object of event class to maintain the track of event that caused the transition
	Event event;

	/**
	 * method to get the initial state
	 * @return initialState
	 */
	public State getInitialState () 
	{
		return initialState;
	}
	
	/**
	 * method to get the final state
	 * @return finalState
	 */
	public State getFinalState () 
	{
		return finalState;
	}
	
	
	/**
	 * method to get the event
	 * @return event
	 */
	public Event getEvent() 
	{
		return event;
	}
	
	/**
	 * constructor to initialize initialState,finalState and event
	 * @param initialState 
	 * @param finalState 
	 * @param event 
	 */
	public Transition (State initialState, State finalState, Event event) 
	{
		this.initialState = initialState;
		this.finalState = finalState;
		this.event = event;
		
	}
}
