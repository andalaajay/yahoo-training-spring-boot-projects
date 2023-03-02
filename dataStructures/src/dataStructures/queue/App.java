package dataStructures.queue;

public class App {

	public static void main(String[] args) {
		Queue queue=new Queue(5);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.view();
		queue.remove();
		System.out.println("after first delete");
		queue.view();
		queue.add(40);
		System.out.println("after adding one element");
		queue.add(40);
		queue.view();
		queue.remove();
		System.out.println("after removing second element");
		queue.view();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println("after removing all");
		queue.view();
	}

}
