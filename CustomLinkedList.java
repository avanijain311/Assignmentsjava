package com.monocept.test;

public class CustomLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(47);
		list.add(56);
		list.add(85);
		System.out.println("Adding in Linked List");
		list.display();
		list.addAtFirst(64);
		System.out.println("Adding at First in Linked List");
		list.display();
		list.addAtIndex(2,23);
		System.out.println("Adding at a specified index in Linked List");
		list.display();
		list.remove(1);
		System.out.println("Removing at a specified index in Linked List");
		list.display();
	}
}
class Node {
	int data;
	Node next;
}
class LinkedList {
	Node head;

	public void add(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;		
		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next=node;
		}
	}
	
	public void addAtFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null; //stop at last null
		
		node.next= head;
		head= node;
		}
	public void addAtIndex(int index,int data) {
		Node node = new Node();
		node.data = data;
		node.next = null; 
		if(index ==0) {
			addAtFirst(data);
		}
		else {
			Node current = head;
			for(int i=0;i<index-1;i++) { //Iterating a Linked List
				current = current.next;
			}
			node.next = current.next;
			current.next=node;
		}
	}
	public void remove(int index) {
		if(index ==0) {
			head = head.next;
		}
		else {
			Node current = head;
			for(int i=0;i<index-1;i++) {
				current = current.next;
			}
			Node temp= null;
			temp = current.next;
			current.next = temp.next;
			temp = null;
		}
	}
	
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(" "+ current.data);
			current = current.next;
		}
		System.out.println("");
	}
}