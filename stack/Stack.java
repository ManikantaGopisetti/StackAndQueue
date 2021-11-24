package com.bridgelabz.stackpractice.stack;

public class Stack {

	private int size;
	LinkedList linkedList = new LinkedList();

	public void push(int data) {
		linkedList.insertFirst(data);
		size++;
	}

	public void displayStack() {
		System.out.println("stack is : ");
		linkedList.displayLinkedList();
	}

	public void size() {
		System.out.println("stack size : " + size);
	}
}
