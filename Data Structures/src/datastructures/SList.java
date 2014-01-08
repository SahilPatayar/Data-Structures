package datastructures;

public class SList
{
	private Node head;
	private int size = 0;	
	private class Node
	{
		int item;
		Node next;
		
		Node(int item)
		{
			this.item = item;
		}
		
	}
	//Private class Node ends here
	
	public void addFirst(int item)
	{
		if(head == null)
		{
			head = new Node(item);
			head.next = null;
			size++;
		}
		else
		{
			Node newNode = new Node(item);
			newNode.next = head;
			head = newNode;
			size++;
		}	
	}
	//addFirst ends here
	
	public void addLast(int item)
	{
		if(head == null)
		{
			head = new Node(item);
			head.next = null;
			size++;
		}
		else
		{
			Node node = head;
			while(node.next != null)
			{
				node = node.next;
			}
			Node newNode = new Node(item);
			node.next = newNode;
			size++;
		}
	}
	// addLast ends here
		
	public void addAtIndex(int index, int item)
	{
		if(index > size || index < 0)
		{
			System.out.println("Index out of boundary");
		}
		else
		{
			if(index == 0)
			{
				addFirst(item);
			}
			else if(index == size)
			{
				addLast(item);
			}			
			else
			{
				int i = 0;
				Node node = head;
					
				while(i < (index-1) && node.next != null)
				{
					node = node.next;
					i++;
				}
				Node temp = new Node(item);
				temp.next = node.next;
				node.next = temp;
			}
		}
	}
	// AddAtIndex ends here
	
	public int removeFirst()
	{
		if(size == 0)
		{
			System.out.println("Empty List");
			return -1;
		}
		else
		{
			int val = head.item;
			head = head.next;
			return val;
		}
	}
	//remove First ends here
	
	public int removeLast()
	{
		if(size == 0)
		{
			System.out.println("Empty List");
			return -1;
		}
		else
		{
			Node node = head;
			while(node.next.next != null)
			{				
				node = node.next;
			}
			int val = node.next.item;
			node.next = null;
			return val;
		}
	}
	// removeLast ends here
	
	public int removeFromIndex(int index)
	{
		if(size <= index || index < 0)
		{
			System.out.println("Index outside the size of List");
			return -1;
		}
		else
		{
			Node node = head;
			int i = 0;
			while(i < (index -1) && node.next != null)
			{
				node = node.next;
				i++;
			}
			int val = node.next.item;
			node.next = node.next.next;
			return val;
		}		
	}
	//removeAtIndex ends here

	public int size()
	{
		return size;
	}
	// size ends here
	
	public void display()
	{
		Node n = head;		
		String elements = "[ ";
		while(n != null)
		{
			elements += ( " " + n.item + ",");
			n = n.next;
		}
		elements += " ]";
		System.out.println("Elements in the list are : " + elements);
	}
	// display ends here
	
	public boolean isCircular(Node n)
	{
		if(n == null)
			return false;
		else
		{
			Node slow = n;
			Node fast = n;
			
			while(fast.next != null)
			{
				slow = slow.next;
				if(fast.next.next == null)
				{
					return false;
				}
				else
				{
					fast = fast.next.next;
				}
				
				if(slow == fast)
				{
					return true;
				}
			}
			
		}	
		return false;	
	}
	
	public int circularHead(Node node)
	{
		if(node == null)
			return -1;
		else
		{
			Node slow = node;
			Node fast = node;
			
			while(fast.next != null)
			{
				slow = slow.next;
				if(fast.next.next == null)
				{
					return -1;
				}
				else
				{
					fast = fast.next.next;
				}
				
				if(slow == fast)
				{
					break;
				}				
			}
			slow = node;
			while(fast.next !=null && slow.next != null)
			{
				slow = slow.next;
				fast = fast.next;
				
				if(slow == fast)
					return slow.item;
			}
			
		}	
		return -1;
	}
	
	
	//creating a circular list to check if isCircular works or not
	public void circular()
	{
		Node n = new Node(1);
		n.next = new Node(2);
		n.next.next = new Node(4);
		n.next.next.next = new Node(5);
		n.next.next.next.next = n.next.next;
		System.out.println("Circular : " + isCircular(n));
		System.out.println("Head : " + circularHead(n));
		
	}
	
}
