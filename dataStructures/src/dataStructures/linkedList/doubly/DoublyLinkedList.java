package dataStructures.linkedList.doubly;

public class DoublyLinkedList {
	public Node head;
	public void insert(int data)
	{
		Node node=new Node();
		node.data=data;
		if(head==null)
		{
			node.next=null;
			node.pre=head;
			head=node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			node.pre=temp;
			temp.next=node;
			node.next=null;
		}
	}
	
	
	public void delete(int data)
	{
		Node node=head;
		int count=0;
		while(node.next!=null)
		{
			if(node.data==data)
			{
				break;
			}
			count++;
			node=node.next;
		}
		Node temp=node.pre;
		temp.next=node.next;
		Node temp1=node.next;
		temp1.pre=node.pre;
		
	}
	
	
	public void insertBetween(int new1,int old)
	{
		Node newNode=new Node();
		newNode.data=new1;
		Node node=head;
		while(node.next!=null)
		{
			if(node.data==old)
			{
				break;
			}
			node=node.next;
		}
		Node temp=node.next;
		newNode.pre=node;
		node.next=newNode;
		temp.pre=newNode;
		newNode.next=temp;
	}
	public void display()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	public void update(int newData,int oldData)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			if(temp.data==oldData)
			{
				temp.data=newData;
				break;
			}
			temp=temp.next;
		}
	}
	
	public void deleteLast()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		Node node=temp.pre;
		node.next=null;
	}
}
