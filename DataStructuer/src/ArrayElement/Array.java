package ArrayElement;

import java.util.Scanner;

public class Array 
{
	private int arr[];
	private Scanner sc=new Scanner(System.in);
	public Array(int n)
	{
		arr=new int[n];
	}
	///inserted the array
	public void insert()
	{
		System.out.println("Enter the index 0 to element: "+arr.length);
		int index=sc.nextInt();
		System.out.println("Enter the elemnet");
		int elem=sc.nextInt();
		arr[index]=elem;
	}
	//delete the array
	public void delete()
	{
		System.out.println("Enetr the index delete the element");
		int index=sc.nextInt();
		arr[index]=0;
	}
	//displaying Array
	public void display() {
		System.out.println("The Displaying the array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
