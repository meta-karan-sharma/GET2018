
/**
 * Abstract class which contains methods to find details of tag
 * 
 * @author Karan Sharma
 */
package assignment_1;

abstract class Element 
{
	// id of tag
	String id;
	// class of tag
	String className;
	/**
	 * Constructor for initializing values
	 *  
	 * @param id
	 * @param className
	 */
	public Element (String id, String className) 
	{
		// initializing id
		this.id = id;
		// initializing class name
		this.className = className;
	}
	
	/**
	 * returns id of a particular tag
	 * 
	 * @return
	 */
	public String getId () 
	{
		return id;
	}
	
	/**
	 * returns class name of a particular tag
	 * 
	 * @return
	 */
	public String getClassName () 
	{
		return className;
	}
	
	/**
	 * for checking instance of element
	 *  
	 * @return
	 */
	public boolean has_instance () 
	{	
		// by default value is false
		return false;
	}	
}
