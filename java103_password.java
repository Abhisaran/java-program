import java.util.Scanner;
public class java103_password {

	public static void main(String[] args) {
			String str1="Password";
			String str2;
			Scanner receive = new Scanner(System.in);
			System.out.println("Enter the password :");
			str2 = receive.nextLine();
			if ( str1.equals(str2))
					System.out.println("Correct.");
			else
				System.out.println("Access denied.");
			
		// TODO Auto-generated method stub

	}

}
