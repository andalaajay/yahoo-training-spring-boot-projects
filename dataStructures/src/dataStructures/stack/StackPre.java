package dataStructures.stack;

import java.util.Stack;

public class StackPre
{
	
	public static void main(String args[])
	{
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		System.out.println("items in the stack"+stack);
		stack.pop();
		stack.push(300);
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.stream().filter(i->i<300).forEach(System.out::println);
	}

}
