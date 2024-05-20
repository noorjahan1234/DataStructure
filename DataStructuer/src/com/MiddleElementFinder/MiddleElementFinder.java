package com.MiddleElementFinder;

class Node{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}
public class MiddleElementFinder {

	public static int findMiddle(Node head) {
		if(head == null) {
			//return -1 or throw an exception based on use-case
			return -1;
		}
		Node slow= head;
		Node fast=head;
		while(fast != null && fast.next != null) {
			slow=slow.next; //Move one step
			fast=fast.next.next; //Move two step
		}
		return slow.data;
	}
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		System.out.println("Find Middile element: "+findMiddle(head));
		head.next.next.next.next.next=new Node(6);
		System.out.println("Find Middile element: "+findMiddle(head));
	}

}
