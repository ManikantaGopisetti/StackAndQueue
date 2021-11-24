package com.bridgelabz.stackpractice.queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		Queue queue= new Queue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.displayQueue();
		queue.size();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.displayQueue();
		queue.size();
		}

}
