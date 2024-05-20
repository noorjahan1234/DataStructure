package com.ReverseLinkedList;

class Node{

	int data;
	Node next;
	//Constructor to initialize the node with data
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
 public class ReverseLinkedList{
		//Function to reverse the linked list
		public static Node reverse(Node head) {
		Node previous=null;
		Node current=head;
		Node next=null;
		while(current!=null) {
			//store next node
			next=current.next;
			//Reverse current nodes pointer
			current.next=previous;
			//Move previous to this node
			previous=current;
			//Move to next node
			current=next;
		}
		//Move head to the last node in the original list
		head=previous;
		return head;
		}
		public static void printList(Node head) {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(6);
		System.out.println("Orignal Liked List: ");
		printList(head);
		head=reverse(head);
		System.out.println("Reversed Linked List :");
		printList(head);
	}

}	
	

