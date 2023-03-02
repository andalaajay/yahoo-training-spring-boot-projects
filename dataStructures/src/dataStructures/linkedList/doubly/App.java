package dataStructures.linkedList.doubly;

public class App {
	
	public static void main(String args[])
	{
		DoublyLinkedList list=new DoublyLinkedList();
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insert(60);
		list.display();
		list.delete(30);
		System.out.println("after deleting 30 list will be");
		list.display();
		
		System.out.println("after inserting 80 between 20 and 40");
		list.insertBetween(80,20);
		list.display();
		
		System.out.println("after updating 40 to 100");
		list.update(100, 40);
		list.display();
		System.out.println("deleting the last element");
		list.deleteLast();
		list.deleteLast();
		list.display();
	}

}
