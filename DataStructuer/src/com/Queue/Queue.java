package com.Queue;

import java.util.Scanner;

public class Queue 
{
	private int q[];
	private int size;
	private int r=-1;
	private int f;
	public Queue(int n)
	{
		q=new int[n];
		size=q.length;
	}
	private Scanner sc=new Scanner(System.in);
	public void insert()
	{
		int elem;
		if(r==size-1)
		{
			System.out.println("insertion not possible");
		}
		else
		{
			System.out.println("Enter the element");
			elem=sc.nextInt();
			r++;
			q[r]=elem;
		}
	}
	public void delete()
	{
		if(r==-1 || f>r)
		{
			System.out.println("Delection not possible");
		}
		else
		{
			System.out.println("Enter the element delete "+q[f]);
			f++;
		}
	}
	public void display()
	{
		if(r==-1 || f>r)
		{
			System.out.println("display not possible");
		}
		else
		{
			for(int i=f; i<=r; i++)
			{
				System.out.print(q[f]+" ");
			}
			System.out.println();
		}
	}
}
