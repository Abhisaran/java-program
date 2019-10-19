class test 
{
	 int a;
	 public int b;
	 private int c;
	 void setc(int i)	
	 {
		 c=i;
	 }
	 int getc()
	 {
		  return c;
	 }
}
public class access_control {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		test ac = new test();
		
		ac.a = 10;
		ac.b = 20;
		
		ac.setc(100);
		System.out.println("a, b, c are : "+ ac.a+" "+ac.b+" "+ac.getc());
		
	}

}
