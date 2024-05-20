package com.Stack;

import java.util.Scanner;

public class Stack
{
	private int s[];
	private int size;
	private int top=-1;
	private Scanner sc=new Scanner(System.in);
	//create constructor
	public Stack(int n)
	{
		s=new int[n];
		size=s.length;
		
	}
	
	public void push()
	{
		int elem;
		if(top==size-1)
		{
			System.out.println("push not possible");
		}
		else
		{
			System.out.println("Enter the element");
			elem=sc.nextInt();
			top++;
			s[top]=elem;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("pop is not possible");
		}
		else
		{
			System.out.println("element deleted is:" +s[top]);
			top--;
		}
	}
	//Display the Stack
	public void display()
	{
		if(top==-1)
		{
			System.out.println("display not posible");
		}
		else
		{
			for(int i=top; i>=0; i--)
			{
				System.out.println(s[i]);
			}
		}
	}
}
