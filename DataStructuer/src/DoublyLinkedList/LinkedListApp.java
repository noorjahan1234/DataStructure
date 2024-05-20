package DoublyLinkedList;

import java.util.Scanner;

public class LinkedListApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		while(true)
		{
			System.out.println("Presse 1_____________insertFront");
			System.out.println("Presse 2______________DeleteFront");
			System.out.println("Presse 3_____________insertRear");
			System.out.println("Presse 4______________DeleteRear");
			System.out.println("Presse 5______________DisplayFoeword");
			System.out.println("Presse 6______________DisplayReverse");
			System.out.println("aenter any one stop");
			System.out.println("Enter your choise");
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1 : ll.insertFront();
			break;
			
			case 2 : ll.deleteFront();
			break;
			
			case 3: ll.insertRear();
			break;
			
			case 4: ll.DeleteRear();
			break;
			
			case 5 : ll.displayFrword();
			break; 
			
			case 6 : ll.displayReverse();
			break;
			
			default : System.exit(0);
			}
		}
	}

}
