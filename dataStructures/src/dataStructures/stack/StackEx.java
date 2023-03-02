package dataStructures.stack;

public class StackEx {
	
	public int maxSize;
	public int size;
	public int stackArr[];
	public int top=-1;
	public  StackEx(int size) {
		this.maxSize=size;
		this.stackArr=new int[maxSize];
		System.out.println(stackArr.length);
	}
	
	public void push(int value)
	{
		//System.out.println(isFull());
		if(isFull())
		{
			System.out.println("stack is full");
		}
		else {
		top++;
		stackArr[top]=value;
		}
		//System.out.println(top);
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		else {
		int old_top=top;
		top--;
		return this.stackArr[old_top];
		}
	}
	
	public int peak()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		return this.stackArr[top];
	}
	
	public boolean isEmpty()
	{
		return this.top==-1;
	}
	
	public boolean isFull()
	{
		//System.out.println(top);
		return this.maxSize-1==top;
	}

}
