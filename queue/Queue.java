package com.bridgelabz.stackpractice.queue;

import com.bridgelabz.stackpractice.stack.LinkedList;

public class Queue {
	private int size;
	LinkedList linkedList= new LinkedList();
	
	public void enquee(int data) {
		linkedList.append(data);
		size++;
	}
	public void displayQueue() {
		System.out.println("Queue is : ");
		linkedList.displayLinkedList();
	}

	public void size() {
		System.out.println("Queue size : " + size);
	}

}
