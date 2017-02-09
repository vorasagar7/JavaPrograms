/* Add two numbers to find their sum without using the + operator */
import java.util.*;
class SumOfTwoWithPlusSign
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		new SumOfTwoWithPlusSign().sumFunction(num1,num2);
	}
	void sumFunction(int n1, int n2)
	{
			System.out.println("Hi");
			while(n2 != 0)
			{
				int carry = n1 & n2;
				n1 = n1 ^ n2;
				n2 = carry << 1;
				
			}
			System.out.println(n1);
	}
}