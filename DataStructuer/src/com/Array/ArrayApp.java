package com.Array;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size array");
		int n=sc.nextInt();
		Array a=new Array(n);
		while(true)
		{
			System.out.println("presse 1________insert");
			System.out.println("Presse 2_________delete");
			System.out.println("presse 3_________display");
			System.out.println("Presse any number_____stop");
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1 : a.insert();
			break;
			
			case 2 : a.delete();
			break;
			
			case 3 : a.display();
			break;
			
			default : System.exit(0);
			}
		}
	}

}

