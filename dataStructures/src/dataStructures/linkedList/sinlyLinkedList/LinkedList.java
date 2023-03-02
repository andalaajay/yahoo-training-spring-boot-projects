package dataStructures.linkedList.sinlyLinkedList;

public class LinkedList 
{

	public Node head;// refers to first node in the list

	public void insert(int data)
	{
		//creating eah new nnoide at every time then assigning data and address to it
		Node node=new Node();
		node.data=data;
		node.next=null;
		//checking if head is null or not if head is null then assigning first node to head
		if(head==null)
		{
			head=node;
			System.out.println(head.data);
			System.out.println(node.data);
//			System.out.println(head);
//			System.out.println(head.next);
			//System.out.println(head.next);//expecting null;
		}
		else
		{
			Node temp=head;//for traversing from first to last we asssign it to temp
			System.out.println("nvjfe"+temp.next);
			while(temp.next!=null)//while will get the last node in list
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	//to display all elements in the linkedlist
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
	
	
	//to insert between two nodes based on value
	public void insertBetweenTwo(int new1,int exist)
	{
		if(head==null)
			System.out.println("cannot insert elements because list is null");
		else
		{
			Node temp=head;
			Node newNode=new Node();
			newNode.data=new1;
			while(temp.next!=null)
			{
				if(temp.data==exist)
				{
					//System.out.println("checking if in the while"+temp.data);
					Node node=temp.next;
					temp.next=newNode;
					newNode.next=node;
					break;
				}
				temp=temp.next;
			}
		}
		
	}
	
	public void delete(int data) {
		Node temp=head;
		//Node old=new Node();
		int count=0;
		Node old=new Node();
		while(temp.next!=null)
		{
			if(temp.data==data)
			{
				break;
			}
			temp=temp.next;
			count++;
		}
		old.next=temp.next;
		temp=head;
		System.out.println(count);
		for(int i=0;i<count-1;i++)
		{
			temp=temp.next;
		}
		temp.next=old.next;
		System.out.println("temp-->"+temp.data);
		
	}
	public void update(int new1,int old) {
		Node node=head;
		while(node.next!=null)
		{
			if(node.data==old)
			{
				node.data=100;
				break;
			}
			node=node.next;
		}
	}

}
