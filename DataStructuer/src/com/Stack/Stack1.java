package com.Stack;

import java.util.Scanner;

public class Stack1
{
	private int s[];
	private int size;
	private int top=-1;
	private Scanner sc=new Scanner(System.in);
	public Stack1(int n)
	{
		s=new int[n];
		size=s.length;
	}
	public void push()
	{
		int elem;
		if(top==size-1)
		{
			System.out.println("push is not posible");
		}
		else
		{
			System.out.println("Enter an element");
			elem=sc.nextInt();
			top++;
			s[top]=elem;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("pop is not posible");
		}
		else
		{
			System.out.println("Element delete is "+s[top]);
			top--;
		}
	}
	public void display() {
		if(top==-1)
		{
			System.out.println("Display not posible");
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
