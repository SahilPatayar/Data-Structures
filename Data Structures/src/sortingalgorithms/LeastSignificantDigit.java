package sortingalgorithms;

import java.io.BufferedReader;
import java.io.FileReader;

/*
 * Least Significant Digit Radix sort is efficient for 
 * sorting integers of fixed length
 * Examples :
 * 	Sorting SSN's
 * 	Sorting based on student's id
 * 
 * */



public class LeastSignificantDigit
{
	// R- Radix which is 10 for digits
	// W- width of String which we assume here is fixed
	
	public static String[] sort(String[] keys, int R, int W)
	{
		int len = keys.length;
		
		String[] aux = new String[len];
		
		for(int j = W-1; j >=0; j--)
		{
			int[] count = new int[R + 1];
			// counting Frequency
			for(int i = 0; i < len; i++)
			{				
				int index = Character.getNumericValue((keys[i].charAt(j)));
				count[ index + 1]++;
			}
		
			// Counting cumulative frequency
		
			for(int i = 0; i < count.length - 1; i++)
			{
				count[i+1] += count[i];
			}
		
			for(int i = 0; i < len; i++)
			{
				int index = Character.getNumericValue(keys[i].charAt(j));
				aux[count[index]++] = keys[i];
			}	
			
			for(int i = 0; i < len; i++)
				keys[i] = aux[i];
			//System.out.println("------------------");
		}
		return aux;		
	}
		
	public static void main(String[] args)
	{
		String[] a = new String[20];
		
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("G:\\test.txt"));
			String line = reader.readLine();
			int i = 0;
			while(line != null && i < 20)
			{
				a[i] = line;
				line = reader.readLine();
				i++;
			}
			reader.close();
			a = sort(a, 10, 2);
			System.out.println("After Sorting : ");
			for(i = 0; i < 20; i++)
				System.out.println("  " + a[i]);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
