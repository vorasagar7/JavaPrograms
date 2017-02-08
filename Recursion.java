import java.io.*;
import java.util.*;
class Recursion
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = in.nextInt();
		System.out.println("Enter the Exponent:");
		int exp = in.nextInt();
		int result=recursion(num,exp);
		System.out.println("The value of "+num+" raised to "+exp+" is: "+result);
	}
	public static int recursion(int num, int exp)
	{
		if(exp == 0)
		{
			return 1;
		}
		
		else
		{
			if(exp%2 == 0)
			{
			    int y = recursion(num,exp/2);
			    return y*y;
			}
			else
			{
			return num*(recursion(num,exp-1));
			}
		}
	}
}