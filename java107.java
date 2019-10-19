import java.util.Scanner;
public class java107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		Boxes b1 = new Boxes(b.nextInt(),b.nextInt(),b.nextInt());
		Boxes b2 = new Boxes();
		Boxes b3 = new Boxes(7);
		
		System.out.println("The volume of box1 is " + b1.volume());
		System.out.println("The volume of box2 is " + b2.volume());
		System.out.println("The volume of box3 is " + b3.volume());
	}
}


