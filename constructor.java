class Box123
{
	double width;
	double height;
	double depth;
	
	Box123()
	{
		System.out.println("Constructing box"); 
		width = 10;
		 height = 20;
		 depth = 43;
		 
	}
	double volume()
	{
	return height*depth*width;	
	}
	}
/**
 * 
 */

/**
 * @author Admin
 *
 */
public class constructor {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Box123 b1 = new Box123();
		
		System.out.println("THe volume of box is " + b1.volume());
	}

}
