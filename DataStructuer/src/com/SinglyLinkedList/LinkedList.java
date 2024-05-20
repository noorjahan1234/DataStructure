package com.SinglyLinkedList;

import java.util.Scanner;

public class LinkedList 
{
	Node temp;
	//create new class ReverseLinkedList
	class Node
	{
		//taking variable  data
		int data;
		//next point 
		Node link;
	}
	//first node
	private Node first;
	private Scanner sc=new Scanner(System.in);
	public void insertrear()
	{
		//first data start name temp
	//ode temp;
		System.out.println("Enter an element");
		int elem=sc.nextInt();
		//create object ReverseLinkedList class
		Node newnode=new Node();
		//stored data shpose that first elem 100
		newnode.data=elem;
		//sentd temp link  point next node
		newnode.link=null;
		//check first node == null ya not
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			temp=first;
			while(temp.link!=null)
			{
				temp=temp.link;
			}
			temp.link=newnode;
		}
	}
	public void insertFront()
	{
	//ode first;
		System.out.println("Enter the element");
		int elem=sc.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			newnode.link=first;
			first=newnode;
		}
	}
	public void deleterear()
	{
	//ode temp;
		if(first==null)
		{
			System.out.println("Deletion not Posible");
		}
		if(first.link==null)
		{
			System.out.println("element delete is "+first.data);
			first=null;
		}
		else
		{
			temp=first;
			while(temp.link.link!=null)
			{
				temp=temp.link;
			}
			System.out.println("Element deleted is "+temp.link.data);
			temp.link=null;
		}
	}
	public void deleteFront()
	{
		if(first==null)
		{
			System.out.println("Deletion not Posible");
		}
		if(first.link==null)
		{
			System.out.println("element delete is "+first.data);
			first=null;
		}
		else
		{
			System.out.println("Element delete is "+first.data);
			first=first.link;
		}
	}
	public void display()
	{
	//ode temp;
		if(first==null)
		{
			System.out.println("Display not possiable");
		}
		else if(first.link==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null)
				{
				System.out.print(temp.data+" ");
				temp=temp.link;
				}
			System.out.println();
		}
	}
}