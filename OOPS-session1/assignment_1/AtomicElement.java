/**
 * This class is responsible for initializing atomic element 
 * i.e. the elements which doesn't have any more tags inside it.
 * 
 * @author Karan Sharma
 */
package assignment_1;

public class AtomicElement extends Element
{
	
	/**
	 * constructor to initialization of values
	 * 
	 * @param id
	 * @param className
	 */
	public AtomicElement(String id, String className) 
	{
	
		// calling parent class for initialization
		super(id,className);
	}
	

}
