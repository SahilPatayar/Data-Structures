package sortingalgorithms;

public class QuickSort
{
	
	
	
	
	public static void sort(int[] a)
	{
		shuffle(a);
		for(int i = 0 ; i < a.length; i++)
			System.out.println(a[i]);
		sort(a, 0, a.length -1);
		
	}
	
	public static void sort(int[] a, int low, int high)
	{
		if(high <= low)
			return;
		
		int j = partition(a, low, high);
		sort(a, low, j-1);
		sort(a, j+1, high);		
	}
	
	public static int partition(int[] a, int low, int high)
	{
		int i = low;
		int j = high + 1;
		int point = a[low];
		while(true)
		{
			while( less(a[++i], point) )
			{
				if(i == high)
					break;
			}
			
			while( less(point, a[--j]) )
			{
				if(j == low)
					break;
			}
			
			if(i >= j)
				break;
			
			exchange(a, i, j);			
		}
		
		exchange(a, low , j);
		return j;
	}
	
	public static void shuffle(int[] a)
	{
		
		for(int i = 0; i < a.length; i++)
		{
			int random = i + (int) (Math.random() * (a.length - i));
			int temp = a[i];
			a[i] = a[random];
			a[random] = temp;
		}
	}
	
	
	public static boolean less(int i, int j)
	{
		if(i < j)
			return true;
		else
			return false;
	}
	//less ends here
	
	public static void exchange(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	// exchange ends here
	
	public static void show(int[] a)
	{
		System.out.print("{ ");
		for(int i = 0; i < a.length ; i++)
		{
			System.out.print(" " + a[i] + ",");
		}
		System.out.println(" }");
	}
	// show ends here
	
	public static boolean isSorted(int[] a)
	{
		for(int i = 0; i < a.length -1 ; i++)
		{
			if(a[i] > a[i+1])
				return false;			
		}
		return true;
	}
	// isSorted Ends here
	
	

}
