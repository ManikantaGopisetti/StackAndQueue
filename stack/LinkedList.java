package com.bridgelabz.stackpractice.stack;

public class LinkedList {
	Node head;

	public void insertFirst(int data) {
		Node node = new Node(data);
		node.next=head;
		head = node;
	}

	public void append(int data) {
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		Node node = new Node(data);
		currentNode.next=node;
	}

	public void insertBetween(int first, int value) {
		Node currentNode = head;
		Node temp = null;
		while (currentNode != null) {
			if (currentNode.key == first) {
				temp = currentNode;
			}
			currentNode = currentNode.next;
		}
		if(temp ==null) {
			System.out.println("No node found with te value "+first);
			return;
		}
		Node node = new Node(value);
		node.next = temp.next;
		temp.next=node;
	}

	public void pop() {
		head = head.next;
	}

	public void popLast() {
		Node currentNode = head;
		Node tail = null;
		while (currentNode.next != null) {
			tail = currentNode;
			currentNode = currentNode.next;
		}
		tail.next = currentNode.next;
	}

	public Node findNode(int data) {
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.key == data) {
				System.out.println("Node with value " + data + " is : " + currentNode.next);
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		System.out.println("No node found with value " + data);
		return null;
	}

	public void delete(int data) {
		Node currentNode = head;
		Node tail = null;
		while (currentNode.next != null) {
			if (currentNode.key == data) {
				tail.next = currentNode.next;
				return;
			}
			tail = currentNode;
			currentNode = currentNode.next;
		}
		System.out.println("No node found with value " + data);
	}

	public void displayLinkedList() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.key + "-->");
			currentNode = currentNode.next;
		}
		System.out.println("\n");
	}

}
