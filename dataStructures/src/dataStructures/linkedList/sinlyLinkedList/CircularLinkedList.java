package dataStructures.linkedList.sinlyLinkedList;

public class CircularLinkedList {
	
	Node head=null;
	Node tail=null;
	
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		if(head==null)
		{
			head=node;
			tail=node;
			node.next=head;
		}
		else
		{
			tail.next=node;
			tail=node;
			tail.next=node;
		}
	}
	
	public void display()
	{
		if(head==null)
			System.out.println("list is empty");
		
		else
		{
			Node temp=head;
			while(temp!=tail)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
		
	}
}
