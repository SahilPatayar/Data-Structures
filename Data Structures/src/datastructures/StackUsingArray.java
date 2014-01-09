package datastructures;

public class StackUsingArray
{
	private int[] holder;
	private int index;
	private int size;
	
	public StackUsingArray()
	{
		holder = new int[8];
		index = -1;
		size = 0;
	}
	
	public void push(int item)
	{
		if(index >= holder.length -1)
			expandHolder();
		
		if(index < holder.length -1)
		{			
			holder[++index] = item;
			size++;
		}					
	}
	
	public int pop()
	{
		if(size < (holder.length/2))
		{
			shrinkHolder();
		}		
		
		int val = holder[index];
		holder[index] = 0;
		index--;
		size--;
		return val;		
	}
	
	public int top()
	{
		return holder[index];
	}	
	
	public int size()
	{
		return size;
	}
	
	public void expandHolder()
	{
		int[] temp = new int[holder.length * 2];
		for(int i = 0; i < holder.length ; i++)
		{
			temp[i] = holder[i];
		}
		holder = temp;		
	}
	
	public void shrinkHolder()
	{
		int[] temp = new int[holder.length/2];
		for(int i = 0; i < temp.length ; i++)
			temp[i] = holder[i];
		holder = temp;		
	}
	
	public boolean isEmpty()
	{
		if(index == -1)
			return true;
		else
			return false;
	}
}
