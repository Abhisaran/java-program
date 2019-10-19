import java.util.Random;
public class dice_randomnumber {
	public static void main(String args[])
	{
		Random dice =new Random();
		int num;
		for(int c=1;c<10;c++)
		{
			num=1+dice.nextInt(6); 
			System.out.println(num);
		}
	}
}
