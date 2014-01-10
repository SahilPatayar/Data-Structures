package sortingalgorithms;

public class Merge
{
	private static int[] aux;
	
	public static void sort(int[] a)
	{
		aux = new int[a.length]; // allocating space to auxiliary array
		sort(a, 0, a.length -1);
	}
	
	public static void sort(int[] a, int low, int high)
	{
		if(high <= low)
			return;
		
		int mid = (low + high)/2;		
		sort(a, low, mid);
		sort(a, mid + 1, high);
		merge(a, low, mid, high);
		
	}
	// Sort ends here
	
	public static void merge(int[] a, int low, int mid, int high)
	{
		int i = low;
		int j = mid + 1;
		
		for(int k = low; k <= high; k++)
			aux[k] = a[k];
		
		for(int k = low; k <= high ; k++)
		{
			if(i > mid)
				a[k] = aux[j++];
			else
				if(j > high)
					a[k] = aux[i++];
				else			
					if( less(aux[j], aux[i]))
						a[k] = aux[j++];
					else
						a[k] = aux[i++];
		}		
	}
	// merge ends here
		
	public static boolean less(int i, int j)
	{
		if(i < j)
			return true;
		else
			return false;
	}
	//less ends here
			
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
