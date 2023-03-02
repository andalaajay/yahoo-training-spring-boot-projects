package dataStructures.stack;

public class App {
	
	public static void main(String args[])
	{
		
		StackEx stack=new StackEx(5);
		
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		
		
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
		System.out.println(stack.peak());
	}

}
