package dataStructures.queue;

public class Queue {
	
	public int queue[];
	public int size;
	public int rear=-1;
	public int front=0;
	public int maxCap;
	public int cap=-1;
	public Queue(int size)
	{
		 maxCap=size;
		queue=new int[size];
	}
	
	public void add(int value)
	{
		if(rear==maxCap-1)
		{
			System.out.println("maximum capacity cannot add value into queue");
		}
		else {
		rear++;
		queue[rear]=value;
		cap++;
		}
	}
	
	public void view()
	{
		//System.out.println("cap size"+cap+"front="+front);
		//System.out.println("elements in the queue are");
		for(int i=front;i<=rear;i++)
		{
			System.out.println(queue[i]);
		}
	}
	
	public int remove()
	{
		if(isEmpty()) {
			System.out.println(isEmpty());
			System.out.println("cannot remove queue is empty");
			return -1;
		}
		else {
		int removed=queue[front];
		front++;
		cap--;
		return removed;
		}
	}
	
	public boolean  isEmpty()
	{
		return (cap==0);
	}
	
	public boolean isFull()
	{
		return rear==size-1;
	}
}
