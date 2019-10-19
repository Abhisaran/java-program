
class stack12 {
	int stck[]=new int [10];
	int top;
	stack12()
	{ 
		top=-1;
		
	}
	void push(int item)
	{ 
		if(top == 9)
		{
		System.out.println("Stack is full");
		}
		else {
			 stck[++top]=item;
		}
	
	}
	int pop()
	{
		if( top < 0)
		{
			System.out.println("Stack underflow");
		return 0;
		}
		else {
			 return stck[top--]; 
		}
	}
	
}
class Stack2
{
	public static void main(String args[]) 
	{
		// TODO Auto-generated method stub
		 stack12 s1 = new stack12();
		 stack12 s2 = new stack12();
		 
		 for(int i=0;i<10;i++) s1.push(i);
		 for(int i=10;i<20;i++) s2.push(i);
		 
		 System.out.println("Stack in s1 :");
		 for(int i=0;i<10;i++)
			 System.out.println(s1.pop());
		 System.out.println("Stack in s1 :");
		 for(int i=0;i<10;i++)
			 System.out.println(s2.pop());
		
			 
	}

}

