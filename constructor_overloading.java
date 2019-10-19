
class Boxes
{
	double width;
	double height;
	double depth;
	
	Boxes(double w,double d,double l)
	{
		width=w;
		height=d;
		depth= l;
		
	} 
	Boxes(double a)
	{
		width=height=depth= a;
		 
	}	
	
	Boxes()
	{
		System.out.println("Constructing box"); 
		width = -1;
		 height = -1;
		 depth = -1;
		 
	}
	double volume()
	{
	return height*depth*width;	
	}
	
	

} 
public class constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boxes b1 = new Boxes(23,32,43);
		Boxes b2 = new Boxes();
		Boxes b3 = new Boxes(7);
		
		System.out.println("The volume of box1 is " + b1.volume());
		System.out.println("The volume of box2 is " + b2.volume());
		System.out.println("The volume of box3 is " + b3.volume());

	}

}
