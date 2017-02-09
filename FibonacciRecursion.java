import java.util.*;
import java.io.*;
class FibonacciRecursion
{
   public static int Fib(int n)
   {
		if(n<2)
		{
			return n;
		}
		else
		{
			return Fib(n-1) + Fib(n-2);
		}
	}
   
   
   
   public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        try
		{
			Random randomNum = new Random();
			System.out.println("Enter the  no of element upto which you want the fibonacci series");
			int nElements = in.nextInt();
			long startTime = System.nanoTime();
			int rec=Fib(nElements);
			long endTime = System.nanoTime();
			System.out.println("*******Took*********: "+(endTime - startTime) + " ns");
			System.out.println("answer is"+rec);
		}
		catch(Exception e)
		{
			System.out.println("***************Exception occured********************");
			e.printStackTrace();
		}
    }
	/* Ends - main () */
}