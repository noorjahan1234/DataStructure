package com.Queue;

import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Queue ");
		int n=sc.nextInt();
		Queue q=new Queue(n);
		while(true)
		{
			System.out.println("presse 1____________insert");
			System.out.println("Presse 2____________delete");
			System.out.println("Presse 3____________Display");
			System.out.println("presse any number Stop");
			System.out.println("Enter our chosie");
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1 :  q.insert();
			break;
			
			case 2: q.delete();
			break;
			
			case 3: q.display();
			break; 
			
			default : System.exit(0);
			}
		}
	}

}
