/**
 * 
 */

/**
 * @author Admin
 *
 */
class Box
{
	 double length;
	 double width;
	 double height;
	 	void volume()
	 	{ 
	 		System.out.println("The volume is ");
	 		System.out.println(length*height*width);
	 			 	}
}
public class method_in_class {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		Box b2 = new Box();
		
		b1.height=10;
		b1.length=15;
		b1.width=20;
		
		b2.height=5;
		b2.length=3;
		b2.width=2;
		
		b1.volume();
		b2.volume();
		
	}

}
