package com.Stack;

import java.util.Scanner;

public class Stack1App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stack size");
		int n=sc.nextInt();
		Stack1 st=new Stack1(n);
		while(true)
		{
			System.out.println("Press 1_________Push");
			System.out.println("Press 2_________Pop");
			System.out.println("Press 3_________display");
			System.out.println("Press any othe number exst");
			int choise=sc.nextInt();
			switch(choise)
			{
			case 1 : st.push();
			break;
			
			case 2 : st.pop();
			break;
			
			case 3: st.display();
			break;
			
			default : System.exit(0);
			}
		}
	}
}
