
public class foreach {

	public static void main(String args[]) {
			int num[] = {1,2,3,34,5,6,7,8,9,10,24};
			int sum = 0;
			for(int x: num)
			{
				 System.out.println("The value is :" + x );
				 sum+=x;
				 }
			System.out.println("Summation :"+sum);
		// TODO Auto-generated method stub

	}

}
