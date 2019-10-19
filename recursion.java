class factorial
{
	int fact(int n)
	{
		int fact1;
		if(n==1) return 1;
		else 
		{
			
		fact1 = fact(n-1)*n;
		return fact1;
		}
		}
}
public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f = new factorial();
		
		System.out.println(" the factorial of 5 is " + f.fact(5));
		
	}

}
