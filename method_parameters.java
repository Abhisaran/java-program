class box2	
{
	 double width;
	 double height;
	 double length;
	 
	 double volume()
	 {
		return width*height*length;  
 	 }
	 //set dimensions of a box
	 void set_dim(double w,double h,double l)
	 {
		 width = w;
		 height = h;;
		 length = l;  
	 }
}
public class method_parameters {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		box2 b1 = new box2();
		box2 b2 = new box2();
		double vol;
		
		b1.set_dim(5,4,3);
		b2.set_dim(6,3,7);
		
		vol = b1.volume();
		System.out.println("Volume of box1 is " + vol);
		
		vol = b2.volume();
		System.out.println("Volume of box1 is " + vol);
		
		
		
	}

}
