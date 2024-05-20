package com.Array;

import java.util.Scanner;

public class Array
{
	private int arr[];
	private Scanner sc=new Scanner(System.in);
	public Array(int n)
	{
		arr=new int[n];
	}
	//insert part
	public void insert()
	{
		System.out.println("Enter index is 0 to "+arr.length);
		int index=sc.nextInt();
		System.out.println("Enter elements");
		int elem=sc.nextInt();
		arr[index]=elem;
	}
	//delete part
	public void delete()
	{
		System.out.println("Enter the index delete the element");
		int index=sc.nextInt();
		System.out.println();
		System.out.println("Delet the element "+arr[index]);
		arr[index]=0;
	}
	public void display()
	{
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
