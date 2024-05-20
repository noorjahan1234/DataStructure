package com.CycleDetection;

class Node{
	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
}
public class CycleDetection {

	public static boolean hasCycle(Node head) {
		if(head == null || head.next == null) {
			return false;
		}
		Node tortoise=head;
		Node hare = head.next;
		while(tortoise != hare) {
			if(hare == null || hare.next == null) {
				//hare reached the end without looping
				return false;
			}
			tortoise = tortoise.next;
			hare = hare.next.next;
		}
		//if tortoise and hare meet, there a cycle
		return true;
		
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		System.out.println("Has Cycle: "+hasCycle(head));
		//Introducing a cycle: Node 4 points back to Node
		head.next.next.next.next = head.next;
		System.out.println("Has Cycle: "+hasCycle(head));
	}

}
