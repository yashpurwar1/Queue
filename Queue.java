package queue;

public class Queue {
	
	MyNode front, rear;
	public Queue()
    {
        this.front = this.rear = null;
    }
	
	public void enqueue(int data)
    {
  
        // Create a new LL node
        MyNode temp = new MyNode();
        temp.data = data;
        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
  
        // Add the new node at the end of queue and change rear
        this.rear.next = temp;
        this.rear = temp;
    }

}
