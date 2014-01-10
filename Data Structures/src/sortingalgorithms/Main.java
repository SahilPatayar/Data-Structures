package sortingalgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)
	{
		int[] a = new int[10];
		
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = "";
			int i = 0;
			System.out.println("Enter the values : ");
			while(i < 10)
			{
				line = reader.readLine();
				a[i] = Integer.parseInt(line);
				i++;				
			}
			System.out.println("Sorted : " + QuickSort.isSorted(a));			
			QuickSort.sort(a);
			System.out.println("Sorted : " + QuickSort.isSorted(a));
			QuickSort.show(a);			
			
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		
		
		
	}
}
