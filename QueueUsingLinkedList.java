/* Queue using linked list */
import java.util.*;
class Node
{
	int data;
	Node next;
}
class QueueFunc
{last
	Node first;
	Node ;
	/*QueueFunc()
	{
		first = null;
		last = null;
	} */
	void addNode(int data)
	{
		Node temp = new Node();
		temp.data = data;
		if(first == null)
		{
			System.out.println("*********** 1st If *********");
			first = temp;
			last = temp;
			temp.next = null;
		}
		else
		{
			System.out.println("*********** 2nd If *********");
			last.next = temp;
			last = temp;
			last.next = null;
		}
	
	}
	int remove()
	{
		int data = 0;
		Node temp = first;
		data = temp.data;
		first = first.next;
		temp = null;
		return data;
		
	}
	void displayElements()
	{
			if(first == null)
			{
				System.out.println("*********** The Queue is empty *********");
				return;
			}
			Node current = first;
			System.out.println("*************The elements in the Queue are:*************:"+(current == last));
			while(current != last)
			{
				System.out.print(current.data+"---->");
				current = current.next;
			}
			System.out.print(last.data);
			System.out.println();
	}
	
}
class QueueUsingLinkedList
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Queue Implementation using Linked List Implementation");
		
		
		int data;
		int ch;
		QueueFunc qf = new QueueFunc();
		do
		{
			System.out.println("These are the choices:");
			System.out.println("1. Add Element in the Queue");
			System.out.println("2. Remove Element in the Queue");
			System.out.println("3. Display the queue");
			System.out.println("4. Exit");
			System.out.println("Enter the choice:");
			ch =in.nextInt();
			switch(ch)
			{
				case 1:
				
					System.out.println("Enter the element");
					data = in.nextInt();
					qf.addNode(data);
					break;
				case 2:
					if(qf.first == null)
					{
						System.out.println("No elements in Queue. Cannot perform deletion");
					}
					else
					{
						int dt = qf.remove();
						System.out.println("Element to be removed is "+dt);
					}
					break;
				case 3:
					qf.displayElements();
					break;
				case 4:
					System.out.println("Thank You Come Again !!");
					break;
				default:
				
					System.out.println("Wrong choice entered");
					break;
				
			}
		}while(ch!=4);

	}
}