import java.io.*;
import java.util.*;
class Node
{
	private int data;
	private Node next;
	
	public Node()
	{
		next=null;
	}
	
	public Node(int data)
	{
		this.data = data;
		
	}
	public int getData()
	{
		return this.data;
	}
	public void setData(int data)
	{
		this.data = data;
	}
	public Node getNextNode()
	{
		return this.next;
	}
	public  void setNextNode(Node next)
	{
		this.next=next;
	}
	
}
class MyLinkedList
{
	Node head;
	int totalElements =0;
	MyLinkedList()
	{
		head = new Node();
	}
	public void addObject(int data)
	{
		Node temp = new Node();
		temp.setData(data);
		if(totalElements == 0)
		{
			head.setNextNode(temp);
			totalElements++;
		}
		else // add at the last
		{
			Node current = head;
			while(current.getNextNode() != null)
			{
				current = current.getNextNode();
			}
			current.setNextNode(temp);
			totalElements++;
		}
	}
	public void addObject(int data, int position)
	{
		
		if(position == 1 && totalElements == 0)
		{
			Node temp = new Node();
			Node current = head;
			temp.setData(data);
			head.setNextNode(temp);
			totalElements++;
		} 
		else if(position > totalElements)
		{
			System.out.println("please specify the proper position");
			return ;
		}
		else
		{
			Node temp = new Node();
			Node current = head;
			temp.setData(data);
			for(int i=1;i<position;i++)
			{
				current=current.getNextNode();
			}
			temp.setNextNode(current.getNextNode());
			current.setNextNode(temp);
		}
	}
	void displayElements()
	{
			if(head.getNextNode()==null)
			{
				System.out.println("*********** The list is empty *********");
				return;
			}
			Node current = head;
			System.out.println("*************The elements in the list are:*************");
			while(current.getNextNode() != null)
			{
				current = current.getNextNode();
				System.out.print(current.getData()+"---->");
			}
			System.out.println();
	}
}
class LinkedListWOCollection
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Linked List Implementation");
		
		
		int data;
		int ch;
		MyLinkedList list = new MyLinkedList();
		do
		{
			System.out.println("These are the choices:");
			System.out.println("1. Add Element at the last of the list");
			System.out.println("2. Add Element at any position in the list");
			System.out.println("3. Add Element at 1st position in the list");
			System.out.println("4. Display the list");
			System.out.println("5. Exit");
			System.out.println("Enter the choice:");
			ch =in.nextInt();
			switch(ch)
			{
				case 1:
				
					System.out.println("Enter the element");
					data = in.nextInt();
					list.addObject(data);
					break;
				
				case 2:
				
					System.out.println("Enter the element");
					data = in.nextInt();
					System.out.println("Enter the position");
					int pos = in.nextInt();
					list.addObject(data,pos);
					break;
				
				case 3:
				
					System.out.println("Enter the element");
					data = in.nextInt();
					list.addObject(data,1);
					break;
				
				case 4:
				
					list.displayElements();
					break;
				case 5:
					System.out.println("Thank You Come Again !!");
					break;
				default:
				
					System.out.println("Wrong choice entered");
					break;
				
			}
		}while(ch!=5);

	}
}