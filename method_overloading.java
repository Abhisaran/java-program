
class overload
{
	 void test()
	 {
		  System.out.println("No parameters");
	 }
	 void test(int a)
	 {
		  System.out.println("a:" + a);
	 }void test(int a,int b)
	 {
		  System.out.println("a and b :"+ a +" " + b);
	 }
	 double test(double a)
	 {
		  System.out.println("double a :" + a);
		  return a*a;
	 }
}
public class method_overloading {
	public static void main(String args[])
	{
		 overload o = new overload();
		 double res;
		 o.test();
		 o.test(10);
		 o.test(34, 23);
		 res = o.test(23.5);
		 System.out.println("The result is :");
		 System.out.print(+res );
	}
}
