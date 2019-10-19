
public class Typecast {

	public static void main(String args[]) {
		byte b;
		int i=257;
		double d=323.142;
		System.out.println("Conversion of int to byte");
		b = (byte) i;
		System.out.println("i and b" +i+ " "+b);
		System.out.println("Conversion of double to int");
		i = (int) d;
		System.out.println("i and d" +i+ " "+d);
		System.out.println("Conversion of double to byte");
		b = (byte) d;
		System.out.println("d and b" +d+ " "+b);
		
		// TODO Auto-generated method stub

	}

}
