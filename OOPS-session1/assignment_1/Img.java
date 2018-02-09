
/**
 * Image is a HTML tag, in this we denote Image as "img"
 * Image is type of Atomic Element
 * 
 * @author Karan Sharma
 */
package assignment_1;

public class Img extends AtomicElement 
{	
	// Attribute of Image tag
	String src;
	/**
	 * Constructor to initialize the values
	 * 
	 * @param id
	 * @param src
	 * @param className
	 */
	Img(String id, String src, String className)
	{		
		// calling parent class for initialization
		super(id , className);
		// initializing the value
		this.src = src;	
	}
}
