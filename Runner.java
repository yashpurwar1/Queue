package queue;

public class Runner {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		System.out.println("Front= " +queue.front.data);
		System.out.println("Rear= " +queue.rear.data);
		queue.dequeue();
		System.out.println("After first dequeue");
		System.out.println("Front= " +queue.front.data);
		System.out.println("Rear= " +queue.rear.data);
		queue.dequeue();
		System.out.println("After second dequeue");
		System.out.println("Front= " +queue.front.data);
		System.out.println("Rear= " +queue.rear.data);
		queue.dequeue();
	}

}
