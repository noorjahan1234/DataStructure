package Circular;

import java.util.Scanner;

public class CircularQueue 
{
	private int cq[];
	private int size;
	private int r=-1;
	private int f;
	private int count=0;
	private Scanner sc=new Scanner(System.in);
	public CircularQueue(int n)
	{
		cq=new int[n];
		size=cq.length;
	}
	public void insert()
	{
		int elem;
		if(count==size)
		{
			System.out.println("Insertion not posibel");
		}
		else
		{
			System.out.println("Enter the element");
			elem=sc.nextInt();
			r=(r+1)%size;
			cq[r]=elem;
			count++;
		}
	}
	public void delete()
	{
		if(count==0)
		{
			System.out.println("Deletion not posibel");
		}
		else
		{
			System.out.println("Deleted element is: "+cq[f]);
			f=(f+1)%size;
			count--;
		}
	}
	public void display()
	{
		int f1=f;
		if(count==0)
		{
			System.out.println("Displaying not posibel");
		}
		else
		{
			for(int i=1; i<=count; i++)
			{
			System.out.print(cq[f1]+" ");
			f1=(f1+1)%size;
			}
			System.out.println();
		}
	}
}
