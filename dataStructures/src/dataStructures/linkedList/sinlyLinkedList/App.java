package dataStructures.linkedList.sinlyLinkedList;

public class App {
	
	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.display();
		list.insertBetweenTwo(20,10);
		System.out.println("after inserting between two elements ");
		list.display();
		list.delete(30);
		System.out.println("after deleting number 30 ");
		list.delete(40);
		list.display();
		System.out.println("after updating 50 to 100 in list");
		list.update(100, 50);
		list.display();
	}

}
