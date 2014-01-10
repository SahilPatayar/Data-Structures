package sortingalgorithms;

public class MaxPQ   // Max Priority Queue
{
	// It takes an data type to create heap structure
	// need an array to store
	// Methods Insert, DeleteMax, Size, Sink and swim
	// child to parent step : n/2;
	// Parent to child step : n/2, n/2 + 1
	
	private static int[] heap;
	private static int count;
	
	public MaxPQ()
	{
		heap = new int[2];
		count = 0;	
	}

	public static void insert(int item)
	{
		if(heap.length -1 == count)
		{
			reSizeArray();
		}
		heap[++count] = item;
		swim(count);		
	}	
	
	
	public static void swim(int i)
	{
		while(i > 1)
		{
			if( heap[(i/2)] < heap[i])
				exchange(i/2, i);
			i = i/2;		
		}	
	}
	
	public static void sink(int i)
	{
		int cIndex = 0;
		
		while(i <= heap.length)
		{
			cIndex = 2 * i;
			if(heap[cIndex] <= heap[cIndex + 1])
			{
				cIndex = cIndex + 1; 
			}
		
			if( heap[cIndex] > heap[i] )
			{
				exchange(cIndex, i);
				i = cIndex;
			}
			else
				break;
		}
	
	}	
	
	public static int getMax()
	{
		return heap[1];
	}
	
	
	public static int deleteMax()
	{
		int temp = heap[1];
		heap[1] = heap[count];
		heap[count--] = 0;
		sink(1);
		if( count <= (heap.length/4) )
			shrinkArray();
		return temp;
	}
	
	public static void reSizeArray()
	{
		int[] temp = new int[heap.length * 2];
		for(int i = 1; i < heap.length; i++)
			temp[i] = heap[i];
		
		heap = temp;
	}
	
	public static void shrinkArray()
	{
		int[] temp = new int[heap.length / 2];
		for(int i = 1; i < heap.length; i++)
			temp[i] = heap[i];
		
		heap = temp;
	}
	
	public static void exchange(int i, int j)
	{
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}
	
	
	public static int size()
	{
		return count;
	}	
		
	public static boolean isEmpty()
	{
		return (count == 0) ; 
	}
	
	public static void show()
	{				
		for(int i = 1; i <= size(); i++)
		{
			System.out.println("Val at " + i + " : "+ heap[i]);
		}
	}
}