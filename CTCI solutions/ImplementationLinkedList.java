import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		next = null;
		this.data = data;
	}
}
class LinkedListFunctions
{
	Node head;
	void addNode(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node ref = head;
			while(ref.next !=null)
			{
				ref = ref.next;
			}
			ref.next = newNode;
		}
	}
	void deleteNode(int ndata)
	{
		if(head == null)
		{
			System.out.println("Cannot delete data as Linked List not created");
		}
		else
		{
			Node ref = head;
			Node prev = null;
			while(ref != null  && ref.data != ndata)
			{
				prev = ref;
				ref = ref.next;
			}
			if(ref == null)
			{
				System.out.println("Entered Data cannot be deleted");
			}
			else
			{
				if(prev == null)
					head = head.next;
				else
					prev.next = ref.next;
			}
		
		}
	
	}
	void displayElements()
	{
			if(head == null)
			{
				System.out.println("*********** The list is empty *********");
				return;
			}
			Node current = head;
			System.out.println("*************The elements in the list are:*************");
			while(current != null)
			{
				System.out.print(current.data+"---->");
				current = current.next;
				
			}
			System.out.println();
	}
	int lSize()
	{
		
		if(head == null)
		{
			return 0;
		}
		else
		{
			Node temp = head;
			int count = 0;
			while(temp != null)
			{
				temp = temp.next;
				count++;
			}
			return count;
		}
		
	}
	
}
class ImplementationLinkedList
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Linked List Implementation");
		
		
		int data;
		int ch;
		LinkedListFunctions list = new LinkedListFunctions();
		do
		{
			System.out.println("These are the choices:");
			System.out.println("1. Add Element at the last of the list");
			System.out.println("2. Remove element by giving Data");
			System.out.println("3. Display elements in the list");
			System.out.println("4. Size of LinkedList");
			System.out.println("5. Exit");
			System.out.println("Enter the choice:");
			ch =in.nextInt();
			switch(ch)
			{
				case 1:
				
					System.out.println("Enter the element");
					data = in.nextInt();
					list.addNode(data);
					break;
				
				case 2:
				
					System.out.println("Enter the element to be deleted");
					data = in.nextInt();
					list.deleteNode(data);
					break;				
				case 3:
				
					list.displayElements();
					break;
				case 4:
				
					int l=list.lSize();
					System.out.println("The Size of Linked List is:"+l);
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