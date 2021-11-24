package com.bridgelabz.stackpractice.queue;

import com.bridgelabz.stackpractice.stack.LinkedList;
import com.bridgelabz.stackpractice.stack.Node;

public class Queue {
	private int size;
	LinkedList linkedList=new LinkedList();

	
	public void enqueue(int data) {
		linkedList.append(data);
		size++;
	}
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Stack is empty no element to delete");
		}
		else {
			linkedList.pop();
			size--;
		}	
	}
	public void displayQueue() {
		System.out.println("Queue is : ");
		linkedList.displayLinkedList();
	}

	public void size() {
		System.out.println("Queue size : " + size);
	}
	public boolean isEmpty() {
		return size==0;
	}

}
