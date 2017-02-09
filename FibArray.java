/* Fibonacci using arrays */
import java.util.*;
class FibArray
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  no of element upto which you want the fibonacci series");
		int n=sc.nextInt();
		int f = 0;
		int fibArray[] = new int[n+1];
		long startTime = System.nanoTime();
		//System.out.println("*******f[0]*********: "+fibArray[0]);
		for(int k=1; k<=n; k++)
		{
			if(k<=2)
			{
				fibArray[k]=1;
			
			}
			else
			{
				f = fibArray[k-1] + fibArray[k-2];
				fibArray[k] = f;
			}
			
		}
		long endTime = System.nanoTime();
		System.out.println("*******Took*********: "+(endTime - startTime) + " ns");
		System.out.println("Fib:"+fibArray[n]);
	}
}