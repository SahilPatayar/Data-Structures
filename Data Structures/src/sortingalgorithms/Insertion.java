package sortingalgorithms;

public class Insertion
{
	public static void sort(int[] a)
	{
		int length = a.length;
		for(int i = 1; i < length ; i++)
		{
			for(int j = i; j > 0 ; j--) 
			{
				if( less(a[j], a[j-1]))
				{					
					exchange(a, j , j-1);
				}
			}
		}		
	}
	// sort ends here
	
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
