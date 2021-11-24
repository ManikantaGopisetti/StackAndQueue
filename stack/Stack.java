package com.bridgelabz.stackpractice.stack;

public class Stack {

	private int size;
	LinkedList linkedList = new LinkedList();

	public void push(int data) {
		linkedList.insertFirst(data);
		size++;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println(linkedList.head.key);
		}
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty no element to delete");
		}
		else {
			System.out.println(linkedList.head.key);
			linkedList.pop();
			size--;
		}	
	}

	public void displayStack() {
		System.out.println("stack is : ");
		linkedList.displayLinkedList();
	}

	public void size() {
		System.out.println("stack size : " + size);
	}
	public boolean isEmpty() {
		return size==0;
	}
}
