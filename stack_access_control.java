class Stack
{
	 private int stck[];
	 private int top;
	 Stack()
	 {
		  top=-1;
		  
	 }
	 void push(int item)
	 {
		  if(top==9)
			  System.out.println("Stack is full");
	 	 
	 else 
	 {
		 stck[++top]= item;
	 }
	 }
	 int pop()
	 {
		 if (top==-1)
		 {
			  System.out.println("Stack underflow");
		 return 0;
		 }
		 else
		  return stck[top--];
	 }
}
public class stack_access_control {
			public static void main(String args[])
			{
				 Stack s1 = new Stack();
				 Stack s2 = new Stack();
				 
				 for(int i=0;i<10;i++) s1.push(i);
				 for(int i=10;i<20;i++) s2.push(i);
				 
				 System.out.println("Stack in s1 :");
				 for(int i=0;i<10;i++)
					 System.out.println(s1.pop());
				 System.out.println("Stack in s1 :");
				 for(int i=0;i<10;i++)
					 System.out.println(s2.pop());
			//These are illegal
				 //s1.top=10
				 //s2.stck[]=100
			}
}
