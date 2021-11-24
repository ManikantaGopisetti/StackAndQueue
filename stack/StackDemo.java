package com.bridgelabz.stackpractice.stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();

		s.push(70);
		s.push(30);
		s.push(56);
		s.displayStack();
		s.peek();
		s.pop();
		s.pop();
		s.pop();
		s.displayStack();
		s.size();
		
	}
}
