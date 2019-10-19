import java.util.Scanner;
public class pass105 {
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n,m;
		
		Scanner get = new Scanner(System.in);
		System.out.println("Enter the choice of type of number to be entered :");
		System.out.println("1)Binary \n 2)Decimal \n 3)Octal \n 4)Hexadecimal");
		n=get.nextInt();
		switch(n)
		{ 
		case 1: System.out.println("Enter the number in Binary:");
		num=get.nextInt();
		binary(num);
		break;
		case 2: System.out.println("Enter the number in Decimal:");num=get.nextInt();
		decimal(num);
		break;
		case 3: System.out.println("Enter the number in Octal:");num=get.nextInt();
		octal(num);
		break;
		case 4: System.out.println("Enter the number in Hexadecimal :");num=get.nextInt();
		hexadeci(num);
		break;
		default: System.out.println("Enter the correct choice");

		}
		
		
		
		
	}
			static void decimal(int x)
			{ 
				int a,m,temp=x,i=0;
				int[] b = new int [4];
								Scanner get = new Scanner(System.in);
				System.out.println("Enter the choice of type of number to be converted:");
				System.out.println("1)Binary \n  2)Octal \n 3)Hexadecimal");
				m=get.nextInt();
				switch(m)
				{ 
				case 1: while(temp!=0)
						{
							 a=temp%2;
							 if(a==0)
								 a=1;
							 else
								 a=0;
							 
							 System.out.print(a);
							 temp=temp/2;
						}
				break;
				case 2: while(temp!=0)
				{
					a=temp%8;
					b[i]=a; 
					i++; 
					temp=temp/8;
				}
				for(;i>=0;i--)
				{
					System.out.print(b[i]); 
				}
				break;
				case 3: while(temp!=0)
				{
					a=temp%16;
					b[i]=a; 
					i++; 
					temp=temp/16;
				}
				
				break;
				}
			}
			static void binary(int x)
			{
				int m;
				Scanner get = new Scanner(System.in);
				System.out.println("Enter the choice of type of number to be converted:");
				System.out.println("1)Decimal \n 2)Octal \n 3)Hexadecimal");
				m=get.nextInt();
			}
			static void octal(int x)
			{
				int m;
				Scanner get = new Scanner(System.in);
				System.out.println("Enter the choice of type of number to be converted:");
				System.out.println("1)Binary \n 2)Decimal \n 3)Hexadecimal");
				m=get.nextInt();
			}
			static void hexadeci(int x)
			{
				int m;
				Scanner get = new Scanner(System.in);
				System.out.println("Enter the choice of type of number to be converted:");
				System.out.println("1)Binary \n 2)Decimal \n 3)Octal \n ");
				m=get.nextInt();
				
			}

}



