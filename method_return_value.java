class Box1
{
	 double length;
	 double width;
	 double height;
	 	double volume()
	 	{ 
	 		return length*height*width;
	 			 	}
}
public class method_return_value {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		double vol;
		Box1 b1 = new Box1();
		Box1 b2 = new Box1();
		
		b1.height=10;
		b1.length=15;
		b1.width=20;
		
		b2.height=5;
		b2.length=3;
		b2.width=2;
		
		vol=b1.volume();
		System.out.println("The volume of box1 is " + vol);
		vol=b2.volume();
		System.out.println("The volume of box2 is " + vol);
		
		b2.volume();
	}

}
