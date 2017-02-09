/* Program to inplement whether a string has unique characters of not 
Take the String and find the ASCII value of each character.
Using the ASCII value as index of array, fill the array.
If the array at the particular index postion is already filled, then the character is repeated. So String is not unique.
If extended ASCII then 256 should be the length.

*/
import java.util.*;
class Problem1UniqueCharacter
{
	public static boolean isUnique(String inputStr)
	{
		boolean uniqueString = true;
		if(inputStr.length() > 128) // A String cannot be made unique if more than 128 characters are used.
		{
			uniqueString = false;
			return uniqueString;
		}
		boolean charSet[] = new boolean[128];
		for(int i=0;i<inputStr.length();i++)
		{
			int asciiValue = inputStr.charAt(i);
			System.out.println("asciiValue::::"+asciiValue);
			if(charSet[asciiValue])
			{
				uniqueString = false;
				return uniqueString;
			}
			charSet[asciiValue] = true;
		}
		return uniqueString;
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String inputString = sc.next();
		boolean isStringUnique = isUnique(inputString);
		if(isStringUnique)
		{
			System.out.println("The entered String is Unique");
		}
		else
		{
			System.out.println("The entered String is Not Unique");
		}
	}

}