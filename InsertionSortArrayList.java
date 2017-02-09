import java.util.*;
import java.io.*;
/* 2 1 4 6 2 */
class InsertionSortArrayList
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number of elements to be sorted:");
			int size=sc.nextInt();
			ArrayList unsortedList = new ArrayList(size);
			for(int i=0; i<size;i++)
			{
				System.out.println("Enter the elements to be sorted:");
				int c = sc.nextInt();
				unsortedList.add((c));
			}
			int k=0;
			System.out.println(unsortedList);
			for(int j=1;j<unsortedList.size();j++)
			{
			
				k=j-1;
				while(k>=0 && (int)unsortedList.get(k) > (int)unsortedList.get(j))
				{
					Object temp = unsortedList.get( k ) ;  // 
					unsortedList.set( k, unsortedList.get( j ) ) ; // 
					unsortedList.set( j, temp ) ; // 
					k=k-1;
				}
			}
			System.out.println(unsortedList);
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
			System.out.println("Please enter integer values only");
		}
	}
}