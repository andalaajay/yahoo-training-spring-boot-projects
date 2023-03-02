package dataStructures.linkedList;

public class App {
	
	public static void main(String args[])
	{
		Node nodeA=new Node();
		nodeA.data=4;
		Node nodeB=new Node();
		nodeB.data=5;
		Node nodeC=new Node();
		nodeC.data=6;
		Node nodeD=new Node();
		nodeD.data=7;
		Node nodeE=new Node();
		nodeE.data=7;
		System.out.println(nodeA.data);
		
		nodeA.next=nodeB;
		nodeB.next=nodeC;
		nodeC.next=nodeE;
		nodeE.next=nodeD;
		System.out.println(lengthCal(nodeA));
		System.out.println(lengthCal(nodeC));
	}
	
	public static int lengthCal(Node nodeA)
	{
		int length=0;
		//Node currentNode=nodeA;
		while(nodeA!=null)
		{
			length++;
			nodeA=nodeA.next;
		}
		return length;
	}

}
