package datastructures;

public class Main
{
	public static void main(String[] args)
	{
		/*SList one = new SList();
		one.addFirst(5);
		one.addFirst(9);
		one.addLast(10);
		one.addLast(20);
		one.addFirst(58);
		
		one.display();
		System.out.println("Size : " + one.size());
		//one.removeFirst();
		//one.removeLast();
		one.addAtIndex(2, 66);
		one.display();	
		one.circular();*/
		StackUsingArray s = new StackUsingArray();
		for(int i = 1; i < 16; i++)
		{
			s.push(i);
		}	
		
		System.out.println(" " + s.top());
		System.out.println(" " + s.pop());
		System.out.println(" " + s.top());
		System.out.println("S : " + s.size());
		
	
	
	}
}
