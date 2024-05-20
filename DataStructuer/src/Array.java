import java.util.Scanner;

public class Array 
{
	private int arr[];
	//private Scanner only access same class
	private Scanner sc=new Scanner(System.in);
	//create constructor
	public Array(int n)
	{
		arr=new int[n];
	}
	//insert
	public void insert()
	{
		System.out.println("Enter the posstion for 0 to " +arr.length);
		int pos=sc.nextInt();
		System.out.println("Enter the element");
		int elem=sc.nextInt();
		arr[pos]=elem;
	}
	//create delete part
	public void delete()
	{
		System.out.println("Enter the postion to be delete the elements");
		int pos=sc.nextInt();
		System.out.println("Element delete is "+arr[pos]);
		arr[pos]=0;
	}
	//displaying the array
	public void display()
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
