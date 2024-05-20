package DoublyLinkedList;

import java.util.Scanner;

public class LinkedList
{
	Node temp;
	class Node
	{
		 Node prelink;
		 int data;
		 Node nextlink;
	};
	private Node first;
	private Scanner sc=new Scanner(System.in);
	
	//insert Front
	public void insertFront()
	{
		System.out.println("Enter the element");
		int elem=sc.nextInt();
		Node newnode=new Node();
		newnode.data = elem;
		newnode.prelink=null;
		newnode.nextlink=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			newnode.nextlink=first;
			first.prelink=newnode;
			first=newnode;
		}
	}
	//Delete Front
	public void deleteFront()
	{
		if(first==null)
		{
			System.out.println("Deletion not posible");
		}
		if(first.nextlink==null)
		{
			System.out.println("Element delete is "+first.data);
			first=null;
		}
		else
		{
			first=first.nextlink;
			first.prelink=null;
		}
	}
	//insert Rear
	public void insertRear()
	{
		System.out.println("Enter the element");
		int elem=sc.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.prelink=null;
		newnode.nextlink=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			temp=first;
			while(temp.nextlink!=null)
			{
				temp=temp.nextlink=newnode;
			}
			temp.nextlink=newnode;
			newnode.prelink=temp;
		}
	}
	//delete Rear
	public void DeleteRear()
	{
		if(first==null)
		{
			System.out.println("Deletion not possibel");
		}
		else if(temp.nextlink==null)
		{
			System.out.println("Element deleted is "+first.data);
			first=null;
		}
		else
		{
			temp=first;
			while(temp.nextlink.nextlink!=null)
			{
				temp=temp.nextlink;
			}
			System.out.println("Element deleted is "+temp.nextlink.data);
			temp.nextlink=null;
		}
	}
	// displayFrword
	public void displayFrword()
	{
		if(first==null)
		{
			System.out.println("Display Not Possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.nextlink;
			}
		}
		System.out.println();
	}
	//display Reverse
	public void displayReverse()
	{
		if(first==null)
		{
			System.out.println("Display not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp.nextlink!=null)
			{
				temp=temp.nextlink;
			}
			while(temp!=null)
			{
		System.out.print(temp.data+" ");
		temp=temp.prelink;
			}
		}
		System.out.println();
	}
}
