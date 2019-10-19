/**
 * 
 */

/**
 * @author Abhisaran
 *
 */
import java.util.Random;
import java.util.Scanner;

public class StopnWait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		int i,n,r;
		System.out.println("Enter the number of frames to send:");
		n=s.nextInt();
		for(i=0;i<n;i++)
		{ 
			r=rand.nextInt(10);
			System.out.println("Sending frame number " +(r+1));
				
		}
s.close();
	}

}
