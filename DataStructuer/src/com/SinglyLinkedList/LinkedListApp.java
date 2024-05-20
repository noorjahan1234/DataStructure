package com.SinglyLinkedList;

import java.util.Scanner;

public class LinkedListApp {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		while(true)
		{
			System.out.println("presse 1___________insertrear");
			System.out.println("presse 2___________deleterear");
			System.out.println("Presse 3___________insertFront");
			System.out.println("Presse 4___________deleteFront");
			System.out.println("Presse 5___________display");
			System.out.println("Enter your choise");
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1 : ll.insertrear();
			break;
			
			case 2 : ll.deleterear();
			break;
			
			case 3: ll.insertFront();
			break;
			
			case 4 : ll.deleteFront();
			break;
			
			case 5 : ll.display();
			break; 
			
			default : System.exit(0);
			}
		}
	}
}
