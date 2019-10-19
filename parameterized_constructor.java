class boxx
{
	double height;
	double length;
	double depth;
	
	boxx(double h,double l,double d )
	{
		 height=h;
		 length = l;
		 depth = d;
				 
	}
		double volume()
		{
			 return depth*height*length;
			 
		}
}
public class parameterized_constructor {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		boxx b1 = new boxx(23,34,45);
		boxx b2 = new boxx(65,54,32);
		
		System.out.println("THe volume of box 1 is :" + b1.volume());
		System.out.println("THe volume of box 2 is :" + b2.volume());
		
		
	}

}
