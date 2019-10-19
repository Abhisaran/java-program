import java.util.Scanner;
class operations
{
	void add(int x, int y)
	{
		System.out.println("Addition of the two numbers :" + (x+y));
	}
	void sub(int x, int y)
	{
		System.out.println("Subtraction of the two numbers :" +  (x-y) );

	}
	void mul(int x, int y)
	{
		System.out.println("Multiplication of the two numbers :" +(x*y));
	}
	void div(int x, int y)
	{
		System.out.println("Division of the two numbers :" +(x/y));
	}
	void mod(int x, int y)
	{
		System.out.println("Modulo Division of the two numbers :" +(x%y));
	}
	
}
public class calc {

	public static void main(String args[]) {
		int a,b,ch;
		int s=1;
		Scanner get = new Scanner(System.in);
		operations opac = new operations();
		System.out.println(" ***************CALCULATOR******************");
		System.out.println("Enter two numbers :");
		a=get.nextInt();
		b=get.nextInt();
		while(s==1)
		{
			System.out.println("Enter your choice :");
			System.out.println("1) ADDITION");
			System.out.println("2) SUBTRACTION");
			System.out.println("3) MULTIPLICATION");
			System.out.println("4) DIVISION");
			System.out.println("5) MODULO DIVISION");
			System.out.println("6) EXIT");
			ch=get.nextInt();
			
			switch(ch)
		{
		case 1 : opac.add(a,b);
		break;
		case 2: opac.sub(a,b);
		break;
		case 3 : opac.mul(a,b);
		break;
		case 4: opac.div(a,b);
		break;
		case 5 : opac.mod(a,b);
		break;
		default : System.out.println("Sorry invalid input.");
		break;
		
		}
		System.out.println("Do you want to continue :press  1 or 0");
		s=get.nextInt();
		}
				
		
		
		// TODO Auto-generated method stub

	}

}
