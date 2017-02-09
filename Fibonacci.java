import java.util.*;
import java.io.*;
class Fibonacci
{
	static int fibonnacci(int n)
	{
		System.out.println(" Entering the function "+n);
		if (n <= 1)
		{
			return n;
		
		}
		else
		{
			int p =  fibonnacci(n-1) + fibonnacci(n-2);
			System.out.println(" Printing for function "+n);
			return p;
		}
		
	
	}

public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for the fibonnacci series");
        int nElements = in.nextInt();
        int q=fibonnacci(nElements);
		System.out.println("Value is"+q);
    }
}

/*

Enter the number for the fibonnacci series
 Entering the function 4
 Entering the function 3
 Entering the function 2
 Entering the function 1
 Entering the function 0
 Printing for function 2
 Entering the function 1
 Printing for function 3
 Entering the function 2
 Entering the function 1
 Entering the function 0
 Printing for function 2
 Printing for function 4
Value is3 */