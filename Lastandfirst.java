import java.util.Scanner;
public class Lastandfirst {
public static void main(String args[]) {
	int start, end,lim;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the limit:");
	lim=scan.nextInt();
	int arr[] = new int[lim];
	System.out.println("Enter the values");
	for(int itr=0;itr<lim;itr++) {
		arr[itr]=scan.nextInt();
	}
}
}
