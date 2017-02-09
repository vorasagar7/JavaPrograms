/* Program to implement whether a string is Permutable of other or not

2 Solutions:
1St. Sort both the Strings using a method like convert them to "to char Array" and then use Arrays.Sort method on the char aaray. Then just call the equals method to check it if they are equal or not. Before that check the length to be equal.

2nd Solution would be to count the frequency of each character. For permutation, frequency in both the character strings must be equal.
Check the String lengths to be equal. Then take the 1st String and count the frequency of each character and store in array. Take the 2nd String and start subtracting the corresponding count value for the character. If anytime it falls below 0, then not a permutale string. Since for all the characters, the count array has already stored 0.

*/
import java.util.*;
class Problem2PermutationsOfEachOther
{
	public static boolean isPermutableStrings(String inputStr1, String inputStr2)
	{
		if(inputStr1.length() != inputStr2.length())
		{
			return false;
		}
		
		int charSet[] = new int[128];
		
		char charArray[] = inputStr1.toCharArray();
		for(char c: charArray)
		{
			charSet[c]++;
			System.out.println("charSet["+c+"] ="+charSet[c]);
		}
		
		for(int i=0;i<inputStr2.length();i++)
		{
			int asciiValue = inputStr2.charAt(i);
			System.out.println("asciiValue::::"+asciiValue);
			charSet[asciiValue]--;
			System.out.println("charSet["+asciiValue+"] ="+charSet[asciiValue]);
			if(charSet[asciiValue] < 0)
			{
				return false;
			
			}
			
		}
		return true;
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String inputString1 = sc.next();
		System.out.println("Enter the 1st String");
		String inputString2 = sc.next();
		boolean isStringUnique = isPermutableStrings(inputString1, inputString2);
		if(isStringUnique)
		{
			System.out.println("The entered Strings are permutable of each other");
		}
		else
		{
			System.out.println("The entered Strings are not permutable of each other");
		}
	}

}