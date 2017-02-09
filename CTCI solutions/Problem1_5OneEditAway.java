import java.util.*;

/*aaaabbccdde
a4b2c2d2e1 
pale ale = true
pale bpale = true
bale pale = true
bale pelr = false;


*/
class Problem1_5OneEditAway
{
	public static boolean isOneEditAway(String inputStr1, String inputStr2)
	{
		int counterForTwo = 0;
		int counterForOne = 0;
		if(inputStr1 == null || inputStr2 == null)
		{
			System.out.println("Either of the entered String is Null");
			return false;
		}
		int str1Length = inputStr1.length();
		int str2Length = inputStr2.length();
		int maxLength = Math.max(str1Length,str2Length);
		if(str1Length == str2Length && inputStr1.equals(inputStr2))
		{
			return true;
		}
		int counter[] = new int[128];
		for(int i=0;i<inputStr1.length();i++)
		{
			int val = inputStr1.charAt(i);
			counter[val]++;
		}
		for(int i=0;i<inputStr2.length();i++)
		{
			int val = inputStr2.charAt(i);
			counter[val]++;
		}
		
		for(int i=0;i<counter.length;i++)
		{
			if(counter[i] % 2 == 0)
			{
				counterForTwo = counterForTwo + (counter[i]/2);
			}
			if(counter[i] == 1)
			{
				counterForOne++;
			}
		}
		if(counterForTwo == maxLength - 1 && counterForOne <=2)
		{
			return true;
		}
		return false;
		
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String Str1 = sc.next();
		System.out.println("Enter 1st String");
		String Str2 = sc.next();
		boolean areTwoStringsOneEditAway = isOneEditAway(Str1,Str2);
		if(areTwoStringsOneEditAway)
		{
			System.out.println("Two Strings are One Edit away");
		}
		else
		{
			System.out.println("Two Strings are Not One Edit away");
		}
	}
}