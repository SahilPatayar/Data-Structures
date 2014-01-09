package datastructures;

public class QueueUsingArray
{
	private int[] holder;
	private int start;
	private int last;
	private int size;
	
	public QueueUsingArray(int len)
	{
		holder = new int[len];
		start = 0;
		last = 0;
		size = 0;
	}
	// constructor ends here
	
	public void enqueue(int item)
	{
		if(!isFull())
		{			
			holder[last] = item;
			last = (last + 1) % holder.length;
			size++;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
	// enqueue ends here
	
	public int dequeue()
	{
		if(!isEmpty())
		{
			int val = holder[start];
			holder[start] = 0;
			start = (start + 1) % holder.length;
			size--;
			return val;
		}
		else
		{
			System.out.println("Queue is empty");
			return -1;
		}
	}
	// dequeue ends here
	
	public boolean isFull()
	{
		if(size == (holder.length -1))
			return true;
		else
			return false;
	}
	
	public boolean isEmpty()
	{
		if(start == last)
			return true;
		else
			return false;		
	}
	public int front()
	{
		return holder[start];
	}
	// front ends here
	
	public int size()
	{
		return size;
	}
	//size ends here
}
