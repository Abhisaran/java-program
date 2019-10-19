import java.util.Scanner;
public class time_difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		time t3=new time();
		time t1= new time();
		time t2=new time();
		Scanner get = new Scanner(System.in);
		t1.gettime(t1.h,t1.m,t1.s);
		t2.gettime(t2.h,t2.m,t2.s);
		t3.difference(t1,t2);
		t3.disp();
		
	}
	
}
class time
{
	static int h;
	static int m;
	static int s;
	static Scanner red = new Scanner(System.in);
	
	public static void gettime(int h,int m,int s ){
		System.out.println("Enter the time in the format HH:MM:SS");
		h=red.nextInt(); m=red.nextInt();s=red.nextInt();
			
		
	}
	public static void disp()
	{
		 System.out.println("The time difference is "+h+":"+m+":"+s);
	}
	public static time difference(time t1,time t2)
	{
		time t=new time();
		t.h=t1.h-t2.h;
		t.m=t1.m-t2.m;
		t.s=t1.s-t2.s;
		System.out.println("The time difference is "+t.h+":"+t.m+":"+t.s);
		return t;
		
	}
}